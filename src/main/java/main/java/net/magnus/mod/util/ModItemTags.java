package main.java.net.magnus.mod.util;

import main.java.net.magnus.mod.Mod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> CHORUS_LOGS = createTag("chorus_logs");
    public static final TagKey<Item> SPAWN_EGGS = createTag("spawn_eggs");
    public static final TagKey<Item> MUSIC_DISCS = createTag("music_discs");
    public static final TagKey<Item> THROWABLE_PROJECTILES = createTag("throwable_projectiles");
    private ModItemTags() {
    }

    private static TagKey<Item> createTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Mod.MOD_ID, name));
    }
}
