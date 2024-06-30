package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.geats.DesireDriverItem;
import com.kelco.kamenridercraft.Items.geats.FeverSlotItem;
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

	public static String[] BaseDesireDriverUsers = new String[] {"geats","tycoon","na_go","buffa","punkjack","nudge_sparrow","shirowe","ginpen","mary"
			,"da_paan","keirou","letter","lopo","hakubi","turbon","brali","gya_go","seeker","butchi","geats_revi","geats_vice","groovy","the_end_riders"
			,"keibi_riders","gm_chirami","gm","jyamato"};
	
	public static String[] FeverUsers = new String[] {"geats","tycoon","na_go","buffa","punkjack","nudge_sparrow","shirowe","ginpen","mary"
			,"da_paan","keirou","letter","lopo","hakubi","turbon","brali","gya_go","seeker","butchi","geats_revi","geats_vice","groovy"};
	
	public static final RegistryObject<Item> GEATS_LOGO = ITEMS.register("geats_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BLANK_CORE_ID = ITEMS.register("blank_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","keibi","desire_driver_belt_keibi",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GEATS_CORE_ID = ITEMS.register("geats_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> TYCOON_CORE_ID = ITEMS.register("tycoon_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","tycoon","desire_driver_belt_tycoon",
					new MobEffectInstance(MobEffects.LUCK, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NA_GO_CORE_ID = ITEMS.register("na_go_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","na_go","desire_driver_belt_na_go",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BUFFA_CORE_ID = ITEMS.register("buffa_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","buffa","desire_driver_belt_buffa",
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BUFFA_CORE_ID_CRACKED = ITEMS.register("buffa_rider_core_id_cracked",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_jyamato","buffa","desire_driver_belt_buffa",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> PUNKJACK_CORE_ID = ITEMS.register("punkjack_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","punkjack","desire_driver_belt_punkjack",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NUGE_SPARROW_CORE_ID = ITEMS.register("nudge_sparrow_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","nudge_sparrow","desire_driver_belt_nadge_sparrow",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SHIROWE_CORE_ID = ITEMS.register("shirowe_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","shirowe","desire_driver_belt_shirowe",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GINPEN_CORE_ID = ITEMS.register("ginpen_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ginpen","desire_driver_belt_ginpen",
					new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> MARY_CORE_ID = ITEMS.register("mary_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","mary","desire_driver_belt_mary",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DA_PAAN_CORE_ID = ITEMS.register("da_paan_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","da_paan","desire_driver_belt_da_paan",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> KEIROU_CORE_ID = ITEMS.register("keirou_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","keirou","desire_driver_belt_keilow",
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> LETTER_CORE_ID = ITEMS.register("letter_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","letter","desire_driver_belt_letter",
					new MobEffectInstance(MobEffects.UNLUCK, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> LOPO_CORE_ID = ITEMS.register("lopo_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","lopo","desire_driver_belt_lopo",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GROOVY_CORE_ID = ITEMS.register("groovy_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","groovy","desire_driver_belt_groovy",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> HAKUBI_CORE_ID = ITEMS.register("hakubi_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","hakubi","desire_driver_belt_ginpen",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> TURBON_CORE_ID = ITEMS.register("turbon_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","turbon","desire_driver_belt_turbon",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BRALI_CORE_ID = ITEMS.register("brali_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","brali","desire_driver_belt_brali",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GYA_GO_CORE_ID = ITEMS.register("gya_go_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","gya_go","desire_driver_belt_gya_go",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SEEKER_CORE_ID = ITEMS.register("seeker_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","seeker","desire_driver_belt_seeker",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BUTCHI_CORE_ID = ITEMS.register("butchi_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","butchi","desire_driver_belt_da_paan",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> REVI_CORE_ID = ITEMS.register("revi_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","geats_revi","desire_driver_belt_revi",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> VICE_CORE_ID = ITEMS.register("vice_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","geats_vice","desire_driver_belt_vice",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DISCORE_ID = ITEMS.register("discore_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","jyamato","desire_driver_belt_jyamato",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));


	public static final RegistryObject<Item> MAGNUM_RAISE_BUCKLE = ITEMS.register("magnum_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_magnum","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.FIRE_SHOT.get(), 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BOOST_RAISE_BUCKLE = ITEMS.register("boost_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_boost","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ZOMBIE_RAISE_BUCKLE = ITEMS.register("zombie_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_zombie","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NINJA_RAISE_BUCKLE = ITEMS.register("ninja_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ninja","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> MONSTER_RAISE_BUCKLE = ITEMS.register("monster_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_monster","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BEAT_RAISE_BUCKLE = ITEMS.register("beat_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_beat","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));


	public static final RegistryObject<Item> POWERED_BUILDER_RAISE_BUCKLE_GEATS = ITEMS.register("powered_builder_raise_buckle_geats",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_poweredbuilder","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.EXPLOSION_SHOT.get(), 40, 0,true,false),
					new MobEffectInstance(Effect_core.FIRE_PUNCH.get(), 40, 1,true,false),
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers));

	public static final RegistryObject<Item> POWERED_BUILDER_RAISE_BUCKLE = ITEMS.register("powered_builder_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_poweredbuilder_seeker","seeker","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.EXPLOSION_SHOT.get(), 40, 0,true,false),
					new MobEffectInstance(Effect_core.FIRE_PUNCH.get(), 40, 1,true,false),
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).addAlternative(POWERED_BUILDER_RAISE_BUCKLE_GEATS.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> FANTASY_RAISE_BUCKLE_GYA_GO = ITEMS.register("powered_builder_raise_buckle_gya_go",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_fantasy_gya_go","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers));

	public static final RegistryObject<Item> FANTASY_RAISE_BUCKLE = ITEMS.register("fantasy_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_fantasy","na_go","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).addAlternative(FANTASY_RAISE_BUCKLE_GYA_GO.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	
	public static final RegistryObject<Item> MAGNUM_RAISE_BUCKLE_FEVER = ITEMS.register("magnum_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_magnum_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.FIRE_SHOT.get(), 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> BOOST_RAISE_BUCKLE_FEVER = ITEMS.register("boost_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_boost_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> ZOMBIE_RAISE_BUCKLE_FEVER = ITEMS.register("zombie_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_zombie_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> NINJA_RAISE_BUCKLE_FEVER = ITEMS.register("ninja_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ninja_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> MONSTER_RAISE_BUCKLE_FEVER = ITEMS.register("monster_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_monster_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> BEAT_RAISE_BUCKLE_FEVER = ITEMS.register("beat_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_beat_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> ARROW_RAISE_BUCKLE_FEVER = ITEMS.register("arrow_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_arrow_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.EXPLOSION_SHOT.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> WATER_RAISE_BUCKLE_FEVER = ITEMS.register("water_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_water_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> HAMMER_RAISE_BUCKLE_FEVER = ITEMS.register("hammer_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_hammer_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> SHIELD_RAISE_BUCKLE_FEVER = ITEMS.register("shield_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shield_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> CHAIN_ARRAY_RAISE_BUCKLE_FEVER = ITEMS.register("chain_array_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_chain_array_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 0,true,false),
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> CLAW_RAISE_BUCKLE_FEVER = ITEMS.register("claw_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_claw_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> DRILL_RAISE_BUCKLE_FEVER = ITEMS.register("drill_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_drill_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 2,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).ChangeModel("geats_rider_drill.geo.json")
			.AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> PROPELLER_RAISE_BUCKLE_FEVER = ITEMS.register("propeller_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_propeller_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 6,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	
	public static final RegistryObject<Item> FEVER_SLOT_RAISE_BUCKLE = ITEMS.register("fever_slot_raise_buckle",
			() -> new FeverSlotItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	/**
	boost_markii_raise_buckle
	unite_grip
	boost_markiii_raise_buckle

	fever_slot_raise_buckle

	command_twin_buckle_jet
	command_twin_buckle_cannon
	 **/

	public static final RegistryObject<Item> JYAMATO_BUCKLE_BUFFA = ITEMS.register("jyamato_buckle_buffa",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_jyamato","buffa","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false))
			.addNeedForm(BUFFA_CORE_ID_CRACKED.get(),1).ChangeSlot(2).SetOffhandSlot(3));


	public static final RegistryObject<Item> JYAMATO_BUCKLE = ITEMS.register("jyamato_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_jyamato","jyamato","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).addAlternative(JYAMATO_BUCKLE_BUFFA.get()).AddCompatibilityList(new String[] {"gm_chirami"}
					).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	//Armed 
	public static final RegistryObject<Item> ARROW_RAISE_BUCKLE = ITEMS.register("arrow_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_arrow","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.EXPLOSION_SHOT.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> WATER_RAISE_BUCKLE = ITEMS.register("water_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_water","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> HAMMER_RAISE_BUCKLE = ITEMS.register("hammer_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_hammer","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SHIELD_RAISE_BUCKLE = ITEMS.register("shield_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shield","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> CHAIN_ARRAY_RAISE_BUCKLE = ITEMS.register("chain_array_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_chain_array","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 0,true,false),
			new MobEffectInstance(Effect_core.SLASH.get(), 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> CLAW_RAISE_BUCKLE = ITEMS.register("claw_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_claw","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DRILL_RAISE_BUCKLE = ITEMS.register("drill_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_drill","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 2,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).ChangeModel("geats_rider_drill.geo.json").AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> PROPELLER_RAISE_BUCKLE = ITEMS.register("propeller_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_propeller","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 6,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GIGANT_CONTAINER_BUCKLE = ITEMS.register("gigant_container_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_gigant_container","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GIGANT_SWORD_BUCKLE = ITEMS.register("gigant_sword_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GIGANT_HAMMER_BUCKLE = ITEMS.register("gigant_hammer_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GIGANT_BLASTER_BUCKLE = ITEMS.register("gigant_blaster_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> MAGNUM_SHOOTER_40X_RAISE_BUCKLE = ITEMS.register("magnum_shooter_40x_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NINJA_DUELER_RAISE_BUCKLE = ITEMS.register("ninja_dueler_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ZOMBIE_BREAKER_RAISE_BUCKLE = ITEMS.register("zombie_breaker_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BEAT_AXE_RAISE_BUCKLE = ITEMS.register("beat_axe_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> CHRISTMAS_BUCKLE = ITEMS.register("christmas_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GOLD_HAMMER_RAISE_BUCKLE = ITEMS.register("golden_hammer_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SILVER_ARROW_RAISE_BUCKLE = ITEMS.register("silver_arrow_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> CLEAR_ARROW_RAISE_BUCKLE = ITEMS.register("clear_arrow_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BEAT_RAISE_BUCKLE_THEME = ITEMS.register("beat_raise_buckle_theme",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	/**
	revice_driver_raise_buckle
	two_si_driver_raise_buckle
	demons_driver_raise_buckle
	libera_driver_raise_buckle

	seiken_swordriver_raise_buckle
	zero_one_driver_raise_buckle
	zikuu_driver_raise_buckle
	build_driver_raise_buckle
	gamer_driver_raise_buckle
	ghost_driver_raise_buckle
	drive_driver_raise_buckle
	sengoku_driver_raise_buckle
	wizardriver_raise_buckle
	fourze_driver_raise_buckle
	ooo_driver_raise_buckle
	double_driver_raise_buckle
	deca_driver_raise_buckle
	kivat_belt_raise_buckle
	den_o_belt_raise_buckle
	kabuto_zector_raise_buckle
	ongekiko_kaentsuzumi_raise_buckle
	blay_buckle_raise_buckle
	faiz_driver_raise_buckle
	v_buckle_raise_buckle
	alter_ring_raise_buckle
	arcle_raise_buckle
	king_stone_raise_buckle
	double_typhoon_raise_buckle
	typhoon_raise_buckle

	ouja_v_buckle_raise_buckle
	 **/
	
	public static final RegistryObject<Item> KING_OHGER_RAISE_BUCKLE = ITEMS.register("king_ohger_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

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

	public static final RegistryObject<Item> DESIRE_DRIVER_JYAMATO = ITEMS.register("desire_driver_jyamato",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"jyamato",DISCORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,JYAMATO_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_GM= ITEMS.register("desire_driver_gm",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"gm",BLANK_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_GM_CHIRAMI= ITEMS.register("desire_driver_gm_chirami",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"gm_chirami",BLANK_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_KEIDI_RIDER = ITEMS.register("desire_driver_keibi_riders",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"keibi_riders",BLANK_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_THE_END_RIDER = ITEMS.register("desire_driver_the_end_riders",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"the_end_riders",BLANK_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	
	public static final RegistryObject<Item> JYAMASHIN_WISH_CARD = ITEMS.register("jyamashin_wish_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_jyamashin","buffa","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));


	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}
