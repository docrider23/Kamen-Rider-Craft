package com.kelco.kamenridercraft.Items;


import java.util.ArrayList;
import java.util.List;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.MobsCore;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RiderTabs {
    public static CreativeModeTab RiderMiscTab;
    public static CreativeModeTab IchigoTab;
    public static CreativeModeTab V3Tab;
    public static CreativeModeTab XTab;
    public static CreativeModeTab AMAZONTab;
    public static CreativeModeTab STRONGERTab;
    public static CreativeModeTab SKYRIDERTab;
    public static CreativeModeTab SUPER1Tab;
    public static CreativeModeTab ZXTab;
    
    public static List<Item> ICHIGO_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> V3_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> X_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> AMAZON_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> STRONGER_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> SKYRIDER_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> SUPER1_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> ZX_TAB_ITEM= new ArrayList<Item>();
    
    public static List<Item> Misc_TAB_ITEM= new ArrayList<Item>();
    
    
    
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
    	
    	IchigoTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_ichigo_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.ICHIGOHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("Ichigo Rider Items")).build());
 
    	V3Tab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_v3_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.V3HELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("V3 Rider Items")).build());
 
    	XTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_x_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.XHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("X Rider Items")).build());
    	
    	AMAZONTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_amazon_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.AMAZONHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("Amazon Rider Items")).build());
 
    	STRONGERTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_stronger_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.STRONGERHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("Stronger Rider Items")).build());
 
    	SKYRIDERTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_skyrider_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.SKYRIDERHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("Skyrider Rider Items")).build());

    	SUPER1Tab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_super_1_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.SUPER1HELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("Super 1 Rider Items")).build());
 
    	
    	RiderMiscTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_misc_tab"),
                builder-> builder.icon(() -> new ItemStack(Modded_item_core.RIDER_CIRCUIT.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("Misc Rider Items")).build());
 
    	ZXTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_zx_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.ZXHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("ZX Rider Items")).build());
    	
    }
    
    public static void AddItemsToTabs(CreativeModeTabEvent.BuildContents event){

		if(event.getTab() == RiderTabs.IchigoTab) {
			for (int i = 0; i < RiderTabs.ICHIGO_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.ICHIGO_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.V3Tab) {
			for (int i = 0; i < RiderTabs.V3_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.V3_TAB_ITEM.get(i));
			}
		}else if(event.getTab() == RiderTabs.XTab) {
			for (int i = 0; i < RiderTabs.X_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.X_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.AMAZONTab) {
			for (int i = 0; i < RiderTabs.AMAZON_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.AMAZON_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.STRONGERTab) {
			for (int i = 0; i < RiderTabs.STRONGER_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.STRONGER_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.SKYRIDERTab) {
			for (int i = 0; i < RiderTabs.SKYRIDER_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.SKYRIDER_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.SUPER1Tab) {
			for (int i = 0; i < RiderTabs.SUPER1_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.SUPER1_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.ZXTab) {
			for (int i = 0; i < RiderTabs.ZX_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.ZX_TAB_ITEM.get(i));
			}

		}


		if(event.getTab() == RiderTabs.RiderMiscTab) {
			
			event.accept(MobsCore.SHOCKER_COMBATMAN_SPAWN_EGG);
			event.accept(MobsCore.SHOCKER_RIDER_SPAWN_EGG);
			
			event.accept(MobsCore.DESTRON_COMBATMAN_SPAWN_EGG);
			event.accept(MobsCore.GOD_WARFARE_AGENT_SPAWN_EGG);
			event.accept(MobsCore.RED_FOLLWER_SPAWN_EGG);
			event.accept(MobsCore.BLACK_SATAN_SOLDIER_SPAWN_EGG);
			event.accept(MobsCore.ARI_COMMANDO_SPAWN_EGG);	
			event.accept(MobsCore.DOGMA_FIGHTER_SPAWN_EGG);
			event.accept(MobsCore.COMBAT_ROID_SPAWN_EGG);
			//event.accept(MobsCore.CHAP_SPAWN_EGG);
			
			for (int i = 0; i < RiderTabs.Misc_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.Misc_TAB_ITEM.get(i));
			}
		}


    	
    }
    
}