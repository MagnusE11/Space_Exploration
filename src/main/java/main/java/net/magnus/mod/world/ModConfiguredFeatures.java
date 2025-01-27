package main.java.net.magnus.mod.world;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.block.ModBlocks;
import main.java.net.magnus.mod.block.custom.ChorusBerryBushBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> URANIUM_ORE_KEY = registryKey("uranium_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_URANIUM_ORE_KEY = registryKey("nether_uranium_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_URANIUM_ORE_KEY = registryKey("end_uranium_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_ENDERITE_DEBRIS_KEY = registryKey("end_enderite_debris_key");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CHORUS_WOOD_KEY = registryKey("chorus_wood_key");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CHORUS_BERRY_BUSH_KEY = registryKey("chorus_berry_bush");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldUraniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.URANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_URANIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherUraniumOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.URANIUM_NETHER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endUraniumOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.URANIUM_END_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endEnderiteOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.ENDERITE_DEBRIS.getDefaultState()));

        register(context, URANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldUraniumOres, 5));
        register(context, NETHER_URANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherUraniumOres, 5));
        register(context, END_URANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endUraniumOres, 5, 1.0f));
        register(context, END_ENDERITE_DEBRIS_KEY, Feature.SCATTERED_ORE, new OreFeatureConfig(endEnderiteOres, 3, 1.0f));

        register(context, CHORUS_WOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CHORUS_LOG),
                new MegaJungleTrunkPlacer(10, 2, 19),
                BlockStateProvider.of(ModBlocks.CHORUS_LEAVES),
                new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
                new TwoLayersFeatureSize(1, 1, 2)).dirtProvider(BlockStateProvider.of(Blocks.END_STONE))
                .build()
        );

        register(context, CHORUS_BERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CHORUS_BERRY_BUSH
                                .getDefaultState()
                                .with(ChorusBerryBushBlock.AGE, 3))),List.of(Blocks.END_STONE))
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Mod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
