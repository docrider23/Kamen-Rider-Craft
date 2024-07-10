package com.kelco.kamenridercraft.Items.den_o;

import java.util.HashSet;

import com.kelco.kamenridercraft.Items.Den_O_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.server.ServerLifecycleHooks;


public class RiderPassItem extends BaseItem {

	public RiderPassItem (Properties properties)
	{
		super(properties);
	}

	public static void teleportToDimension(ServerLevel otherDim, Player player, Vec3 loc) {
		BlockPos destY = new BlockPos((int)loc.x, 61, (int)loc.z);

        int tries = 0;
        while ((otherDim.getBlockState(destY).getBlock() != Blocks.AIR) &&
                !otherDim.getBlockState(destY).canBeReplaced(Fluids.WATER) &&
                (otherDim.getBlockState(destY.below()).getBlock() != Blocks.AIR) &&
                !otherDim.getBlockState(destY.below()).canBeReplaced(Fluids.WATER) && (tries < 25)) {
            destY = destY.above(2);
            tries++;
        }
	    player.teleportTo(otherDim, loc.x, destY.getY(), loc.z, new HashSet<>(), 0, 0);
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {
		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ResourceKey<Level> SANDS_OF_TIME = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("kamenridercraft:sands_of_time"));
		MinecraftServer Server = ServerLifecycleHooks.getCurrentServer();  

		if (!p_41128_.isClientSide()) {
			if (p_41128_.dimension() == SANDS_OF_TIME) {
				teleportToDimension(Server.getLevel(Level.OVERWORLD), p_41129_, p_41129_.getPosition(0));
			} else {
				teleportToDimension(Server.getLevel(SANDS_OF_TIME), p_41129_, p_41129_.getPosition(0));
			}
			if (this==Den_O_Rider_Items.RIDER_PASS.get()) {itemstack.hurtAndBreak(1, p_41129_, player -> player.broadcastBreakEvent(player.getUsedItemHand()));}
			p_41129_.getCooldowns().addCooldown(this, 500);
		}
		
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}