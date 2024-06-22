package com.kelco.kamenridercraft.Entities.bosses;


import javax.annotation.Nullable;

import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;
import com.kelco.kamenridercraft.Items.Ex_Aid_Rider_Items;
import com.kelco.kamenridercraft.Items.Faiz_Rider_Items;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.ChatFormatting;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.BossEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AnkhCompleteEntity extends BaseHenchmenEntity {

	private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(Component.translatable(getDisplayName().getString()).withStyle(ChatFormatting.RED), BossEvent.BossBarColor.RED, BossEvent.BossBarOverlay.PROGRESS));


 
	
	public AnkhCompleteEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="ankh_complete";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(OOO_Rider_Items.OOOHELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(OOO_Rider_Items.OOOCHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(OOO_Rider_Items.OOOLEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(OOO_Rider_Items.GREEED_BLET_ANKH.get()));
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
        		.add(Attributes.FOLLOW_RANGE, 35.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.2F)
        		.add(Attributes.ATTACK_DAMAGE, 15.0D)
        		.add(Attributes.ARMOR, 4.0D)
        		.add(Attributes.MAX_HEALTH, 250.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
     }
}