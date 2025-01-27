package main.java.net.magnus.mod.world.gen;

import main.java.net.magnus.mod.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModBushGeneration {
    public static void generateBushes() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS, BiomeKeys.END_MIDLANDS, BiomeKeys.END_BARRENS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CHORUS_BERRY_BUSH_PLACED_KEY);
    }

}
