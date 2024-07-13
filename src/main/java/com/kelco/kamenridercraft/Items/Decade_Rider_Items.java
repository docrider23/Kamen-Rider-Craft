package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
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

public class Decade_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> DECADE_LOGO = ITEMS.register("decade_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));

	public static final RegistryObject<Item> BLANK_CRAD = ITEMS.register("blank_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> DECADE_CYAN_CRAD = ITEMS.register("decade_cyan_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_cyan","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 400, 2,true,false)));

    public static final RegistryObject<Item> DIEND_GREEN_CRAD = ITEMS.register("diend_green_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_green","diend","diend_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false)));

    public static final RegistryObject<Item> DECADE_CRAD = ITEMS.register("decade_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 400, 2,true,false)).addAlternative(DIEND_GREEN_CRAD.get()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> K_TOUCH = ITEMS.register("k_touch",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_complete","decade","decadriver_belt_k_touch",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
					
    public static final RegistryObject<Item> DECADE_VIOLENT_EMOTION_CARD = ITEMS.register("decade_violent_emotion_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_violent_emotion","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(MobEffects.HUNGER, 40, 0,true,false)).AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> DIEND_CRAD = ITEMS.register("diend_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","diend","diend_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false)).addAlternative(DECADE_CYAN_CRAD.get()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> K_TOUCH_DIEND = ITEMS.register("k_touch_diend",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_complete","diend","diend_belt_k_touch",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> DARK_DECADE_CRAD = ITEMS.register("dark_decade_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","dark_decade","dark_decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 400, 2,true,false)).AddToTabList(RiderTabs.DECADE_TAB_ITEM));

	public static String[] BaseDecadeUsers = new String[] {"decade","dark_decade"};

    public static final RegistryObject<Item> KUUGA_MIGHTY_CRAD = ITEMS.register("kuuga_mighty_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

	public static final RegistryObject<Item> AGITO_GROUND_CRAD = ITEMS.register("agito_ground_card",
	        () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	        		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
	        		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
	        .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("agito").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> RYUKI_CRAD = ITEMS.register("ryuki_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("ryuki").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> FAIZ_CRAD = ITEMS.register("faiz_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("faiz").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> BLADE_ACE_CRAD = ITEMS.register("blade_ace_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("blade").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> HIBIKI_CRAD = ITEMS.register("hibiki_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("hibiki").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KABUTO_RIDER_CRAD = ITEMS.register("kabuto_rider_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kabuto").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> DEN_O_SWORD_CRAD = ITEMS.register("den_o_sword_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("den_o").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KIVA_CRAD = ITEMS.register("kiva_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kiva").AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	

	public static final RegistryObject<Item> KUUGA_GROWING_CRAD = ITEMS.register("kuuga_growing_card",
	        () -> new RiderFormChangeItem(new Item.Properties(),0,"_growing","decade","decadriver_belt",
	        		new MobEffectInstance(MobEffects.WEAKNESS, 40, 2,true,false))
	        .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));
		
    public static final RegistryObject<Item> KUUGA_DRAGON_CRAD = ITEMS.register("kuuga_dragon_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_dragon","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_PEGASUS_CRAD = ITEMS.register("kuuga_pegasus_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_pegasus","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_TITAN_CRAD = ITEMS.register("kuuga_titan_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_titan","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_MIGHTY_CRAD = ITEMS.register("kuuga_rising_mighty_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_mighty","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 3,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_DRAGON_CRAD = ITEMS.register("kuuga_rising_dragon_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_dragon","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_PEGASUS_CRAD = ITEMS.register("kuuga_rising_pegasus_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_pegasus","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_TITAN_CRAD = ITEMS.register("kuuga_rising_titan_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_titan","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_AMAZING_MIGHTY_CRAD = ITEMS.register("kuuga_amazing_mighty_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_amazing_mighty","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

  
    public static final RegistryObject<Item> AGITO_STORM_CRAD = ITEMS.register("agito_storm_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_storm","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("agito").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_FLAME_CRAD = ITEMS.register("agito_flame_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_flame","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("agito").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_TRINITY_CRAD = ITEMS.register("agito_trinity_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_trinity","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("agito").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_BURNING_CRAD = ITEMS.register("agito_burning_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_burning","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("agito").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));


    public static final RegistryObject<Item> RYUKI_BLANK_CRAD = ITEMS.register("ryuki_blank_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_blank","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.WEAKNESS, 400, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("ryuki").AddToTabList(RiderTabs.DECADE_TAB_ITEM));


    public static final RegistryObject<Item> FAIZ_AXEL_CRAD = ITEMS.register("faiz_axel_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_axel","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("faiz").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));


    public static final RegistryObject<Item> BLADE_JACK_CRAD = ITEMS.register("blade_jack_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_jack","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 400, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("blade").IsGlowing().ifFlyingModelResource( "geo/rider_plusbelt_and_wings.geo.json").AddToTabList(RiderTabs.DECADE_TAB_ITEM));


    public static final RegistryObject<Item> HIBIKI_KURENAI_CRAD = ITEMS.register("hibiki_kurenai_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_kurenai","decade","decadriver_belt",
                	new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
                	new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                	new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
                	new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("hibiki").AddToTabList(RiderTabs.DECADE_TAB_ITEM));


    public static final RegistryObject<Item> KABUTO_MASKED_CRAD = ITEMS.register("kabuto_masked_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_masked","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kabuto").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));


    public static final RegistryObject<Item> DEN_O_PLAT_CRAD = ITEMS.register("den_o_plat_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_plat","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.WEAKNESS, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("den_o").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> DEN_O_ROD_CRAD = ITEMS.register("den_o_rod_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rod","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("den_o").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> DEN_O_AX_CRAD = ITEMS.register("den_o_ax_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_axe","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("den_o").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> DEN_O_GUN_CRAD = ITEMS.register("den_o_gun_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_gun","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("den_o").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> DEN_O_WING_CRAD = ITEMS.register("den_o_wing_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_wing","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.WEAKNESS, 40, 0,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("den_o").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> DEN_O_CLIMAX_CRAD = ITEMS.register("den_o_climax_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_climax","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("den_o").AddToTabList(RiderTabs.DECADE_TAB_ITEM));


    public static final RegistryObject<Item> KIVA_GARULU_CRAD = ITEMS.register("kiva_garulu_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_garulu","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kiva").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KIVA_BASSHAA_CRAD = ITEMS.register("kiva_basshaa_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_basshaa","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kiva").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KIVA_DOGGA_CRAD = ITEMS.register("kiva_dogga_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_dogga","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kiva").AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KIVA_DOGABAKI_CRAD = ITEMS.register("kiva_dogabaki_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_dogabaki","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.WITHER, 40, 0,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("kiva").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));


    public static final RegistryObject<Item> ICHIGO_CRAD = ITEMS.register("ichigo_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("ichigo").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> NIGO_CRAD = ITEMS.register("nigo_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("nigo").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> V3_CRAD = ITEMS.register("v3_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
						new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("v3").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> RIDERMAN_CRAD = ITEMS.register("riderman_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.REGENERATION,200, 0,true,false),
	            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("riderman").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> X_CRAD = ITEMS.register("x_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.REGENERATION,200, 0,true,false),
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("x").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> AMAZON_CRAD = ITEMS.register("amazon_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.REGENERATION,200, 1,true,false),
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("amazon").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> STRONGER_CRAD = ITEMS.register("stronger_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("stronger").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> SKYRIDER_CRAD = ITEMS.register("skyrider_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
						new MobEffectInstance(Effect_core.FLYING.get(), 40, 4,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("skyrider").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> SUPER_1_CRAD = ITEMS.register("super_1_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("super_1").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> ZX_CRAD = ITEMS.register("zx_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.REGENERATION,200, 0,true,false),
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
						new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("zx").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> BLACK_CRAD = ITEMS.register("black_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("black").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> BLACK_RX_CRAD = ITEMS.register("black_rx_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("black_rx").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> SHIN_CRAD = ITEMS.register("shin_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("shin").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> ZO_CRAD = ITEMS.register("zo_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("zo").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> J_CRAD = ITEMS.register("j_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("j").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> BLACK_RX_ROBORIDER_CRAD = ITEMS.register("black_rx_roborider_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_robo","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
						new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("black_rx").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> BLACK_RX_BIORIDER_CRAD = ITEMS.register("black_rx_biorider_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_bio","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
						new MobEffectInstance(MobEffects.WATER_BREATHING,40, 0,true,false),
	            		new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 40, 1,true,false),
						new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false))
            .AddCompatibilityList(BaseDecadeUsers).ChangeRiderName("black_rx").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

	public static final RegistryObject<Item> KUUGA_ULTIMATE_CARD = ITEMS.register("kuuga_ultimate_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> AGITO_SHINING_CARD = ITEMS.register("agito_shining_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> RYUKI_SURVIVE_CARD = ITEMS.register("ryuki_survive_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> FAIZ_BLASTER_CARD = ITEMS.register("faiz_blaster_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> BLADE_KING_CARD = ITEMS.register("blade_king_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> ARMED_HIBIKI_CARD = ITEMS.register("armed_hibiki_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> KABUTO_HYPER_CARD = ITEMS.register("kabuto_hyper_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> DEN_O_LINER_CARD = ITEMS.register("den_o_liner_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> KIVA_EMPEROR_CARD = ITEMS.register("kiva_emperor_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> G4_CARD = ITEMS.register("g4_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> RYUGA_CARD = ITEMS.register("ryuga_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> ORGA_CARD = ITEMS.register("orga_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> GLAIVE_CARD = ITEMS.register("glaive_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> KABUKI_CARD = ITEMS.register("kabuki_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> CAUCASUS_CARD = ITEMS.register("caucasus_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> ARC_CARD = ITEMS.register("arc_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> SKULL_CARD = ITEMS.register("skull_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));



	public static final RegistryObject<Item> DECADEHELMET = ITEMS.register("decadehead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM).ChangeRepairItem(BLANK_CRAD.get()));
	public static final RegistryObject<Item> DECADECHESTPLATE = ITEMS.register("decadetroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM).ChangeRepairItem(BLANK_CRAD.get()));
	public static final RegistryObject<Item> DECADELEGGINGS = ITEMS.register("decadelegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM).ChangeRepairItem(BLANK_CRAD.get()));

	public static final RegistryObject<Item> DECADRIVER = ITEMS.register("decadriver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"decade",DECADE_CRAD ,DECADEHELMET, DECADECHESTPLATE,DECADELEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.DECADE_TAB_ITEM).ChangeRepairItem(BLANK_CRAD.get()));
	public static final RegistryObject<Item> DIEND_BELT= ITEMS.register("diend_belt",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"diend",DIEND_CRAD ,DECADEHELMET, DECADECHESTPLATE,DECADELEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> DARK_DECADRIVER = ITEMS.register("dark_decadriver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dark_decade",DARK_DECADE_CRAD ,DECADEHELMET, DECADECHESTPLATE,DECADELEGGINGS , new Item.Properties())
			.Override_belt_text("dark_decadriver_belt").AddToTabList(RiderTabs.DECADE_TAB_ITEM).ChangeRepairItem(BLANK_CRAD.get()));

	public static final RegistryObject<BaseBlasterItem> RIDE_BOOKER = ITEMS.register("ride_booker",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.DECADE_TAB_ITEM)
			.ChangeRepairItem(BLANK_CRAD.get()));
    public static final RegistryObject<BaseBlasterItem> DIENDRIVER = ITEMS.register("diendriver",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM).ChangeRepairItem(BLANK_CRAD.get()));
    public static final RegistryObject<SwordItem> ONGEKIBO_REKKA_DECADE = ITEMS.register("ongekibo_rekka_decade",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM).ChangeRepairItem(BLANK_CRAD.get()));
    public static final RegistryObject<SwordItem> ONGEKIBO_REKKA_DIEND = ITEMS.register("ongekibo_rekka_diend",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM).ChangeRepairItem(BLANK_CRAD.get()));
		
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}