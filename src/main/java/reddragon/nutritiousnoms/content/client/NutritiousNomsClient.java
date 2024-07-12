package reddragon.nutritiousnoms.content.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class NutritiousNomsClient implements ClientModInitializer {

	 @Override
	    public void onInitializeClient() {
	        ScreenRegistry.register(NutritiousNomsClient.PRESS_SCREEN_HANDLER, PressScreen::new);
	    }

}
