package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseShieldItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;
import com.kelco.kamenridercraft.Items.ryuki.AdventCardItem;
import com.kelco.kamenridercraft.events.ModClientEvents;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Ryuki_Rider_Items {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	
	public static final RegistryObject<Item> RYUKI_LOGO = ITEMS.register("ryuki_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	public static final RegistryObject<Item> ADVENT_CARD = ITEMS.register("advent_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_blank","ryuki","v_buckle_belt",
					new MobEffectInstance(MobEffects.WEAKNESS, 400, 0,true,false)).AddCompatibilityList(new String[] {"ouja","knight"}).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	public static final RegistryObject<Item> DRAGREDER_ADVENT = ITEMS.register("dragreder_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ryuki","v_buckle_belt_ryuki",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.IsGlowing().AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> DARKWING_ADVENT = ITEMS.register("darkwing_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","knight","v_buckle_belt_knight",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> VOLCANCER_ADVENT = ITEMS.register("volcancer_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","scissors","v_buckle_belt_scissors",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> MAGNUGIGA_ADVENT = ITEMS.register("magnugiga_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","zolda","v_buckle_belt_zolda",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> EVILDIVER_ADVENT = ITEMS.register("evildiver_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","raia","v_buckle_belt_raia",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> METALGELAS_ADVENT = ITEMS.register("metalgelas_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","gai","v_buckle_belt_gai",
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false)).ChangeModel("geo/gai.geo.json").AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> VENOSNAKER_ADVENT = ITEMS.register("venosnaker_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ouja","v_buckle_belt_ouja",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> GOLDPHOENIX_ADVENT = ITEMS.register("goldphoenix_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","odin","v_buckle_belt_odin",
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance (MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> DESTWILDER_ADVENT = ITEMS.register("destwilder_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","tiger","v_buckle_belt_tiger",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> GIGAZELLE_ADVENT = ITEMS.register("gigazelle_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","imperer","v_buckle_belt_imperer",
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> BLANCWING_ADVENT = ITEMS.register("blancwing_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","femme","v_buckle_belt_femme",
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> DRAGBLACKER_ADVENT = ITEMS.register("dragblacker_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ryuga","v_buckle_belt_ryuga",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.IsGlowing().AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> BIOGREEZA_ADVENT = ITEMS.register("biogreeza_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","verde","v_buckle_belt_verde",
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> ABYSSLASHER_ADVENT = ITEMS.register("abysslasher_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","abyss","v_buckle_belt_abyss",
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> PSYCOROGUE_ADVENT = ITEMS.register("psycorogue_advent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","alternative","v_buckle_alternative_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> SURVIVE_REKKA_RYUGA = ITEMS.register("survive_rekka_ryuga",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","ryuga","v_buckle_belt_ryuga_s",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false))
			.IsGlowing());

	public static final RegistryObject<Item> SURVIVE_REKKA = ITEMS.register("survive_rekka",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","ryuki","v_buckle_belt_ryuki_s",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)).addAlternative(SURVIVE_REKKA_RYUGA.get())
			.IsGlowing().AddToTabList(RiderTabs.RYUKI_TAB_ITEM));


	public static final RegistryObject<Item> SURVIVE_SHIPPU_RAIA = ITEMS.register("survive_shippu_raia",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","raia","v_buckle_belt_raia_s",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)));

	public static final RegistryObject<Item> SURVIVE_SHIPPU_OUJA = ITEMS.register("survive_shippu_ouja",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","ouja","v_buckle_belt_ouja",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).addAlternative(SURVIVE_SHIPPU_RAIA.get()));
	  
	public static final RegistryObject<Item> SURVIVE_SHIPPU = ITEMS.register("survive_shippu",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","knight","v_buckle_belt_knight_s",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).addAlternative(SURVIVE_SHIPPU_OUJA.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	public static final RegistryObject<Item> SURVIVE_MUGEN = ITEMS.register("survive_mugen",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_survive_mugen","ouja","v_buckle_belt_ouja_s",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> SURVIVE_BLACK = ITEMS.register("survive_black",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_survive_black","ryuki","v_buckle_belt_ryuki",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false))
			.IsGlowing().AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	  
	public static final RegistryObject<Item> RYUKIHELMET = ITEMS.register("ryukihead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	public static final RegistryObject<Item> RYUKICHESTPLATE = ITEMS.register("ryukitroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	public static final RegistryObject<Item> RYUKILEGGINGS = ITEMS.register("ryukilegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));

	public static final RegistryObject<Item> RYUKIDRIVER = ITEMS.register("v_buckle_ryuki",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ryuki",DRAGREDER_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	public static final RegistryObject<Item> KNIGHTDRIVER = ITEMS.register("v_buckle_knight",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"knight",DARKWING_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> SCISSORSDRIVER = ITEMS.register("v_buckle_scissors",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"scissors",VOLCANCER_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ZOLDADRIVER = ITEMS.register("v_buckle_zolda",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"zolda",MAGNUGIGA_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> RAIADRIVER = ITEMS.register("v_buckle_raia",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"raia",EVILDIVER_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> GAIDRIVER = ITEMS.register("v_buckle_gai",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"gai",METALGELAS_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> OUJADRIVER = ITEMS.register("v_buckle_ouja",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ouja",VENOSNAKER_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ODINDRIVER = ITEMS.register("v_buckle_odin",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"odin",GOLDPHOENIX_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> TIGERDRIVER = ITEMS.register("v_buckle_tiger",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"tiger",DESTWILDER_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> IMPERERDRIVER = ITEMS.register("v_buckle_imperer",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"imperer",GIGAZELLE_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> FEMMEDRIVER = ITEMS.register("v_buckle_femme",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"femme",BLANCWING_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> RYUGADRIVER = ITEMS.register("v_buckle_ryuga",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ryuga",DRAGBLACKER_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> VERDEDRIVER = ITEMS.register("v_buckle_verde",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"verde",BIOGREEZA_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ABYSSDRIVER = ITEMS.register("v_buckle_abyss",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"abyss",ABYSSLASHER_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ALTERNATIVEDRIVER = ITEMS.register("alternative_v_buckle",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"alternative",PSYCOROGUE_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ALTERNATIVEZERODRIVER = ITEMS.register("alternative_zero_v_buckle",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"alternative_zero",PSYCOROGUE_ADVENT ,RYUKIHELMET,RYUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	
	public static final RegistryObject<Item> RIDE_VISOR = ITEMS.register("ride_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
    public static final RegistryObject<SwordItem> RIDE_SABER = ITEMS.register("ride_saber",
            () -> new BaseSwordItem(Tiers.DIAMOND, 1, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<Item> DRAG_VISOR = ITEMS.register("drag_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<SwordItem> DRAG_SABER = ITEMS.register("drag_saber",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<BaseBlasterItem> DRAG_CLAW = ITEMS.register("drag_claw",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).setProjectileFireball().AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
        	
	public static final RegistryObject<ShieldItem> DRAG_SHIELD = ITEMS.register("drag_shield",
            () -> new BaseShieldItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem( ADVENT_CARD.get()));
    
    public static final RegistryObject<BaseBlasterItem> DRAG_VISOR_ZWEI = ITEMS.register("drag_visor_zwei",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 10, -2.4F, new Item.Properties()).setProjectileLargeFireball(1).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> DRAG_BLADE = ITEMS.register("drag_blade",
            () -> new BaseSwordItem(Tiers.DIAMOND, 11, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> DARK_VISOR = ITEMS.register("dark_visor",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> WING_LANCER = ITEMS.register("wing_lancer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -3F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> DARK_BLADE = ITEMS.register("dark_blade",
            () -> new BaseSwordItem(Tiers.DIAMOND, 11, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<ShieldItem> DARK_SHIELD = ITEMS.register("dark_visor_zwei",
            () -> new BaseShieldItem(new Item.Properties()).AddToTabList(ModClientEvents.DARK_SHIELD_ITEM).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<BaseBlasterItem> DARK_ARROW = ITEMS.register("dark_arrow",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 11, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> SCISSORS_VISOR = ITEMS.register("scissors_visor",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> SCISSORS_PINCH = ITEMS.register("scissors_pinch",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -3F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<ShieldItem> SHELL_DEFENSE = ITEMS.register("shell_defense",
            () -> new BaseShieldItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<BaseBlasterItem> MAGNA_VISOR = ITEMS.register("magna_visor",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> GIGA_HORN = ITEMS.register("giga_horn",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -3F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<BaseBlasterItem> GIGA_LAUNCHER = ITEMS.register("giga_launcher",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 5, -3F, new Item.Properties()).setProjectileLargeFireball(3).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<ShieldItem> GIGA_ARMOR = ITEMS.register("giga_armor",
            () -> new BaseShieldItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<Item> EVIL_VISOR = ITEMS.register("evil_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<SwordItem> EVIL_WHIP = ITEMS.register("evil_whip",
            () -> new BaseSwordItem(Tiers.DIAMOND, 2, -2F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<BaseBlasterItem> EVIL_VISOR_ZWEI = ITEMS.register("evil_visor_zwei",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 10, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<Item> METAL_VISOR = ITEMS.register("metal_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<SwordItem> METAL_HORN = ITEMS.register("metal_horn",
            () -> new BaseSwordItem(Tiers.DIAMOND, 8, -3.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> VENO_VISOR = ITEMS.register("veno_visor",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -3F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> VENO_SABER = ITEMS.register("veno_saber",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> VENO_VISOR_ZWEI = ITEMS.register("veno_visor_zwei",
            () -> new BaseSwordItem(Tiers.DIAMOND, 14, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> GOLD_VISOR = ITEMS.register("gold_visor",
            () -> new BaseSwordItem(Tiers.DIAMOND, 10, -3F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> GOLD_SABER = ITEMS.register("gold_saber",
            () -> new BaseSwordItem(Tiers.DIAMOND, 9, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<ShieldItem> GOLD_SHIELD = ITEMS.register("gold_shield",
            () -> new BaseShieldItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> DEST_VISOR = ITEMS.register("dest_visor",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> DEST_CLAW = ITEMS.register("dest_claw",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.6F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> DEST_CLAW1 = ITEMS.register("dest_claw1",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.6F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<Item> GAZELLE_VISOR = ITEMS.register("gazelle_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<SwordItem> GAZELLE_STAB = ITEMS.register("gazelle_stab",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> BLANC_VISOR = ITEMS.register("blanc_visor",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> WING_SLASHER = ITEMS.register("wing_slasher",
            () -> new BaseSwordItem(Tiers.DIAMOND,  6, -3F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<ShieldItem> WING_SHIELD = ITEMS.register("wing_shield",
            () -> new BaseShieldItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<Item> BLACK_DRAG_VISOR = ITEMS.register("black_drag_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<SwordItem> DRAG_SABER_RYUGA = ITEMS.register("drag_saber_ryuga",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<BaseBlasterItem> DRAG_CLAW_RYUGA = ITEMS.register("drag_claw_ryuga",
    	    () -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).setProjectileFireball().AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
	public static final RegistryObject<ShieldItem> DRAG_SHIELD_RYUGA = ITEMS.register("drag_shield_ryuga",
            () -> new BaseShieldItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem( ADVENT_CARD.get()));
    
    public static final RegistryObject<BaseBlasterItem> BLACK_DRAG_VISOR_ZWEI = ITEMS.register("black_drag_visor_zwei",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 14, -2.4F, new Item.Properties()).setProjectileLargeFireball(1).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<Item> BIO_VISOR = ITEMS.register("bio_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<SwordItem> BIO_WINDER = ITEMS.register("bio_winder",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<Item> SLASH_VISOR = ITEMS.register("slash_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<SwordItem> SLASH_DAGGER = ITEMS.register("slash_dagger",
            () -> new BaseSwordItem(Tiers.DIAMOND, 9, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<Item> ABYSS_VISOR = ITEMS.register("abyss_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<SwordItem> ABYSS_SABER = ITEMS.register("abyss_saber",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
    
    public static final RegistryObject<SwordItem> ABYSS_CLAW = ITEMS.register("abyss_claw",
            () -> new BaseSwordItem(Tiers.DIAMOND, 7, -3F, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<Item> RIDE_SABER_VENT = ITEMS.register("ride_saber_vent",
			() -> new AdventCardItem(new Item.Properties(), "ryuki", RIDE_SABER.get(), RIDE_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DRAG_SABER_VENT = ITEMS.register("drag_saber_vent",
			() -> new AdventCardItem(new Item.Properties(), "ryuki", DRAG_SABER.get(), DRAG_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DRAG_CLAW_VENT = ITEMS.register("drag_claw_vent",
			() -> new AdventCardItem(new Item.Properties(), "ryuki", DRAG_CLAW.get(), DRAG_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DRAG_SHIELD_VENT = ITEMS.register("drag_shield_vent",
			() -> new AdventCardItem(new Item.Properties(), "ryuki", DRAG_SHIELD.get(), DRAG_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DRAG_SHIELD_VENT_FORM = ITEMS.register("drag_shield_vent_form",
    		() -> new RiderFormChangeItem(new Item.Properties(),0,"_drag_shield","ryuki","v_buckle_belt_ryuki",
    				new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
    				new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
    				new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
    				new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
    		.ChangeModel("geo/ryuki_drag_shield.geo.json").IsGlowing().AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
    public static final RegistryObject<Item> DRAG_VISOR_ZWEI_VENT = ITEMS.register("drag_visor_zwei_vent",
			() -> new AdventCardItem(new Item.Properties(), "ryuki", DRAG_VISOR_ZWEI.get(), DRAG_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DRAG_BLADE_VENT = ITEMS.register("drag_blade_vent",
			() -> new AdventCardItem(new Item.Properties(), "ryuki", DRAG_BLADE.get(), DRAG_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> WING_LANCER_VENT = ITEMS.register("wing_lancer_vent",
			() -> new AdventCardItem(new Item.Properties(), "knight", WING_LANCER.get(), DARK_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> WING_WALL_VENT = ITEMS.register("wing_wall_vent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_wing_wall","knight","v_buckle_belt_knight",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.ChangeModel("geo/knight_wing_wall.geo.json").AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
    public static final RegistryObject<Item> DARK_BLADE_VENT = ITEMS.register("dark_blade_vent",
			() -> new AdventCardItem(new Item.Properties(), "knight", DARK_BLADE.get(), DARK_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DARK_VISOR_ZWEI_VENT = ITEMS.register("dark_visor_zwei_vent",
			() -> new AdventCardItem(new Item.Properties(), "knight", DARK_SHIELD.get(), DARK_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DARK_ARROW_VENT = ITEMS.register("dark_arrow_vent",
			() -> new AdventCardItem(new Item.Properties(), "knight", DARK_ARROW.get(), DARK_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> SCISSORS_PINCH_VENT = ITEMS.register("scissors_pinch_vent",
			() -> new AdventCardItem(new Item.Properties(), "scissors", SCISSORS_PINCH.get(), SCISSORS_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> SHELL_DEFENSE_VENT = ITEMS.register("shell_defense_vent",
			() -> new AdventCardItem(new Item.Properties(), "scissors", SHELL_DEFENSE.get(), SCISSORS_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> GIGA_HORN_VENT = ITEMS.register("giga_horn_vent",
			() -> new AdventCardItem(new Item.Properties(), "zolda", GIGA_HORN.get(), MAGNA_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> GIGA_LAUNCHER_VENT = ITEMS.register("giga_launcher_vent",
			() -> new AdventCardItem(new Item.Properties(), "zolda", GIGA_LAUNCHER.get(), MAGNA_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> GIGA_CANNON_VENT = ITEMS.register("giga_cannon_vent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_giga_cannon","zolda","v_buckle_belt_zolda",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
			.ChangeModel("geo/zolda_giga_cannon.geo.json").AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> GIGA_ARMOR_VENT = ITEMS.register("giga_armor_vent",
			() -> new AdventCardItem(new Item.Properties(), "zolda", GIGA_ARMOR.get(), MAGNA_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	public static final RegistryObject<Item> GIGA_TECTOR_VENT = ITEMS.register("giga_tector_vent",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_giga_tector","zolda","v_buckle_belt_zolda",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> EVIL_WHIP_VENT = ITEMS.register("evil_whip_vent",
			() -> new AdventCardItem(new Item.Properties(), "raia", EVIL_WHIP.get(), EVIL_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> EVIL_VISOR_ZWEI_VENT = ITEMS.register("evil_visor_zwei_vent",
			() -> new AdventCardItem(new Item.Properties(), "raia", EVIL_VISOR_ZWEI.get(), EVIL_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> METAL_HORN_VENT = ITEMS.register("metal_horn_vent",
			() -> new AdventCardItem(new Item.Properties(), "gai", METAL_HORN.get(), METAL_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> VENO_SABER_VENT = ITEMS.register("veno_saber_vent",
			() -> new AdventCardItem(new Item.Properties(), "ouja", VENO_SABER.get(), VENO_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> VENO_VISOR_ZWEI_VENT = ITEMS.register("veno_visor_zwei_vent",
			() -> new AdventCardItem(new Item.Properties(), "ouja", VENO_VISOR_ZWEI.get(), VENO_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> GOLD_SABER_VENT = ITEMS.register("gold_saber_vent",
			() -> new AdventCardItem(new Item.Properties(), "odin", GOLD_SABER.get(), GOLD_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> GOLD_SHIELD_VENT = ITEMS.register("gold_shield_vent",
			() -> new AdventCardItem(new Item.Properties(), "odin", GOLD_SHIELD.get(), GOLD_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DEST_CLAW_VENT = ITEMS.register("dest_claw_vent",
			() -> new AdventCardItem(new Item.Properties(), "tiger", DEST_CLAW.get(), DEST_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> GAZELLE_STAB_VENT = ITEMS.register("gazelle_stab_vent",
			() -> new AdventCardItem(new Item.Properties(), "imperer", GAZELLE_STAB.get(), GAZELLE_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> WING_SLASHER_VENT = ITEMS.register("wing_slasher_vent",
			() -> new AdventCardItem(new Item.Properties(), "femme", WING_SLASHER.get(), BLANC_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> WING_SHIELD_VENT = ITEMS.register("wing_shield_vent",
			() -> new AdventCardItem(new Item.Properties(), "femme", WING_SHIELD.get(), BLANC_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DRAG_SABER_VENT_RYUGA = ITEMS.register("drag_saber_vent_ryuga",
			() -> new AdventCardItem(new Item.Properties(), "ryuga", DRAG_SABER_RYUGA.get(), BLACK_DRAG_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DRAG_CLAW_VENT_RYUGA = ITEMS.register("drag_claw_vent_ryuga",
			() -> new AdventCardItem(new Item.Properties(), "ryuga", DRAG_CLAW_RYUGA.get(), BLACK_DRAG_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> DRAG_SHIELD_VENT_RYUGA = ITEMS.register("drag_shield_vent_ryuga",
			() -> new AdventCardItem(new Item.Properties(), "ryuga", DRAG_SHIELD_RYUGA.get(), BLACK_DRAG_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	   
	public static final RegistryObject<Item> DRAG_SHIELD_VENT_FORM_RYUGA = ITEMS.register("drag_shield_vent_form_ryuga",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_drag_shield","ryuga","v_buckle_belt_ryuga",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.ChangeModel("geo/ryuki_drag_shield.geo.json").IsGlowing().AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> BLACK_DRAG_VISOR_ZWEI_VENT = ITEMS.register("black_drag_visor_zwei_vent",
			() -> new AdventCardItem(new Item.Properties(), "ryuga", BLACK_DRAG_VISOR_ZWEI.get(), BLACK_DRAG_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> BIO_WINDER_VENT = ITEMS.register("bio_winder_vent",
			() -> new AdventCardItem(new Item.Properties(), "verde", BIO_WINDER.get(), BIO_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> SLASH_DAGGER_VENT = ITEMS.register("slash_dagger_vent",
			() -> new AdventCardItem(new Item.Properties(), "alternative", SLASH_DAGGER.get(), SLASH_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> ABYSS_SABER_VENT = ITEMS.register("abyss_saber_vent",
			() -> new AdventCardItem(new Item.Properties(), "abyss", ABYSS_SABER.get(), ABYSS_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
    
    public static final RegistryObject<Item> ABYSS_CLAW_VENT = ITEMS.register("abyss_claw_vent",
			() -> new AdventCardItem(new Item.Properties(), "abyss", ABYSS_CLAW.get(), ABYSS_VISOR.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	
     /**
	abyssmash
	**/
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
