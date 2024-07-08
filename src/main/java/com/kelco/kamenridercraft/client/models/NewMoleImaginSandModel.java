package com.kelco.kamenridercraft.client.models;


import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.footSoldiers.NewMoleImaginSandEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class NewMoleImaginSandModel extends GeoModel<NewMoleImaginSandEntity> {
    @Override
    public ResourceLocation getModelResource(NewMoleImaginSandEntity animatable) {
        return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/new_mole_imagin_sand.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NewMoleImaginSandEntity animatable) {
        return new ResourceLocation(KamenRiderCraftCore.MODID, "textures/entity/new_mole_imagin_sand.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NewMoleImaginSandEntity animatable) {
        return new ResourceLocation(KamenRiderCraftCore.MODID, "animations/ichigo.animation.json");
        // return new ResourceLocation(KamenRiderCraftCore.MODID, "animations/new_mole_imagin_sand.animation.json");
    }

    @Override
    public void setCustomAnimations(NewMoleImaginSandEntity animatable, long instanceId, AnimationState<NewMoleImaginSandEntity> animationState) {
  
    }
}