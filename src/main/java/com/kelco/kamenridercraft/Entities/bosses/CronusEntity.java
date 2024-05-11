package com.kelco.kamenridercraft.Entities.bosses;

import java.util.EnumSet;
import java.util.Random;

import javax.annotation.Nullable;

import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Entities.bosses.AncientOOOEntity.AncientOOOEntityAttackGoal;
import com.kelco.kamenridercraft.Entities.bosses.CoreEntity.CoreEntityAttackGoal;
import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;
import com.kelco.kamenridercraft.Items.Ex_Aid_Rider_Items;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import com.kelco.kamenridercraft.Items.W_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.BossEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.MoveThroughVillageGoal;
import net.minecraft.world.entity.ai.goal.MoveTowardsRestrictionGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CronusEntity extends BaseHenchmenEntity {

	private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(this.getDisplayName(), BossEvent.BossBarColor.GREEN, BossEvent.BossBarOverlay.PROGRESS));
	private static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(CoreEntity.class, EntityDataSerializers.BYTE);


	public CronusEntity(EntityType<? extends Zombie> type, Level level) {
		super(type, level);
		NAME="cronus";
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Ex_Aid_Rider_Items.EX_AIDHELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Ex_Aid_Rider_Items.EX_AIDCHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Ex_Aid_Rider_Items.EX_AIDLEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET,new ItemStack(Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II_CHRONOS.get()));
		this.setItemSlot(EquipmentSlot.MAINHAND,new ItemStack(Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II.get()));
	}

	protected void addBehaviourGoals() {

		this.goalSelector.addGoal(3, new CronusEntityAttackGoal(this, 1.0D, false));
		this.goalSelector.addGoal(5, new MoveTowardsRestrictionGoal(this, 1.0D));
		this.goalSelector.addGoal(6, new MoveThroughVillageGoal(this, 1.0D, true, 4, this::canBreakDoors));
		this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D, 0.0F));
		this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers());
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
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
				.add(Attributes.MOVEMENT_SPEED,(double)0.3F)
				.add(Attributes.ATTACK_DAMAGE, 12.0D)
				.add(Attributes.ARMOR, 3.0D)
				.add(Attributes.KNOCKBACK_RESISTANCE, 4.0D)
				.add(Attributes.ATTACK_KNOCKBACK, 2.0D)
				.add(Attributes.MAX_HEALTH, 300.0D)
				.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
				.build();
	}

	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_FLAGS_ID, (byte)0);
	}

	void setCharged(boolean p_32241_) {
		byte b0 = this.entityData.get(DATA_FLAGS_ID);
		if (p_32241_) {
			b0 = (byte)(b0 | 1);
		} else {
			b0 = (byte)(b0 & -2);
		}

		this.entityData.set(DATA_FLAGS_ID, b0);
	}

	static class CronusEntityAttackGoal extends MeleeAttackGoal {
		private final CronusEntity CoreEntity;
		private int attackStep;
		private int attackTime;
		private int lastSeen;

		public CronusEntityAttackGoal(CronusEntity p_26019_, double p_26020_, boolean p_26021_) {
			super(p_26019_, p_26020_, p_26021_);
			this.CoreEntity = p_26019_;
			this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
		}

		public boolean canUse() {
			LivingEntity livingentity = this.CoreEntity.getTarget();
			return livingentity != null && livingentity.isAlive() && this.CoreEntity.canAttack(livingentity);
		}

		public void start() {
			this.attackStep = 0;
		}

		public void stop() {
			this.CoreEntity.setCharged(false);
			this.lastSeen = 0;
		}

		public boolean requiresUpdateEveryTick() {
			return true;
		}

		public void tick() {
			--this.attackTime;
			LivingEntity livingentity = this.CoreEntity.getTarget();
			if (livingentity != null) {
				boolean flag = this.CoreEntity.getSensing().hasLineOfSight(livingentity);
				if (flag) {
					this.lastSeen = 0;
				} else {
					++this.lastSeen;
				}

				double d0 = this.CoreEntity.distanceToSqr(livingentity);
				if (d0 < 4.0D) {
					if (!flag) {
						return;
					}

					if (this.attackTime <= 0) {
						this.attackTime = 20;
						this.CoreEntity.doHurtTarget(livingentity);
					}

					this.CoreEntity.getMoveControl().setWantedPosition(livingentity.getX(), livingentity.getY(), livingentity.getZ(), 1.0D);
				} else if (d0 < this.getFollowDistance() * this.getFollowDistance() && flag) {
					if (this.attackTime <= 0) {
						++this.attackStep;
						if (this.attackStep == 1) {
							this.attackTime = 60;
							this.CoreEntity.setCharged(true);
						} else if (this.attackStep <= 4) {
							this.attackTime = 6;
						} else {
							this.attackTime = 100;
							this.attackStep = 0;
							this.CoreEntity.setCharged(false);
						}

						if (this.attackStep > 1) {
							if (!this.CoreEntity.isSilent()) {
								this.CoreEntity.level().levelEvent((Player)null, 1018, this.CoreEntity.blockPosition(), 0);
							}
								if (this.CoreEntity.getItemBySlot(EquipmentSlot.FEET).getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II_CHRONOS.get()) {

									if (RiderDriverItem.get_Form_Item(this.CoreEntity.getItemBySlot(EquipmentSlot.FEET),1)!=Ex_Aid_Rider_Items.KAMEN_RIDER_CHRONICLE_GASHAT_GEMEDEUS.get()) {
										livingentity.addEffect(new MobEffectInstance(Effect_core.PAUSE.get(),150,0));
										if (livingentity instanceof Player playerIn){
											playerIn.sendSystemMessage(Component.translatable("Pause!").withStyle(ChatFormatting.GREEN));
										}

									}
									else {
										livingentity.addEffect(new MobEffectInstance(Effect_core.RESET.get(),30,0));
										if (livingentity instanceof Player playerIn){
											playerIn.sendSystemMessage(Component.translatable("Reset!").withStyle(ChatFormatting.RED));
										}
									
								}
							}
						}
					}

					this.CoreEntity.getLookControl().setLookAt(livingentity, 10.0F, 10.0F);
				} else if (this.lastSeen < 5) {
					this.CoreEntity.getMoveControl().setWantedPosition(livingentity.getX(), livingentity.getY(), livingentity.getZ(), 1.0D);
				}

				super.tick();
			}
		}

		private double getFollowDistance() {
			return this.CoreEntity.getAttributeValue(Attributes.FOLLOW_RANGE);
		}
	}
}