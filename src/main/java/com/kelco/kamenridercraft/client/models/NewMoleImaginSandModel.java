package com.kelco.kamenridercraft.client.models;
// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.google.common.collect.ImmutableList;
import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.List;

import net.minecraft.client.model.AnimationUtils;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;

public class NewMoleImaginSandModel<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(KamenRiderCraftCore.MODID, "imagin_model"), "main");
	private final List<ModelPart> parts;
	public final ModelPart leftPants;
	public final ModelPart rightPants;
	public final ModelPart leftSleeve;
	public final ModelPart jacket;
	public final ModelPart head;
	public final ModelPart hat;
	public final ModelPart body;
	public final ModelPart rightSleeve;
	public final ModelPart rightArm;
	public final ModelPart leftArm;
	public final ModelPart rightLeg;
	public final ModelPart leftLeg;

	public NewMoleImaginSandModel(ModelPart root) {
		super(root, RenderType::entityTranslucent);
		this.leftPants = root.getChild("left_pants");
		this.rightPants = root.getChild("right_pants");
		this.leftSleeve = root.getChild("left_sleeve");
		this.jacket = root.getChild("jacket");
		this.head = root.getChild("head");
		this.hat = root.getChild("hat");
		this.body = root.getChild("body");
		this.rightSleeve = root.getChild("right_sleeve");
		this.rightArm = root.getChild("right_arm");
		this.leftArm = root.getChild("left_arm");
		this.rightLeg = root.getChild("right_leg");
		this.leftLeg = root.getChild("left_leg");
        this.parts = root.getAllParts().filter((list) -> {
           return !list.isEmpty();
        }).collect(ImmutableList.toImmutableList());
	}

	public static LayerDefinition createBodyLayer(CubeDeformation p_170826_) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(p_170826_, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 4.0F, -4.0F, 8.0F, 8.0F, 8.0F, p_170826_), PartPose.offset(10.0F, 10.0F, 10.0F));
		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -20.0F, -4.0F, 8.0F, 8.0F, 8.0F, p_170826_.extend(0.5F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 12.0F, -2.0F, 8.0F, 12.0F, 4.0F, p_170826_), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("jacket", CubeListBuilder.create().texOffs(16, 32).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, 10.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_), PartPose.offset(5.0F, 2.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, 10.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_), PartPose.offset(-5.0F, 2.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_sleeve", CubeListBuilder.create().texOffs(48, 48).addBox(4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_sleeve", CubeListBuilder.create().texOffs(40, 32).addBox(-8.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, -20.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_), PartPose.offset(1.9F, 12.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -20.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_), PartPose.offset(-1.9F, 12.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_pants", CubeListBuilder.create().texOffs(0, 48).addBox(-0.1F, -32.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_pants", CubeListBuilder.create().texOffs(0, 32).addBox(-3.9F, -32.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		boolean flag = entity.getFallFlyingTicks() > 4;
		this.head.yRot = netHeadYaw * ((float)Math.PI / 180F);
		if (flag) {
		   this.head.xRot = (-(float)Math.PI / 4F);
		} else {
		   this.head.xRot = headPitch * ((float)Math.PI / 180F);
		}
  
		this.body.yRot = 0.0F;
		this.rightArm.z = 0.0F;
		this.rightArm.x = -5.0F;
		this.leftArm.z = 0.0F;
		this.leftArm.x = 5.0F;
		if (this.riding) {
			this.head.y = 2.0F;
			this.body.y = 2.0F;
			this.rightArm.y = 4.0F;
			this.leftArm.y = 4.0F;
			this.leftLeg.y = -18.0F;
			this.rightLeg.y = -18.0F;
		} else {
			this.head.y = 12.0F;
			this.body.y = 12.0F;
			this.rightArm.y = 14.0F;
			this.leftArm.y = 14.0F;
			this.leftLeg.y = -8.0F;
			this.rightLeg.y = -8.0F;
		}
		float f = 1.0F;
		if (flag) {
		   f = (float)entity.getDeltaMovement().lengthSqr();
		   f /= 0.2F;
		   f *= f * f;
		}
  
		if (f < 1.0F) {
		   f = 1.0F;
		}

		this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
		this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.rightArm.yRot = 0.0F;
        this.leftArm.yRot = 0.0F;
		this.rightArm.zRot = 0.0F;
		this.leftArm.zRot = 0.0F;
		this.rightLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
		this.leftLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
		this.rightLeg.yRot = 0.005F;
		this.leftLeg.yRot = -0.005F;
		this.rightLeg.zRot = 0.005F;
		this.leftLeg.zRot = -0.005F;

		this.setupAttackAnimation(entity, ageInTicks);
        AnimationUtils.bobModelPart(this.rightArm, ageInTicks, 1.0F);
        AnimationUtils.bobModelPart(this.leftArm, ageInTicks, -1.0F);

		this.leftPants.copyFrom(this.leftLeg);
		this.rightPants.copyFrom(this.rightLeg);
		this.leftSleeve.copyFrom(this.leftArm);
		this.rightSleeve.copyFrom(this.rightArm);
		this.jacket.copyFrom(this.body);
		this.hat.copyFrom(this.head);
	}

	public void setAllVisible(boolean p_103419_) {
	   super.setAllVisible(p_103419_);
	   this.leftSleeve.visible = p_103419_;
	   this.rightSleeve.visible = p_103419_;
	   this.leftPants.visible = p_103419_;
	   this.rightPants.visible = p_103419_;
	   this.jacket.visible = p_103419_;
	   this.hat.visible = p_103419_;
	}

	public void translateToHand(HumanoidArm p_103392_, PoseStack p_103393_) {
	   ModelPart modelpart = this.getArm(p_103392_);
	   modelpart.translateAndRotate(p_103393_);
	}

    public ModelPart getRandomModelPart(RandomSource p_233439_) {
       return this.parts.get(p_233439_.nextInt(this.parts.size()));
    }

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leftPants.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightPants.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftSleeve.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		jacket.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightSleeve.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}