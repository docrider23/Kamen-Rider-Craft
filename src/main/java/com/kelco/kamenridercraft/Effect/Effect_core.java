package com.kelco.kamenridercraft.Effect;

import com.kelco.kamenridercraft.KamenRiderCraftCore;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Effect_core {

	public static final DeferredRegister<MobEffect> EFFECT = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, KamenRiderCraftCore.MODID);


	public static final RegistryObject<MobEffect> BOOST = EFFECT.register("boost",
			() -> new 	BoostEffect(MobEffectCategory.BENEFICIAL, 0xff0015));

	public static final RegistryObject<MobEffect> ANTIPOISON = EFFECT.register("anti_poison",
			() -> new 	AntiPoisonEffect(MobEffectCategory.BENEFICIAL, 0x8532a8));

	public static final RegistryObject<MobEffect> SLASH= EFFECT.register("slash",
			() -> new 	SlashEffect(MobEffectCategory.BENEFICIAL, 0x21daff));

	public static final RegistryObject<MobEffect> PUNCH= EFFECT.register("punch",
			() -> new 	PunchEffect(MobEffectCategory.BENEFICIAL, 0x1d8519));

	public static final RegistryObject<MobEffect> FLYING= EFFECT.register("flying",
			() -> new 	FlyingEffect(MobEffectCategory.BENEFICIAL, 0x1d8519));

	public static final RegistryObject<MobEffect> SMALL= EFFECT.register("small",
			() -> new 	SmallEffect(MobEffectCategory.NEUTRAL, 0x1d8519));

	public static final RegistryObject<MobEffect> BIG= EFFECT.register("big",
			() -> new 	BigEffect(MobEffectCategory.NEUTRAL, 0x1d8519).addAttributeModifier(ForgeMod.BLOCK_REACH.get(), "91AEAA56-376B-4498-935B-2F7F68070640", 1F, AttributeModifier.Operation.ADDITION)
			.addAttributeModifier(ForgeMod.ENTITY_REACH.get(), "91AEAA56-376B-4498-935B-2F7F68070640", 1F, AttributeModifier.Operation.ADDITION)
			.addAttributeModifier(ForgeMod.STEP_HEIGHT_ADDITION.get(), "91AEAA56-376B-4498-935B-2F7F68070640", 1F, AttributeModifier.Operation.ADDITION)
			);

	public static final RegistryObject<MobEffect> FLAT= EFFECT.register("flat",
			() -> new 	FlatEffect(MobEffectCategory.NEUTRAL, 0xf7fada));

	public static final RegistryObject<MobEffect> STRETCH= EFFECT.register("stretch",
			() -> new 	StretchEffect(MobEffectCategory.NEUTRAL, 0xf78d95));

	public static final RegistryObject<MobEffect> WIDE= EFFECT.register("wide",
			() -> new 	WideEffect(MobEffectCategory.NEUTRAL, 0x87ce87));

	public static final RegistryObject<MobEffect> EXPLODE= EFFECT.register("explode",
			() -> new 	ExplodeEffect(MobEffectCategory.HARMFUL, 0x565656));
	
	public static final RegistryObject<MobEffect> FIRE_PUNCH= EFFECT.register("fire_punch",
			() -> new 	FirePunchEffect(MobEffectCategory.BENEFICIAL, 0xf7c208));
	
	public static final RegistryObject<MobEffect> EXPLOSION_PUNCH= EFFECT.register("explosion_punch",
			() -> new 	ExplosionPunchEffect(MobEffectCategory.BENEFICIAL, 0xf7c208));

	public static final RegistryObject<MobEffect> FIRE_SHOT= EFFECT.register("fire_shot",
			() -> new 	FireShotEffect(MobEffectCategory.BENEFICIAL, 0xf7c208));
	
	public static final RegistryObject<MobEffect> EXPLOSION_SHOT= EFFECT.register("explosion_shot",
			() -> new 	ExplosionShotEffect(MobEffectCategory.BENEFICIAL, 0xf7c208));

	public static final RegistryObject<MobEffect> FIRE_ARMOR= EFFECT.register("fire_armor",
			() -> new 	FireArmorEffect(MobEffectCategory.BENEFICIAL, 0xf7c208));

	public static final RegistryObject<MobEffect> REFLECT= EFFECT.register("reflect",
			() -> new 	ReflectEffect(MobEffectCategory.BENEFICIAL, 0xd1d1d1));

	public static final RegistryObject<MobEffect> SLEEP= EFFECT.register("sleep",
			() -> new 	SleepEffect(MobEffectCategory.HARMFUL, 0xffce00));
	
	public static final RegistryObject<MobEffect> FORM_LOCK= EFFECT.register("form_lock",
			() -> new 	FormLockEffect(MobEffectCategory.HARMFUL, 0xffffff));

	public static final RegistryObject<MobEffect> GREEED= EFFECT.register("greeed",
			() -> new 	GreeedEffect(MobEffectCategory.HARMFUL, 0xc9c6c1));
	
	public static final RegistryObject<MobEffect> BUGSTER= EFFECT.register("bug",
			() -> new 	BugEffect(MobEffectCategory.HARMFUL, 0xe8842e));

	public static final RegistryObject<MobEffect> RESET= EFFECT.register("reset",
			() -> new 	ResetEffect(MobEffectCategory.HARMFUL, 0x4eff00));

	public static final RegistryObject<MobEffect> MUTEKI= EFFECT.register("muteki",
			() -> new 	SaveEffect(MobEffectCategory.HARMFUL, 0xffce00));

	public static final RegistryObject<MobEffect> PAUSE= EFFECT.register("pause",
			() -> new 	PauseEffect(MobEffectCategory.HARMFUL, 0x4eff00)
			.addAttributeModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070639", (double)-100F, AttributeModifier.Operation.MULTIPLY_TOTAL)
			.addAttributeModifier(ForgeMod.ENTITY_GRAVITY.get(), "91AEAA56-376B-4498-935B-2F7F68070640", (double)100F, AttributeModifier.Operation.MULTIPLY_TOTAL)
			);



	public static void register(IEventBus eventBus) {
		EFFECT.register(eventBus);
	}

}