package main.java.net.magnus.mod.util;

import main.java.net.magnus.mod.Mod;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ENDERITE_TOOL = createTag("needs_enderite_tool");
        public static final TagKey<Block> NEEDS_UPGRADED_ENDERITE_TOOL = createTag("needs_enderite_tool");
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("needs_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENDERITE_TOOL = createTag("incorrect_for_enderite_tool");
        public static final TagKey<Block> INCORRECT_FOR_UPGRADED_ENDERITE_TOOL = createTag("incorrect_for_upgraded_enderite_tool");
        public static final TagKey<Block> CHORUS_LOGS = createTag("chorus_logs");
    }

    private static TagKey<Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Mod.MOD_ID, name));
    }
}
