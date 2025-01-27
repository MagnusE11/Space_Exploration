package main.java.net.magnus.mod.trim;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimPattern;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModTrimPatterns {
    public static final RegistryKey<ArmorTrimPattern> ENDERITE = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(Mod.MOD_ID, "enderite"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context) {
        register(context, ModItems.ENDERITE_SMITHING_TEMPLATE, ENDERITE);
    }

    private static void register(Registerable<ArmorTrimPattern> context, Item item, RegistryKey<ArmorTrimPattern> key) {
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(key.getValue(), Registries.ITEM.getEntry(item),
                Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false);

        context.register(key, trimPattern);
    }
}
