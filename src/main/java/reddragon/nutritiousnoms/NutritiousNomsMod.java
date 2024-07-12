package reddragon.nutritiousnoms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.BlockPos;
import reddragon.api.utils.ItemGroupUtils;
import reddragon.nutritiousnoms.content.NutritiousNomsBlock;
import reddragon.nutritiousnoms.content.NutritiousNomsItem;
import reddragon.nutritiousnoms.content.blocks.PressBlock;
import reddragon.nutritiousnoms.content.blocks.entity.PressBlockEntity;

public class NutritiousNomsMod implements ModInitializer {

	public static final String NAMESPACE = "nutritiousnoms";

    public static final RegistryKey<ItemGroup> ITEMGROUP = ItemGroupUtils.createModItemGroup(NAMESPACE,
			NutritiousNomsBlock.GORGONZOLA_WHEEL.getBlock());

	public static final Logger LOG = LogManager.getLogger(NAMESPACE);

	public static final Block PRESS_BLOCK;
    public static final BlockEntityType PRESS_BLOCK_ENTITY;
	public static final RecipeType PRESSING_RECIPE_TYPE;
    
    public static final Block FERMENTER_BLOCK;
    public static final BlockEntityType FERMENTER_BLOCK_ENTITY;
	public static final RecipeType FERMENTING_RECIPE_TYPE;

 
	
	
    static {
        //Block
    	//PRESS_BLOCK = Registry.register(Registries.BLOCK, "press", new Press(new Block.Settings()));
        //BlockItem
        //Registry.register(Registries.ITEM, "press", new BlockItem(PRESS_BLOCK, new Item.Settings()));
        //BlockEntity
        //PRESS_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, "press", BlockEntityType.Builder.create(PressBlockEntity::new, PRESS_BLOCK).build(null));
    }
	
	
	@Override
	public void onInitialize() {
        for (NutritiousNomsItem item : NutritiousNomsItem.values()) {
            item.getConfig().register(NAMESPACE, ITEMGROUP, item.name());
		}

		for (NutritiousNomsBlock block : NutritiousNomsBlock.values()) {
			block.getConfig().register(NAMESPACE, ITEMGROUP, block.name());
		}
	}
}
