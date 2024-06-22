package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Modded_item_core {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> BLANK_FORM = ITEMS.register("blank_form",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","",""));


	public static final RegistryObject<Item> RIDER_CIRCUIT = ITEMS.register("rider_circuit",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> ICE_POP = ITEMS.register("icepop1",
			() -> new BaseItem(new Item.Properties().food(Foods.BEEF)).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> ICE_POP2 = ITEMS.register("icepop2",
			() -> new BaseItem(new Item.Properties().food(Foods.BEEF)).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> ICE_POP3 = ITEMS.register("icepop3",
			() -> new BaseItem(new Item.Properties().food(Foods.BEEF)).AddToTabList(RiderTabs.Misc_TAB_ITEM));


	public static final RegistryObject<Item> DONUT = ITEMS.register("donut",
			() -> new BaseItem(new Item.Properties().food(Foods.BREAD)).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> BASE_SWORD = ITEMS.register("base_sword",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> BASE_BIKE = ITEMS.register("base_bike",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> SHOCKER_EMBLEM = ITEMS.register("shocker_emblem",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> SINISTER_PACHINKO_BALL = ITEMS.register("sinister_pachinko_ball",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> CARD_WARRIOR_KAMEN_RIDER_MANGA = ITEMS.register("card_warrior_kamen_rider_manga",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM).KeepItem());

	
	public static final RegistryObject<Item> DRAGREDER = ITEMS.register("dragreder",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_dragreder","ryuki","v_buckle_belt_ryuki",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 1,true,false))
			.ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> STAGTORNADOR = ITEMS.register("stagtornador",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_stagtornador","agito","alter_ring_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 1,true,false))
			.ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));

	 public static final RegistryObject<Item> HERCULESPADER = ITEMS.register("herculespader",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_herculespader","blade","blay_buckle_belt",
	            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
	            .ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));
	    
	 
		public static final RegistryObject<Item> DARKWING = ITEMS.register("darkwing",
				() -> new RiderFormChangeItem(new Item.Properties(),0,"_darkwing","knight","v_buckle_belt_knight",
						new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
						new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
						new MobEffectInstance(Effect_core.FLYING.get(), 40, 1,true,false))
						.ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));



		public static final RegistryObject<Item> GREYWOLCH = ITEMS.register("greywolch",
				() -> new RiderFormChangeItem(new Item.Properties(),0,"_greywolch","faiz","faiz_driver_belt",
						new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
						new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
						new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
				.ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));
		 
	public static final RegistryObject<Item> GRANDGOURAM = ITEMS.register("grandgouram",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_grand_gouram","kuuga","arcle_belt_r",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 8,true,false))
			.ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));

    public static final RegistryObject<Item> EXBEETER = ITEMS.register("exbeeter",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_exbeeter","kabuto","kabuto_rider_belt",
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false))
        	.ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));
    
    public static final RegistryObject<Item> CHAOSDILE = ITEMS.register("chaosdile",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_chaosdile","kaixa","kaixa_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)
					).ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));

    
    public static final RegistryObject<Item> LEATHERAIDER = ITEMS.register("leatheraider",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_leatheraider","gills","meta_factor_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
            .ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));


	public static final RegistryObject<Item> FLARESALAMANDER = ITEMS.register("flaresalamander",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_flaresalamander","v3","double_typhoon_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 1,true,false)
					).ChangeModel("geo/v3_flaresalamander.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));

	//Dragranzer
	//Scissorbeeter
	//Akanetaka
	//Shadowmantis
	public static final RegistryObject<Item> CYCLONEHOPPER = ITEMS.register("cyclonehopper",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_cyclonehopper","ichigo","typhoon_belt_original",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 1,true,false)
					).ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));

	//Bakuen no senshi
	//Jinrai no senshi

	public static final RegistryObject<SwordItem> GRANDGOURAM_ROD = ITEMS.register("grandgouram_rod",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM)
			.ChangeRepairItem(RIDER_CIRCUIT.get()));

	public static final RegistryObject<SwordItem> HERCULESPADER_SWORD = ITEMS.register("herculespader_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM)
			.ChangeRepairItem(RIDER_CIRCUIT.get()));

	public static final RegistryObject<SwordItem> DARKWING_SWORD = ITEMS.register("darkwing_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 9, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM)
			.ChangeRepairItem(RIDER_CIRCUIT.get()));

	public static final RegistryObject<SwordItem> FLARESALAMANDER_SWORD = ITEMS.register("flaresalamander_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM)
			.ChangeRepairItem(RIDER_CIRCUIT.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}