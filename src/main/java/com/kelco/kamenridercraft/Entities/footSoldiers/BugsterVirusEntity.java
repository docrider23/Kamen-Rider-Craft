package com.kelco.kamenridercraft.Entities.footSoldiers;

import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Items.Agito_Rider_Items;
import com.kelco.kamenridercraft.Items.Ex_Aid_Rider_Items;

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

public class BugsterVirusEntity extends BaseHenchmenEntity {
	
    public BugsterVirusEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="bugstervirus";

        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Ex_Aid_Rider_Items.BUGSTER_TRIDENT.get()));
    }


    public void remove(Entity.RemovalReason p_149847_) {

		if ( this.isDeadOrDying()) {
			
		if (this.random.nextInt(10) == 1) {
					BaseHenchmenEntity boss = MobsCore.GENM.get().create(this.level());
					if (boss != null) {
						boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
						this.level().addFreshEntity(boss);

						if (this.getLastAttacker()instanceof Player){
							Player playerIn=	(Player) this.getLastAttacker();
							playerIn.sendSystemMessage(Component.translatable("<GENM>I am God Himself-!").withStyle(ChatFormatting.DARK_PURPLE));
						}
					}
				}
		}else if (this.random.nextInt(8) == 1) {
			BaseHenchmenEntity boss = MobsCore.GRAPHITE_BUGSTER.get().create(this.level());
			if (boss != null) {
				boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
				this.level().addFreshEntity(boss);

			}
			}
		
		super.remove(p_149847_);
	}
    
    public static AttributeSupplier setAttributes() {
    
        return Monster.createMonsterAttributes()
        		.add(Attributes.FOLLOW_RANGE, 35.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.23F)
        		.add(Attributes.ATTACK_DAMAGE, 4.0D)
        		.add(Attributes.ARMOR, 3.0D)
        		.add(Attributes.MAX_HEALTH, 30.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
     }
}