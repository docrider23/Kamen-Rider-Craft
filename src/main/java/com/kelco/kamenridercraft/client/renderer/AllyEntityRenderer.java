package com.kelco.kamenridercraft.client.renderer;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.allies.BaseAllyEntity;
import com.kelco.kamenridercraft.client.models.BasicMobModel;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;


public class AllyEntityRenderer  extends  HumanoidMobRenderer<BaseAllyEntity, BasicMobModel<BaseAllyEntity>>  {


	public AllyEntityRenderer(EntityRendererProvider.Context ctx) {
		this(ctx, ModelLayers.PLAYER);
	}

	
	public AllyEntityRenderer(EntityRendererProvider.Context ctx, ModelLayerLocation ModelLayer) {
		super(ctx, new BasicMobModel<>(ctx.bakeLayer(ModelLayer)),1);
		this.addLayer(new HumanoidArmorLayer<>(this, new HumanoidModel<>(ctx.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel<>(ctx.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), ctx.getModelManager()));
	}


	   protected void scale(BaseAllyEntity p_114775_, PoseStack p_114776_, float p_114777_) {
		   
		   float size = p_114775_.getScale();
		      p_114776_.scale(size,size,size);
		   }

	@Override
	public ResourceLocation getTextureLocation(BaseAllyEntity p_114482_) {
		
		return new ResourceLocation(KamenRiderCraftCore.MODID, "textures/entities/"+p_114482_.NAME+".png");
	}
}