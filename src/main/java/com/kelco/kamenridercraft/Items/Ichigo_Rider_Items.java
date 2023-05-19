package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Ichigo_Rider_Items {
	
	  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	    	     
	    public static final RegistryObject<Item> ICHIGOHELMET = ITEMS.register("ichigohead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    public static final RegistryObject<Item> ICHIGOCHESTPLATE = ITEMS.register("ichigotroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    public static final RegistryObject<Item> ICHIGOLEGGINGS = ITEMS.register("ichigolegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    

	    public static final RegistryObject<Item> TYPHOON_CORE = ITEMS.register("typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ichigo","typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> ORIGINAL_TYPHOON_CORE = ITEMS.register("original_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_original","ichigo","typhoon_belt_original",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_CORE_NIGO = ITEMS.register("typhoon_core_nigo",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","nigo","typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    

	    public static final RegistryObject<Item> ORIGINAL_TYPHOON_CORE_NIGO = ITEMS.register("original_typhoon_core_nigo",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_original","nigo","typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    
	    public static final RegistryObject<Item> SAKURAJIMA_TYPHOON_CORE = ITEMS.register("sakurajima_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_sakurajima","ichigo","typhoon_belt_original",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_CORE_SANGO = ITEMS.register("typhoon_core_sango",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","sango","typhoon_belt_sango",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> RIDER3_VS_THE_DEMON_OF_GENERAL_BLACK = ITEMS.register("rider3_vs_the_demon_of_general_black",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_manga","sango","typhoon_belt_original",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> TYPHOON_CORE_YONGO = ITEMS.register("typhoon_core_yongo",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","yongo","typhoon_belt_yongo",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> NEW_TYPHOON_CORE = ITEMS.register("new_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_new","ichigo","new_typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> SHOCKER_RIDER_TYPHOON_CORE = ITEMS.register("shocker_rider_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","shocker_rider","shocker_rider_typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> NOPHOON_CORE = ITEMS.register("nophoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ichigo","nophoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	

	    public static final RegistryObject<Item> TYPHOON_ICHIGO = ITEMS.register("typhoon_ichigo",
	           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ichigo",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_NIGO = ITEMS.register("typhoon_nigo",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"nigo",TYPHOON_CORE,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> TYPHOON_SANGO = ITEMS.register("typhoon_sango",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"sango",TYPHOON_CORE_SANGO,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_YONGO = ITEMS.register("typhoon_yongo",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"yongo",TYPHOON_CORE_YONGO,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_1 = ITEMS.register("typhoon_shocker_rider_1",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_1",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_2 = ITEMS.register("typhoon_shocker_rider_2",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_2",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_3 = ITEMS.register("typhoon_shocker_rider_3",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_3",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_4 = ITEMS.register("typhoon_shocker_rider_4",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_4",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_5 = ITEMS.register("typhoon_shocker_rider_5",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_5",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_6 = ITEMS.register("typhoon_shocker_rider_6",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_6",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_7 = ITEMS.register("typhoon_shocker_rider_7",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_7",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_8 = ITEMS.register("typhoon_shocker_rider_8",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_8",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_9 = ITEMS.register("typhoon_shocker_rider_9",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_9",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_10 = ITEMS.register("typhoon_shocker_rider_10",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_10",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_11 = ITEMS.register("typhoon_shocker_rider_11",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_11",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_12 = ITEMS.register("typhoon_shocker_rider_12",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_12",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> NOPHOON_KAMEN_NORIDER = ITEMS.register("nophoon_kamen_norider",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kamen_norider",NOPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    
	    //V3
	    
	    public static final RegistryObject<Item> V3HELMET = ITEMS.register("v3head",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    public static final RegistryObject<Item> V3CHESTPLATE = ITEMS.register("v3troso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    public static final RegistryObject<Item> V3LEGGINGS = ITEMS.register("v3legs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    
	    

	    public static final RegistryObject<Item> DOUBLE_TYPHOON_CORE = ITEMS.register("double_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","v3","double_typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,20, 1,true,false)).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    
	    public static final RegistryObject<Item> BLUE_DOUBLE_TYPHOON_CORE = ITEMS.register("blue_double_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_blue","v3","double_typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 2,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP,20, 2,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,20, 2,true,false)).AddToTabList(RiderTabs.V3_TAB_ITEM));

	    public static final RegistryObject<Item> RIDERMAN_BELT_CORE = ITEMS.register("riderman_belt_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","riderman","riderman_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED,20, 2,true,false)).AddToTabList(RiderTabs.V3_TAB_ITEM));

	    
	    public static final RegistryObject<Item> DOUBLE_TYPHOON = ITEMS.register("double_typhoon",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"v3",DOUBLE_TYPHOON_CORE ,V3HELMET,V3CHESTPLATE,V3LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));


	    public static final RegistryObject<Item> RIDERMAN_BELT = ITEMS.register("riderman_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"riderman",RIDERMAN_BELT_CORE ,V3HELMET,V3CHESTPLATE,V3LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));


	    //X
	    
	    public static final RegistryObject<SwordItem> RIDOL_STICK = ITEMS.register("ridol_stick",
	            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));
	    
	    public static final RegistryObject<Item> XHELMET = ITEMS.register("xhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));
	    public static final RegistryObject<Item> XCHESTPLATE = ITEMS.register("xtroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));
	    public static final RegistryObject<Item> XLEGGINGS = ITEMS.register("xlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));


	    public static final RegistryObject<Item> RIDOL_CORE = ITEMS.register("ridol_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","x","ridol_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 0,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 2,true,false),new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.X_TAB_ITEM));
	 
	    public static final RegistryObject<Item> RIDOL = ITEMS.register("ridol",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"x",RIDOL_CORE ,XHELMET,XCHESTPLATE,XLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));

		//Amazon
	    
	    public static final RegistryObject<Item> AMAZONHELMET = ITEMS.register("amazonhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    public static final RegistryObject<Item> AMAZONCHESTPLATE = ITEMS.register("amazontroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    public static final RegistryObject<Item> AMAZONLEGGINGS = ITEMS.register("amazonlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));

	    public static final RegistryObject<Item> CONDORER_WHEEL = ITEMS.register("condorer_wheel",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","amazon","condorer_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 2,true,false),new MobEffectInstance(MobEffects.JUMP,20, 2,true,false)).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	 
	    public static final RegistryObject<Item> CONDORER = ITEMS.register("condorer",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amazon",CONDORER_WHEEL ,AMAZONHELMET,AMAZONCHESTPLATE,AMAZONLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));

	    public static final RegistryObject<Item> GIGI_ARMLET = ITEMS.register("gigi_armlet",
	    		  () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    
	    public static final RegistryObject<Item> GAGA_ARMLET = ITEMS.register("gaga_armlet",
	    		  () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    
	    
	    /**
	    public static final RegistryObject<Item> HELMET = ITEMS.register("head",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs._TAB_ITEM));
	    public static final RegistryObject<Item> CHESTPLATE = ITEMS.register("troso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs._TAB_ITEM));
	    public static final RegistryObject<Item> LEGGINGS = ITEMS.register("legs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs._TAB_ITEM));
	    **/
	    
	    
	    
	    public static void register(IEventBus eventBus) {
	        ITEMS.register(eventBus);
	    }
	    
	}