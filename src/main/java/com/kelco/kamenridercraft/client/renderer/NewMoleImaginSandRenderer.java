package com.kelco.kamenridercraft.client.renderer;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.footSoldiers.NewMoleImaginSandEntity;
import com.kelco.kamenridercraft.client.models.NewMoleImaginSandModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class NewMoleImaginSandRenderer extends GeoEntityRenderer<NewMoleImaginSandEntity> {
	
	


	public NewMoleImaginSandRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new NewMoleImaginSandModel());
    }

    @Override
    public ResourceLocation getTextureLocation(NewMoleImaginSandEntity animatable) {
        return new ResourceLocation(KamenRiderCraftCore.MODID, "textures/entity/new_mole_imagin_sand.png");
    }

    @Override
    public void render(NewMoleImaginSandEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}