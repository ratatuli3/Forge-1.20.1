package net.ratatuli.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties KEVIN_FOOD = new FoodProperties.Builder().nutrition(8)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 69), 1f).build();
}
