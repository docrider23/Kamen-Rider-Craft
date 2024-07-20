package com.kelco.kamenridercraft.Items.ex_aid;


import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.summons.BaseSummonEntity;
import com.kelco.kamenridercraft.Items.Ex_Aid_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ParaDXSummonItem extends RiderFormChangeItem {

	public static boolean ParaDXSummoned = false;

	public ParaDXSummonItem( Properties properties,int belt,String formName,String ridername,String beltTex, MobEffectInstance... effects) {
		super( properties, belt, formName, ridername, beltTex, effects);
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {
		super.use(p_41128_, p_41129_, p_41130_);
		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ItemStack BELT = p_41129_.getItemBySlot(EquipmentSlot.FEET);

		if (!p_41129_.hasEffect(Effect_core.FORM_LOCK.get()) && ParaDXSummoned == false && BELT.getItem() == Ex_Aid_Rider_Items.GAMER_DRIVER_EX_AID.get()) {
			BaseSummonEntity paradx = MobsCore.PARADX_SUMMON.get().create(p_41128_);
			if (paradx != null) {
				paradx.moveTo(p_41129_.getX(), p_41129_.getY()+1, p_41129_.getZ(), p_41129_.getYRot(), p_41129_.getXRot());
				paradx.setTame(true);
				paradx.setOwnerUUID(p_41129_.getUUID());
				if (itemstack.getItem()==Ex_Aid_Rider_Items.KNOCK_OUT_FIGHTER_2_GASHAT.get()) {
					paradx.setItemSlot(EquipmentSlot.FEET, new ItemStack(Ex_Aid_Rider_Items.GAMER_DRIVER_PARA_DX.get()));
					RiderDriverItem.set_Form_Item(paradx.getItemBySlot(EquipmentSlot.FEET), Ex_Aid_Rider_Items.KNOCK_OUT_FIGHTER_2_GASHAT.get(), 1);
				}
				p_41128_.addFreshEntity(paradx);
				ParaDXSummoned = true;
			}
		}
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());

	}

	
}
