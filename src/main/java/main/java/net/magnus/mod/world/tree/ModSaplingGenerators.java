package main.java.net.magnus.mod.world.tree;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator CHORUSWOOD = new SaplingGenerator(Mod.MOD_ID + ":choruswood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CHORUS_WOOD_KEY), Optional.empty());
}
