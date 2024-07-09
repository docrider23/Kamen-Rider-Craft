package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.den_o.RiderPassItem;
import com.kelco.kamenridercraft.Items.den_o.DenKamenSwordItem;
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

    public static final RegistryObject<Item> DECADE_CRAD = ITEMS.register("decade_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 400, 2,true,false)).AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_MIGHTY_CRAD = ITEMS.register("kuuga_mighty_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 2,true,false))
            .ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

	  public static final RegistryObject<Item> AGITO_GROUND_CRAD = ITEMS.register("agito_ground_card",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
	            .ChangeRiderName("agito").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

	  
		public static final RegistryObject<Item> KUUGA_GROWING_CRAD = ITEMS.register("kuuga_growing_card",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_growing","decade","decadriver_belt",
	            		new MobEffectInstance(MobEffects.WEAKNESS, 40, 2,true,false))
	            .ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));
		
    public static final RegistryObject<Item> KUUGA_DRAGON_CRAD = ITEMS.register("kuuga_dragon_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_dragon","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
            .ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_PEGASUS_CRAD = ITEMS.register("kuuga_pegasus_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_pegasus","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
            .ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_TITAN_CRAD = ITEMS.register("kuuga_titan_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_titan","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
            .ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_MIGHTY_CRAD = ITEMS.register("kuuga_rising_mighty_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_mighty","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 3,true,false))
            .ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_DRAGON_CRAD = ITEMS.register("kuuga_rising_dragon_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_dragon","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
            .ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_PEGASUS_CRAD = ITEMS.register("kuuga_rising_pegasus_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_pegasus","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
            .ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_TITAN_CRAD = ITEMS.register("kuuga_rising_titan_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_titan","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
            .ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_AMAZING_MIGHTY_CRAD = ITEMS.register("kuuga_amazing_mighty_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_amazing_mighty","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
            .ChangeRiderName("kuuga").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

  
    public static final RegistryObject<Item> AGITO_STORM_CRAD = ITEMS.register("agito_storm_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_storm","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
            .ChangeRiderName("agito").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_FLAME_CRAD = ITEMS.register("agito_flame_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_flame","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
            .ChangeRiderName("agito").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_TRINITY_CRAD = ITEMS.register("agito_trinity_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_trinity","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
            .ChangeRiderName("agito").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_BURNING_CRAD = ITEMS.register("agito_burning_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_burning","decade","decadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false))
            .ChangeRiderName("agito").IsGlowing().AddToTabList(RiderTabs.DECADE_TAB_ITEM));

	public static final RegistryObject<Item> DECADEHELMET = ITEMS.register("decadehead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> DECADECHESTPLATE = ITEMS.register("decadetroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));
	public static final RegistryObject<Item> DECADELEGGINGS = ITEMS.register("decadelegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.DECADE_TAB_ITEM));

	public static final RegistryObject<Item> DECADRIVER = ITEMS.register("decadriver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"decade",DECADE_CRAD ,DECADEHELMET, DECADECHESTPLATE,DECADELEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.DECADE_TAB_ITEM));
		
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}