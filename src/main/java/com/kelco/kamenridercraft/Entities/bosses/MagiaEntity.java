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

public class MagiaEntity extends BaseHenchmenEntity {
	

	
    public MagiaEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="magia";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.ZETSUMERISER_BEROTHA.get()));
		
		switch (this.getRandom().nextInt(9)) {
		  case 0:
			  this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.ZETSUMERISER_KUEHNE.get()));
			  break;
		  case 1:
			  this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.ZETSUMERISER_EKAL.get()));
			  break;
		  case 2:
			  this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.ZETSUMERISER_NEOHI.get()));
			  break;
		  case 3:
			  this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.ZETSUMERISER_ONYCHO.get()));
			  break;
		  case 4:
			  this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.ZETSUMERISER_VICARYA.get()));
			  break;
		  case 5:
			  this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.ZETSUMERISER_GAERU.get()));
			  break;
		  case 6:
			  this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.ZETSUMERISER_MAMMOTH.get()));
			  break;
		  case 7:
			  this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.ZETSUMERISER_ARSINO.get()));
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