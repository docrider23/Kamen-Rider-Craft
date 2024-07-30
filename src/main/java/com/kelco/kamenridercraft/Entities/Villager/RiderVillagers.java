package com.kelco.kamenridercraft.Entities.Villager;



import com.google.common.collect.ImmutableSet;
import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.Rider_Blocks;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class RiderVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, KamenRiderCraftCore.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, KamenRiderCraftCore.MODID);

    public static final RegistryObject<PoiType> SHOCKER_MONITOR_POI = POI_TYPES.register("shocker_monitor_poi",
            () -> new PoiType(ImmutableSet.copyOf(Rider_Blocks.SHOCKER_MONITOR.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> SHOCKER_VILLAGER = VILLAGER_PROFESSIONS.register("shocker_villager",
            () -> new VillagerProfession("shocker_villager", x -> x.get() == SHOCKER_MONITOR_POI.get(),
                    x -> x.get() == SHOCKER_MONITOR_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    public static final RegistryObject<PoiType> HIDEN_3D_PRINTER_POI = POI_TYPES.register("hiden_3d_printer_poi",
            () -> new PoiType(ImmutableSet.copyOf(Rider_Blocks.HIDEN_3D_PRINTER.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> HUMAGEAR_VILLAGER = VILLAGER_PROFESSIONS.register("humagear_villager",
            () -> new VillagerProfession("humagear_villager", x -> x.get() == HIDEN_3D_PRINTER_POI.get(),
                    x -> x.get() == HIDEN_3D_PRINTER_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    public static final RegistryObject<PoiType> KAMEN_CAFE_COUNTER_POI = POI_TYPES.register("kamen_cafe_counter_poi",
            () -> new PoiType(ImmutableSet.copyOf(Rider_Blocks.KAMEN_CAFE_COUNTER.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> KAMEN_CAFE_BUTLER = VILLAGER_PROFESSIONS.register("kamen_cafe_butler",
            () -> new VillagerProfession("kamen_cafe_butler", x -> x.get() == KAMEN_CAFE_COUNTER_POI.get(),
                    x -> x.get() == KAMEN_CAFE_COUNTER_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    
    

    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, SHOCKER_MONITOR_POI.get());
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, HIDEN_3D_PRINTER_POI.get());
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, KAMEN_CAFE_COUNTER_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}