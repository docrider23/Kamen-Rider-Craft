package com.kelco.kamenridercraft.Entities.summons;

import com.kelco.kamenridercraft.Entities.allies.BaseAllyEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ShockerCombatmanEntity;
import com.kelco.kamenridercraft.Items.Decade_Rider_Items;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.goal.target.ResetUniversalAngerTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class DecadeIllusionEntity extends BaseSummonEntity {

	public DecadeIllusionEntity(EntityType<? extends DecadeIllusionEntity> type, Level level) {
		super(type, level);
		NAME="decade_illusion";
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Decade_Rider_Items.DECADEHELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Decade_Rider_Items.DECADECHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Decade_Rider_Items.DECADELEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Decade_Rider_Items.DECADRIVER.get()));
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Decade_Rider_Items.RIDE_BOOKER.get()));
	}

	public static AttributeSupplier setAttributes() {
		return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, (double)0.3F).add(Attributes.MAX_HEALTH, 20.0D).add(Attributes.ARMOR, -10.0D).add(Attributes.ATTACK_DAMAGE, 4.0D).build();
	}


	protected void registerGoals() {
		this.goalSelector.addGoal(1, new FloatGoal(this));
		this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, Creeper.class, 24.0F, 1.5D, 1.5D));
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.0D, true));
		this.goalSelector.addGoal(4, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
		this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(1, (new HurtByTargetGoal(this, BaseAllyEntity.class, BaseSummonEntity.class)).setAlertOthers());
		this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Monster.class, 5, false, false, (p_28879_) -> {
			if (isTame()) {
				return p_28879_ instanceof Enemy;
			}else return false;
		}));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, ShockerCombatmanEntity.class, false));
      	this.targetSelector.addGoal(5, new ResetUniversalAngerTargetGoal<>(this, true));

	}

	public void aiStep() {

		if ( this.getOwner() instanceof Player owner) {
			if(owner.getItemBySlot(EquipmentSlot.FEET).getItem()!=Decade_Rider_Items.DECADRIVER.get()&&owner.getItemBySlot(EquipmentSlot.FEET).getItem()!=Decade_Rider_Items.DARK_DECADRIVER.get()) this.setHealth(0);
			if(owner.getItemBySlot(EquipmentSlot.HEAD).getItem()!=Decade_Rider_Items.DECADEHELMET.get()
			||owner.getItemBySlot(EquipmentSlot.CHEST).getItem()!=Decade_Rider_Items.DECADECHESTPLATE.get()
			||owner.getItemBySlot(EquipmentSlot.LEGS).getItem()!=Decade_Rider_Items.DECADELEGGINGS.get()) this.setHealth(0);
		}    	
		else this.setHealth(0);

		super.aiStep();
	}


	@Override
	public void setTame(boolean p_30443_) {
		super.setTame(p_30443_);
		this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(20.0D);
		this.setHealth(20.0F);
	}

	protected SoundEvent getAmbientSound() {
		return SoundEvents.VILLAGER_AMBIENT;
	}

	protected void playStepSound(BlockPos p_30415_, BlockState p_30416_) {

	}

	protected SoundEvent getHurtSound(DamageSource p_30424_) {
		return SoundEvents.VILLAGER_HURT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.VILLAGER_HURT;
	}

	public boolean wantsToAttack(LivingEntity p_30389_, LivingEntity p_30390_) {
		if (!(p_30389_ instanceof Creeper)&&!(p_30389_ instanceof Ghast)) {
        	if (p_30389_ instanceof BaseAllyEntity) {
        	    BaseAllyEntity illusion = (BaseAllyEntity)p_30389_;
        	    return !illusion.isTame() || illusion.getOwner() != p_30390_;
			} else if (p_30389_ instanceof BaseSummonEntity) {
				BaseSummonEntity illusion = (BaseSummonEntity)p_30389_;
				return !illusion.isTame() || illusion.getOwner() != p_30390_;
			} else if (p_30389_ instanceof Player && p_30390_ instanceof Player && !((Player)p_30390_).canHarmPlayer((Player)p_30389_)) {
				return false;
			} else if (p_30389_ instanceof AbstractHorse && ((AbstractHorse)p_30389_).isTamed()) {
				return false;
			} else {
				return !(p_30389_ instanceof TamableAnimal) || !((TamableAnimal)p_30389_).isTame();
			}
		} else {
			return false;
		}
	}

	public boolean isBaby() {
		return false;
	}

	public boolean canMate(Animal p_30392_) {
		return false;
	}
}