package reddragon.nutritiousnoms.content.blocks;


import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class CheeseBlock extends Block {

//	  Assuming default 20 random ticks per second
//	  20min = 1 Minecraft day = * 24,000ticks
//	  300min = 1 Minecraft Month (8 Minecraft Days) = 192,000 ticks
//	  On average ~ 1365 ticks per random block tick or 68sec
//	  On average ~ 18 random block ticks per Minecraft day
//	  On average ~ 137 random block ticks per Minecraft month
//
//	  Mature Time Calculations
//	  1 Day 	 ~18   random block ticks ~ 66.67% chance to progress per random tick
//	  1 Month 	 ~141  random block ticks ~ 8.85% chance to progress per random tick
//	  2 Month 	 ~282  random block ticks ~ 4.25% change to progress per random tick
//	  3 Month 	 ~423  random block ticks ~ 2.84% change to progress per random tick
//	  6 Month   ~847  random block ticks ~ 1.42% change to progress per random tick
//	  12 Month  ~1694 random block ticks ~ 0.71% change to progress per random tick
//	  24 Months ~3388 random block ticks ~ 0.35% change to progress per random tick
	private static final int MAX_MATURENESS = 11;
	private static final float AVERAGE_RANDOM_TICKS = 1365.33f;
	private static final int TICKS_PER_MINECRAFT_MONTH = 8 * 24000;
	private static final float MOLD_CHANCE = 0.01f;

    private static final Set<Block> SOIL_BLOCKS = Set.of(
        Blocks.DIRT,
        Blocks.GRASS_BLOCK,
        Blocks.FARMLAND,
        Blocks.PODZOL,
        Blocks.COARSE_DIRT,
        Blocks.MYCELIUM);

    public static final IntProperty MATURENESS = IntProperty.of("matureness", 0, MAX_MATURENESS);

    private final float mature_chance;

    protected static final VoxelShape SHAPE;

	static {
		SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 14.0D, 15.0D);
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return SHAPE;
	}

	@Override
	public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isSolidBlock(world, pos);
	}

	@Override
	protected void appendProperties(Builder<Block, BlockState> builder) {
		super.appendProperties(builder);
		builder.add(MATURENESS);
	}

	@Override
	public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
		return false;
	}

	public CheeseBlock(Settings settings, final float mature_months) {
		super(settings);
		setDefaultState(stateManager.getDefaultState().with(MATURENESS, 0));
		mature_chance = (MAX_MATURENESS + 1) / (mature_months * TICKS_PER_MINECRAFT_MONTH / AVERAGE_RANDOM_TICKS);
	}

	@Override
	public boolean hasRandomTicks(BlockState state) {
		return true;
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		int matureness = state.get(MATURENESS);
		if (matureness < MAX_MATURENESS) {
			if (isOnDirty(world, pos) || isWaterNearby(world, pos) || world.hasRain(pos.up())) {
				if (world.random.nextFloat() <= MOLD_CHANCE) {
					mold(state, world, pos);
				}
			} else if (!isAdjacentLit(world, pos) && world.random.nextFloat() <= mature_chance) {
				world.setBlockState(pos, state.with(MATURENESS, matureness + 1), 2);
			}
		}
	}

	public static void mold(BlockState state, World world, BlockPos pos) {
		world.setBlockState(pos, Blocks.SLIME_BLOCK.getDefaultState());
		world.syncWorldEvent(1501, pos, 0); // ExtingushEvent
	}

	private static boolean isWaterNearby(WorldView world, BlockPos pos) {
		var var2 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))
				.iterator();

		BlockPos blockPos;
		do {
			if (!var2.hasNext()) {
				return false;
			}
			blockPos = var2.next();
		} while (!world.getFluidState(blockPos).isIn(FluidTags.WATER));
		return true;
	}

	private static boolean isOnDirty(WorldView world, BlockPos pos) {
        var groundMaterial = world.getBlockState(pos.down());

        return SOIL_BLOCKS.contains(groundMaterial.getBlock());
	}

	private static boolean isAdjacentLit(WorldView world, BlockPos pos) {
		return world.getLightLevel(pos.up(), 0) >= 10
				|| world.getLightLevel(pos.north(), 0) >= 10
				|| world.getLightLevel(pos.east(), 0) >= 10
				|| world.getLightLevel(pos.down(), 0) >= 10
				|| world.getLightLevel(pos.south(), 0) >= 10
				|| world.getLightLevel(pos.west(), 0) >= 10;
	}

}
