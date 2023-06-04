package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;
import com.kelco.kamenridercraft.Items.w.WDriverItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class W_Rider_Items {
	
	  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	    	     
	    public static final RegistryObject<Item> WHELMET = ITEMS.register("whead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.W_TAB_ITEM));
	    public static final RegistryObject<Item> WCHESTPLATE = ITEMS.register("wtroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.W_TAB_ITEM));
	    public static final RegistryObject<Item> WLEGGINGS = ITEMS.register("wlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.W_TAB_ITEM));
	    
	    

	    public static final RegistryObject<Item> CYCLONE_MEMORY = ITEMS.register("cyclone_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_cyclone","w","wdriver_belt",
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
	            .AddToTabList(RiderTabs.W_TAB_ITEM));
	    
	    public static final RegistryObject<Item> HEAT_MEMORY = ITEMS.register("heat_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_heat","w","wdriver_belt_hj",
	            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
	            .AddToTabList(RiderTabs.W_TAB_ITEM));
	    
	    public static final RegistryObject<Item> LUNA_MEMORY = ITEMS.register("luna_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_luna","w","wdriver_belt_lj",
	            		new MobEffectInstance(MobEffects.NIGHT_VISION, 40, 0,true,false),
	            		new MobEffectInstance(MobEffects.REGENERATION, 40, 0,true,false)).AddToTabList(RiderTabs.W_TAB_ITEM));
	    
	    public static final RegistryObject<Item> FANG_MEMORY = ITEMS.register("fang_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_fang","w","wdriver_belt_fj",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
	            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.CONFUSION, 40, 0,true,false)).AddToTabList(RiderTabs.W_TAB_ITEM));
	    
	    public static final RegistryObject<Item> JOKER_JOKER_MEMORY = ITEMS.register("joker_joker_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_joker_joker","w","wdriver_belt_jj",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
	            .AddToTabList(RiderTabs.W_TAB_ITEM));
	    
	    
	    public static final RegistryObject<Item> JOKER_MEMORY = ITEMS.register("joker_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_joker","w","wdriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
	            .ChangeSlot(2).AddToTabList(RiderTabs.W_TAB_ITEM));
	    
	    public static final RegistryObject<Item> METAL_MEMORY = ITEMS.register("metal_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_metal","w","wdriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
	            .ChangeSlot(2).AddToTabList(RiderTabs.W_TAB_ITEM));
	   
	    public static final RegistryObject<Item> TRIGGER_MEMORY = ITEMS.register("trigger_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_trigger","w","wdriver_belt",
	            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
	            .ChangeSlot(2).AddToTabList(RiderTabs.W_TAB_ITEM));
	    
	    public static final RegistryObject<Item> CYCLONE_CYCLONE_MEMORY = ITEMS.register("cyclone_cyclone_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_cyclone_cyclone","w","wdriver_belt",
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
	            .ChangeSlot(2).AddToTabList(RiderTabs.W_TAB_ITEM));
	  
	    
	    public static final RegistryObject<Item> XTREME_MEMORY = ITEMS.register("xtreme_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_cyclone_xtreme","w","wdriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
	            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
	            		new MobEffectInstance(MobEffects.REGENERATION, 40, 1,true,false))
	            .alsoChange2ndSlot(JOKER_MEMORY.get()).AddToTabList(RiderTabs.W_TAB_ITEM));
	
	    public static final RegistryObject<Item> XTREME_GOLD_MEMORY = ITEMS.register("xtreme_gold_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_cyclone_xtreme_gold","w","wdriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
	            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
	            		new MobEffectInstance(MobEffects.REGENERATION, 40, 1,true,false))
	            .alsoChange2ndSlot(JOKER_MEMORY.get()).ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.W_TAB_ITEM));
	
	    public static final RegistryObject<Item> XTREME_ACCEL_MEMORY = ITEMS.register("xtreme_accel_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_cyclone_xtreme_accel","w","wdriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
	            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
	            		new MobEffectInstance(MobEffects.REGENERATION, 40, 1,true,false))
	            .alsoChange2ndSlot(JOKER_MEMORY.get()).AddToTabList(RiderTabs.W_TAB_ITEM));
	
	    public static final RegistryObject<Item> SKULL_MEMORY = ITEMS.register("skull_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","skull","lostdriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
	            .AddToTabList(RiderTabs.W_TAB_ITEM));
	
	    
	    public static final RegistryObject<Item> T2_CYCLONE_MEMORY = ITEMS.register("t2_cyclone_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","cyclone","lostdriver_belt_c",
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
	            .AddToTabList(RiderTabs.W_TAB_ITEM));
	
	    public static final RegistryObject<Item> T2_JOKER_MEMORY = ITEMS.register("t2_joker_memory",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","joker","lostdriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
	            .ChangeSlot(2).AddToTabList(RiderTabs.W_TAB_ITEM));
	    
	    
	    public static final RegistryObject<Item> WDRIVER = ITEMS.register("wdriver",
		           () -> new WDriverItem(ArmorMaterials.DIAMOND,"w",CYCLONE_MEMORY ,WHELMET,WCHESTPLATE,WLEGGINGS , new Item.Properties())
		           .Add_Extra_Base_Form_Items(JOKER_MEMORY).AddToTabList(RiderTabs.W_TAB_ITEM));

	    public static final RegistryObject<Item> LOSTDRIVER_JOKER = ITEMS.register("lostdriver_joker",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"joker",T2_JOKER_MEMORY ,WHELMET,WCHESTPLATE,WLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.W_TAB_ITEM));

	    public static final RegistryObject<Item> LOSTDRIVER_CYCLONE = ITEMS.register("lostdriver_cyclone",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"cyclone",T2_CYCLONE_MEMORY ,WHELMET,WCHESTPLATE,WLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.W_TAB_ITEM));

	    public static final RegistryObject<Item> LOSTDRIVER_SKULL = ITEMS.register("lostdriver_skull",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"skull",SKULL_MEMORY ,WHELMET,WCHESTPLATE,WLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.W_TAB_ITEM));

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