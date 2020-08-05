package reddragon.nutritiousnoms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NutritiousNomsMod implements ModInitializer {

	public static final String NAMESPACE = "nutritiousnoms";

	public static final Logger LOG = LogManager.getLogger(NAMESPACE);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		for (final ItemRegistry item : ItemRegistry.values()) {
			Registry.register(Registry.ITEM, new Identifier(NAMESPACE, item.getItemName()), item.getItem());
		}

	}
}
