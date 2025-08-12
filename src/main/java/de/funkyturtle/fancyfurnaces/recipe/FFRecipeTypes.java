package de.funkyturtle.fancyfurnaces.recipe;

import de.funkyturtle.fancyfurnaces.FancyFurnaces;
import de.funkyturtle.fancyfurnaces.recipe.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FFRecipeTypes {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, FancyFurnaces.MOD_ID);

    public static final DeferredHolder<RecipeType<?>, RecipeType<BrickFurnaceRecipe>> BRICK_FURNACE_RECIPE = RECIPE_TYPES.register("brick_furnace_recipe",
            () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return "brick_furnace_recipe";
                }
            });

    public static final DeferredHolder<RecipeType<?>, RecipeType<StoneFurnaceRecipe>> STONE_FURNACE_RECIPE = RECIPE_TYPES.register("stone_furnace_recipe",
            () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return "stone_furnace_recipe";
                }
            });

    public static final DeferredHolder<RecipeType<?>, RecipeType<SpongeDryerRecipe>> SPONGE_DRYER_RECIPE = RECIPE_TYPES.register("sponge_dryer_recipe",
            () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return "sponge_dryer_recipe";
                }
            });

    public static final DeferredHolder<RecipeType<?>, RecipeType<GlassFurnaceRecipe>> GLASS_FURNACE_RECIPE = RECIPE_TYPES.register("glass_furnace_recipe",
            () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return "glass_furnace_recipe";
                }
            });

    public static final DeferredHolder<RecipeType<?>, RecipeType<WoodFurnaceRecipe>> WOOD_FURNACE_RECIPE = RECIPE_TYPES.register("wood_furnace_recipe",
            () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return "wood_furnace_recipe";
                }
            });

    public static void register(IEventBus eventBus) {
        RECIPE_TYPES.register(eventBus);
    }

}
