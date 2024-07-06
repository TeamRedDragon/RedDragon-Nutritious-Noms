package reddragon.nutritiousnoms.content;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import reddragon.api.configs.ModItemConfig;
import reddragon.api.content.ItemHolder;

public enum NutritiousNomsItem implements ItemHolder {

	// Tools

	// Non-Consumable Ingredients

	// Consumable Ingredients

	// Snacks * use half the time to be consumed

	// Meats *can be used to tame wolves

	CHOCO_CAKE(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),
	JELLY_DONUT(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),
	CHOCO_DONUT(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),
	FROSTED_DONUT(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),
	CRULLER(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),
	HOTDOG(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),
	TOAST_SLICE(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),
	EGG_TOAST(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),
	CHOCO_MUFFIN(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),
	PRETZEL(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),
	CROISSANT(new FoodComponent.Builder().hunger(5).saturationModifier(1.2F).build()),

	// Diary Products
	// Milk
	PASTEURIZED_MILK(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	SKIMMED_MILK(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	CURD_CHEESE(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	COTTAGE_CHEESE(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	PASTEURIZED_SKIMMED_MILK(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	HEAVY_CREAM(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	WHIPPED_CREAM(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	SOUR_CREAM(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	CREAM_CHEESE(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	YOGHURT(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	BUTTER(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	MOZZERELLA(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	MOZZERELLA_SLICES(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	GRATED_MOZZERELLA(new FoodComponent.Builder().hunger(1).saturationModifier(1F).build()),
	HAVARTI(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 1f).build()),
	HAVARTI_SLICES(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 1f).build()),
	GRATED_HAVARTI(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 1f).build()),
	SWISS_CHEESE(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1), 1f).build()),
	SWISS_CHEESE_SLICES(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1), 1f).build()),
	GRATED_SWISS_CHEESE(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1), 1f).build()),
	GORGONZOLA(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 12, 2), 1f).build()),
	GORGONZOLA_SLICES(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 12, 2), 1f).build()),
	GRATED_GORGONZOLA(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 12, 2), 1f).build()),
	FETA(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 1), 1f).build()),
	FETA_SLICES(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 1), 1f).build()),
	GRATED_FETA(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 1), 1f).build()),
	PARMESAN(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 12, 1), 1f).build()),
	PARMESAN_SLICES(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 12, 1), 1f).build()),
	GRATED_PARMESAN(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 12, 1), 1f).build()),
	CHEDDAR(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 12, 1), 1f).build()),
	CHEDDAR_SLICES(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 12, 1), 1f).build()),
	GRATED_CHEDDAR(new FoodComponent.Builder().hunger(1).saturationModifier(1F)
			.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 12, 1), 1f).build()),
	CHEERUS(new FoodComponent.Builder().hunger(4).saturationModifier(2.4F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 6), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 4), 1f).build()),
	CHEERUS_SLICES(new FoodComponent.Builder().hunger(4).saturationModifier(2.4F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 6), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 4), 1f).build()),
	GRATED_CHEERUS(new FoodComponent.Builder().hunger(4).saturationModifier(2.4F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 6), 1f)
			.statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 4), 1f).build()),
	GRATED_CHEESE_MIX(new FoodComponent.Builder().hunger(3).saturationModifier(3F).build());

    private static final int MAX_COUNT = 64;

	private final ModItemConfig config;

	NutritiousNomsItem(ModItemConfig config) {
		this.config = config;
	}

	NutritiousNomsItem(FoodComponent foodComponent) {
        config = new ModItemConfig(foodComponent, MAX_COUNT);
	}

	@Override
	public Item getItem() {
		return null;
	}

	public ModItemConfig getConfig() {
		return config;
	}

}
