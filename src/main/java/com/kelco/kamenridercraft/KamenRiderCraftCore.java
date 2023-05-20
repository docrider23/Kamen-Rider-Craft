package com.kelco.kamenridercraft;


import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Items.Ichigo_Rider_Items;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.RiderTabs;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(KamenRiderCraftCore.MODID)
public class KamenRiderCraftCore {

	public static final String MODID="kamenridercraft";

	public KamenRiderCraftCore() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		Modded_item_core.register(modEventBus);
		Ichigo_Rider_Items.register(modEventBus);
		MobsCore.register(modEventBus);
MobsCore.MOBLIST.register(modEventBus);
		MinecraftForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::addCreative);
	}



	private void addCreative(CreativeModeTabEvent.BuildContents event) {


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
			event.accept(MobsCore.DESTRON_COMBATMAN_SPAWN_EGG);
			
			for (int i = 0; i < RiderTabs.Misc_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.Misc_TAB_ITEM.get(i));
			}
		}


	}



	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
		}
	}
}