package reddragon.nutritiousnoms.content.blocks.entity;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import reddragon.nutritiousnoms.NutritiousNomsMod;

public class PressBlockEntity extends AbstractFurnaceBlockEntity {
	//Since we already now the BlockEntityType and RecipeType we don't need them in the constructor's parameters
    public PressBlockEntity() {
        super(NutritiousNomsMod.PRESS_BLOCK_ENTITY, NutritiousNomsMod.PRESSING_RECIPE_TYPE);
    }
 
    @Override
    public Text getContainerName() {
        //you should use a translation key instead but this is easier
        return Text.of("Press");
    }
 
    @Override
    public ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new PressScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

}
