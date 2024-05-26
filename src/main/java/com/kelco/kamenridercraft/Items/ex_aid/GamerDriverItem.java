package com.kelco.kamenridercraft.Items.ex_aid;

import com.google.common.collect.Lists;
import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.Ex_Aid_Rider_Items;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class GamerDriverItem extends RiderDriverItem{


	public GamerDriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);

		Extra_Base_Form_Item= Lists.newArrayList((RiderFormChangeItem)Modded_item_core.BLANK_FORM.get(),(RiderFormChangeItem)Modded_item_core.BLANK_FORM.get());
		Num_Base_Form_Item=2;
	}

	public GamerDriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> armorFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem,armorFormItem, head, torso, legs, properties);

		Extra_Base_Form_Item= Lists.newArrayList((RiderFormChangeItem)Modded_item_core.BLANK_FORM.get(),(RiderFormChangeItem)Modded_item_core.BLANK_FORM.get());
		Num_Base_Form_Item=2;
	}
	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider,String riderName)
	{
		if (equipmentSlot == EquipmentSlot.FEET) {
			String belt = ((RiderDriverItem)itemstack.getItem()).BELT_TEXT;
			if (((RiderDriverItem)itemstack.getItem()).BELT_TEXT==null) {
			 belt = get_Form_Item(itemstack,1).getBeltTex();
			}
		
			if (itemstack.getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR_GENM.get()) {
				if(rider.getMainHandItem().getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR.get()||rider.getOffhandItem().getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR.get() ) belt="bugster_buckle";
				}
			if (itemstack.getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II_CHRONOS.get()||itemstack.getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II_CHRONICLE_BUGTER.get()
					||itemstack.getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II_POPPY.get()||itemstack.getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II_LAZER.get()) {
				if(rider.getMainHandItem().getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II.get()||rider.getOffhandItem().getItem()==Ex_Aid_Rider_Items.GASHACON_BUGVISOR_II.get() ) belt="bugster_buckle";
				}
			
			if(get_Form_Item(itemstack,1).get_Belt_Model()=="geo/lv_1_belt.geo.json") {
				if (rider.getItemBySlot(EquipmentSlot.HEAD).getItem()!=Ex_Aid_Rider_Items.EX_AIDHELMET.get()||
						rider.getItemBySlot(EquipmentSlot.CHEST).getItem()!=Ex_Aid_Rider_Items.EX_AIDCHESTPLATE.get()||
						rider.getItemBySlot(EquipmentSlot.LEGS).getItem()!=Ex_Aid_Rider_Items.EX_AIDLEGGINGS.get()) {
					
					belt = get_Form_Item(itemstack,1).getBeltTex()+"_un";
				}
			}
			
			return "belts/"+belt;
		}
		else if (equipmentSlot == EquipmentSlot.CHEST) return get_Form_Item(itemstack,2).getFormName(false);

		else {
			RiderDriverItem belt = ((RiderDriverItem)itemstack.getItem());
			if (belt==Ex_Aid_Rider_Items.GAMER_DRIVER_SNIPE.get()) {
				if (get_Form_Item(itemstack,2)==Ex_Aid_Rider_Items.JET_COMBAT_GASHAT.get()||
						get_Form_Item(itemstack,2)==Ex_Aid_Rider_Items.BANG_BANG_TANK_GASHAT.get()||
						get_Form_Item(itemstack,2)==Ex_Aid_Rider_Items.XEVIOUS_GASHAT.get()) {
					return riderName+"_jet";
				}else 	if (get_Form_Item(itemstack,2)==Ex_Aid_Rider_Items.BANG_BANG_SIMULATION_GASHAT.get()) {
					return riderName+"_nocape";
				} 

			}
		}
		return riderName+get_Form_Item(itemstack,1).getFormName(false);


	}

	public ResourceLocation getBeltModelResource(ItemStack itemstack,RiderArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		
		if(get_Form_Item(itemstack,1).get_Belt_Model()=="geo/lv_1_belt.geo.json") {
			if (rider.getItemBySlot(EquipmentSlot.HEAD).getItem()!=Ex_Aid_Rider_Items.EX_AIDHELMET.get()||
					rider.getItemBySlot(EquipmentSlot.CHEST).getItem()!=Ex_Aid_Rider_Items.EX_AIDCHESTPLATE.get()||
					rider.getItemBySlot(EquipmentSlot.LEGS).getItem()!=Ex_Aid_Rider_Items.EX_AIDLEGGINGS.get()) {
				return new ResourceLocation(KamenRiderCraftCore.MODID,"geo/riderbelt.geo.json");	
			}
		}
		
		return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, 1).get_Belt_Model());	
	}


	public ResourceLocation getModelResource(ItemStack itemstack,RiderArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {

		switch (slot) {

		case CHEST -> {
			if (get_Form_Item(itemstack, 2).HasWingsIfFlying() & !rider.onGround()){
				return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, 2).get_FlyingModel());
			}else if (get_Form_Item(itemstack, 2).get_Model()=="geo/ichigo.geo.json") {
				return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/bigger_rider_plusbelt.geo.json");
			}else   
				return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, 2).get_Model());
		}
		
		default -> {}
		}
		return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, 1).get_Model());

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
			if (get_Form_Item(itemstack, 2)!=Modded_item_core.BLANK_FORM.get()) {
				if (part =="head") return true;
				if (part =="body") return true;
				if (part =="rightArm") return true;
				if (part =="leftArm") return true;
				if (part =="leftLeg") return true;
				if (part =="rightLeg") return true;
			}
		}
		case LEGS -> {
		}
		default -> {}
		}
		return false;
	}

}