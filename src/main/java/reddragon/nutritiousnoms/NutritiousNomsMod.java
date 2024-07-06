package reddragon.nutritiousnoms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import reddragon.api.utils.ItemGroupUtils;
import reddragon.nutritiousnoms.content.NutritiousNomsBlock;
import reddragon.nutritiousnoms.content.NutritiousNomsItem;

public class NutritiousNomsMod implements ModInitializer {

	public static final String NAMESPACE = "nutritiousnoms";

    public static final RegistryKey<ItemGroup> ITEMGROUP = ItemGroupUtils.createModItemGroup(NAMESPACE,
			NutritiousNomsBlock.GORGONZOLA_WHEEL.getBlock());

	public static final Logger LOG = LogManager.getLogger(NAMESPACE);

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
