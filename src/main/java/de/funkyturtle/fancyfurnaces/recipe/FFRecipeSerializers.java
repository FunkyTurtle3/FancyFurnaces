package de.funkyturtle.fancyfurnaces.recipe;

import de.funkyturtle.fancyfurnaces.FancyFurnaces;
import de.funkyturtle.fancyfurnaces.recipe.custom.BrickFurnaceRecipe;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FFRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, FancyFurnaces.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<BrickFurnaceRecipe>> BRICK_FURNACE_RECIPE_SERIALIZER = SERIALIZERS.register("brick_furnace_recipe", () -> new AbstractCookingRecipe.Serializer<>(BrickFurnaceRecipe::new, 100) {});

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }

}
