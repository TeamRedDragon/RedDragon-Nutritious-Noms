/**
 * 
 */
package reddragon.nutritiousnoms.content.blocks;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import reddragon.nutritiousnoms.content.blocks.entity.PressBlockEntity;

/**
 * 
 */
public class PressBlock extends AbstractFurnaceBlock {

	public PressBlock(Settings settings) {
		super(settings);
	}

	public BlockEntity createBlockEntity(BlockView world) {
		return new PressBlockEntity();
	}


	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new PressBlockEntity();
	}
	
	@Override
	protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
		//This is called by the onUse method inside AbstractFurnaceBlock so
        //it is a little bit different of how you open the screen for normal container
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof PressBlockEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            // Optional: increment player's stat
            player.incrementStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

}
