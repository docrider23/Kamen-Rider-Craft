package com.kelco.kamenridercraft.Blocks.MachineBlocks;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kelco.kamenridercraft.Items.Ex_Aid_Rider_Items;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class GanbarizingMachine extends MachineBlock {
	
	  public static List<Item> BLANK_GASHAT= new ArrayList<Item>();
		 
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;


	  public static VoxelShape SHAPE = Block.box(0, 0, 0, 16,32, 16);
	  
	public GanbarizingMachine(Properties properties,VoxelShape shape ) {
		
		super(properties);
		SHAPE =shape;
	}
	
	   @Override
	    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
	        return SHAPE;
	    }

	    @Override
	    public RenderShape getRenderShape(BlockState pState) {
	        return RenderShape.MODEL;
	    }

	   public static boolean isShapeFullBlock(VoxelShape p_49917_) {
		      return false;
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

     private Item getgashatDrop(int num) {
 		Random generator = new Random();
 			int rand = generator.nextInt(BLANK_GASHAT.size());
 			return BLANK_GASHAT.get(rand);

 	}
   
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
    		Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
    	
        if (!pLevel.isClientSide()) {
			 if (pPlayer.getItemInHand(pHand).getItem() == Ex_Aid_Rider_Items.BLANK_GASHAT.get()) process(pPlayer, pLevel, pPos, pHand, getgashatDrop(1));
            return  InteractionResult.sidedSuccess(true);
        }
        return InteractionResult.sidedSuccess(false);
    }



	public GanbarizingMachine AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}