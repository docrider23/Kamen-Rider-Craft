package com.kelco.kamenridercraft.Entities.footSoldiers;

import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Items.Kabuto_Rider_Items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ShadowTrooperEntity extends BaseHenchmenEntity {
	
    public ShadowTrooperEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="shadow_trooper";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Kabuto_Rider_Items.KABUTOHELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Kabuto_Rider_Items.KABUTOCHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Kabuto_Rider_Items.KABUTOLEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Kabuto_Rider_Items.SHADOW_TROOPER_BELT.get()));
        
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Kabuto_Rider_Items.MACHINEGUN_BLADE.get()));
    }

    public static AttributeSupplier setAttributes() {
    
    	//.add(ForgeMod.ATTACK_RANGE.get(),2)
        return Monster.createMonsterAttributes()
        		.add(Attributes.FOLLOW_RANGE, 35.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.23F)
        		.add(Attributes.ATTACK_DAMAGE, 4.0D)
        		.add(Attributes.MAX_HEALTH, 30.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
     }
}