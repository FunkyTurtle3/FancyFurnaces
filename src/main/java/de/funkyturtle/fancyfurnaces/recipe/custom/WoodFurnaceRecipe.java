package de.funkyturtle.fancyfurnaces.recipe.custom;

import de.funkyturtle.fancyfurnaces.block.FFBlocks;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeSerializers;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeTypes;
import de.funkyturtle.fancyfurnaces.recipe.book.FFRecipeBookCategories;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import org.jetbrains.annotations.NotNull;

public class WoodFurnaceRecipe extends AbstractCookingRecipe {
    public WoodFurnaceRecipe(String group, CookingBookCategory category, Ingredient input, ItemStack result, float experience, int cookingTime) {
        super(group, category, input, result, experience, cookingTime);
    }

    @Override
    public @NotNull RecipeSerializer<? extends AbstractCookingRecipe> getSerializer() {
        return FFRecipeSerializers.WOOD_FURNACE_RECIPE_SERIALIZER.get();
    }

    @Override
    public @NotNull RecipeType<? extends AbstractCookingRecipe> getType() {
        return FFRecipeTypes.WOOD_FURNACE_RECIPE.get();
    }

    @Override
    public @NotNull RecipeBookCategory recipeBookCategory() {
        return switch (this.category()) {
            case BLOCKS -> FFRecipeBookCategories.WOOD_FURNACE_BLOCKS_CATEGORY.get();
            case FOOD, MISC -> FFRecipeBookCategories.WOOD_FURNACE_MISC_CATEGORY.get();
        };
    }

    @Override
    protected @NotNull Item furnaceIcon() {
        return FFBlocks.WOOD_FURNACE.asItem();
    }
}
