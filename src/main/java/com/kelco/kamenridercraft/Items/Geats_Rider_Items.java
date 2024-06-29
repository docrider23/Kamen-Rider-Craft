package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.geats.DesireDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
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

public class Geats_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> GEATS_LOGO = ITEMS.register("geats_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> BLANK_CORE_ID = ITEMS.register("blank_rider_core_id",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

 
	public static final RegistryObject<Item> GEATS_CORE_ID = ITEMS.register("geats_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","geats","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> TYCOON_CORE_ID = ITEMS.register("tycoon_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","tycoon","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.LUCK, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NA_GO_CORE_ID = ITEMS.register("na_go_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","na_go","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BUFFA_CORE_ID = ITEMS.register("buffa_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","buffa","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> PUNKJACK_CORE_ID = ITEMS.register("punkjack_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","punkjack","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NUGE_SPARROW_CORE_ID = ITEMS.register("nudge_sparrow_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","nudge_sparrow","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SHIROWE_CORE_ID = ITEMS.register("shirowe_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","shirowe","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GINPEN_CORE_ID = ITEMS.register("ginpen_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ginpen","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> MARY_CORE_ID = ITEMS.register("mary_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","mary","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DA_PAAN_CORE_ID = ITEMS.register("da_paan_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","da_paan","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> KEIROU_CORE_ID = ITEMS.register("keirou_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","keirou","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> LETTER_CORE_ID = ITEMS.register("letter_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","letter","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> LOPO_CORE_ID = ITEMS.register("lopo_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","lopo","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GROOVY_CORE_ID = ITEMS.register("groovy_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","groovy","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> HAKUBI_CORE_ID = ITEMS.register("hakubi_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","hakubi","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> TURBON_CORE_ID = ITEMS.register("turbon_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","turbon","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BRALI_CORE_ID = ITEMS.register("brali_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","brali","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GYA_GO_CORE_ID = ITEMS.register("gya_go_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","gya_go","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SEEKER_CORE_ID = ITEMS.register("seeker_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","seeker","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BUTCHI_CORE_ID = ITEMS.register("butchi_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","butchi","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> REVI_CORE_ID = ITEMS.register("revi_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","geats_revi","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> VICE_CORE_ID = ITEMS.register("vice_rider_core_id",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","geats_vice","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static String[] BaseDesireDriverUsers = new String[] {"geats","tycoon","na_go","buffa","punkjack","nudge_sparrow","shirowe","ginpen","mary"
			,"da_paan","keirou","letter","lopo","hakubi","turbon","brali","gya_go","seeker","butchi","geats_revi","geats_vice","groovy"};
	
	public static final RegistryObject<Item> MAGNUM_RAISE_BUCKLE = ITEMS.register("magnum_raise_buckle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_magnum","geats","desire_driver_belt_geats",
            		new MobEffectInstance(Effect_core.FIRE_SHOT.get(), 40, 0,true,false))
            .ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ZOMBIE_RAISE_BUCKLE = ITEMS.register("zombie_raise_buckle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_zombie","geats","desire_driver_belt_geats",
            		new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 1,true,false))
            .ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NINJA_RAISE_BUCKLE = ITEMS.register("ninja_raise_buckle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_ninja","geats","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
            .ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
    
	public static final RegistryObject<Item> BEAT_RAISE_BUCKLE = ITEMS.register("beat_raise_buckle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_beat","geats","desire_driver_belt_geats",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
            .ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

    
	public static final RegistryObject<Item> BOOST_RAISE_BUCKLE = ITEMS.register("boost_raise_buckle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_boost","geats","desire_driver_belt_geats",
            		new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false))
            .ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));


	
	public static final RegistryObject<Item> GEATS_HELMET = ITEMS.register("geatshead",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    public static final RegistryObject<Item> GEATS_CHESTPLATE = ITEMS.register("geatstroso",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    public static final RegistryObject<Item> GEATS_LEGGINGS = ITEMS.register("geatslegs",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

    
    public static final RegistryObject<Item> DESIRE_DRIVER_GEATS = ITEMS.register("desire_driver_geats",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"geats",GEATS_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_TYCOON = ITEMS.register("desire_driver_tycoon",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"tycoon",TYCOON_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_NA_GO = ITEMS.register("desire_driver_na_go",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"na_go",NA_GO_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_BUFFA = ITEMS.register("desire_driver_buffa",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"buffa",BUFFA_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
   
    public static final RegistryObject<Item> DESIRE_DRIVER_PUNKJACK = ITEMS.register("desire_driver_punkjack",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"punkjack",PUNKJACK_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_NUGE_SPARROW = ITEMS.register("desire_driver_nudge_sparrow",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"nudge_sparrow",NUGE_SPARROW_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_SHIROWE = ITEMS.register("desire_driver_shirowe",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"shirowe",SHIROWE_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_GINPEN = ITEMS.register("desire_driver_ginpen",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"ginpen",GINPEN_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_MARY = ITEMS.register("desire_driver_mary",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"mary",MARY_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_DA_PAAN = ITEMS.register("desire_driver_da_paan",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"da_paan",DA_PAAN_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_KEIROU = ITEMS.register("desire_driver_keirou",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"keirou",KEIROU_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_LETTER = ITEMS.register("desire_driver_letter",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"letter",LETTER_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_LOPO = ITEMS.register("desire_driver_lopo",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"lopo",LOPO_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_GROOVY = ITEMS.register("desire_driver_groovy",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"groovy",GROOVY_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_HAKUBI = ITEMS.register("desire_driver_hakubi",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"hakubi",HAKUBI_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_TURBON = ITEMS.register("desire_driver_turbon",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"turbon",TURBON_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_BRALI = ITEMS.register("desire_driver_brali",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"brali",BRALI_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_GYA_GO = ITEMS.register("desire_driver_gya_go",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"gya_go",GYA_GO_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_SEEKER = ITEMS.register("desire_driver_seeker",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"seeker",SEEKER_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_BUTCHI = ITEMS.register("desire_driver_butchi",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"butchi",BUTCHI_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_REVI = ITEMS.register("desire_driver_revi",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"geats_revi",REVI_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static final RegistryObject<Item> DESIRE_DRIVER_VICE = ITEMS.register("desire_driver_vice",
    		() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"geats_vice",VICE_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
    		.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
    
    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}
