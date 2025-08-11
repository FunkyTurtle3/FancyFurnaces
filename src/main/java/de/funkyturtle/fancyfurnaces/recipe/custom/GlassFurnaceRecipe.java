package de.funkyturtle.fancyfurnaces.recipe.custom;

import de.funkyturtle.fancyfurnaces.block.FFBlocks;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeSerializers;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeTypes;
import de.funkyturtle.fancyfurnaces.recipe.book.FFRecipeBookCategories;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import org.jetbrains.annotations.NotNull;

public class GlassFurnaceRecipe extends AbstractCookingRecipe {
    public GlassFurnaceRecipe(String group, CookingBookCategory category, Ingredient input, ItemStack result, float experience, int cookingTime) {
        super(group, category, input, result, experience, cookingTime);
    }

    @Override
    public @NotNull RecipeSerializer<? extends AbstractCookingRecipe> getSerializer() {
        return FFRecipeSerializers.GLASS_FURNACE_RECIPE_SERIALIZER.get();
    }

    @Override
    public @NotNull RecipeType<? extends AbstractCookingRecipe> getType() {
        return FFRecipeTypes.GLASS_FURNACE_RECIPE.get();
    }

    @Override
    public @NotNull RecipeBookCategory recipeBookCategory() {
        return FFRecipeBookCategories.GLASS_FURNACE_BLOCKS_CATEGORY.get();
    }

    @Override
    protected @NotNull Item furnaceIcon() {
        return FFBlocks.GLASS_FURNACE.asItem();
    }
}
