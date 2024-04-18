package com.kelco.kamenridercraft.Entities.bosses;

import java.util.Random;

import javax.annotation.Nullable;

import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;
import com.kelco.kamenridercraft.Items.Ex_Aid_Rider_Items;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import com.kelco.kamenridercraft.Items.W_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.BossEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CronusEntity extends BaseHenchmenEntity {
	
	   private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(this.getDisplayName(), BossEvent.BossBarColor.GREEN, BossEvent.BossBarOverlay.PROGRESS));

	
    public CronusEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Ex_Aid_Rider_Items.EX_AIDHELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Ex_Aid_Rider_Items.EX_AIDCHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Ex_Aid_Rider_Items.EX_AIDLEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET,new ItemStack(Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II_CHRONOS.get()));
        this.setItemSlot(EquipmentSlot.MAINHAND,new ItemStack(Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II.get()));
    }

	public void tick() {
		if (this.getHealth()<100) {
			if(getItemBySlot(EquipmentSlot.FEET).getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II_CHRONOS.get()){
				ItemStack belt = getItemBySlot(EquipmentSlot.FEET);
				if (RiderDriverItem.get_Form_Item(belt,1)!=Ex_Aid_Rider_Items.KAMEN_RIDER_CHRONICLE_GASHAT_GEMEDEUS.get()) {
					RiderDriverItem.set_Form_Item(belt, Ex_Aid_Rider_Items.KAMEN_RIDER_CHRONICLE_GASHAT_GEMEDEUS.get(), 1);
			        this.setItemSlot(EquipmentSlot.MAINHAND,new ItemStack(Ex_Aid_Rider_Items.DEUS_RUSHER.get()));
			        this.setItemSlot(EquipmentSlot.OFFHAND,new ItemStack(Ex_Aid_Rider_Items.DEUS_RAMPART.get()));
				}
			}
		}
		super.tick();
	}

	 protected void customServerAiStep() {
         super.customServerAiStep();
         this.bossEvent.setProgress(this.getHealth() / this.getMaxHealth());
      }
	 
	 
	  public void readAdditionalSaveData(CompoundTag p_31474_) {
	      super.readAdditionalSaveData(p_31474_);
	      if (this.hasCustomName()) {
	         this.bossEvent.setName(this.getDisplayName());
	      }
	   }

	   public void setCustomName(@Nullable Component p_31476_) {
	      super.setCustomName(p_31476_);
	      this.bossEvent.setName(this.getDisplayName());
	   }
    
	   public void startSeenByPlayer(ServerPlayer p_31483_) {
		      super.startSeenByPlayer(p_31483_);
		      this.bossEvent.addPlayer(p_31483_);
		   }

		   public void stopSeenByPlayer(ServerPlayer p_31488_) {
		      super.stopSeenByPlayer(p_31488_);
		      this.bossEvent.removePlayer(p_31488_);
		   }
	   
    public static AttributeSupplier setAttributes() {

        return Monster.createMonsterAttributes()
        		.add(Attributes.FOLLOW_RANGE, 135.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.23F)
        		.add(Attributes.ATTACK_DAMAGE, 10.0D)
        		.add(Attributes.ARMOR, 3.0D)
        		.add(Attributes.MAX_HEALTH, 200.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
     }
    

}