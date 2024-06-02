package com.kelco.kamenridercraft.Blocks;


import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
public class GlassBaseBlockDropExperience extends GlassBlock implements BeaconBeamBlock  {

	   private final IntProvider xpRange;
	   private DyeColor COL = DyeColor.BLACK;
	   
	   public GlassBaseBlockDropExperience(BlockBehaviour.Properties p_221081_) {
	      this(p_221081_, ConstantInt.of(0),DyeColor.BLACK);

	   }

	   public GlassBaseBlockDropExperience(BlockBehaviour.Properties p_221083_, IntProvider p_221084_,DyeColor col) {
	      super(p_221083_);
	      this.xpRange = p_221084_;
	      COL = col;
	   }

	   public void spawnAfterBreak(BlockState p_221086_, ServerLevel p_221087_, BlockPos p_221088_, ItemStack p_221089_, boolean p_221090_) {
	      super.spawnAfterBreak(p_221086_, p_221087_, p_221088_, p_221089_, p_221090_);

	   }

	   @Override
	   public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader level, net.minecraft.util.RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
	      return silkTouchLevel == 0 ? this.xpRange.sample(randomSource) : 0;
	   }
	   
		public GlassBaseBlockDropExperience AddToTabList(List<Block> TabList) {
			TabList.add(this);
			return this;
		}

		@Override
		public DyeColor getColor() {
			// TODO Auto-generated method stub
			return COL;
		}

}