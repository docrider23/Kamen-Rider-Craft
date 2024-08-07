package com.kelco.kamenridercraft.Items.ex_aid;

import java.util.List;

import com.google.common.collect.Lists;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.Ex_Aid_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;

import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class ExAidEnergyItem extends BaseItem{

	private List<MobEffectInstance> potionEffectList;

	public ExAidEnergyItem (Properties properties, MobEffectInstance... effects)
	{
		super(properties);
		potionEffectList = Lists.newArrayList(effects);
	}


	public void  useEnergyItem (ItemStack itemstack, Level world,Player playerIn) {
		if (!world.isClientSide()) {
			for (int i = 0; i < potionEffectList.size(); i++)
			{
				playerIn.addEffect(new MobEffectInstance(potionEffectList.get(i).getEffect(),potionEffectList.get(i).getDuration(),potionEffectList.get(i).getAmplifier(),true,false));
			}
			itemstack.shrink(1);	
			playerIn.awardStat(Stats.ITEM_USED.get(this));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int num, boolean flag) {
		//&playerIn.getInventory().countItem(Ex_Aid_Rider_Items.ENERGY_ITEM_HOLDER.get())!=0
		if (entity instanceof Player playerIn
		&& !playerIn.hasEffect(Effect_core.BUGSTER.get())
		&& playerIn.getInventory().countItem(Ex_Aid_Rider_Items.ENERGY_ITEM_HOLDER.get())==0) this.useEnergyItem(itemstack,world, playerIn);
	}

	@Override
		public InteractionResultHolder<ItemStack> use(Level world, Player playerIn, InteractionHand p_41434_) {
			ItemStack itemstack = playerIn.getItemInHand(p_41434_);

			this.useEnergyItem(itemstack,world, playerIn);
			return InteractionResultHolder.consume(itemstack);
		}

	}