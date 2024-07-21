package reddragon.nutritiousnoms.content;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import reddragon.nutritiousnoms.content.blocks.CheeseBlock;

public enum NutritiousNomsBlockDefinition {
	// Kitchen Devices
	// TODO make them work like fuel-less ovens
	//FERMENTER(FabricBlockSettings.copyOf(Blocks.SMOKER)),
	//PRESS(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE)),

	// Cheese
	MOZZARELLA_POT(new CheeseBuilder().mature(1f / 8).hardness(1F).resistance(0.6F).build()),
	HAVARTI_WHEEL(new CheeseBuilder().mature(1f / 8).hardness(1F).resistance(0.8F).build()),
	FETA_POT(new CheeseBuilder().mature(1f / 8).hardness(1F).resistance(0.6F).build()),
	GORGONZOLA_WHEEL(new CheeseBuilder().mature(1f / 8).hardness(1F).resistance(0.8F).build()),
	SWISS_CHEESE_WHEEL(new CheeseBuilder().mature(1f / 8).hardness(2F).resistance(1F).build()),
	CHEDDAR_WHEEL(new CheeseBuilder().mature(1f / 8).hardness(3F).resistance(1.6F).build()),
	CHEERUS_POT(new CheeseBuilder().mature(1f / 8).hardness(4F).resistance(1.9F).build()),
	PARMESAN_WHEEL(new CheeseBuilder().mature(1f / 8).hardness(4F).resistance(1.9F).build());

	private final Block block;
	private final BlockItem blockItem;

	NutritiousNomsBlockDefinition(FabricBlockSettings settings) {
		this.block = new Block(settings);
		this.blockItem = new BlockItem(block, new FabricItemSettings());
	}

	NutritiousNomsBlockDefinition(CheeseBlock block) {
		this.block = block;
		this.blockItem = new BlockItem(block, new FabricItemSettings());
	}


	public Block getBlock() {
		return this.block;
	}

	public BlockItem getBlockItem() {
		return this.blockItem;
	}


	static class CheeseBuilder {
		private float hardness;
		private float resistance;
		private float mature_months;

		public CheeseBuilder() {
		}

		public CheeseBuilder mature(float month) {
			mature_months = month;
			return this;
		}

		public CheeseBuilder hardness(float hardness) {
			this.hardness = hardness;
			return this;
		}

		public CheeseBuilder resistance(float resistance) {
			this.resistance = resistance;
			return this;
		}

		public CheeseBlock build() {
			// TODO: Migrate these methods.

			return new CheeseBlock(FabricBlockSettings.copyOf(Blocks.MUD).nonOpaque()
					.strength(hardness, resistance)
					.sounds(BlockSoundGroup.NYLIUM)
					// .breakByTool(FabricToolTags.SWORDS)
					// .breakByHand(true)
					.ticksRandomly(),
					mature_months);
		}
	}
}
