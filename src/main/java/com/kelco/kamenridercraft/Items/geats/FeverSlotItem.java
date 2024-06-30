package com.kelco.kamenridercraft.Items.geats;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kelco.kamenridercraft.Items.Geats_Rider_Items;
import com.kelco.kamenridercraft.Items.Hibiki_Rider_Items;
import com.kelco.kamenridercraft.Items.Kabuto_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class FeverSlotItem extends BaseItem {

	public String RIDER;
    public static List<Item> FEVER_SLOT= new ArrayList<Item>();
    
    
	public FeverSlotItem (Properties properties)
	{
		super(properties);
	}

	
    private RiderFormChangeItem RandomForm() {
 		Random generator = new Random();
 			int rand = generator.nextInt(FEVER_SLOT.size());
 			return (RiderFormChangeItem) FEVER_SLOT.get(rand);
 		
 	}
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {

		ItemStack itemstack = player.getItemInHand(hand);

		String[] ClockUpUsers = Geats_Rider_Items.BaseDesireDriverUsers;


		if (player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof  DesireDriverItem){
			for (int i = 0; i < ClockUpUsers.length; i++) {
				if (ClockUpUsers[i]==((RiderDriverItem)player.getItemBySlot(EquipmentSlot.FEET).getItem()).Rider){
					if (!world.isClientSide()) {
						RandomForm().use(world, player, hand);
						player.getCooldowns().addCooldown(this, 50);
					}
				}
			}
		}

		return InteractionResultHolder.sidedSuccess(itemstack, world.isClientSide());
	}
}