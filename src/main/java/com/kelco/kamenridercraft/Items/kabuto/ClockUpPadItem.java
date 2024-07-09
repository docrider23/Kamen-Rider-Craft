package com.kelco.kamenridercraft.Items.kabuto;

import com.kelco.kamenridercraft.Items.Kabuto_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class ClockUpPadItem extends BaseItem {

	public ClockUpPadItem (Properties properties)
	{
		super(properties);
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		String[] ClockUpUsers = new String[] {"kabuto","thebee","drake","sasword","gatack","dark_kabuto","kickhopper","punchhopper","ketaros","hercus","caucasus","lady"};
		
		if (p_41129_.getItemBySlot(EquipmentSlot.LEGS).getItem() == Kabuto_Rider_Items.KABUTOLEGGINGS.get()){
			if (p_41129_.getItemBySlot(EquipmentSlot.CHEST).getItem() == Kabuto_Rider_Items.KABUTOCHESTPLATE.get()){
				if (p_41129_.getItemBySlot(EquipmentSlot.HEAD).getItem() == Kabuto_Rider_Items.KABUTOHELMET.get()){
					if (p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RiderDriverItem && RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1).getFormName(false)!="_masked"){
                        for (int i = 0; i < ClockUpUsers.length; i++) {
                            if (ClockUpUsers[i]==((RiderDriverItem)p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem()).Rider){
                                if (!p_41128_.isClientSide()) {
                                    p_41129_.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 250, 20,true,false));
                                    p_41129_.getCooldowns().addCooldown(this, 500);
                                }
                            }
                        }
					}
				}
			}
		}
		
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}