package reddragon.nutritiousnoms;

import static net.minecraft.item.ItemGroup.FOOD;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Locale;
import java.util.Optional;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;

public enum ItemRegistry {

	CHOCO_CAKE(new FoodBuilder().hunger(5).saturation(1.2F).build()),
	JELLY_DONUT(new FoodBuilder().hunger(5).saturation(1.2F).build()),
	CHOCO_DONUT(new FoodBuilder().hunger(5).saturation(1.2F).build()),
	FROSTED_DDONUT(new FoodBuilder().hunger(5).saturation(1.2F).build()),
	CRULLER(new FoodBuilder().hunger(5).saturation(1.2F).build()),
	HOTDOG(new FoodBuilder().hunger(5).saturation(1.2F).build()),
	TOAST_SLICE(new FoodBuilder().hunger(5).saturation(1.2F).build()),
	EGG_TOAST(new FoodBuilder().hunger(5).saturation(1.2F).build()),
	CHOCO_MUFFIN(new FoodBuilder().hunger(5).saturation(1.2F).build()),
	PRETZEL(new FoodBuilder().hunger(5).saturation(1.2F).build()),
	CROISSANT(new FoodBuilder().hunger(5).saturation(1.2F).build()),

	NULL(null);

	private String customIdentifier;

	private Item item;

	private ItemRegistry(final Settings settings, boolean reflect) {
		this(settings);

		if (!reflect) {
			return;
		}
		try {
			Field field = item.getClass().getDeclaredField("field_8008");

			field.setAccessible(true);

			Field modifiersField = Field.class.getDeclaredField("modifiers");
			modifiersField.setAccessible(true);
			modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

			field.set(item, item);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private ItemRegistry(final Settings settings) {
		item = new Item(settings);
	}

	public String getItemName() {
		return Optional.ofNullable(customIdentifier).orElse(name().toLowerCase(Locale.ENGLISH));
	}

	public Item getItem() {
		return item;
	}

	private static class FoodBuilder {
		int hunger;
		float saturationModifier;

		public FoodBuilder() {
		}

		public FoodBuilder hunger(int hunger) {
			this.hunger = hunger;
			return this;
		}

		public FoodBuilder saturation(float saturationModifier) {
			this.saturationModifier = saturationModifier;
			return this;
		}

		public Settings build() {
			return new Settings().group(FOOD)
					.food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturationModifier).build());
		}
	}

}
