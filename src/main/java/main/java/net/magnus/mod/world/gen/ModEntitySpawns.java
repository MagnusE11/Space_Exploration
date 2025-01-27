package main.java.net.magnus.mod.world.gen;

import main.java.net.magnus.mod.entity.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocation;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawns {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
                BiomeKeys.END_BARRENS,
                BiomeKeys.END_MIDLANDS,
                BiomeKeys.END_HIGHLANDS,
                BiomeKeys.SMALL_END_ISLANDS,
                BiomeKeys.THE_END), SpawnGroup.MONSTER, ModEntities.ENDER_BRUTE, 27, 1, 3);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
                BiomeKeys.END_BARRENS,
                BiomeKeys.END_MIDLANDS,
                BiomeKeys.END_HIGHLANDS,
                BiomeKeys.SMALL_END_ISLANDS,
                BiomeKeys.THE_END), SpawnGroup.MONSTER, ModEntities.ENDER_WORM, 12, 1, 4);


        SpawnRestriction.register(ModEntities.ENDER_WORM, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
        SpawnRestriction.register(ModEntities.ENDER_BRUTE, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);
    }
}
