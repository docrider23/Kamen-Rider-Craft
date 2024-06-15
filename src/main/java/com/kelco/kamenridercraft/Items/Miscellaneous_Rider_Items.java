package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Miscellaneous_Rider_Items {
	
	  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	    	     
	  //G
	    public static final RegistryObject<Item> G_LOGO = ITEMS.register("g_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.G_TAB_ITEM));

	    public static final RegistryObject<Item> GORO_WINE_BOTTLE = ITEMS.register("goro_wine_bottle",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","kamen_rider_g","g_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.G_TAB_ITEM).KeepItem());

	    
	    public static final RegistryObject<Item> GHELMET = ITEMS.register("ghead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.G_TAB_ITEM));
	    public static final RegistryObject<Item> GCHESTPLATE = ITEMS.register("gtroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.G_TAB_ITEM));
	    public static final RegistryObject<Item> GLEGGINGS = ITEMS.register("glegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.G_TAB_ITEM));
	    
	    public static final RegistryObject<Item> G_BELT = ITEMS.register("g_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kamen_rider_g",GORO_WINE_BOTTLE ,GHELMET,GCHESTPLATE,GLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.G_TAB_ITEM));

//Gorider
		public static final RegistryObject<Item> GORIDER_LOGO = ITEMS.register("gorider_logo",
				() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GORIDER_TAB_ITEM));

		public static final RegistryObject<Item> AKARIDER_CARD = ITEMS.register("akarider_card",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","aka_rider","typhoon_belt_akarider",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED,40, 1,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false)).AddToTabList(RiderTabs.GORIDER_TAB_ITEM).KeepItem());
		public static final RegistryObject<Item> AORIDER_CARD = ITEMS.register("aorider_card",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ao_rider","typhoon_belt_aorider",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED,40, 1,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false)).AddToTabList(RiderTabs.GORIDER_TAB_ITEM).KeepItem());
		public static final RegistryObject<Item> KIRIDER_CARD = ITEMS.register("kirider_card",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ki_rider","typhoon_belt_kirider",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED,40, 1,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false)).AddToTabList(RiderTabs.GORIDER_TAB_ITEM).KeepItem());
		public static final RegistryObject<Item> MOMORIDER_CARD = ITEMS.register("momorider_card",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","momo_rider","typhoon_belt_momorider",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED,40, 1,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false)).AddToTabList(RiderTabs.GORIDER_TAB_ITEM).KeepItem());
		public static final RegistryObject<Item> MIDORIDER_CARD = ITEMS.register("midorider_card",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","mido_rider","typhoon_belt_midorider",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED,40, 1,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false)).AddToTabList(RiderTabs.GORIDER_TAB_ITEM).KeepItem());


		public static final RegistryObject<Item> AKARIDERHELMET = ITEMS.register("akariderhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.GORIDER_TAB_ITEM));
	    public static final RegistryObject<Item> AKARIDERCHESTPLATE = ITEMS.register("akaridertroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.GORIDER_TAB_ITEM));
	    public static final RegistryObject<Item> AKARIDERLEGGINGS = ITEMS.register("akariderlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.GORIDER_TAB_ITEM));

		public static final RegistryObject<Item> TYPHOON_AKARIDER = ITEMS.register("typhoon_akarider",
				() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"aka_rider",AKARIDER_CARD ,AKARIDERHELMET,AKARIDERCHESTPLATE,AKARIDERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.GORIDER_TAB_ITEM));
		public static final RegistryObject<Item> TYPHOON_AORIDER = ITEMS.register("typhoon_aorider",
				() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ao_rider",AORIDER_CARD ,AKARIDERHELMET,AKARIDERCHESTPLATE,AKARIDERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.GORIDER_TAB_ITEM));
		public static final RegistryObject<Item> TYPHOON_KIRIDER = ITEMS.register("typhoon_kirider",
				() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ki_rider",KIRIDER_CARD ,AKARIDERHELMET,AKARIDERCHESTPLATE,AKARIDERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.GORIDER_TAB_ITEM));
		public static final RegistryObject<Item> TYPHOON_MOMORIDER = ITEMS.register("typhoon_momorider",
				() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"momo_rider",MOMORIDER_CARD ,AKARIDERHELMET,AKARIDERCHESTPLATE,AKARIDERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.GORIDER_TAB_ITEM));
		public static final RegistryObject<Item> TYPHOON_MIDORIDER = ITEMS.register("typhoon_midorider",
				() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"mido_rider",MIDORIDER_CARD ,AKARIDERHELMET,AKARIDERCHESTPLATE,AKARIDERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.GORIDER_TAB_ITEM));
			 
		
		//Ride Kamens
		
		public static final RegistryObject<Item> CONTRACT_CHAOSTONE = ITEMS.register("contract_chaostone",
				() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM));
		
		  public static final RegistryObject<Item> CHAOS_RING_SAIGO = ITEMS.register("chaos_ring_saigo",
		            () -> new RiderFormChangeItem(new Item.Properties(),0,"","saigo","chaos_driver_saigo_belt",
		            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
		            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false))
		            .ChangeModel("geo/saigo.geo.json").IsGlowing().AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM).KeepItem());

		  public static final RegistryObject<Item> CHAOS_RING_HARUMA = ITEMS.register("chaos_ring_haruma",
		            () -> new RiderFormChangeItem(new Item.Properties(),0,"","haruma","chaos_driver_haruma_belt",
		            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
		            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM).KeepItem());

		  public static final RegistryObject<Item> CHAOS_RING_SHION = ITEMS.register("chaos_ring_shion",
		            () -> new RiderFormChangeItem(new Item.Properties(),0,"","shion","chaos_driver_shion_belt",
		            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
		            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM).KeepItem());

		  public static final RegistryObject<Item> CHAOS_RING_JIGEN = ITEMS.register("chaos_ring_jigen",
		            () -> new RiderFormChangeItem(new Item.Properties(),0,"","jigen","chaos_driver_jigen_belt",
		            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
		            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM).KeepItem());

		    
		    public static final RegistryObject<Item> RIDE_KAMENS_HELMET = ITEMS.register("ride_kamens_head",
		            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM));
		    public static final RegistryObject<Item> RIDE_KAMENS_CHESTPLATE = ITEMS.register("ride_kamens_troso",
		            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM));
		    public static final RegistryObject<Item> RIDE_KAMENS_LEGGINGS = ITEMS.register("ride_kamens_legs",
		            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM));
		    
		    public static final RegistryObject<Item> CHAOS_DRIVER_SAIGO = ITEMS.register("chaos_driver_saigo",
			           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"saigo",CHAOS_RING_SAIGO ,RIDE_KAMENS_HELMET,RIDE_KAMENS_CHESTPLATE,RIDE_KAMENS_LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM));

		    public static final RegistryObject<Item> CHAOS_DRIVER_HARUMA = ITEMS.register("chaos_driver_haruma",
			           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"haruma",CHAOS_RING_HARUMA ,RIDE_KAMENS_HELMET,RIDE_KAMENS_CHESTPLATE,RIDE_KAMENS_LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM));

		    public static final RegistryObject<Item> CHAOS_DRIVER_SHION = ITEMS.register("chaos_driver_shion",
			           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shion",CHAOS_RING_SHION ,RIDE_KAMENS_HELMET,RIDE_KAMENS_CHESTPLATE,RIDE_KAMENS_LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM));

		    public static final RegistryObject<Item> CHAOS_DRIVER_JIGEN = ITEMS.register("chaos_driver_jigen",
			           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"jigen",CHAOS_RING_JIGEN ,RIDE_KAMENS_HELMET,RIDE_KAMENS_CHESTPLATE,RIDE_KAMENS_LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.RIDE_KAMENS_TAB_ITEM));


		
	    public static void register(IEventBus eventBus) {
	        ITEMS.register(eventBus);
	    }
	    
	}