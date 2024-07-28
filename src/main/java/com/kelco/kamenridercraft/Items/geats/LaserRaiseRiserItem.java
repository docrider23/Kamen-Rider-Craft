package com.kelco.kamenridercraft.Items.geats;

import com.kelco.kamenridercraft.Items.Geats_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
public class LaserRaiseRiserItem extends BaseBlasterItem {
	
	public LaserRaiseRiserItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);
	}
	
	public void releaseUsing(ItemStack p_40667_, Level p_40668_, LivingEntity p_40669_, int p_40670_) {
        super.releaseUsing(p_40667_, p_40668_, p_40669_, p_40670_);
		if (p_40669_ instanceof Player player && player.getItemBySlot(EquipmentSlot.FEET) == ItemStack.EMPTY) {
			if (player.getItemBySlot(EquipmentSlot.OFFHAND).getItem() == Geats_Rider_Items.ZIIN_RAISE_RISER_CARD.get())
                player.setItemSlot(EquipmentSlot.FEET, new ItemStack(Geats_Rider_Items.RAISE_RISER_BELT_ZIIN.get(), 1));
			else if (player.getItemBySlot(EquipmentSlot.OFFHAND).getItem() == Geats_Rider_Items.KEKERA_RAISE_RISER_CARD.get() || player.getItemBySlot(EquipmentSlot.OFFHAND).getItem() == Geats_Rider_Items.KEKERA_BLACK_RAISE_RISER_CARD.get()) {
                player.setItemSlot(EquipmentSlot.FEET, new ItemStack(Geats_Rider_Items.RAISE_RISER_BELT_KEKERA.get(), 1));
                player.getItemBySlot(EquipmentSlot.OFFHAND).use(p_40668_, player, InteractionHand.OFF_HAND);
            } else if (player.getItemBySlot(EquipmentSlot.OFFHAND).getItem() == Geats_Rider_Items.KYUUN_RAISE_RISER_CARD.get())
                player.setItemSlot(EquipmentSlot.FEET, new ItemStack(Geats_Rider_Items.RAISE_RISER_BELT_KYUUN.get(), 1));
			else if (player.getItemBySlot(EquipmentSlot.OFFHAND).getItem() == Geats_Rider_Items.BEROBA_RAISE_RISER_CARD.get() || player.getItemBySlot(EquipmentSlot.OFFHAND).getItem() == Geats_Rider_Items.BEROBA_BLACK_RAISE_RISER_CARD.get()) {
                player.setItemSlot(EquipmentSlot.FEET, new ItemStack(Geats_Rider_Items.RAISE_RISER_BELT_BEROBA.get(), 1));
                player.getItemBySlot(EquipmentSlot.OFFHAND).use(p_40668_, player, InteractionHand.OFF_HAND);
            }
		}
	}
}