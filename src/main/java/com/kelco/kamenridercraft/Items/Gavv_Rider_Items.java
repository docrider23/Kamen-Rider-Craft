package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
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

public class Gavv_Rider_Items {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	
	public static final RegistryObject<Item> GAVV_LOGO = ITEMS.register("gavv_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GAVV_TAB_ITEM));

	public static final RegistryObject<Item> POPPINGGUMMY_GOCHIZO = ITEMS.register("poppingummy_gochizo",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","gavv","henshin_belt_gavv_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 0,true,false)
					,new MobEffectInstance(MobEffects.JUMP, 400, 1,true,false)).AddToTabList(RiderTabs.GAVV_TAB_ITEM));

	public static final RegistryObject<Item> PUNCHINGUMMY_GOCHIZO = ITEMS.register("punchingummy_gochizo",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_punchin","gavv","henshin_belt_gavv_belt",
					new MobEffectInstance(Effect_core.PUNCH.get(), 400, 3,true,false)
					,new MobEffectInstance(MobEffects.JUMP, 400, 1,true,false)).AddToTabList(RiderTabs.GAVV_TAB_ITEM));

	public static final RegistryObject<Item> KICKINGUMMY_GOCHIZO = ITEMS.register("kickingummy_gochizo",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kickin","gavv","henshin_belt_gavv_belt",
					new MobEffectInstance(Effect_core.PUNCH.get(), 400, 3,true,false)
					,new MobEffectInstance(MobEffects.JUMP, 400, 1,true,false)).AddToTabList(RiderTabs.GAVV_TAB_ITEM));

	public static final RegistryObject<Item> GAVV_HELMET = ITEMS.register("gavv_head",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.GAVV_TAB_ITEM));
	public static final RegistryObject<Item> GAVV_CHESTPLATE = ITEMS.register("gavv_troso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.GAVV_TAB_ITEM));
	public static final RegistryObject<Item> GAVV_LEGGINGS = ITEMS.register("gavv_legs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.GAVV_TAB_ITEM));

	public static final RegistryObject<Item> HENSHIN_BELT_GAVV = ITEMS.register("henshin_belt_gavv",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"gavv",POPPINGGUMMY_GOCHIZO ,GAVV_HELMET,GAVV_CHESTPLATE,GAVV_LEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.GAVV_TAB_ITEM));

	public static final RegistryObject<SwordItem> GAVVGABLADE = ITEMS.register("gavvgablade",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GAVV_TAB_ITEM));

	
		public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
