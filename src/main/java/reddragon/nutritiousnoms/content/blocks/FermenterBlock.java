/**
 * 
 */
package reddragon.nutritiousnoms.content.blocks;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import reddragon.nutritiousnoms.content.blocks.entity.PressBlockEntity;

/**
 * 
 */
public class FermenterBlock extends BlockWithEntity implements BlockEntityProvider {
	//TODO: Adjust Voxel Shape
	private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 16);
	//Maybe add getOutlineShape 
	
	public FermenterBlock(Settings settings) {
		super(settings);
	}


	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	public BlockEntity createBlockEntity(BlockView world) {
		return new FermenterBlockEntity();
	}


	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new FermenterBlockEntity();
	}
	
	@Override
	protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
		//This is called by the onUse method inside AbstractFurnaceBlock so
        //it is a little bit different of how you open the screen for normal container
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof FermenterBlockEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            // Optional: increment player's stat
            player.incrementStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

}
