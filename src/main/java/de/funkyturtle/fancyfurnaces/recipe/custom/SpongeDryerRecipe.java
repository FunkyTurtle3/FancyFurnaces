package de.funkyturtle.fancyfurnaces.recipe.custom;

import de.funkyturtle.fancyfurnaces.block.FFBlocks;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeSerializers;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeTypes;
import de.funkyturtle.fancyfurnaces.recipe.book.FFRecipeBookCategories;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import org.jetbrains.annotations.NotNull;

public class SpongeDryerRecipe extends AbstractCookingRecipe {
    public SpongeDryerRecipe(String group, CookingBookCategory category, Ingredient input, ItemStack result, float experience, int cookingTime) {
        super(group, category, input, result, experience, cookingTime);
    }

    @Override
    public @NotNull RecipeSerializer<? extends AbstractCookingRecipe> getSerializer() {
        return FFRecipeSerializers.SPONGE_DRYER_RECIPE_SERIALIZER.get();
    }

    @Override
    public @NotNull RecipeType<? extends AbstractCookingRecipe> getType() {
        return FFRecipeTypes.SPONGE_DRYER_RECIPE.get();
    }

    @Override
    public @NotNull RecipeBookCategory recipeBookCategory() {
        return FFRecipeBookCategories.SPONGE_DRYER_BLOCKS_CATEGORY.get();
    }

    @Override
    protected @NotNull Item furnaceIcon() {
        return FFBlocks.SPONGE_DRYER.asItem();
    }
}
