package reddragon.nutritiousnoms.content.blocks.entity;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import reddragon.nutritiousnoms.NutritiousNomsMod;

public class FermenterBlockEntity extends AbstractFurnaceBlockEntity {
	//Since we already now the BlockEntityType and RecipeType we don't need them in the constructor's parameters
    public FermenterBlockEntity() {
        super(NutritiousNomsMod.FERMENTER_BLOCK_ENTITY, NutritiousNomsMod.FERMENTING_RECIPE_TYPE);
    }
 
    @Override
    public Text getContainerName() {
        //you should use a translation key instead but this is easier
        return Text.of("Fermenter");
    }
 
    @Override
    public ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new PressScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

}
