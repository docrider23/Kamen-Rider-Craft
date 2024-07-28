package com.kelco.kamenridercraft.Items.zero_one;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.Zero_One_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;

public class ThousandriverItem extends RiderDriverItem{


	public ThousandriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
		
	}

	public void onArmorTick(ItemStack stack, Level level, Player player)
	{
        super.onArmorTick(stack, level, player);

		if (player.getItemBySlot(EquipmentSlot.LEGS).getItem() == LEGS){
			if (player.getItemBySlot(EquipmentSlot.CHEST).getItem() == TORSO){
				if (player.getItemBySlot(EquipmentSlot.HEAD).getItem() == HEAD){
					if (player.getItemBySlot(EquipmentSlot.FEET).getItem() == this){
						if (!level.isClientSide && player.hasEffect(Effect_core.BUGSTER.get())
                        & player.getInventory().countItem(Zero_One_Rider_Items.ARK_ONE_PROGRISEKEY.get())!=0
                        & player.getInventory().countItem(Zero_One_Rider_Items.HUMAGEAR_PROGRISEKEY.get())!=0) {
							ItemStack item = new ItemStack(Zero_One_Rider_Items.PRESIDENT_DAN_KUROTO_PROGRISEKEY.get(), 1);
							if (item != null) {
                                player.getInventory().clearOrCountMatchingItems(ItemStack -> ItemStack.getItem() == Zero_One_Rider_Items.HUMAGEAR_PROGRISEKEY.get(), 1, ((Container) player.getInventory()));
								ItemEntity entity = new ItemEntity(level, player.getX(), player.getY(), player.getZ(), item, 0, 0, 0);
								entity.setPickUpDelay(0);
								level.addFreshEntity(entity);
                                if (player.hasEffect(Effect_core.BUGSTER.get())) player.sendSystemMessage(Component.translatable("President Dan Kuroto!").withStyle(ChatFormatting.LIGHT_PURPLE));
                                player.removeEffect(Effect_core.BUGSTER.get());
							}
                        }
					}
				}
			}
		}

	}

	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider,String riderName)
	{
		boolean fly = rider instanceof Player player && player.getAbilities().flying;
		if (equipmentSlot == EquipmentSlot.FEET) {
			
			
				String belt = ((RiderDriverItem)itemstack.getItem()).BELT_TEXT;
				if (((RiderDriverItem)itemstack.getItem()).BELT_TEXT==null) {
					belt = get_Form_Item(itemstack,1).getBeltTex();
				}
				return "belts/"+belt;
			
		}
	
		else if (rider.hasEffect(Effect_core.BUGSTER.get()))return "zaia";
		else return riderName+ get_Form_Item(itemstack,1).getFormName(fly);

	}

	public  boolean getGlowForSlot(ItemStack itemstack,EquipmentSlot currentSlot, LivingEntity livingEntity) {

		if (currentSlot== EquipmentSlot.FEET) {
			return get_Form_Item(itemstack, 1).get_Is_Belt_Glowing();
		}
		if (livingEntity.getItemBySlot(EquipmentSlot.LEGS).getItem() == LEGS){
			if (livingEntity.getItemBySlot(EquipmentSlot.CHEST).getItem() == TORSO){
				if (livingEntity.getItemBySlot(EquipmentSlot.HEAD).getItem() == HEAD){
					switch (currentSlot) {
					case HEAD ->{ 
						return get_Form_Item(itemstack, 1).get_Is_Glowing();
					}
					case CHEST -> {
						return get_Form_Item(itemstack, 1).get_Is_Glowing();
					}
					case LEGS -> {
						return get_Form_Item(itemstack, 1).get_Is_Glowing();
					}
					default -> {}
					}
					return false;
				}
			}

		}
		return false;
	}

	public ResourceLocation getModelResource(ItemStack itemstack,RiderArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {

		return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, 1).get_Model());

	}
	
	@Override
	public  boolean getPartsForSlot(ItemStack itemstack,EquipmentSlot currentSlot,String  part) {

		switch (currentSlot) {
		case HEAD ->{ 
			if (part =="head") return true;
			if (part =="body") return true;
			
		}
		case CHEST -> {
			if (part =="body") return true;
			if (part =="rightArm") return true;
			if (part =="leftArm") return true;
			
		}
		case LEGS -> {
			if (part =="body") return true;
			if (part =="leftLeg") return true;
			if (part =="rightLeg") return true;
			
		
		}
		default -> {}
		}
		return false;
	}

}