package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.GSystemChipProgrammer;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseShieldItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;
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

public class Gotchard_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> GOTCHARD_LOGO = ITEMS.register("gotchard_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));

	public static final RegistryObject<Item> BLANK_RIDE_CHEMY_CARD = ITEMS.register("blank_ride_chemy_card",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    	    
	
    public static final RegistryObject<Item> HOPPER1_RIDE_CHEMY_CARD = ITEMS.register("hopper1_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    /* pikahotaru
     * gengenchoucho
     * bakuonzemi
     * antrooper
     * greatonbo
     * stagvine
     * kaiserbee
     * kamantis
     * beetlx
     * 
     * odorippa
     * dokkirimajin
     * doctorkozo
     * pilets
     * wrestler_g
     * sasukemaru
     * bulletbaang
     */
    
    public static final RegistryObject<Item> APPAREBUSHIDO_RIDE_CHEMY_CARD = ITEMS.register("apparebushido_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_appare_skebow","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(Effect_core.SLASH.get(), 40, 2,true,false))
            .ChangeModel("geo/gotchard_appare_skebow.geo.json").AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    /* karyudos
     * x wizard
     * 
     * spicle
     */
    
    public static final RegistryObject<Item> SKEBOWS_RIDE_CHEMY_CARD = ITEMS.register("skebows_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_appare_skebow","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(Effect_core.SLASH.get(), 40, 2,true,false))
            .ChangeModel("geo/gotchard_appare_skebow.geo.json").AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    /* hiikescue
     */
    
    public static final RegistryObject<Item> GEKIOCOPTER_RIDE_CHEMY_CARD = ITEMS.register("gekiocopter_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_gekiocopter","valvarad","valvaradraw_buckle_belt",
            		new MobEffectInstance(Effect_core.FLYING.get(), 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
            .ChangeModel("geo/valvarad_gekiocopter.geo.json").AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
     /* deepmariner
     */
    
    public static final RegistryObject<Item> MADWHEEL_RIDE_CHEMY_CARD = ITEMS.register("madwheel_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","valvarad","valvaradraw_buckle_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
     
     /* 
     * golddash
     * gutsshovel
     */
    
    public static final RegistryObject<Item> STEAMLINER_RIDE_CHEMY_CARD = ITEMS.register("steamliner_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
	
    /* exceedfighter
     * 
     * yamibat
     * catchula
     * mechanichani
     * bussasorry
     * bountybunny
     * hawkstar
     * tsupparihebi
     * gorillasensei
     * ganvhale
     * lixion
     * 
     * raidenji
     * kesuzo
     * mitemirror
     * energyl
     * panpakaparka
     * televi
     * timelord
     * smaphone
     * renkingrobo
     * x_fortress
     * 
     * happyclover
     * burningnero
     * bambamboo
     * saboneedle
     * venomdake
     * utsubocchama
     * flayrose
     * buglesia
     * junglejan
     * xeggdrasil
     * 
     * carery
     * berosol
     * sayzombie
     * angelead
     * zukyumpire
     * daiohni
     * mackraken
     * jyamatanoorochi
     * ninetail
     * ufo_x
     * 
     * nanmonite
     * akumanocaris
     * pakuraptor
     * ojilacanth
     * sabeliger
     * warptera
     * gigalodon
     * tricera
     * blizzammoth
     * x_rex
     * 
     * mercurin
     * kinkiravina
     * gokigenmeteon
     * neminemoon
     * firemars
     * grandsaturn
     * the_sun
     * jupitta
     * kuroana
     * gaiard
     * 
     * gigabaham
     * macentaurus
     * unicon
     * vanfenrir
     * inphoenix
     * yoacerberus
     * haodin
     * gingriffon
     * donposeidon
     * dragonalos
     */
    
	public static final RegistryObject<Item> GOTCHARD_HELMET = ITEMS.register("gotchard_head",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
    public static final RegistryObject<Item> GOTCHARD_CHESTPLATE = ITEMS.register("gotchard_torso",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
    public static final RegistryObject<Item> GOTCHARD_LEGGINGS = ITEMS.register("gotchard_legs",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));

    
    public static final RegistryObject<Item> GOTCHARDRIVER = ITEMS.register("gotchardriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"gotchard", HOPPER1_RIDE_CHEMY_CARD ,GOTCHARD_HELMET, GOTCHARD_CHESTPLATE,GOTCHARD_LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
    
    public static final RegistryObject<Item> VALVARADRAW_BUCKLE = ITEMS.register("valvaradraw_buckle",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"valvarad", MADWHEEL_RIDE_CHEMY_CARD ,GOTCHARD_HELMET, GOTCHARD_CHESTPLATE,GOTCHARD_LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));

    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}
