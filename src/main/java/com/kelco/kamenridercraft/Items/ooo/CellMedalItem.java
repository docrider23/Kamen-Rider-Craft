package com.kelco.kamenridercraft.Items.ooo;

import java.util.List;

import com.google.common.collect.Lists;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.Ex_Aid_Rider_Items;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class CellMedalItem extends BaseItem{


	public CellMedalItem (Properties properties)
	{
		super(properties);
	}




	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int num, boolean flag) {
		if (entity instanceof Player playerIn) {
					int num1 = playerIn.getInventory().countItem(OOO_Rider_Items.CELL_MEDAL.get());
					int num2 = (num1/64)-1;
					playerIn.addEffect(new MobEffectInstance(Effect_core.GREEED.get(),300,num2));
			}
		}


	}