package com.kelco.kamenridercraft.Items.rider_armor_base;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CopyFormChangeItem extends BaseItem {

	private  RiderFormChangeItem FORM_ITEM;
	
	public CopyFormChangeItem( Properties properties, Item form_item) {
		super( properties);
		if ( form_item instanceof RiderFormChangeItem form) FORM_ITEM=form;
	
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		if (FORM_ITEM !=null)FORM_ITEM.use(p_41128_, p_41129_, p_41130_);
		
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());

	}
}
