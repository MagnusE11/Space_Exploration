package main.java.net.magnus.mod.potion;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final RegistryEntry<Potion> RADIOACTIVE_POTION = registerPotion("radioactive_potion",
            new Potion(new StatusEffectInstance(ModEffects.RADIOACTIVE, 6000, 0)));


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(Mod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        Mod.LOGGER.info("Registering Potions For Space Exploration " + Mod.MOD_ID);
    }
}
