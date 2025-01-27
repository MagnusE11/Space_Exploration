package main.java.net.magnus.mod.item;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
    public static final ItemGroup SPACE_EXPLORATION = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Mod.MOD_ID, "space_exploration"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ENDERITE_SCYTHE))
                    .displayName(Text.translatable("itemGroup.mod.space_exploration"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PORTAL_LIGHTER);

                        entries.add(ModItems.PORTAL_FRAGMENT);
                        entries.add(ModBlocks.METEORITE);
                        entries.add(ModBlocks.METEORITE_BUTTON);
                        entries.add(ModBlocks.METEORITE_STAIRS);
                        entries.add(ModBlocks.METEORITE_DOOR);
                        entries.add(ModBlocks.METEORITE_FENCE);
                        entries.add(ModBlocks.METEORITE_SLAB);
                        entries.add(ModBlocks.METEORITE_FENCE_GATE);
                        entries.add(ModBlocks.METEORITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.METEORITE_WALL);
                        entries.add(ModBlocks.METEORITE_TRAPDOOR);
                        entries.add(ModBlocks.URANIUM_ORE);
                        entries.add(ModBlocks.URANIUM_END_ORE);
                        entries.add(ModBlocks.URANIUM_NETHER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_URANIUM_ORE);
                        entries.add(ModBlocks.URANIUM_BLOCK);
                        entries.add(ModItems.URANIUM_INGOT);
                        entries.add(ModItems.URANIUM_NUGGET);
                        entries.add(ModBlocks.MOON_ROCK);
                        entries.add(ModBlocks.MOON_ROCK_BUTTON);
                        entries.add(ModBlocks.MOON_ROCK_STAIRS);
                        entries.add(ModBlocks.MOON_ROCK_DOOR);
                        entries.add(ModBlocks.MOON_ROCK_FENCE);
                        entries.add(ModBlocks.MOON_ROCK_SLAB);
                        entries.add(ModBlocks.MOON_ROCK_FENCE_GATE);
                        entries.add(ModBlocks.MOON_ROCK_PRESSURE_PLATE);
                        entries.add(ModBlocks.MOON_ROCK_WALL);
                        entries.add(ModBlocks.MOON_ROCK_TRAPDOOR);
                        entries.add(ModBlocks.MOON_LAMP);
                        entries.add(ModBlocks.ENDERITE_DEBRIS);
                        entries.add(ModBlocks.ENDERITE_BLOCK);
                        entries.add(ModItems.ENDERITE_INGOT);
                        entries.add(ModItems.ENDERITE_SCRAP);
                        entries.add(ModItems.ENDERITE_SWORD);
                        entries.add(ModItems.ENDERITE_SCYTHE);
                        entries.add(ModItems.ENDERITE_PICKAXE);
                        entries.add(ModItems.ENDERITE_HAMMER);
                        entries.add(ModItems.ENDERITE_AXE);
                        entries.add(ModItems.ENDERITE_VIKING_AXE);
                        entries.add(ModItems.ENDERITE_SHOVEL);
                        entries.add(ModItems.ENDERITE_DIGGER);
                        entries.add(ModItems.ENDERITE_HOE);
                        entries.add(ModItems.UPGRADED_ENDERITE_HOE);
                        entries.add(ModItems.ENDERITE_HELMET);
                        entries.add(ModItems.ENDERITE_CHESTPLATE);
                        entries.add(ModItems.ENDERITE_LEGGINGS);
                        entries.add(ModItems.ENDERITE_BOOTS);
                        entries.add(ModItems.ENDERITE_HORSE_ARMOR);
                        entries.add(ModItems.ROMOS_MAGIC_TOUCH_MUSIC_DISC);
                        entries.add(ModItems.SAD_PAST_MUSIC_DISC);
                        entries.add(ModItems.LAND_OF_PETALS_MUSIC_DISC);
                        entries.add(ModItems.NIGHTHAWK_ISOLATION_MUSIC_DISC);
                        entries.add(ModItems.SHIAWASE_VIP_MUSIC_DISC);
                        entries.add(ModItems.CHORUS_SEED);
                        entries.add(ModItems.CHORUS_SNACK);
                        entries.add(ModItems.CHORUS_BERRIES);
                        entries.add(ModBlocks.CHORUS_LOG);
                        entries.add(ModBlocks.STRIPPED_CHORUS_LOG);
                        entries.add(ModBlocks.CHORUS_WOOD);
                        entries.add(ModBlocks.STRIPPED_CHORUS_WOOD);
                        entries.add(ModBlocks.CHORUS_PLANKS);
                        entries.add(ModBlocks.CHORUS_LEAVES);
                        entries.add(ModBlocks.CHORUS_SAPLING);
                        entries.add(ModBlocks.CHORUS_BUTTON);
                        entries.add(ModBlocks.CHORUS_STAIRS);
                        entries.add(ModBlocks.CHORUS_DOOR);
                        entries.add(ModBlocks.CHORUS_FENCE);
                        entries.add(ModBlocks.CHORUS_SLAB);
                        entries.add(ModBlocks.CHORUS_FENCE_GATE);
                        entries.add(ModBlocks.CHORUS_PRESSURE_PLATE);
                        entries.add(ModBlocks.CHORUS_WALL);
                        entries.add(ModBlocks.CHORUS_TRAPDOOR);
                        entries.add(ModItems.ENDER_BRUTE_SPAWN_EGG);
                        entries.add(ModItems.ENDER_WORM_SPAWN_EGG);
                        entries.add(ModBlocks.CHAIR);
                    }).build());


    public static void registerItemGroups() {
        Mod.LOGGER.info("Registering Item Groups for Space Exploration " + Mod.MOD_ID);
    }
}
