package com.kelco.kamenridercraft.Blocks;


import java.util.List;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.BeaconBeamBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.PushReaction;

public class GlassBaseFacingBlock extends GlassBlock implements BeaconBeamBlock  {

	   private DyeColor COL = DyeColor.BLACK;
	   public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

	   public GlassBaseFacingBlock(BlockBehaviour.Properties p_221083_,DyeColor col) {
	      super(p_221083_);
	      COL = col;
          this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	   }

	   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_53681_) {
		p_53681_.add(FACING);
	 	}

	 	public BlockState getStateForPlacement(BlockPlaceContext p_53679_) {
			return this.defaultBlockState().setValue(FACING, p_53679_.getHorizontalDirection().getOpposite());
	 	}

	 	public PushReaction getPistonPushReaction(BlockState p_53683_) {
			return PushReaction.PUSH_ONLY;
	 	}

	 	public BlockState rotate(BlockState p_48722_, Rotation p_48723_) {
			return p_48722_.setValue(FACING, p_48723_.rotate(p_48722_.getValue(FACING)));
	 	}

	   
		public GlassBaseFacingBlock AddToTabList(List<Block> TabList) {
			TabList.add(this);
			return this;
		}

		@Override
		public DyeColor getColor() {
			// TODO Auto-generated method stub
			return COL;
		}

}