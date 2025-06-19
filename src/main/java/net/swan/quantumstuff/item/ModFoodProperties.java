package net.swan.quantumstuff.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties EMERALD_CARROT = new FoodProperties.Builder().nutrition(20).saturationModifier(1.5f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 6000), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL, 20, 1), 0.25F)
            .build();

    public static final FoodProperties QUANTUM_APPLE = new FoodProperties.Builder().nutrition(20).saturationModifier(6.9f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 6000), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL, 20, 99), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10000, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 10000, 9), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 10000, 4), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 5000, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 3000, 2), 1.0F)
            .alwaysEdible()
            .build();


}