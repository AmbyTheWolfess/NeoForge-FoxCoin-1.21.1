package net.ambythewolfess.foxcoin.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ROSEGOLDCARROT = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2f)
            .build();

    public static final FoodProperties ROSEGOLDAPPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION,400), 1f).effect(() -> new MobEffectInstance(MobEffects.LUCK,2400, 2),1.0f).alwaysEdible().build();

    public static final FoodProperties ENCHANTEDROSEGOLDCARROT = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION,800), 1f).effect(() -> new MobEffectInstance(MobEffects.LUCK, 6000, 4), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2),1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 4), 1.0f)
                    .alwaysEdible().build();
}
