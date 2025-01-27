package main.java.net.magnus.mod.enchantment;

import com.mojang.serialization.MapCodec;
import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.enchantment.custom.LightningStrikerEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {
    public static final MapCodec<? extends EnchantmentEntityEffect> LIGHTNING_STRIKER =
            registerEntityEffect("lightning_striker", LightningStrikerEnchantmentEffect.CODEC);

    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends EnchantmentEntityEffect> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(Mod.MOD_ID, name), codec);
    }

    public static void registerEnchantmentEffects() {
        Mod.LOGGER.info("Registering Mod Enchantments For Space Exploration " + Mod.MOD_ID);
    }
}
