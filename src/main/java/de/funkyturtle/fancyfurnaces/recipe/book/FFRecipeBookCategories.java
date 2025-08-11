package de.funkyturtle.fancyfurnaces.recipe.book;

import de.funkyturtle.fancyfurnaces.FancyFurnaces;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeBookCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FFRecipeBookCategories {
    public static final DeferredRegister<RecipeBookCategory> RECIPE_BOOK_CATEGORY = DeferredRegister.create(BuiltInRegistries.RECIPE_BOOK_CATEGORY, FancyFurnaces.MOD_ID);

    public static final Supplier<RecipeBookCategory> BRICK_FURNACE_MISC_CATEGORY = RECIPE_BOOK_CATEGORY.register("brick_furnace_misc_category", RecipeBookCategory::new);
    public static final Supplier<RecipeBookCategory> BRICK_FURNACE_BLOCKS_CATEGORY = RECIPE_BOOK_CATEGORY.register("brick_furnace_blocks_category", RecipeBookCategory::new);

    public static final Supplier<RecipeBookCategory> STONE_FURNACE_MISC_CATEGORY = RECIPE_BOOK_CATEGORY.register("stone_furnace_misc_category", RecipeBookCategory::new);
    public static final Supplier<RecipeBookCategory> STONE_FURNACE_BLOCKS_CATEGORY = RECIPE_BOOK_CATEGORY.register("stone_furnace_blocks_category", RecipeBookCategory::new);

    public static final Supplier<RecipeBookCategory> SPONGE_DRYER_BLOCKS_CATEGORY = RECIPE_BOOK_CATEGORY.register("sponge_dryer_blocks_category", RecipeBookCategory::new);

    public static final Supplier<RecipeBookCategory> GLASS_FURNACE_BLOCKS_CATEGORY = RECIPE_BOOK_CATEGORY.register("glass_furnace_blocks_category", RecipeBookCategory::new);


    public static void register(IEventBus eventBus) {
        RECIPE_BOOK_CATEGORY.register(eventBus);
    }
}
