package main.java.net.magnus.mod.world.gen;

import main.java.net.magnus.mod.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.URANIUM_ORE_PLACED_KEY);

        // Example for individual Biomes in the future
        // BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, ModBiomeKeys.MOON_FOREST, ModBiomeKeys.CHORUS_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
        //         ModPlacedFeatures.URANIUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_URANIUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_URANIUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_ENDERITE_DEBRIS_PLACED_KEY);


    }
}
