package main.java.net.magnus.mod.block;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.block.custom.*;
import main.java.net.magnus.mod.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static net.minecraft.block.MapColor.*;

public class ModBlocks {
    public static final Block METEORITE = registerBlock(
            "meteorite",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .mapColor(GRAY)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(50.0F, 100f))
    );
    public static final Block ENDERITE_DEBRIS = registerBlock(
            "enderite_debris",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .mapColor(DIAMOND_BLUE)
                    .sounds(BlockSoundGroup.ANCIENT_DEBRIS)
                    .strength(40.0F, 1200.0F))
    );
    public static final Block METEORITE_STAIRS = registerBlock(
            "meteorite_stairs",
            new StairsBlock(ModBlocks.METEORITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool())
    );
    public static final Block METEORITE_SLAB = registerBlock(
            "meteorite_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool())
    );
    public static final Block METEORITE_BUTTON = registerBlock(
                "meteorite_button",
            new ButtonBlock(BlockSetType.IRON, 2,
                    AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool()
                            .noCollision())
    );
    public static final Block METEORITE_PRESSURE_PLATE = registerBlock(
            "meteorite_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON,
                    AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool())
    );
    public static final Block METEORITE_FENCE = registerBlock(
            "meteorite_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool())
    );
    public static final Block METEORITE_FENCE_GATE = registerBlock(
            "meteorite_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool())
    );
    public static final Block METEORITE_WALL = registerBlock(
            "meteorite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool())
    );
    public static final Block METEORITE_DOOR = registerBlock(
            "meteorite_door",
            new DoorBlock(BlockSetType.IRON,
                    AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool()
                            .nonOpaque())
    );
    public static final Block METEORITE_TRAPDOOR = registerBlock(
            "meteorite_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON,
                    AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool()
                            .nonOpaque())
    );
    public static final Block URANIUM_BLOCK = registerBlock(
            "uranium_block",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .mapColor(GREEN)
                    .sounds(BlockSoundGroup.STONE)
                    .luminance(state -> 15)
                    .strength(50.0F, 100f))
    );
    public static final Block URANIUM_ORE = registerBlock(
            "uranium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .mapColor(GREEN)
                    .sounds(BlockSoundGroup.STONE)
                    .luminance(state -> 15)
                    .strength(50.0F, 100f))
    );
    public static final Block DEEPSLATE_URANIUM_ORE = registerBlock(
            "deepslate_uranium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .mapColor(DARK_GREEN)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .luminance(state -> 15)
                    .strength(55.0F, 100f))
    );
    public static final Block MOON_ROCK = registerBlock(
            "moon_rock",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .mapColor(WHITE_GRAY)
                    .sounds(BlockSoundGroup.TUFF)
                    .strength(3.0F, 9.0F))
    );
    public static final Block MOON_ROCK_STAIRS = registerBlock(
            "moon_rock_stairs",
            new StairsBlock(ModBlocks.MOON_ROCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool())
    );
    public static final Block MOON_ROCK_SLAB = registerBlock(
            "moon_rock_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 9.0F)
                    .requiresTool())
    );
    public static final Block MOON_ROCK_BUTTON = registerBlock(
            "moon_rock_button",
            new ButtonBlock(BlockSetType.STONE, 2,
                    AbstractBlock.Settings.create()
                            .strength(2.5f, 9.0F)
                            .requiresTool()
                            .noCollision())
    );
    public static final Block MOON_ROCK_PRESSURE_PLATE = registerBlock(
            "moon_rock_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.create()
                            .strength(2.5f, 9.0F)
                            .requiresTool())
    );
    public static final Block MOON_ROCK_FENCE = registerBlock(
            "moon_rock_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 9.0F)
                    .requiresTool())
    );
    public static final Block MOON_ROCK_FENCE_GATE = registerBlock(
            "moon_rock_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.5f, 9.0F)
                            .requiresTool())
    );
    public static final Block MOON_ROCK_WALL = registerBlock(
            "moon_rock_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 9.0F)
                    .requiresTool())
    );
    public static final Block MOON_ROCK_DOOR = registerBlock(
            "moon_rock_door",
            new DoorBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.create()
                            .strength(2.5f, 9.0F)
                            .requiresTool()
                            .nonOpaque())
    );
    public static final Block MOON_ROCK_TRAPDOOR = registerBlock(
            "moon_rock_trapdoor",
            new TrapdoorBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.create()
                            .strength(2.5f, 9.0F)
                            .requiresTool()
                            .nonOpaque())
    );
    public static final Block MOON_LAMP = registerBlock("moon_lamp",
            new MoonLampBlock(AbstractBlock.Settings.create()
                    .strength(2.0f, 9.0F)
                    .requiresTool()
                    .luminance(state -> state.get(MoonLampBlock.CLICKED) ? 15 : 0))
    );
    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(55.0F, 1200F)
                    .requiresTool()
                    .mapColor(LIGHT_BLUE)
                    .sounds(BlockSoundGroup.NETHERITE)
                    .instrument(NoteBlockInstrument.BASEDRUM))
    );

    public static final Block CHORUS_PLANT_CROP = registerBlockWithoutBlockItem("chorus_plant_crop",
            new ChorusPlantCropBlock(AbstractBlock.Settings.create()
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .mapColor(PURPLE)
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY))
    );

    public static final Block CHORUS_BERRY_BUSH = registerBlockWithoutBlockItem("chorus_berry_bush",
            new ChorusBerryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH), Blocks.END_STONE)
    );

    public static final Block URANIUM_END_ORE =registerBlock("uranium_end_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .strength(50.0F, 100f)
                            .requiresTool())
        );

    public static final Block URANIUM_NETHER_ORE =registerBlock("uranium_nether_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .strength(30.0F, 75f)
                            .requiresTool())
    );

    public static final Block CHORUS_LOG =registerBlock("chorus_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG))
    );

        public static final Block CHORUS_WOOD =registerBlock("chorus_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD))
    );

        public static final Block STRIPPED_CHORUS_LOG =registerBlock("stripped_chorus_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG))
    );

        public static final Block STRIPPED_CHORUS_WOOD =registerBlock("stripped_chorus_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD))
    );

        public static final Block CHORUS_PLANKS =registerBlock("chorus_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))
    );

        public static final Block CHORUS_LEAVES =registerBlock("chorus_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES))
    );

        public static final Block CHORUS_SAPLING =registerBlock("chorus_sapling",
            new ModSaplingBlock(ModSaplingGenerators.CHORUSWOOD, AbstractBlock.Settings.copy(Blocks.JUNGLE_SAPLING), Blocks.END_STONE)
    );

    public static final Block CHORUS_STAIRS = registerBlock(
            "chorus_stairs",
            new StairsBlock(ModBlocks.CHORUS_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .strength(35.0F, 100f)
                            .requiresTool())
    );
    public static final Block CHORUS_SLAB = registerBlock(
            "chorus_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 9.0F)
                    .requiresTool())
    );
    public static final Block CHORUS_BUTTON = registerBlock(
            "chorus_button",
            new ButtonBlock(BlockSetType.OAK, 2,
                    AbstractBlock.Settings.create()
                            .strength(2.5f, 9.0F)
                            .requiresTool()
                            .noCollision())
    );
    public static final Block CHORUS_PRESSURE_PLATE = registerBlock(
            "chorus_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.5f, 9.0F)
                            .requiresTool())
    );
    public static final Block CHORUS_FENCE = registerBlock(
            "chorus_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 9.0F)
                    .requiresTool())
    );
    public static final Block CHORUS_FENCE_GATE = registerBlock(
            "chorus_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.5f, 9.0F)
                            .requiresTool())
    );
    public static final Block CHORUS_WALL = registerBlock(
            "chorus_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(2.5f, 9.0F)
                    .requiresTool())
    );
    public static final Block CHORUS_DOOR = registerBlock(
            "chorus_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.5f, 9.0F)
                            .requiresTool()
                            .nonOpaque())
    );
    public static final Block CHORUS_TRAPDOOR = registerBlock(
            "chorus_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.5f, 9.0F)
                            .requiresTool()
                            .nonOpaque())
    );

    public static final Block CHAIR = registerBlock(
            "chair",
            new ChairBlock(
                    AbstractBlock.Settings.create()
                            .nonOpaque())
    );







    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Mod.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Mod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Mod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Mod.LOGGER.info("Registering Mod Blocks for Space Exploration " + Mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(METEORITE);
            fabricItemGroupEntries.add(METEORITE_BUTTON);
            fabricItemGroupEntries.add(METEORITE_STAIRS);
            fabricItemGroupEntries.add(METEORITE_DOOR);
            fabricItemGroupEntries.add(METEORITE_FENCE);
            fabricItemGroupEntries.add(METEORITE_SLAB);
            fabricItemGroupEntries.add(METEORITE_FENCE_GATE);
            fabricItemGroupEntries.add(METEORITE_PRESSURE_PLATE);
            fabricItemGroupEntries.add(METEORITE_WALL);
            fabricItemGroupEntries.add(METEORITE_TRAPDOOR);
            fabricItemGroupEntries.add(URANIUM_ORE);
            fabricItemGroupEntries.add(URANIUM_BLOCK);
            fabricItemGroupEntries.add(URANIUM_END_ORE);
            fabricItemGroupEntries.add(URANIUM_NETHER_ORE);
            fabricItemGroupEntries.add(DEEPSLATE_URANIUM_ORE);
            fabricItemGroupEntries.add(MOON_ROCK);
            fabricItemGroupEntries.add(MOON_ROCK_BUTTON);
            fabricItemGroupEntries.add(MOON_ROCK_STAIRS);
            fabricItemGroupEntries.add(MOON_ROCK_DOOR);
            fabricItemGroupEntries.add(MOON_ROCK_FENCE);
            fabricItemGroupEntries.add(MOON_ROCK_SLAB);
            fabricItemGroupEntries.add(MOON_ROCK_FENCE_GATE);
            fabricItemGroupEntries.add(MOON_ROCK_PRESSURE_PLATE);
            fabricItemGroupEntries.add(MOON_ROCK_WALL);
            fabricItemGroupEntries.add(MOON_ROCK_TRAPDOOR);
            fabricItemGroupEntries.add(MOON_LAMP);
            fabricItemGroupEntries.add(ENDERITE_DEBRIS);
            fabricItemGroupEntries.add(ENDERITE_BLOCK);
            fabricItemGroupEntries.add(CHORUS_LOG);
            fabricItemGroupEntries.add(STRIPPED_CHORUS_LOG);
            fabricItemGroupEntries.add(CHORUS_WOOD);
            fabricItemGroupEntries.add(STRIPPED_CHORUS_WOOD);
            fabricItemGroupEntries.add(CHORUS_PLANKS);
            fabricItemGroupEntries.add(CHORUS_LEAVES);
            fabricItemGroupEntries.add(CHORUS_SAPLING);
            fabricItemGroupEntries.add(CHORUS_BUTTON);
            fabricItemGroupEntries.add(CHORUS_STAIRS);
            fabricItemGroupEntries.add(CHORUS_DOOR);
            fabricItemGroupEntries.add(CHORUS_FENCE);
            fabricItemGroupEntries.add(CHORUS_SLAB);
            fabricItemGroupEntries.add(CHORUS_FENCE_GATE);
            fabricItemGroupEntries.add(CHORUS_PRESSURE_PLATE);
            fabricItemGroupEntries.add(CHORUS_WALL);
            fabricItemGroupEntries.add(CHORUS_TRAPDOOR);
            fabricItemGroupEntries.add(CHAIR);
        });
    }

}