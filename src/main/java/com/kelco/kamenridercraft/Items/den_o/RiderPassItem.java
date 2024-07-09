package com.kelco.kamenridercraft.Items.den_o;

import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class RiderPassItem extends BaseItem {

	public RiderPassItem (Properties properties)
	{
		super(properties);
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		// :Lovekov:

        p_41129_.getCooldowns().addCooldown(this, 500);
		
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}