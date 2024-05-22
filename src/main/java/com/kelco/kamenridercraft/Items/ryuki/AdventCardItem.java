package com.kelco.kamenridercraft.Items.ryuki;

import com.kelco.kamenridercraft.Items.Ryuki_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class AdventCardItem extends BaseItem {

	public String RIDER;
	public Item WEAPON;
	public Item VISOR;

	public AdventCardItem (Properties properties, String rider, Item weapon, Item visor)
	{
		super(properties);
		
		RIDER = rider;
		WEAPON = weapon;
		VISOR = visor;
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {
		
		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);
		
		if (p_41129_.getInventory().countItem(VISOR)!=0) {
			if (p_41129_.getItemBySlot(EquipmentSlot.LEGS).getItem() == Ryuki_Rider_Items.RYUKILEGGINGS.get()){
				if (p_41129_.getItemBySlot(EquipmentSlot.CHEST).getItem() == Ryuki_Rider_Items.RYUKICHESTPLATE.get()){
					if (p_41129_.getItemBySlot(EquipmentSlot.HEAD).getItem() == Ryuki_Rider_Items.RYUKIHELMET.get()){
						if (p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RiderDriverItem){
							if (RIDER == ((RiderDriverItem)p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem()).Rider | (p_41129_.getInventory().countItem(Ryuki_Rider_Items.SLASH_VISOR.get())!=0 && ((RiderDriverItem)p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem()).Rider == "alternative_zero")) {
								if (!p_41128_.isClientSide()) {
									p_41129_.drop(new ItemStack(WEAPON), true);
									
									if (this == Ryuki_Rider_Items.DEST_CLAW_VENT.get())
									{
										p_41129_.drop(new ItemStack(Ryuki_Rider_Items.DEST_CLAW1.get()), true);
									}
									if (this == Ryuki_Rider_Items.DRAG_SHIELD_VENT.get() | this == Ryuki_Rider_Items.DRAG_SHIELD_VENT_RYUGA.get() | this == Ryuki_Rider_Items.GOLD_SABER_VENT.get() | this == Ryuki_Rider_Items.ABYSS_SABER_VENT.get())
									{
										p_41129_.drop(new ItemStack(WEAPON), true);
									}
									
									if	(!p_41129_.isCreative()) {
										itemstack.shrink(1);
									}
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