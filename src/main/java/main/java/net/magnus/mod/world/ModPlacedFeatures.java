package main.java.net.magnus.mod.world;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> URANIUM_ORE_PLACED_KEY = registerKey("uranium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_URANIUM_ORE_PLACED_KEY = registerKey("nether_uranium_ore_placed");
    public static final RegistryKey<PlacedFeature> END_URANIUM_ORE_PLACED_KEY = registerKey("end_uranium_ore_placed");
    public static final RegistryKey<PlacedFeature> END_ENDERITE_DEBRIS_PLACED_KEY = registerKey("end_enderite_debris_placed");

    public static final RegistryKey<PlacedFeature> CHORUSTREE_PLACED_KEY = registerKey("chorustree_placed");

    public static final RegistryKey<PlacedFeature> CHORUS_BERRY_BUSH_PLACED_KEY = registerKey("chorus_berry_bush_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.URANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-59), YOffset.fixed(25))));
        register(context, NETHER_URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_URANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-59), YOffset.fixed(32))));
        register(context, END_URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_URANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-59), YOffset.aboveBottom(80))));
        register(context, END_ENDERITE_DEBRIS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_ENDERITE_DEBRIS_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-59), YOffset.aboveBottom(80))));

        register(context, CHORUSTREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHORUS_WOOD_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.CHORUS_SAPLING));

        register(context, CHORUS_BERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHORUS_BERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(32),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Mod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
