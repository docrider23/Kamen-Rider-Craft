package com.kelco.kamenridercraft.Blocks.MachineBlocks;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kelco.kamenridercraft.Blocks.Rider_Blocks;
import com.kelco.kamenridercraft.Items.Zero_One_Rider_Items;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;


public class ProgrisekeyPrinter extends MachineBlock {
	
	  public static List<Item> HIDEN_PROGRISEKEY= new ArrayList<Item>();
	  public static List<Item> HUMAGEAR_PROGRISEKEY= new ArrayList<Item>();
	  public static List<Item> ZAIA_PROGRISEKEY= new ArrayList<Item>();
		 
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public ProgrisekeyPrinter(Properties properties) {
        super(properties);
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

     private Item getProgrisekeyDrop(int num) {
 		Random generator = new Random();
 		if (num==1){
 			int rand = generator.nextInt(HIDEN_PROGRISEKEY.size());
 			return HIDEN_PROGRISEKEY.get(rand);
 		} else if (num==2){
 			int rand = generator.nextInt(HUMAGEAR_PROGRISEKEY.size());
 			return HUMAGEAR_PROGRISEKEY.get(rand);
 		} else {
 			int rand = generator.nextInt(ZAIA_PROGRISEKEY.size());
 			return ZAIA_PROGRISEKEY.get(rand);
 		}
 	}
   
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
    		Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
    	
        if (!pLevel.isClientSide()) {
            if (this.asBlock() == Rider_Blocks.ZAIA_3D_PRINTER.get()) {
                if (pPlayer.getItemInHand(pHand).getItem() == Zero_One_Rider_Items.BLANK_PROGRISEKEY.get()) process(pPlayer, pLevel, pPos, pHand, getProgrisekeyDrop(0));
            } else {
                if (pPlayer.getItemInHand(pHand).getItem() == Zero_One_Rider_Items.BLANK_PROGRISEKEY.get()) process(pPlayer, pLevel, pPos, pHand, getProgrisekeyDrop(1));
			    else if (pPlayer.getItemInHand(pHand).getItem() == Zero_One_Rider_Items.HUMAGEAR_PROGRISEKEY.get()) process(pPlayer, pLevel, pPos, pHand, getProgrisekeyDrop(2));
            }
            return  InteractionResult.sidedSuccess(true);
        }
        return InteractionResult.sidedSuccess(false);
    }



	public ProgrisekeyPrinter AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}