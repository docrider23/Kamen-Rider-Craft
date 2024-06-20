package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.kabuto.ClockUpPadItem;
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

public class Kabuto_Rider_Items {
	
	  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	    	     
	    public static final RegistryObject<Item> KABUTO_LOGO = ITEMS.register("kabuto_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
 
        public static final RegistryObject<Item> MINI_ZECTER = ITEMS.register("mini_zecter",
                () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
 
        public static final RegistryObject<Item> UNFINISHED_KABUTICK_ZECTER = ITEMS.register("unfinished_kabutick_zecter",
                () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        public static final RegistryObject<Item> PERFECT_THEBEE_ZECTER = ITEMS.register("perfectthebee_zecter",
                () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        public static final RegistryObject<Item> PERFECT_DRAKE_ZECTER = ITEMS.register("perfectdrake_zecter",
                () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        public static final RegistryObject<Item> PERFECT_SASWORD_ZECTER = ITEMS.register("perfectsasword_zecter",
                () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        
        public static final RegistryObject<Item> KABUTO_ZECTER_MASK = ITEMS.register("kabuto_zecter_mask",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_mask","kabuto","kabuto_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)));
        public static final RegistryObject<Item> KABUTO_ZECTER = ITEMS.register("kabuto_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","kabuto","kabuto_rider_belt",
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false)).addSwitchForm(KABUTO_ZECTER_MASK.get()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));

        public static final RegistryObject<Item> THEBEE_ZECTER_MASK = ITEMS.register("thebee_zecter_mask",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_mask","thebee","thebee_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)));
        public static final RegistryObject<Item> THEBEE_ZECTER = ITEMS.register("thebee_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","thebee","thebee_rider_belt",
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false)).addSwitchForm(THEBEE_ZECTER_MASK.get()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));

        public static final RegistryObject<Item> DRAKE_ZECTER_MASK = ITEMS.register("drake_zecter_mask",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_mask","drake","drake_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)));
        public static final RegistryObject<Item> DRAKE_ZECTER = ITEMS.register("drake_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","drake","drake_rider_belt",
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).addSwitchForm(DRAKE_ZECTER_MASK.get()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));

        public static final RegistryObject<Item> SASWORD_ZECTER_MASK = ITEMS.register("sasword_zecter_mask",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_mask","sasword","sasword_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)));
        public static final RegistryObject<Item> SASWORD_ZECTER = ITEMS.register("sasword_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","sasword","sasword_rider_belt",
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 2,true,false)).addSwitchForm(SASWORD_ZECTER_MASK.get()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));

        public static final RegistryObject<Item> GATACK_ZECTER_MASK = ITEMS.register("gatack_zecter_mask",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_mask","gatack","gatack_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)));
        public static final RegistryObject<Item> GATACK_ZECTER = ITEMS.register("gatack_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","gatack","gatack_rider_belt",
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).addSwitchForm(GATACK_ZECTER_MASK.get()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        public static final RegistryObject<Item> GATACK_HYPER_ZECTER = ITEMS.register("gatack_hyper_zecter",
        () -> new RiderFormChangeItem(new Item.Properties(),0,"_hyper","gatack","gatack_rider_belt",
                new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 7,true,false),
                new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
                new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
                new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
                new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)));

        public static final RegistryObject<Item> KICKHOPPER_ZECTER = ITEMS.register("kickhopper_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","kickhopper","kickhopper_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.JUMP, 40, 7,true,false)).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        public static final RegistryObject<Item> PUNCHHOPPER_ZECTER = ITEMS.register("punchhopper_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","punchhopper","puchhopper_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false)).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));

        public static final RegistryObject<Item> DARK_KABUTO_ZECTER_MASK = ITEMS.register("dark_kabuto_zecter_mask",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_mask","dark_kabuto","dark_kabuto_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)));
        public static final RegistryObject<Item> DARK_KABUTO_ZECTER = ITEMS.register("dark_kabuto_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","dark_kabuto","dark_kabuto_rider_belt",
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false)).addSwitchForm(DARK_KABUTO_ZECTER_MASK.get()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        public static final RegistryObject<Item> DARK_HYPER_ZECTER = ITEMS.register("dark_hyper_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_hyper","dark_kabuto","dark_kabuto_rider_belt",
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 7,true,false),
                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)));

        public static final RegistryObject<Item> CAUCASUS_ZECTER_MASK = ITEMS.register("caucasus_zecter_mask",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_mask","caucasus","caucasus_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)));
        public static final RegistryObject<Item> CAUCASUS_ZECTER = ITEMS.register("caucasus_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","caucasus","caucasus_rider_belt",
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 7,true,false),
                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).addSwitchForm(CAUCASUS_ZECTER_MASK.get()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        
        public static final RegistryObject<Item> HERCUS_ZECTER_MASK = ITEMS.register("hercus_zecter_mask",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_mask","hercus","hercus_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)));
        public static final RegistryObject<Item> HERCUS_ZECTER = ITEMS.register("hercus_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","hercus","hercus_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false)).addSwitchForm(HERCUS_ZECTER_MASK.get()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        
        public static final RegistryObject<Item> KETAROS_ZECTER_MASK = ITEMS.register("ketaros_zecter_mask",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_mask","ketaros","ketaros_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)));
        public static final RegistryObject<Item> KETAROS_ZECTER = ITEMS.register("ketaros_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","ketaros","ketaros_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false)).addSwitchForm(KETAROS_ZECTER_MASK.get()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        
        public static final RegistryObject<Item> LADY_ZECTER = ITEMS.register("lady_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"","lady","lady_rider_belt",
                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false)).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        
        public static final RegistryObject<Item> HYPER_ZECTER = ITEMS.register("hyper_zecter",
                () -> new RiderFormChangeItem(new Item.Properties(),0,"_hyper","kabuto","kabuto_rider_belt",
                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 7,true,false),
                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).addAlternative(GATACK_HYPER_ZECTER.get()).addAlternative(DARK_HYPER_ZECTER.get()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));

        public static final RegistryObject<Item> ZECTROOPER_ZECTER = ITEMS.register("zectrooper_zecter",
        () -> new RiderFormChangeItem(new Item.Properties(),0,"","zectrooper","zectrooper_belt",
                new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
                new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
                new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)));
        public static final RegistryObject<Item> BRIGHTROOPER_ZECTER = ITEMS.register("brightrooper_zecter",
        () -> new RiderFormChangeItem(new Item.Properties(),0,"","brightrooper","brightrooper_belt",
                new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
                new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
                new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)));
        public static final RegistryObject<Item> NEOTROOPER_ZECTER = ITEMS.register("neotrooper_zecter",
        () -> new RiderFormChangeItem(new Item.Properties(),0,"","neotrooper","neotrooper_belt",
                new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
                new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
                new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)));
                    
        public static final RegistryObject<Item> KABUTOHELMET = ITEMS.register("kabutohead",
                () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        public static final RegistryObject<Item> KABUTOCHESTPLATE = ITEMS.register("kabutotroso",
                () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));
        public static final RegistryObject<Item> KABUTOLEGGINGS = ITEMS.register("kabutolegs",
                () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));

            
        public static final RegistryObject<Item> KABUTO_RIDER_BELT = ITEMS.register("kabuto_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kabuto",KABUTO_ZECTER_MASK ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> GATACK_RIDER_BELT = ITEMS.register("gatack_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"gatack",GATACK_ZECTER_MASK ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> THEBEE_RIDER_BELT = ITEMS.register("thebee_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"thebee",THEBEE_ZECTER_MASK ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> DRAKE_RIDER_BELT = ITEMS.register("drake_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"drake",DRAKE_ZECTER_MASK ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> SASWORD_RIDER_BELT = ITEMS.register("sasword_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"sasword",SASWORD_ZECTER_MASK ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> KICKHOPPER_RIDER_BELT = ITEMS.register("kickhopper_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kickhopper",KICKHOPPER_ZECTER ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> PUNCHHOPPER_RIDER_BELT = ITEMS.register("puchhopper_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"punchhopper",PUNCHHOPPER_ZECTER ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> DARK_KABUTO_RIDER_BELT = ITEMS.register("dark_kabuto_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dark_kabuto",DARK_KABUTO_ZECTER_MASK ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> CAUCASUS_RIDER_BELT = ITEMS.register("caucasus_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"caucasus",CAUCASUS_ZECTER ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> HERCUS_RIDER_BELT = ITEMS.register("hercus_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"hercus",HERCUS_ZECTER ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> KETAROS_RIDER_BELT = ITEMS.register("ketaros_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ketaros",KETAROS_ZECTER ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> LADY_RIDER_BELT = ITEMS.register("lady_rider_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"lady",LADY_ZECTER ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> ZECTROOPER_BELT = ITEMS.register("zectrooper_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"zectrooper",ZECTROOPER_ZECTER ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> SHADOW_TROOPER_BELT = ITEMS.register("shadow_trooper_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shadow_trooper",ZECTROOPER_ZECTER ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> BRIGHTROOPER_BELT = ITEMS.register("brightrooper_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"brightrooper",BRIGHTROOPER_ZECTER ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<Item> NEOTROOPER_BELT = ITEMS.register("neotrooper_belt",
                () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"neotrooper",NEOTROOPER_ZECTER ,KABUTOHELMET,KABUTOCHESTPLATE,KABUTOLEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM).ChangeRepairItem(MINI_ZECTER.get()));
	    
        public static final RegistryObject<Item> CLOCK_UP_PAD = ITEMS.register("clock_up_pad",
                () -> new ClockUpPadItem(new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM));

        public static final RegistryObject<BaseBlasterItem> KABUTO_KUNAI = ITEMS.register("kabuto_kunai",
                () -> new BaseBlasterItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<SwordItem> KABUTO_KUNAI_KUNAI = ITEMS.register("kabuto_kunai_kunai",
                () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<BaseBlasterItem> ZECT_MIZER = ITEMS.register("zect_mizer",
                () -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).setProjectileFireball().AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<SwordItem> PERFECT_ZECTER = ITEMS.register("perfect_zecter",
                () -> new BaseSwordItem(Tiers.DIAMOND, 9, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<BaseBlasterItem> DRAKE_GLIP = ITEMS.register("drake_grip",
                () -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<SwordItem> SASWORD_YAIVER = ITEMS.register("sasword_yaiver",
                () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<SwordItem> GATACK_DOUBLE_CALIBUR = ITEMS.register("gatack_double_calibur",
                () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<SwordItem> GATACK_DOUBLE_CALIBUR_MINUS = ITEMS.register("gatack_double_calibur_minus",
                () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<SwordItem> GATACK_DOUBLE_CALIBUR_TWIN = ITEMS.register("gatack_double_calibur_twin",
                () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<BaseBlasterItem> ZECT_KUNAI = ITEMS.register("zect_kunai",
                () -> new BaseBlasterItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<SwordItem> ZECT_KUNAI_KUNAI = ITEMS.register("zect_kunai_kunai",
                () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));
        public static final RegistryObject<BaseBlasterItem> MACHINEGUN_BLADE = ITEMS.register("machinegun_blade",
                () -> new BaseBlasterItem(Tiers.DIAMOND, 6, -3F, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.KABUTO_TAB_ITEM)
                .ChangeRepairItem(MINI_ZECTER.get()));

	    public static void register(IEventBus eventBus) {
	        ITEMS.register(eventBus);
	    }
	    
	}