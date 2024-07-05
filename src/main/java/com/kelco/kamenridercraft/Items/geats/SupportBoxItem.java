package com.kelco.kamenridercraft.Items.geats;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class SupportBoxItem extends BaseItem{

	  public static List<Item> GIGANT_BUCKLE= new ArrayList<Item>();

	public SupportBoxItem (Properties properties)
	{
		super(properties);
	}

	 private Item ItemDrop() {
	 		Random generator = new Random();
	 			int rand = generator.nextInt(GIGANT_BUCKLE.size());
	 			return GIGANT_BUCKLE.get(rand);
	 	}

	public void  useEnergyItem (ItemStack itemstack, Level world,Player playerIn) {
		
			playerIn.drop(new ItemStack(ItemDrop(), 1), true);
			
		if	(!playerIn.isCreative()) {
			itemstack.shrink(1);
		}
	}


	@Override
		public InteractionResultHolder<ItemStack> use(Level world, Player playerIn, InteractionHand p_41434_) {
			ItemStack itemstack = playerIn.getItemInHand(p_41434_);

			this.useEnergyItem(itemstack,world, playerIn);
			return InteractionResultHolder.consume(itemstack);
		}

	}