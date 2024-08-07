package com.kelco.kamenridercraft.Items.ryuki;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.summons.BaseSummonEntity;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.Ryuki_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class AdventCardItem extends BaseItem {

	public String RIDER;
	private ArrayList<Item> WEAPONS;
	public String SPECIAL;
	public Item VISOR;

	public AdventCardItem (Properties properties, String rider, Item visor, Item... weapons)
	{
		super(properties);
		
		RIDER = rider;
		VISOR = visor;
		WEAPONS = Lists.newArrayList(weapons);
	}

	public AdventCardItem (Properties properties, String rider, Item visor, String special)
	{
		super(properties);
		
		RIDER = rider;
		VISOR = visor;
		SPECIAL = special;
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
									if (WEAPONS != null) {
										for (int i = 0; i < WEAPONS.size(); i++) {
											ItemStack item = new ItemStack(WEAPONS.get(i), 1);
											if (item != null) {
												ItemEntity entity = new ItemEntity(p_41128_, p_41129_.getX(), p_41129_.getY(), p_41129_.getZ(), item, 0, 0, 0);
												entity.setPickUpDelay(0);
												p_41128_.addFreshEntity(entity);
											}
										}
									} else {
									 	switch (SPECIAL) {
									 		case "trick_vent":
												for (int i = 0; i < 4; i++) {
													BaseSummonEntity trick = MobsCore.RYUKI_TRICK_VENT.get().create(p_41128_);
													if (trick != null) {
														trick.moveTo(p_41129_.getX(), p_41129_.getY()+1, p_41129_.getZ(), p_41129_.getYRot(), p_41129_.getXRot());
														trick.setTame(true);
														trick.setOwnerUUID(p_41129_.getUUID());
														RiderDriverItem.set_Form_Item(trick.getItemBySlot(EquipmentSlot.FEET), RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1), 1);
														if (RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1) == Ryuki_Rider_Items.ADVENT_CARD.get()) {
															trick.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Ryuki_Rider_Items.RIDE_SABER.get()));
															trick.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Ryuki_Rider_Items.RIDE_VISOR.get()));
														}
														else if (RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1) == Ryuki_Rider_Items.SURVIVE_REKKA.get()
															||RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1) == Ryuki_Rider_Items.SURVIVE_BLACK.get()
															||RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1) == Modded_item_core.DRAGRANZER.get()) {
															trick.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Ryuki_Rider_Items.DRAG_BLADE.get()));
														} else trick.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Ryuki_Rider_Items.DRAG_VISOR.get()));
														p_41128_.addFreshEntity(trick);
													}
												}
									 			break;
									 		case "trick_vent_knight":
												for (int i = 0; i < 4; i++) {
													BaseSummonEntity trick = MobsCore.KNIGHT_TRICK_VENT.get().create(p_41128_);
													if (trick != null) {
														trick.moveTo(p_41129_.getX(), p_41129_.getY()+1, p_41129_.getZ(), p_41129_.getYRot(), p_41129_.getXRot());
														trick.setTame(true);
														trick.setOwnerUUID(p_41129_.getUUID());
														RiderDriverItem.set_Form_Item(trick.getItemBySlot(EquipmentSlot.FEET), RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1), 1);
														if (RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1) == Ryuki_Rider_Items.ADVENT_CARD.get()) {
															trick.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Ryuki_Rider_Items.RIDE_SABER.get()));
															trick.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Ryuki_Rider_Items.RIDE_VISOR.get()));
														}
														else if (RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1) == Ryuki_Rider_Items.SURVIVE_SHIPPU.get()) {
															trick.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Ryuki_Rider_Items.DARK_BLADE.get()));
															trick.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Ryuki_Rider_Items.DARK_SHIELD.get()));
														}
														p_41128_.addFreshEntity(trick);
													}
												}
									 			break;
									 		default:
									 			break;
									 	}
									}

									if (!p_41129_.isCreative()) {
										itemstack.shrink(1);
										p_41129_.getCooldowns().addCooldown(this, 500);
									}
									p_41129_.awardStat(Stats.ITEM_USED.get(this));
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