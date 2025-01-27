package main.java.net.magnus.mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponets {
    public static final FoodComponent CHORUS_SNACK = new FoodComponent.Builder().snack().nutrition(10).alwaysEdible().saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20, 0), 0.10f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 2), 0.01f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20, 1), 0.01f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20, 2), 0.01f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1000, 2), 0.05f).build();

    public static final FoodComponent CHORUS_BERRY = new FoodComponent.Builder().snack().nutrition(6).alwaysEdible().saturationModifier(0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20, 0), 0.10f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 2), 0.01f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20, 1), 0.01f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20, 2), 0.01f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1000, 2), 0.05f).build();
}
