package main.java.net.magnus.mod.datagen;

import main.java.net.magnus.mod.block.ModBlocks;
import main.java.net.magnus.mod.item.ModItems;
import main.java.net.magnus.mod.util.ModItemTags;
import main.java.net.magnus.mod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.ENDERITE_SWORD)
                .add(ModItems.ENDERITE_SCYTHE);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.ENDERITE_PICKAXE)
                .add(ModItems.ENDERITE_HAMMER);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.ENDERITE_AXE)
                .add(ModItems.ENDERITE_VIKING_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.ENDERITE_SHOVEL)
                .add(ModItems.ENDERITE_DIGGER);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.ENDERITE_HOE)
                .add(ModItems.UPGRADED_ENDERITE_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ENDERITE_HELMET)
                .add(ModItems.ENDERITE_CHESTPLATE)
                .add(ModItems.ENDERITE_LEGGINGS)
                .add(ModItems.ENDERITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.ENDERITE_SWORD)
                .add(ModItems.ENDERITE_SCYTHE)
                .add(ModItems.ENDERITE_PICKAXE)
                .add(ModItems.ENDERITE_HAMMER)
                .add(ModItems.ENDERITE_AXE)
                .add(ModItems.ENDERITE_VIKING_AXE)
                .add(ModItems.ENDERITE_SHOVEL)
                .add(ModItems.ENDERITE_DIGGER)
                .add(ModItems.ENDERITE_HOE)
                .add(ModItems.UPGRADED_ENDERITE_HOE)
                .add(ModItems.ENDERITE_HELMET)
                .add(ModItems.ENDERITE_CHESTPLATE)
                .add(ModItems.ENDERITE_LEGGINGS)
                .add(ModItems.ENDERITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(ModItems.ENDERITE_SWORD)
                .add(ModItems.ENDERITE_SCYTHE)
                .add(ModItems.ENDERITE_HAMMER)
                .add(ModItems.ENDERITE_AXE)
                .add(ModItems.ENDERITE_VIKING_AXE);

        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .add(ModItems.ENDERITE_SWORD)
                .add(ModItems.ENDERITE_SCYTHE);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.ENDERITE_PICKAXE);

        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.ENDERITE_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(ModItems.ENDERITE_SWORD)
                .add(ModItems.ENDERITE_SCYTHE);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.ENDERITE_HELMET)
                .add(ModItems.ENDERITE_CHESTPLATE)
                .add(ModItems.ENDERITE_LEGGINGS)
                .add(ModItems.ENDERITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.ENDERITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.ENDERITE_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.ENDERITE_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.ENDERITE_HELMET);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.ENDERITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.ENDERITE_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.ENDERITE_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.ENDERITE_HELMET);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.ROMOS_MAGIC_TOUCH_MUSIC_DISC)
                .add(ModItems.SAD_PAST_MUSIC_DISC)
                .add(ModItems.LAND_OF_PETALS_MUSIC_DISC)
                .add(ModItems.NIGHTHAWK_ISOLATION_MUSIC_DISC)
                .add(ModItems.SHIAWASE_VIP_MUSIC_DISC);
        getOrCreateTagBuilder(ModItemTags.MUSIC_DISCS)
                .add(ModItems.ROMOS_MAGIC_TOUCH_MUSIC_DISC)
                .add(ModItems.SAD_PAST_MUSIC_DISC)
                .add(ModItems.LAND_OF_PETALS_MUSIC_DISC)
                .add(ModItems.NIGHTHAWK_ISOLATION_MUSIC_DISC)
                .add(ModItems.SHIAWASE_VIP_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.CHORUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHORUS_LOG.asItem())
                .add(ModBlocks.CHORUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHORUS_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.CHORUS_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.CHORUS_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.CHORUS_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.CHORUS_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.CHORUS_FENCE.asItem())
                .add(ModBlocks.CHORUS_FENCE_GATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.CHORUS_PRESSURE_PLATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.CHORUS_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.CHORUS_STAIRS.asItem());

        getOrCreateTagBuilder(ModItemTags.CHORUS_LOGS)
                .add(ModBlocks.CHORUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHORUS_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(ModBlocks.CHORUS_SAPLING.asItem());

        getOrCreateTagBuilder(ModItemTags.SPAWN_EGGS)
                .add(ModItems.ENDER_BRUTE_SPAWN_EGG)
                .add(ModItems.ENDER_WORM_SPAWN_EGG);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.ENDERITE_SMITHING_TEMPLATE);
        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.ENDERITE_INGOT);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ENDERITE_HELMET)
                .add(ModItems.ENDERITE_CHESTPLATE)
                .add(ModItems.ENDERITE_LEGGINGS)
                .add(ModItems.ENDERITE_BOOTS);
    }
}
