package com.kelco.kamenridercraft.Blocks;

import java.util.function.Supplier;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.GaiaMemoryRefinerBlock;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.RiderTabs;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Rider_Blocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Block> SHOCKER_MONITOR = registerBlock("shocker_monitor",
			() -> new BaseFacingBlock(BlockBehaviour.Properties.of(Material.METAL)
					.lightLevel((glow) -> { return 15; }).strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));


	public static final RegistryObject<Block> PURE_GAIA_MEMORY_BLOCK = registerBlock("pure_gaia_memory_block",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.STONE)
					.lightLevel((glow) -> { return 15; }).strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));

	public static final RegistryObject<Block> GAIA_MEMORY_ORE = registerBlock("gaiamemoryblock",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)).AddToTabList(RiderTabs.RIDER_BLOCK));

	public static final RegistryObject<Block> DEEPSLATE_GAIA_MEMORY_ORE = registerBlock("deepslate_gaiamemoryblock",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)).AddToTabList(RiderTabs.RIDER_BLOCK));


	public static final RegistryObject<Block> GAIA_MEMORY_REFINER = registerBlock("gaia_memory_refiner",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> COUNTER_95DO = registerBlock("counter_95do",
			() -> new BaseFacingBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> MONITOR = registerBlock("monitor",
			() -> new BaseFacingBlock(BlockBehaviour.Properties.of(Material.METAL)
					.lightLevel((glow) -> { return 15; })
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> OVERLORD_OOPART = registerBlock("overlord_oopart",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> OVERLORD_OOPART2 = registerBlock("overlord_oopart2",
			() -> new BaseFacingBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));

	public static final RegistryObject<Block> PLANKS_BIG_OAK_GOLDEN_TRIM = registerBlock("planks_big_oak_golden_trim",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> PLANKS_BROWN = registerBlock("planks_brown",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> PLANKS_DARK_BLUE = registerBlock("planks_dark_blue",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> PLANKS_LIGHT_BLUE = registerBlock("planks_light_blue",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> PLANKS_WHITE = registerBlock("planks_white",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> QUARTZ_BLOCK_GOLD_TRIM = registerBlock("quartz_block_gold_trim",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SPRUCE_FLOORING = registerBlock("spruce_flooring",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> STONE_FLOORING = registerBlock("stone_flooring",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_BOOKSHELF = registerBlock("sword_of_logos_bookshelf",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_BRICK = registerBlock("sword_of_logos_brick",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_GOLD_STAIRS = registerBlock("sword_of_logos_gold_stairs",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_GOLD_TRIM = registerBlock("sword_of_logos_gold_trim",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_INNER_GOLD_STAIRS = registerBlock("sword_of_logos_inner_gold_stairs",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_INNER_STAIRS = registerBlock("sword_of_logos_inner_stairs",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.WOOL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_INNER_WOOD_STAIRS = registerBlock("sword_of_logos_inner_wood_stairs",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_LOGO = registerBlock("sword_of_logos_logo",
			() -> new BaseFacingBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_OUTER_GOLD_STAIRS = registerBlock("sword_of_logos_outer_gold_stairs",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_OUTER_STAIRS = registerBlock("sword_of_logos_outer_stairs",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_OUTER_WOOD_STAIRS = registerBlock("sword_of_logos_outer_wood_stair",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_STAIRS = registerBlock("sword_of_logos_stairs",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_SWORD_BLADE = registerBlock("sword_of_logos_sword_blade",
			() -> new BaseFacingBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_TABEL_INNER_STAIRS = registerBlock("sword_of_logos_tabel_inner_stairs",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_TABEL_OUTER_STAIRS = registerBlock("sword_of_logos_tabel_outer_stairs",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_TABEL_TOP = registerBlock("sword_of_logos_tabel_top",
			() -> new BaseFacingBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_WOOD_STAIRS = registerBlock("sword_of_logos_wood_stairs",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_WOOD_TRIM = registerBlock("sword_of_logos_wood_trim",
			() -> new BaseFacingBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));	
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_WOOD = registerBlock("sword_of_logos_wood",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> SWORD_OF_LOGOS_WOOD2 = registerBlock("sword_of_logos_wood2",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> TADDLE_BRICK = registerBlock("taddle_brick",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));

	public static final RegistryObject<Block> TADDLE_WALL = registerBlock("taddle_wall",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> WALLPLATE = registerBlock("wallplate",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> WHITE_WALLPLATE = registerBlock("white_wallplate",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> WOODEN_PANEL = registerBlock("wooden_panel",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	public static final RegistryObject<Block> WOODEN_PANEL2 = registerBlock("wooden_panel2",
			() -> new BaseFacingBlock(BlockBehaviour.Properties.of(Material.WOOD)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));
	
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}


	public static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block ){
		return  Modded_item_core.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
	}


	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}

}