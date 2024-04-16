package com.kelco.kamenridercraft.Effect;

import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;


public class ResetEffect extends InstantenousMobEffect {


	public ResetEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}



	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
		if (!pLivingEntity.level().isClientSide()) {

			if (pLivingEntity.getItemBySlot(EquipmentSlot.FEET)!=null&!pLivingEntity.hasEffect(Effect_core.MUTEKI.get())) {
				if (pLivingEntity.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RiderDriverItem) {	
				RiderDriverItem.reset_Form_Item(pLivingEntity.getItemBySlot(EquipmentSlot.FEET));
				}
			}
		}
	}
}