package io.github.PAntomie;

import io.github.PAntomie.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;


public class QJFItem extends Item {
    public QJFItem() {
        super(new Item.Properties()
                .rarity(Rarity.EPIC)
                .food(new FoodProperties.Builder()
                        .nutrition(4)
                        .saturationMod(1.2F)
                        .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F)
                        .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
                        .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 2), 1.0F)
                        .effect(new MobEffectInstance(MobEffects.GLOWING, 40, 0), 1.0F)
                        .fast()
                        .build()));
    }
    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, Level level, @NotNull LivingEntity entity) {
        if (!level.isClientSide) {
            level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                    SoundEvents.WDFMSL.get(),
                    SoundSource.PLAYERS, 0.16F, 1.0F);
        }

        return super.finishUsingItem(stack, level, entity);
    }
}