package de.funkyturtle.fancyfurnaces.recipe;

import de.funkyturtle.fancyfurnaces.FancyFurnaces;
import de.funkyturtle.fancyfurnaces.recipe.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FFRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, FancyFurnaces.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<BrickFurnaceRecipe>> BRICK_FURNACE_RECIPE_SERIALIZER = SERIALIZERS.register("brick_furnace_recipe", () -> new AbstractCookingRecipe.Serializer<>(BrickFurnaceRecipe::new, 100) {});

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<StoneFurnaceRecipe>> STONE_FURNACE_RECIPE_SERIALIZER = SERIALIZERS.register("stone_furnace_recipe", () -> new AbstractCookingRecipe.Serializer<>(StoneFurnaceRecipe::new, 100) {});

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<SpongeDryerRecipe>> SPONGE_DRYER_RECIPE_SERIALIZER = SERIALIZERS.register("sponge_dryer_recipe", () -> new AbstractCookingRecipe.Serializer<>(SpongeDryerRecipe::new, 100) {});

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<GlassFurnaceRecipe>> GLASS_FURNACE_RECIPE_SERIALIZER = SERIALIZERS.register("glass_furnace_recipe", () -> new AbstractCookingRecipe.Serializer<>(GlassFurnaceRecipe::new, 100) {});

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<WoodFurnaceRecipe>> WOOD_FURNACE_RECIPE_SERIALIZER = SERIALIZERS.register("wood_furnace_recipe", () -> new AbstractCookingRecipe.Serializer<>(WoodFurnaceRecipe::new, 100) {});


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }

}
