package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.GameCreator;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.ProgrisekeyPrinter;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;
import com.kelco.kamenridercraft.events.ModClientEvents;

import net.minecraft.client.gui.font.glyphs.BakedGlyph.Effect;
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

public class Zero_One_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
    
	public static final RegistryObject<Item> ZERO_ONE_LOGO = ITEMS.register("zero_one_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));

	public static final RegistryObject<Item> HIDEN_METAL = ITEMS.register("hiden_metal",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> BLANK_PROGRISEKEY = ITEMS.register("blank_progrisekey",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> HUMAGEAR_PROGRISEKEY = ITEMS.register("humagear_progrisekey",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));

	public static final RegistryObject<Item> RISING_HOPPER_PROGRISEKEY = ITEMS.register("rising_hopper_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HIDEN_PROGRISEKEY, 10));
	public static final RegistryObject<Item> SHINING_HOPPER_PROGRISEKEY = ITEMS.register("shining_hopper_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_shining","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HIDEN_PROGRISEKEY, 2));
	public static final RegistryObject<Item> SHINING_ASSAULT_HOPPER_PROGRISEKEY = ITEMS.register("shining_assault_hopper_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_assault","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> METALCLUSTER_HOPPER_PROGRISEKEY = ITEMS.register("metalcluster_hopper_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_metalcluster","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> ZERO_TWO_PROGRISEKEY = ITEMS.register("zero_two_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_two","zero_one","zero_two_driver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 8,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> RED_RISING_HOPPER_PROGRISEKEY = ITEMS.register("red_rising_hopper_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_red","zero_one","zero_one_driver_red_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HIDEN_PROGRISEKEY));
	public static final RegistryObject<Item> REALIZE_RISING_HOPPER_PROGRISEKEY = ITEMS.register("realize_rising_hopper_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_realizing_hopper","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false))
            .IsGlowing().AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> HELLRISE_PROGRISEKEY = ITEMS.register("hellrise_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_hell","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 2,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> ZERO_THREE_PROGRISEKEY = ITEMS.register("zero_three_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_three","zero_one","zero_three_driver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 6,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 8,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));

	// I almost want to use .AddCompatibilityList() for Vulcan despite him being the only other Rider that uses these
	public static final RegistryObject<Item> BITING_SHARK_PROGRISEKEY = ITEMS.register("biting_shark_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_shark","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HIDEN_PROGRISEKEY, 5));
	public static final RegistryObject<Item> FLAMING_TIGER_PROGRISEKEY = ITEMS.register("flaming_tiger_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_tiger","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HIDEN_PROGRISEKEY, 5));
	public static final RegistryObject<Item> FREEZING_BEAR_PROGRISEKEY = ITEMS.register("freezing_bear_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_bear","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.ZAIA_PROGRISEKEY, 5));
	// public static final RegistryObject<Item> BREAKING_MAMMOTH_PROGRISEKEY = ITEMS.register("breaking_mammoth_progrisekey",
    //         () -> new RiderFormChangeItem(new Item.Properties(),0,"_mammoth","zero_one","zero_one_driver_belt",
    //         		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
    //         		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
    //         		new MobEffectInstance(Effect_core.BIG.get(), 40, 2,true,false))
	// 		.ChangeModel("geo/breaking_mammoth.geo.json").SetPalyerModelInvisible().AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HIDEN_PROGRISEKEY, 5));
	public static final RegistryObject<Item> SPARKING_GIRAFFE_PROGRISEKEY = ITEMS.register("sparking_giraffe_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_giraffe","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.ZAIA_PROGRISEKEY, 5));
	public static final RegistryObject<Item> AMAZING_HERCULES_PROGRISEKEY = ITEMS.register("amazing_hercules_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_hercules","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.ZAIA_PROGRISEKEY, 5));
	public static final RegistryObject<Item> CRUSHING_BUFFALO_PROGRISEKEY = ITEMS.register("crushing_buffalo_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_buffalo","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> EXCITING_STAG_PROGRISEKEY = ITEMS.register("exciting_stag_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_stag","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.ZAIA_PROGRISEKEY, 5));
	public static final RegistryObject<Item> GATLING_HEDGEHOG_PROGRISEKEY = ITEMS.register("gatling_hedgehog_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_hedgehog","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.ZAIA_PROGRISEKEY, 5));
	public static final RegistryObject<Item> TRAPPING_SPIDER_PROGRISEKEY = ITEMS.register("trapping_spider_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_spider","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.ZAIA_PROGRISEKEY, 5));
	public static final RegistryObject<Item> STORMING_PENGUIN_PROGRISEKEY = ITEMS.register("storming_penguin_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_penguin","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> HOPPING_KANGAROO_PROGRISEKEY = ITEMS.register("hopping_kangaroo_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_kangaroo","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 6,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HIDEN_PROGRISEKEY, 5));
	public static final RegistryObject<Item> SPLASHING_WHALE_PROGRISEKEY = ITEMS.register("splashing_whale_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_whale","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> DYNAMAITING_LION_PROGRISEKEY = ITEMS.register("dynamaiting_lion_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_lion","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> SCOUTING_PANDA_PROGRISEKEY = ITEMS.register("scouting_panda_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_panda","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> INVADING_HORSESHOE_CRAB_PROGRISEKEY = ITEMS.register("invading_horseshoe_crab_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_horseshoe_crab","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
            .AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));

	public static final RegistryObject<Item> SHOOTING_WOLF_PROGRISEKEY_ZERO_ONE = ITEMS.register("shooting_wolf_progrisekey_zero_one",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_wolf","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)));
	public static final RegistryObject<Item> SHOOTING_WOLF_PROGRISEKEY = ITEMS.register("shooting_wolf_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","vulcan","shotriser_belt",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.addAlternative(SHOOTING_WOLF_PROGRISEKEY_ZERO_ONE.get()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> PUNCHING_KONG_PROGRISEKEY_ZERO_ONE = ITEMS.register("punching_kong_progrisekey_zero_one",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_kong","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false)));
	public static final RegistryObject<Item> PUNCHING_KONG_PROGRISEKEY = ITEMS.register("punching_kong_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_kong","vulcan","shotriser_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
			.addAlternative(PUNCHING_KONG_PROGRISEKEY_ZERO_ONE.get()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.ZAIA_PROGRISEKEY, 5));
	public static final RegistryObject<Item> RUSHING_CHEETAH_PROGRISEKEY_ZERO_ONE = ITEMS.register("rushing_cheetah_progrisekey_zero_one",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_cheetah","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)));
	public static final RegistryObject<Item> RUSHING_CHEETAH_PROGRISEKEY = ITEMS.register("rushing_cheetah_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","valkyrie","shotriser_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.addAlternative(RUSHING_CHEETAH_PROGRISEKEY_ZERO_ONE.get()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> LIGHTNING_HORNET_PROGRISEKEY_ZERO_ONE = ITEMS.register("lightning_hornet_progrisekey_zero_one",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_hornet","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false)));
	public static final RegistryObject<Item> LIGHTNING_HORNET_PROGRISEKEY = ITEMS.register("lightning_hornet_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_hornet","valkyrie","shotriser_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false))
			.addAlternative(LIGHTNING_HORNET_PROGRISEKEY_ZERO_ONE.get()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.ZAIA_PROGRISEKEY, 5));

	public static final RegistryObject<Item> STING_SCORPION_PROGRISEKEY_ZERO_ONE = ITEMS.register("sting_scorpion_progrisekey_zero_one",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_scorpion","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false)));
	public static final RegistryObject<Item> STING_SCORPION_PROGRISEKEY = ITEMS.register("sting_scorpion_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","horobi","forceriser_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false))
			.addAlternative(STING_SCORPION_PROGRISEKEY_ZERO_ONE.get()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.ZAIA_PROGRISEKEY, 10));
	public static final RegistryObject<Item> FLYING_FALCON_PROGRISEKEY_ZERO_ONE = ITEMS.register("flying_falcon_progrisekey_zero_one",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_falcon","zero_one","zero_one_driver_belt",
            		new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false)));
	public static final RegistryObject<Item> FLYING_FALCON_PROGRISEKEY = ITEMS.register("flying_falcon_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","jin","forceriser_belt",
            		new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false))
			.addAlternative(FLYING_FALCON_PROGRISEKEY_ZERO_ONE.get()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HIDEN_PROGRISEKEY, 5));

	public static final RegistryObject<Item> AMAZING_CAUCASUS_PROGRISEKEY_ZERO_ONE = ITEMS.register("amazing_caucasus_progrisekey_zero_one",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_caucasus","zero_one","zero_one_driver_belt",
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)));
	public static final RegistryObject<Item> AMAZING_CAUCASUS_PROGRISEKEY = ITEMS.register("amazing_caucasus_progrisekey",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","thouser","thousandriver_belt",
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
			.addAlternative(AMAZING_CAUCASUS_PROGRISEKEY_ZERO_ONE.get()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.ZAIA_PROGRISEKEY, 2));

	public static final RegistryObject<Item> IS_PROGRISEKEY = ITEMS.register("is_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY));
	public static final RegistryObject<Item> UCHUYARO_SUBARU_PROGRISEKEY = ITEMS.register("uchuyaro_subaru_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> SAIKYO_TAKUMI_OYAKATA_PROGRISEKEY = ITEMS.register("saikyo_takumi_oyakata_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> DR_OMIGOTO_PROGRISEKEY = ITEMS.register("dr_omigoto_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> SUMIDA_SMILE_PROGRISEKEY = ITEMS.register("sumida_smile_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> MAMORU_PROGRISEKEY = ITEMS.register("mamoru_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> BENGOSHI_BINGO_PROGRISEKEY = ITEMS.register("bengoshi_bingo_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> IKKAN_NIGIRO_PROGRISEKEY = ITEMS.register("ikkan_nigiro_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> MATSUDA_ENJI_PROGRISEKEY = ITEMS.register("matsuda_enji_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> MORIFUDE_G_PEN_PROGRISEKEY = ITEMS.register("morifude_g_pen_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> FUKKINHOUKAI_TARO_PROGRISEKEY = ITEMS.register("fukkinhoukai_taro_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> SHESTA_PROGRISEKEY = ITEMS.register("shesta_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> LOVE_CHAN_PROGRISEKEY = ITEMS.register("love_chan_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> HAKASE_BOT_PROGRISEKEY = ITEMS.register("hakase_bot_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> OKURERU_PROGRISEKEY = ITEMS.register("okureru_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> DELMO_PROGRISEKEY = ITEMS.register("delmo_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HUMAGEAR_PROGRISEKEY, 5));
	public static final RegistryObject<Item> MATSURIDA_Z_PROGRISEKEY = ITEMS.register("matsurida_z_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));

	public static final RegistryObject<Item> HOROBI_PROGRISEKEY = ITEMS.register("horobi_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> NAKI_PROGRISEKEY = ITEMS.register("naki_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> JIN_PROGRISEKEY = ITEMS.register("jin_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> IKAZUCHI_PROGRISEKEY = ITEMS.register("ikazuchi_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));
	public static final RegistryObject<Item> PRESIDENT_DAN_KUROTO_PROGRISEKEY = ITEMS.register("president_dan_kuroto_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM));

	public static final RegistryObject<Item> MERRY_HOPPER_PROGRISEKEY = ITEMS.register("merry_hopper_progrisekey",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).AddToTabList(ProgrisekeyPrinter.HIDEN_PROGRISEKEY));

    public static final RegistryObject<Item> ZERO_ONE_HELMET = ITEMS.register("zero_onehead",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
    public static final RegistryObject<Item> ZERO_ONE_CHESTPLATE = ITEMS.register("zero_onetroso",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
    public static final RegistryObject<Item> ZERO_ONE_LEGGINGS = ITEMS.register("zero_onelegs",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
    
    public static final RegistryObject<Item> HIDEN_ZERO_ONE_DRIVER = ITEMS.register("hiden_zero_one_driver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"zero_one",RISING_HOPPER_PROGRISEKEY ,ZERO_ONE_HELMET, ZERO_ONE_CHESTPLATE,ZERO_ONE_LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));

    
    public static final RegistryObject<SwordItem> ATTACHE_CALIBUR = ITEMS.register("attache_calibur",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
	public static final RegistryObject<BaseBlasterItem> ATTACHE_SHOTGUN = ITEMS.register("attache_shotgun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
	public static final RegistryObject<BaseBlasterItem> ATTACHE_ARROW = ITEMS.register("attache_arrow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
	public static final RegistryObject<BaseBlasterItem> AUTHORISE_BUSTER = ITEMS.register("authorise_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 13, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
    public static final RegistryObject<SwordItem> PROGRISE_HOPPER_BLADE = ITEMS.register("progrise_hopper_blade",
            () -> new BaseSwordItem(Tiers.DIAMOND, 11, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
    public static final RegistryObject<SwordItem> PROGRISE_HOPPER_BLADE_NAGINATA = ITEMS.register("progrise_hopper_blade_naginata",
            () -> new BaseSwordItem(Tiers.DIAMOND, 18, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
    public static final RegistryObject<SwordItem> THOUSAND_JACKER = ITEMS.register("thousand_jacker",
            () -> new BaseSwordItem(Tiers.DIAMOND, 8, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));

	public static final RegistryObject<BaseBlasterItem> SHOTRISER = ITEMS.register("shot_riser_gun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
    public static final RegistryObject<SwordItem> SLASHRISER = ITEMS.register("zaia_slashriser_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
	public static final RegistryObject<BaseBlasterItem> SHOTABADDORISER = ITEMS.register("shot_abaddo_gun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
    public static final RegistryObject<SwordItem> SLASHABADDORISER = ITEMS.register("slash_abaddo_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.ZERO_ONE_TAB_ITEM).ChangeRepairItem(HIDEN_METAL.get()));
		
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}