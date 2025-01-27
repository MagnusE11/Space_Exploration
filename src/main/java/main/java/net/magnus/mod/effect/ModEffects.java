package main.java.net.magnus.mod.effect;

import main.java.net.magnus.mod.Mod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> RADIOACTIVE = registerStatusEffect("radioactive",
            new RadioactiveEffect(StatusEffectCategory.HARMFUL, 2293580)
                    .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH,
                            Identifier.of(Mod.MOD_ID, "radioactive"), -0.25f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Mod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        Mod.LOGGER.info("Registering Effects For Space Exploration" + Mod.MOD_ID);
    }
}
