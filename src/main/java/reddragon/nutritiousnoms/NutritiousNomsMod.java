package reddragon.nutritiousnoms;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import reddragon.nutritiousnoms.content.NutritiousNomsBlockDefinition;
import reddragon.nutritiousnoms.content.NutritiousNomsItemDefinition;


public class NutritiousNomsMod implements ModInitializer {

	public static final String NAMESPACE = "nutritiousnoms";

	public static final Logger LOG = LogManager.getLogger(NAMESPACE);

	public static final RegistryKey<ItemGroup> ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(NAMESPACE, "item_group"));

	public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(NutritiousNomsBlockDefinition.GORGONZOLA_WHEEL.getBlock()))
			.displayName(Text.translatable("itemGroup.nutritiousnoms"))
			.build();

	@Override
	public void onInitialize() {
		// Register the Mod Item Group
		Registry.register(Registries.ITEM_GROUP, ITEM_GROUP_KEY, ITEM_GROUP);


		// Register all Mod Items
		for (NutritiousNomsItemDefinition itemDef : NutritiousNomsItemDefinition.values()) {
			Registry.register(Registries.ITEM, Identifier.of(NAMESPACE, itemDef.name().toLowerCase(Locale.US)), itemDef.getItem());
		}

		// Register all Blocks
		for (NutritiousNomsBlockDefinition blockDef : NutritiousNomsBlockDefinition.values()) {
			String name = blockDef.name().toLowerCase(Locale.US);

			Registry.register(Registries.BLOCK, Identifier.of(NAMESPACE, name), blockDef.getBlock());

			Registry.register(Registries.ITEM, Identifier.of(NAMESPACE, name), blockDef.getBlockItem());

		}

		// Update the Mod Item Group to add all Mod Items and Blocks
		ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP_KEY).register(itemGroup -> {
			for (NutritiousNomsItemDefinition itemDef : NutritiousNomsItemDefinition.values()) {
				itemGroup.add(itemDef.getItem());
			}
			for (NutritiousNomsBlockDefinition blockDef : NutritiousNomsBlockDefinition.values()) {
				itemGroup.add(blockDef.getBlock());
			}
		});

	}

}
