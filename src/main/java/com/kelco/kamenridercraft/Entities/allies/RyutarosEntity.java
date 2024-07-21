package com.kelco.kamenridercraft.Entities.allies;


import com.kelco.kamenridercraft.Entities.footSoldiers.NewMoleImaginSandEntity;
import com.kelco.kamenridercraft.Items.Den_O_Rider_Items;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.SitWhenOrderedToGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;


public class RyutarosEntity extends BaseAllyEntity {
	
	public RyutarosEntity(EntityType<? extends RyutarosEntity> entityType, Level level) {
		super(entityType, level);
		NAME = "ryutaros";
        
		}

	public static AttributeSupplier setAttributes() {
		return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, (double)0.3F).add(Attributes.MAX_HEALTH, 40.0D).add(Attributes.ATTACK_DAMAGE, 2.0D).build();
	}


	protected void registerGoals() {
		this.goalSelector.addGoal(1, new FloatGoal(this));
		this.goalSelector.addGoal(1, new PanicGoal(this, 1.4D));
		this.goalSelector.addGoal(2, new SitWhenOrderedToGoal(this));
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.0D, true));
		this.goalSelector.addGoal(4, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
		this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Mob.class, 5, false, false, (p_28879_) -> {
			if (isTame()) {
				return p_28879_ instanceof Enemy && !(p_28879_ instanceof Creeper);
			}else return false;
		}));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal<>(this, NewMoleImaginSandEntity.class, false));

	}

	@Override
	public void setTame(boolean p_30443_) {
		super.setTame(p_30443_);
        if (p_30443_) {
            this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(40.0D);
            this.setHealth(40.0F);
            this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Den_O_Rider_Items.RYUVOLVER.get()));
        }
	}
	
	public InteractionResult mobInteract(Player p_30412_, InteractionHand p_30413_) {
	      ItemStack itemstack = p_30412_.getItemInHand(p_30413_);
		  Level level = this.level();
		  if (level.isClientSide) {
	         boolean flag = this.isOwnedBy(p_30412_) || this.isTame() || itemstack.is(Items.PUMPKIN_PIE) && !this.isTame() && !this.isAngry();
	         return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
	      } else if (this.isTame()) {
	         if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
	            this.heal((float)itemstack.getFoodProperties(this).getNutrition());
	            if (!p_30412_.getAbilities().instabuild) {
	               itemstack.shrink(1);
	            }

	            this.gameEvent(GameEvent.EAT, this);
	            return InteractionResult.SUCCESS;
	         } else {
	            InteractionResult interactionresult = super.mobInteract(p_30412_, p_30413_);
	            if ((!interactionresult.consumesAction() || this.isBaby()) && this.isOwnedBy(p_30412_)) {
	               this.setOrderedToSit(!this.isOrderedToSit());
	               this.jumping = false;
	               this.navigation.stop();
	               this.setTarget((LivingEntity)null);
	               return InteractionResult.SUCCESS;
	            } else {
	               return interactionresult;
	            }
	         }
	      } else if (itemstack.is(Items.PUMPKIN_PIE) && !this.isAngry()) {
	         if (!p_30412_.getAbilities().instabuild) {
	            itemstack.shrink(1);
	         }

	         if (this.random.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, p_30412_)) {
	            this.tame(p_30412_);
	            this.navigation.stop();
	            this.setTarget((LivingEntity)null);
	            this.setOrderedToSit(true);
	            this.level().broadcastEntityEvent(this, (byte)7);
	         } else {
	            this.level().broadcastEntityEvent(this, (byte)6);
	         }

	         return InteractionResult.SUCCESS;
	      } else {
	         return super.mobInteract(p_30412_, p_30413_);
	      }
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

	   public boolean isBaby() {
		      return false;
		   }
	   
	public boolean canMate(Animal p_30392_) {
	            return false;
	   }
	   
	   public boolean isFood(ItemStack p_30440_) {
		      Item item = p_30440_.getItem();

		      return item ==Items.PUMPKIN_PIE;
		   }
}
