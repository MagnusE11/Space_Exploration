package main.java.net.magnus.mod.entity;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.entity.custom.ChairEntity;
import main.java.net.magnus.mod.entity.custom.EnderBruteEntity;
import main.java.net.magnus.mod.entity.custom.EnderWormEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<EnderBruteEntity> ENDER_BRUTE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Mod.MOD_ID, "ender_brute"),
            EntityType.Builder.create(EnderBruteEntity::new, SpawnGroup.MONSTER)
                    .dimensions(0.8F, 2.6F)
                    .passengerAttachments(2.80625F)
                    .maxTrackingRange(8)
                    .eyeHeight(2.0F)
                    .build()
    );

    public static final EntityType<EnderWormEntity> ENDER_WORM = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Mod.MOD_ID, "ender_worm"),
            EntityType.Builder.create(EnderWormEntity::new, SpawnGroup.MONSTER)
                    .dimensions(0.5F, 0.4F)
                    .eyeHeight(0.13F)
                    .passengerAttachments(0.2375F)
                    .maxTrackingRange(8)
                    .build()
    );

    public static final EntityType<ChairEntity> CHAIR = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Mod.MOD_ID, "chair_entity"),
            EntityType.Builder.create(ChairEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 0.5f)
                    .build()
    );


    public static void registerModEntities() {
        Mod.LOGGER.info("Registering Mod Entities For Space Exploration " + Mod.MOD_ID);
    }
}
