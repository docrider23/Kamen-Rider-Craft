package com.kelco.kamenridercraft.Items.rider_armor_base;


import java.util.List;


import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.events.ModClientEvents;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
public class BaseSwordItem extends SwordItem {

	private Item RepairItem = Modded_item_core.RIDER_CIRCUIT.get();
	private Boolean Change_sword = false;


	public BaseSwordItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);

	}

	public BaseSwordItem ChangeRepairItem(Item item) {
		RepairItem = item;
		return this;
	}

	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem;
	}

	public BaseSwordItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	public static int Get_Mode (ItemStack itemstack)
	{
		if (!itemstack.hasTag()) return  0;
		else return itemstack.getTag().getInt("item_mode");
	}

	public BaseSwordItem IsChangeSword() {
		Change_sword=true;
		ModClientEvents.CHANGE_SWORD_ITEM.add(this);
		return this;
	}

	public static void Set_Mode(ItemStack itemstack)
	{
		if (!itemstack.hasTag())itemstack.setTag(new CompoundTag());
		itemstack.getTag().putInt("item_mode", Get_Mode(itemstack)==0? 1:0);
	}



	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand p_41130_) {
		ItemStack itemstack = player.getItemInHand(p_41130_);
		if (Change_sword) {
			if (player.isShiftKeyDown()) {
				Set_Mode(itemstack);
			}

			if (Get_Mode(itemstack)==0) {
				
			}
			
		}	
		   return InteractionResultHolder.pass(player.getItemInHand( p_41130_));
	}


}