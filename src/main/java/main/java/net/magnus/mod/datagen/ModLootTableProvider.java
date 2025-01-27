package main.java.net.magnus.mod.datagen;

import main.java.net.magnus.mod.block.ModBlocks;
import main.java.net.magnus.mod.block.custom.ChorusBerryBushBlock;
import main.java.net.magnus.mod.block.custom.ChorusPlantCropBlock;
import main.java.net.magnus.mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        addDrop(ModBlocks.URANIUM_BLOCK);
        addDrop(ModBlocks.METEORITE);
        addDrop(ModBlocks.URANIUM_ORE, multipleOreDrops(ModBlocks.URANIUM_ORE, ModItems.URANIUM_NUGGET, 3, 9));
        addDrop(ModBlocks.URANIUM_END_ORE, multipleOreDrops(ModBlocks.URANIUM_END_ORE, ModItems.URANIUM_NUGGET, 3, 9));
        addDrop(ModBlocks.URANIUM_NETHER_ORE, multipleOreDrops(ModBlocks.URANIUM_NETHER_ORE, ModItems.URANIUM_NUGGET, 3, 9));
        addDrop(ModBlocks.DEEPSLATE_URANIUM_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_URANIUM_ORE, ModItems.URANIUM_NUGGET, 3, 9));
        addDrop(ModBlocks.METEORITE_TRAPDOOR);
        addDrop(ModBlocks.METEORITE_BUTTON);
        addDrop(ModBlocks.METEORITE_SLAB, slabDrops(ModBlocks.METEORITE_SLAB));
        addDrop(ModBlocks.METEORITE_STAIRS);
        addDrop(ModBlocks.METEORITE_WALL);
        addDrop(ModBlocks.METEORITE_FENCE_GATE);
        addDrop(ModBlocks.METEORITE_FENCE);
        addDrop(ModBlocks.METEORITE_DOOR, doorDrops(ModBlocks.METEORITE_DOOR));
        addDrop(ModBlocks.METEORITE_PRESSURE_PLATE);
        addDrop(ModBlocks.MOON_ROCK);
        addDrop(ModBlocks.MOON_ROCK_TRAPDOOR);
        addDrop(ModBlocks.MOON_ROCK_BUTTON);
        addDrop(ModBlocks.MOON_ROCK_SLAB, slabDrops(ModBlocks.MOON_ROCK_SLAB));
        addDrop(ModBlocks.MOON_ROCK_STAIRS);
        addDrop(ModBlocks.MOON_ROCK_WALL);
        addDrop(ModBlocks.MOON_ROCK_FENCE_GATE);
        addDrop(ModBlocks.MOON_ROCK_FENCE);
        addDrop(ModBlocks.MOON_ROCK_DOOR, doorDrops(ModBlocks.MOON_ROCK_DOOR));
        addDrop(ModBlocks.MOON_ROCK_PRESSURE_PLATE);
        addDrop(ModBlocks.MOON_LAMP);
        addDrop(ModBlocks.ENDERITE_DEBRIS);
        addDrop(ModBlocks.ENDERITE_BLOCK);
        addDrop(ModBlocks.CHORUS_LOG);
        addDrop(ModBlocks.STRIPPED_CHORUS_LOG);
        addDrop(ModBlocks.CHORUS_WOOD);
        addDrop(ModBlocks.STRIPPED_CHORUS_WOOD);
        addDrop(ModBlocks.CHORUS_PLANKS);
        addDrop(ModBlocks.CHORUS_SAPLING);
        addDrop(ModBlocks.CHORUS_TRAPDOOR);
        addDrop(ModBlocks.CHORUS_BUTTON);
        addDrop(ModBlocks.CHORUS_SLAB, slabDrops(ModBlocks.CHORUS_SLAB));
        addDrop(ModBlocks.CHORUS_STAIRS);
        addDrop(ModBlocks.CHORUS_WALL);
        addDrop(ModBlocks.CHORUS_FENCE_GATE);
        addDrop(ModBlocks.CHORUS_FENCE);
        addDrop(ModBlocks.CHORUS_DOOR, doorDrops(ModBlocks.CHORUS_DOOR));
        addDrop(ModBlocks.CHORUS_PRESSURE_PLATE);
        addDrop(ModBlocks.CHAIR);

        addDrop(ModBlocks.CHORUS_LEAVES, leavesDrops(ModBlocks.CHORUS_LEAVES, ModBlocks.CHORUS_SAPLING, 0.0625f));

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CHORUS_PLANT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(ChorusPlantCropBlock.AGE, ChorusPlantCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.CHORUS_PLANT_CROP, this.cropDrops(ModBlocks.CHORUS_PLANT_CROP, ModItems.CHORUS_SNACK, ModItems.CHORUS_SEED, builder2));

        this.addDrop(
                ModBlocks.CHORUS_BERRY_BUSH,
                block -> this.applyExplosionDecay(
                        block,
                        LootTable.builder()
                                .pool(
                                        LootPool.builder()
                                                .conditionally(
                                                        BlockStatePropertyLootCondition.builder(ModBlocks.CHORUS_BERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(ChorusBerryBushBlock.AGE, 3))
                                                )
                                                .with(ItemEntry.builder(ModItems.CHORUS_BERRIES))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                                )
                                .pool(
                                        LootPool.builder()
                                                .conditionally(
                                                        BlockStatePropertyLootCondition.builder(ModBlocks.CHORUS_BERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(ChorusBerryBushBlock.AGE, 2))
                                                )
                                                .with(ItemEntry.builder(ModItems.CHORUS_BERRIES))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                                )
                )
        );


    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}