package reddragon.nutritiousnoms.content;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public enum NutritiousNomsItemDefinition {

	// Tools

	// Non-Consumable Ingredients

	// Consumable Ingredients

	// Snacks * use half the time to be consumed

	// Meats *can be used to tame wolves

	CHOCO_CAKE(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),
	JELLY_DONUT(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),
	CHOCO_DONUT(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),
	FROSTED_DONUT(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),
	CRULLER(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),
	HOTDOG(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),
	TOAST_SLICE(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),
	EGG_TOAST(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),
	CHOCO_MUFFIN(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),
	PRETZEL(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),
	CROISSANT(foodItem(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build())),

	// Diary Products
	// Milk

	PASTEURIZED_MILK_BUCKET(drinkItemBucket()), PASTEURIZED_MILK_BOTTLE(drinkItemBottle()),
	SKIMMED_MILK_BUCKET(drinkItemBucket()), SKIMMED_MILK_BOTTLE(drinkItemBottle()),
	PASTEURIZED_SKIMMED_MILK_BUCKET(drinkItemBucket()), PASTEURIZED_SKIMMED_MILK_BOTTLE(drinkItemBottle()),
	CURD_CHEESE(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	COTTAGE_CHEESE(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	HEAVY_CREAM(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	WHIPPED_CREAM(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	SOUR_CREAM(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	CREAM_CHEESE(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	YOGHURT(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	BUTTER(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	MOZZARELLA(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	MOZZARELLA_SLICES(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	GRATED_MOZZARELLA(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build())),
	HAVARTI(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 1f).build())),
	HAVARTI_SLICES(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 1f).build())),
	GRATED_HAVARTI(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 1f).build())),
	SWISS_CHEESE(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1), 1f).build())),
	SWISS_CHEESE_SLICES(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1), 1f).build())),
	GRATED_SWISS_CHEESE(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1), 1f).build())),
	GORGONZOLA(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 12, 2), 1f).build())),
	GORGONZOLA_SLICES(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 12, 2), 1f).build())),
	GRATED_GORGONZOLA(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 12, 2), 1f).build())),
	FETA(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 1), 1f).build())),
	FETA_SLICES(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 1), 1f).build())),
	GRATED_FETA(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 1), 1f).build())),
	PARMESAN(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 12, 1), 1f).build())),
	PARMESAN_SLICES(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 12, 1), 1f).build())),
	GRATED_PARMESAN(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 12, 1), 1f).build())),
	CHEDDAR(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 12, 1), 1f).build())),
	CHEDDAR_SLICES(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 12, 1), 1f).build())),
	GRATED_CHEDDAR(foodItem(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 12, 1), 1f).build())),
	CHEERUS(foodItem(new FoodComponent.Builder().hunger(4).saturationModifier(2.4F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 6), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 4), 1f).build())),
	CHEERUS_SLICES(foodItem(new FoodComponent.Builder().hunger(4).saturationModifier(2.4F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 6), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 4), 1f).build())),
	GRATED_CHEERUS(foodItem(new FoodComponent.Builder().hunger(4).saturationModifier(2.4F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 6), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 4), 1f).build())),
	GRATED_CHEESE_MIX(foodItem(new FoodComponent.Builder().hunger(3).saturationModifier(3F).build()));

	private final Item item;

	NutritiousNomsItemDefinition(Item.Settings settings) {
		this.item = new Item(settings);
	}

	public Item getItem() {
		return item;
	}

	// Helper methods
	public static Item.Settings basicItem() {
		return new Item.Settings();
	}

	public static Item.Settings foodItem(FoodComponent food) {
		return new Item.Settings().food(food);
	}

	public static Item.Settings bowlFoodItem(FoodComponent food) {
		return new Item.Settings().food(food).recipeRemainder(Items.BOWL).maxCount(16);
	}

	public static Item.Settings drinkItemBottle() {
		return new Item.Settings().recipeRemainder(Items.GLASS_BOTTLE).maxCount(16);
	}

	public static Item.Settings drinkItemBucket() {
		return new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1);
	}

}
