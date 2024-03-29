package com.kelco.kamenridercraft.Effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class SleepEffect extends InstantenousMobEffect {

	public SleepEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}

	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
		if (!pLivingEntity.level().isClientSide()) {
		     if (pLivingEntity.level() instanceof ServerLevel ) {
		         ((ServerLevel)pLivingEntity.level()).setDayTime(0);
		      }
		}
	}
}