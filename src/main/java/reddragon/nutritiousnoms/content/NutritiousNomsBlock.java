package reddragon.nutritiousnoms.content;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import reddragon.api.configs.ModBlockConfig;
import reddragon.api.content.BlockHolder;
import reddragon.nutritiousnoms.content.blocks.CheeseBlock;

public enum NutritiousNomsBlock implements BlockHolder {
	// Kitchen Devices
	// TODO make them work like fuel-less ovens
	FERMENTER(FabricBlockSettings.copyOf(Blocks.BARREL)),
	PRESS(FabricBlockSettings.copyOf(Blocks.BARREL)),

	// Cheese
	MOZZERELLA_POT(new CheeseBuilder().mature(1f / 8).hardness(1F).resistance(0.6F).build()),
	HAVARTI_WHEEL(new CheeseBuilder().mature(1f / 8).hardness(1F).resistance(0.8F).build()),
	FETA_POT(new CheeseBuilder().mature(1f / 8).hardness(1F).resistance(0.6F).build()),
	GORGONZOLA_WHEEL(new CheeseBuilder().mature(1f / 8).hardness(1F).resistance(0.8F).build()),
	SWISS_CHEESE_WHEEL(new CheeseBuilder().mature(1f / 8).hardness(2F).resistance(1F).build()),
	CHEDDAR_WHEEL(new CheeseBuilder().mature(1f / 8).hardness(3F).resistance(1.6F).build()),
	CHEERUS_POT(new CheeseBuilder().mature(1f / 8).hardness(4F).resistance(1.9F).build()),
	PARMESAN_WHEEL(new CheeseBuilder().mature(1f / 8).hardness(4F).resistance(1.9F).build());

	private final ModBlockConfig config;

	NutritiousNomsBlock(ModBlockConfig config) {
		this.config = config;
	}

	NutritiousNomsBlock(FabricBlockSettings settings) {
		this(new ModBlockConfig(settings));
	}

	NutritiousNomsBlock(CheeseBlock block) {
		config = new ModBlockConfig(block);
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

            return new CheeseBlock(FabricBlockSettings.copyOf(Blocks.DIRT)
					.strength(hardness, resistance)
					.sounds(BlockSoundGroup.NYLIUM)
                // .breakByTool(FabricToolTags.SWORDS)
                // .breakByHand(true)
					.ticksRandomly(),
					mature_months);
		}
	}

	@Override
	public Block getBlock() {
		return config.getBlock();
	}

	public ModBlockConfig getConfig() {
		return config;
	}

}
