package main.java.net.magnus.mod.item;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.block.ModBlocks;
import main.java.net.magnus.mod.entity.ModEntities;
import main.java.net.magnus.mod.item.custom.*;
import main.java.net.magnus.mod.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


public class ModItems {
    public static final Item PORTAL_LIGHTER = registerItem("portal_lighter", new Portal_Lighter(new Item.Settings().maxDamage(128)));
    public static final Item PORTAL_FRAGMENT = registerItem("portal_fragment", new Item(new Item.Settings()));
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new Item(new Item.Settings()));
    public static final Item URANIUM_NUGGET = registerItem("uranium_nugget", new Item(new Item.Settings()));
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings()));
    public static final Item ENDERITE_SCRAP = registerItem("enderite_scrap", new Item(new Item.Settings()));

    public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
            new EnderiteSwordItem(ModToolMaterials.ENDERITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ENDERITE, 3, -2.4f)))
    );
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new EnderitePickaxeItem(ModToolMaterials.ENDERITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ENDERITE, 1, -2.8f)))
    );
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new EnderiteShovelItem(ModToolMaterials.ENDERITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ENDERITE, 1.5f, -3.0f)))
    );
    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new EnderiteAxeItem(ModToolMaterials.ENDERITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ENDERITE, 6, -3.2f)))
    );
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new EnderiteHoeItem(ModToolMaterials.ENDERITE, new Item.Settings()
                    .attributeModifiers(UpgradedEnderiteHoeItem.createAttributeModifiers(ModToolMaterials.ENDERITE, 0, -3.0f)))
    );
    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet",
            new ModArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate",
            new ModArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings",
            new ModArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots",
            new ModArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));


    public static final Item ENDERITE_SCYTHE = registerItem("enderite_scythe",
            new EnderiteScytheItem(ModToolMaterials.UPGRADED_ENDERITE, new Item.Settings()
                    .attributeModifiers(EnderiteScytheItem.createAttributeModifiers(ModToolMaterials.UPGRADED_ENDERITE, 5, -2.0f)))
    );
    public static final Item ENDERITE_HAMMER = registerItem("enderite_hammer",
            new EnderiteHammerItem(ModToolMaterials.UPGRADED_ENDERITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.UPGRADED_ENDERITE, 7, -3.4f)))
    );
    public static final Item ENDERITE_VIKING_AXE = registerItem("enderite_viking_axe",
            new EnderiteVikingAxeItem(ModToolMaterials.UPGRADED_ENDERITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.UPGRADED_ENDERITE, 6, -2.5f)))
    );
    public static final Item ENDERITE_DIGGER = registerItem("enderite_digger",
            new EnderiteDiggerItem(ModToolMaterials.UPGRADED_ENDERITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.UPGRADED_ENDERITE, 1.5f, -2.0f)))
    );
    public static final Item UPGRADED_ENDERITE_HOE = registerItem("upgraded_enderite_hoe",
            new UpgradedEnderiteHoeItem(ModToolMaterials.UPGRADED_ENDERITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.UPGRADED_ENDERITE, 0, -2.0f)))
    );

    public static final Item ENDERITE_HORSE_ARMOR = registerItem("enderite_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false,
                    new Item.Settings()
                            .maxCount(1))
    );

    public static final Item ROMOS_MAGIC_TOUCH_MUSIC_DISC = registerItem("romos_magic_touch_music_disc",
            new Item(new Item.Settings()
                    .jukeboxPlayable(ModSounds.ROMOS_MAGIC_TOUCH_KEY)
                    .maxCount(1))
    );

    public static final Item SAD_PAST_MUSIC_DISC = registerItem("sad_past_music_disc",
            new Item(new Item.Settings()
                    .jukeboxPlayable(ModSounds.SAD_PAST_KEY)
                    .maxCount(1))
    );

    public static final Item LAND_OF_PETALS_MUSIC_DISC = registerItem("land_of_petals_music_disc",
            new Item(new Item.Settings()
                    .jukeboxPlayable(ModSounds.LAND_OF_PETALS_KEY)
                    .maxCount(1))
    );

    public static final Item NIGHTHAWK_ISOLATION_MUSIC_DISC = registerItem("nighthawk_isolation_music_disc",
            new Item(new Item.Settings()
                    .jukeboxPlayable(ModSounds.NIGHTHAWK_ISOLATION_KEY)
                    .maxCount(1))
    );

    public static final Item SHIAWASE_VIP_MUSIC_DISC = registerItem("shiawase_vip_music_disc",
            new Item(new Item.Settings()
                    .jukeboxPlayable(ModSounds.SHIAWASE_VIP_KEY)
                    .maxCount(1))
    );

    public static final Item CHORUS_SEED = registerItem("chorus_seed",
            new AliasedBlockItem(ModBlocks.CHORUS_PLANT_CROP,
                    new Item.Settings())
    );

    public static final Item CHORUS_SNACK = registerItem("chorus_snack",
            new Item(new Item.Settings()
                    .food(ModFoodComponets.CHORUS_SNACK))
    );

    public static final Item CHORUS_BERRIES = registerItem("chorus_berries",
            new AliasedBlockItem(ModBlocks.CHORUS_BERRY_BUSH, new Item.Settings().food(ModFoodComponets.CHORUS_BERRY))
    );

    // colors is integer rgb
    public static final Item ENDER_BRUTE_SPAWN_EGG = registerItem("ender_brute_spawn_egg",
        new SpawnEggItem(ModEntities.ENDER_BRUTE, 	13370285, 0,
                new Item.Settings()));

    public static final Item ENDER_WORM_SPAWN_EGG = registerItem("ender_worm_spawn_egg",
            new SpawnEggItem(ModEntities.ENDER_WORM, 	0, 13370285,
                    new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Mod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Mod.LOGGER.info("Registering Mod Items For Space Exploration " + Mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(PORTAL_FRAGMENT);
            entries.add(PORTAL_LIGHTER);
            entries.add(URANIUM_INGOT);
            entries.add(URANIUM_NUGGET);
            entries.add(ENDERITE_INGOT);
            entries.add(ENDERITE_SCRAP);
            entries.add(ENDERITE_SWORD);
            entries.add(ENDERITE_SCYTHE);
            entries.add(ENDERITE_PICKAXE);
            entries.add(ENDERITE_HAMMER);
            entries.add(ENDERITE_AXE);
            entries.add(ENDERITE_VIKING_AXE);
            entries.add(ENDERITE_SHOVEL);
            entries.add(ENDERITE_DIGGER);
            entries.add(ENDERITE_HOE);
            entries.add(UPGRADED_ENDERITE_HOE);
            entries.add(ENDERITE_HELMET);
            entries.add(ENDERITE_CHESTPLATE);
            entries.add(ENDERITE_LEGGINGS);
            entries.add(ENDERITE_BOOTS);
            entries.add(ENDERITE_HORSE_ARMOR);
            entries.add(ROMOS_MAGIC_TOUCH_MUSIC_DISC);
            entries.add(SAD_PAST_MUSIC_DISC);
            entries.add(LAND_OF_PETALS_MUSIC_DISC);
            entries.add(NIGHTHAWK_ISOLATION_MUSIC_DISC);
            entries.add(SHIAWASE_VIP_MUSIC_DISC);
            entries.add(CHORUS_SEED);
            entries.add(CHORUS_SNACK);
            entries.add(CHORUS_BERRIES);
            entries.add(ENDER_BRUTE_SPAWN_EGG);
            entries.add(ENDER_WORM_SPAWN_EGG);
        });
    }
}
