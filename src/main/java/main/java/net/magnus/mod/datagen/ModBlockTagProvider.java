package main.java.net.magnus.mod.datagen;

import main.java.net.magnus.mod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.URANIUM_BLOCK)
                .add(ModBlocks.METEORITE)
                .add(ModBlocks.URANIUM_ORE)
                .add(ModBlocks.URANIUM_END_ORE)
                .add(ModBlocks.URANIUM_NETHER_ORE)
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE)
                .add(ModBlocks.MOON_ROCK_TRAPDOOR)
                .add(ModBlocks.MOON_ROCK_WALL)
                .add(ModBlocks.MOON_ROCK_DOOR)
                .add(ModBlocks.MOON_ROCK_FENCE)
                .add(ModBlocks.MOON_ROCK_BUTTON)
                .add(ModBlocks.MOON_ROCK_FENCE_GATE)
                .add(ModBlocks.MOON_ROCK_PRESSURE_PLATE)
                .add(ModBlocks.MOON_ROCK_SLAB)
                .add(ModBlocks.MOON_ROCK_STAIRS)
                .add(ModBlocks.MOON_ROCK)
                .add(ModBlocks.MOON_LAMP)
                .add(ModBlocks.METEORITE_TRAPDOOR)
                .add(ModBlocks.METEORITE_BUTTON)
                .add(ModBlocks.METEORITE_SLAB)
                .add(ModBlocks.METEORITE_STAIRS)
                .add(ModBlocks.METEORITE_WALL)
                .add(ModBlocks.METEORITE_FENCE_GATE)
                .add(ModBlocks.METEORITE_FENCE)
                .add(ModBlocks.METEORITE_DOOR)
                .add(ModBlocks.METEORITE_PRESSURE_PLATE)
                .add(ModBlocks.ENDERITE_BLOCK)
                .add(ModBlocks.ENDERITE_DEBRIS);
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.CHORUS_LOG)
                .add(ModBlocks.STRIPPED_CHORUS_LOG)
                .add(ModBlocks.CHORUS_WOOD)
                .add(ModBlocks.STRIPPED_CHORUS_WOOD)
                .add(ModBlocks.CHORUS_PLANKS)
                .add(ModBlocks.CHORUS_TRAPDOOR)
                .add(ModBlocks.CHORUS_WALL)
                .add(ModBlocks.CHORUS_DOOR)
                .add(ModBlocks.CHORUS_FENCE)
                .add(ModBlocks.CHORUS_BUTTON)
                .add(ModBlocks.CHORUS_FENCE_GATE)
                .add(ModBlocks.CHORUS_PRESSURE_PLATE)
                .add(ModBlocks.CHORUS_SLAB)
                .add(ModBlocks.CHAIR)
                .add(ModBlocks.CHORUS_STAIRS);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.URANIUM_BLOCK)
                .add(ModBlocks.METEORITE)
                .add(ModBlocks.URANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE)
                .add(ModBlocks.MOON_ROCK_TRAPDOOR)
                .add(ModBlocks.MOON_ROCK_WALL)
                .add(ModBlocks.MOON_ROCK_DOOR)
                .add(ModBlocks.MOON_ROCK_FENCE)
                .add(ModBlocks.MOON_ROCK_BUTTON)
                .add(ModBlocks.MOON_ROCK_FENCE_GATE)
                .add(ModBlocks.MOON_ROCK_PRESSURE_PLATE)
                .add(ModBlocks.MOON_ROCK_SLAB)
                .add(ModBlocks.MOON_ROCK_STAIRS)
                .add(ModBlocks.MOON_ROCK)
                .add(ModBlocks.ENDERITE_DEBRIS)
                .add(ModBlocks.METEORITE_TRAPDOOR)
                .add(ModBlocks.METEORITE_BUTTON)
                .add(ModBlocks.METEORITE_SLAB)
                .add(ModBlocks.METEORITE_STAIRS)
                .add(ModBlocks.METEORITE_WALL)
                .add(ModBlocks.METEORITE_FENCE_GATE)
                .add(ModBlocks.METEORITE_FENCE)
                .add(ModBlocks.METEORITE_DOOR)
                .add(ModBlocks.METEORITE_PRESSURE_PLATE)
                .add(ModBlocks.ENDERITE_BLOCK)
                .add(ModBlocks.ENDERITE_DEBRIS)
                .add(ModBlocks.CHORUS_TRAPDOOR)
                .add(ModBlocks.CHORUS_WALL)
                .add(ModBlocks.CHORUS_DOOR)
                .add(ModBlocks.CHORUS_FENCE)
                .add(ModBlocks.CHORUS_BUTTON)
                .add(ModBlocks.CHORUS_FENCE_GATE)
                .add(ModBlocks.CHORUS_PRESSURE_PLATE)
                .add(ModBlocks.CHORUS_SLAB)
                .add(ModBlocks.CHORUS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.MOON_LAMP);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.METEORITE_FENCE)
                .add(ModBlocks.MOON_ROCK_FENCE)
                .add(ModBlocks.CHORUS_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.METEORITE_FENCE_GATE)
                .add(ModBlocks.MOON_ROCK_FENCE_GATE)
                .add(ModBlocks.CHORUS_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.METEORITE_WALL)
                .add(ModBlocks.MOON_ROCK_WALL)
                .add(ModBlocks.CHORUS_WALL);
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.METEORITE_SLAB)
                .add(ModBlocks.MOON_ROCK_SLAB)
                .add(ModBlocks.CHORUS_SLAB);
        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.MOON_ROCK_STAIRS)
                .add(ModBlocks.METEORITE_STAIRS)
                .add(ModBlocks.CHORUS_STAIRS);
        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.MOON_ROCK_DOOR)
                .add(ModBlocks.METEORITE_DOOR)
                .add(ModBlocks.CHORUS_DOOR);
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.MOON_ROCK_BUTTON)
                .add(ModBlocks.METEORITE_BUTTON)
                .add(ModBlocks.CHORUS_BUTTON);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.MOON_ROCK_TRAPDOOR)
                .add(ModBlocks.METEORITE_TRAPDOOR)
                .add(ModBlocks.CHORUS_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.MOON_ROCK_PRESSURE_PLATE)
                .add(ModBlocks.METEORITE_PRESSURE_PLATE)
                .add(ModBlocks.CHORUS_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.URANIUM_BLOCK)
                .add(ModBlocks.ENDERITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.CHORUS_LOG)
                .add(ModBlocks.STRIPPED_CHORUS_LOG)
                .add(ModBlocks.CHORUS_WOOD)
                .add(ModBlocks.STRIPPED_CHORUS_WOOD);
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.CHORUS_PLANKS);
    }
}
