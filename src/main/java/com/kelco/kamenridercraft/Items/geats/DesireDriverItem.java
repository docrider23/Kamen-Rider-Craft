package com.kelco.kamenridercraft.Items.geats;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class DesireDriverItem  extends RiderDriverItem{


	public DesireDriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
		
	}

	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider,String riderName)
	{
		boolean fly = !rider.onGround();
		if (equipmentSlot == EquipmentSlot.FEET) {
			
			
				String belt = ((RiderDriverItem)itemstack.getItem()).BELT_TEXT;
				if (((RiderDriverItem)itemstack.getItem()).BELT_TEXT==null) {
					belt = get_Form_Item(itemstack,1).getBeltTex();
				}
				return "belts/"+belt;
			
		}
	

		else if (equipmentSlot == EquipmentSlot.HEAD) return riderName+"_base_over"+ get_Form_Item(itemstack,1).getFormName(fly);
		else if (equipmentSlot == EquipmentSlot.CHEST) return "geats_rider"+get_Form_Item(itemstack,2).getFormName(fly);
		else return "geats_rider"+get_Form_Item(itemstack,3).getFormName(fly);

	}

	public  boolean getGlowForSlot(ItemStack itemstack,EquipmentSlot currentSlot, LivingEntity livingEntity) {
		return false;
	}

	public ResourceLocation getModelResource(ItemStack itemstack,RiderArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		int num = 1;
		if (slot == EquipmentSlot.CHEST)num=2; 
		if (slot == EquipmentSlot.LEGS)num=3;
		
		 if (slot == EquipmentSlot.CHEST) {
			return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/geats_rider_plusbelt.geo.json");
		 }else if (slot == EquipmentSlot.LEGS) {
				return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/geats_rider_plusbelt_revo.geo.json");
			 }else 
			 return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, num).get_Model());

	}
	
	@Override
	public  boolean getPartsForSlot(ItemStack itemstack,EquipmentSlot currentSlot,String  part) {

		switch (currentSlot) {
		case HEAD ->{ 
			if (part =="head") return true;
			if (part =="body") return true;
			if (part =="rightArm") return true;
			if (part =="leftArm") return true;
			if (part =="leftLeg") return true;
			if (part =="rightLeg") return true;
			
		}
		case CHEST -> {
			if (part =="head") return true;
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