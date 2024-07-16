package com.kelco.kamenridercraft.Items.decade;

import java.util.List;

import com.google.common.collect.Lists;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.summons.BaseSummonEntity;
import com.kelco.kamenridercraft.Items.Decade_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class AttackRideCardItem extends BaseItem {

	public String[] FORMS = new String[] {""};
	private List<MobEffectInstance> EFFECTS;
	public Item ITEM;
	public int DAMAGE;
	public String SPECIAL;

	public AttackRideCardItem (Properties properties, String[] forms, MobEffectInstance... effects)
	{
		super(properties);
		
		FORMS = forms;
		EFFECTS = Lists.newArrayList(effects);
	}

	public AttackRideCardItem (Properties properties, String[] forms, Item item, int damage)
	{
		super(properties);
		
		FORMS = forms;
		ITEM = item;
		DAMAGE = damage;
	}

	public AttackRideCardItem (Properties properties, String[] forms, String special)
	{
		super(properties);
		
		FORMS = forms;
		SPECIAL = special;
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {
		
		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);
		
		if (p_41129_.getItemBySlot(EquipmentSlot.LEGS).getItem() == Decade_Rider_Items.DECADELEGGINGS.get()){
			if (p_41129_.getItemBySlot(EquipmentSlot.CHEST).getItem() == Decade_Rider_Items.DECADECHESTPLATE.get()){
				if (p_41129_.getItemBySlot(EquipmentSlot.HEAD).getItem() == Decade_Rider_Items.DECADEHELMET.get()){
					if (p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem() == Decade_Rider_Items.DECADRIVER.get() || p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem() == Decade_Rider_Items.DIEND_BELT.get() || p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem() == Decade_Rider_Items.DARK_DECADRIVER.get()){
						boolean matchFound = false;
						ItemStack belt = p_41129_.getItemBySlot(EquipmentSlot.FEET);
						for (int i = 0; i < FORMS.length; i++)
						{
							if (((RiderDriverItem) belt.getItem()).GET_TEXT(belt, null, p_41129_, ((RiderDriverItem) belt.getItem()).Rider).equals(FORMS[i])){
								matchFound = !matchFound;
							}
						}

						if (matchFound && !p_41128_.isClientSide()) {
							if (EFFECTS != null) {
								for (int i = 0; i < EFFECTS.size(); i++)
								{
									p_41129_.addEffect(new MobEffectInstance(EFFECTS.get(i).getEffect(),EFFECTS.get(i).getDuration(),EFFECTS.get(i).getAmplifier(),true,false));
								}
							} else if (ITEM != null) {
								ItemStack item = new ItemStack(ITEM, 1);
								if (DAMAGE > 0) {
									item.setDamageValue(DAMAGE);
									item.setRepairCost(Integer.MAX_VALUE); // No cheating with anvils, sorry not sorry
								}

								ItemEntity entity = new ItemEntity(p_41128_, p_41129_.getX(), p_41129_.getY(), p_41129_.getZ(), item, 0, 0, 0);
								entity.setPickUpDelay(3);
								p_41128_.addFreshEntity(entity);
							} else {
								switch (SPECIAL) {
									case "illusion":
										for (int i = 0; i < 4; i++)
										{
											BaseSummonEntity illusion = MobsCore.DECADE_ILLUSION.get().create(p_41128_);
											if (illusion != null) {
												illusion.moveTo(p_41129_.getX(), p_41129_.getY(), p_41129_.getZ(), p_41129_.getYRot(), p_41129_.getXRot());
												illusion.tame(p_41129_);
												if (RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1)==Decade_Rider_Items.DECADE_VIOLENT_EMOTION_CARD.get()) {
													RiderDriverItem.set_Form_Item(illusion.getItemBySlot(EquipmentSlot.FEET), Decade_Rider_Items.DECADE_VIOLENT_EMOTION_CARD.get(), 1);
												} else if (RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1)==Decade_Rider_Items.DECADE_CYAN_CRAD.get()) {
													RiderDriverItem.set_Form_Item(illusion.getItemBySlot(EquipmentSlot.FEET), Decade_Rider_Items.DECADE_CYAN_CRAD.get(), 1);
												} else if (p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem()==Decade_Rider_Items.DARK_DECADRIVER.get()) {
													illusion.setItemSlot(EquipmentSlot.FEET, new ItemStack(Decade_Rider_Items.DARK_DECADRIVER.get()));
												}
												p_41128_.addFreshEntity(illusion);
											}
										}
										break;
									case "diend_illusion": // Please don't touch this, I'm gonna change it when I get the chance
										for (int i = 0; i < 4; i++)
										{
											BaseSummonEntity illusion = MobsCore.DECADE_ILLUSION.get().create(p_41128_);
											// BaseSummonEntity illusion = MobsCore.DIEND_ILLUSION.get().create(p_41128_);
											if (illusion != null) {
												illusion.moveTo(p_41129_.getX(), p_41129_.getY(), p_41129_.getZ(), p_41129_.getYRot(), p_41129_.getXRot());
												illusion.tame(p_41129_);
												illusion.setItemSlot(EquipmentSlot.FEET, new ItemStack(Decade_Rider_Items.DIEND_BELT.get()));
												illusion.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Decade_Rider_Items.DIENDRIVER.get()));
												if (RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1)==Decade_Rider_Items.DIEND_GREEN_CRAD.get()) {
													RiderDriverItem.set_Form_Item(illusion.getItemBySlot(EquipmentSlot.FEET), Decade_Rider_Items.DIEND_GREEN_CRAD.get(), 1);
												} 
												p_41128_.addFreshEntity(illusion);
											}
										}
										break;
									case "ore_sanjou":
										p_41129_.sendSystemMessage(Component.translatable("I... have arrived!").withStyle(ChatFormatting.RED));
										break;
									case "bokuni_tsurarete_miru":
										p_41129_.sendSystemMessage(Component.translatable("Mind if I reel you in?").withStyle(ChatFormatting.BLUE));
										break;
									case "nakerude":
										p_41129_.sendSystemMessage(Component.translatable("You cried!").withStyle(ChatFormatting.YELLOW));
										break;
									case "kotaewa_kiite_nai":
										p_41129_.sendSystemMessage(Component.translatable("I can't hear your answer!").withStyle(ChatFormatting.DARK_PURPLE));
										break;
									default:
										break;
								}
							}

							if	(!p_41129_.isCreative()) {
								itemstack.shrink(1);
							}
							p_41129_.getCooldowns().addCooldown(this, 500);
						}
					}
				}
			}
		}
		
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}