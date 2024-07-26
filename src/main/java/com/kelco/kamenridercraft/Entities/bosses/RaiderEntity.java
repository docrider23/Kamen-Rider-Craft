package com.kelco.kamenridercraft.Entities.bosses;

import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;
import com.kelco.kamenridercraft.Items.Zero_One_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RaiderEntity extends BaseHenchmenEntity {
	

	
    public RaiderEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="raider";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.RAIDRISER.get()));
		switch (this.getRandom().nextInt(7)) {
			case 0:
				RiderDriverItem.set_Form_Item(this.getItemBySlot(EquipmentSlot.FEET), Zero_One_Rider_Items.CRUSHING_BUFFALO_PROGRISEKEY.get(), 1);
				break;
			case 1:
				RiderDriverItem.set_Form_Item(this.getItemBySlot(EquipmentSlot.FEET), Zero_One_Rider_Items.SPLASHING_WHALE_PROGRISEKEY.get(), 1);
				break;
			case 2:
				RiderDriverItem.set_Form_Item(this.getItemBySlot(EquipmentSlot.FEET), Zero_One_Rider_Items.DYNAMAITING_LION_PROGRISEKEY.get(), 1);
				break;
			case 3:
				RiderDriverItem.set_Form_Item(this.getItemBySlot(EquipmentSlot.FEET), Zero_One_Rider_Items.STORMING_PENGUIN_PROGRISEKEY.get(), 1);
				break;
			case 4:
				RiderDriverItem.set_Form_Item(this.getItemBySlot(EquipmentSlot.FEET), Zero_One_Rider_Items.SCOUTING_PANDA_PROGRISEKEY.get(), 1);
				break;
			case 5:
				RiderDriverItem.set_Form_Item(this.getItemBySlot(EquipmentSlot.FEET), Zero_One_Rider_Items.FIGHTING_JACKAL_PROGRISEKEY.get(), 1);
				break;
			default:
				break;
		  }
    }
    

    public static AttributeSupplier setAttributes() {

        return Monster.createMonsterAttributes()
        		.add(Attributes.FOLLOW_RANGE, 135.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.3F)
        		.add(Attributes.ATTACK_DAMAGE, 10.0D)
        		.add(Attributes.ARMOR, 3.0D)
        		.add(Attributes.MAX_HEALTH, 40.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
     }
}