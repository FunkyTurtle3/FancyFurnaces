package de.funkyturtle.fancyfurnaces.screen;

import de.funkyturtle.fancyfurnaces.menu.custom.BrickFurnaceMenu;
import de.funkyturtle.fancyfurnaces.menu.custom.StoneFurnaceMenu;
import de.funkyturtle.fancyfurnaces.recipe.book.FFRecipeBookCategories;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.RecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Items;

import java.util.List;

public class StoneFurnaceScreen extends AbstractFurnaceScreen<StoneFurnaceMenu> {
    private static final ResourceLocation LIT_PROGRESS_SPRITE = ResourceLocation.withDefaultNamespace("container/furnace/lit_progress");
    private static final ResourceLocation BURN_PROGRESS_SPRITE = ResourceLocation.withDefaultNamespace("container/furnace/burn_progress");
    private static final ResourceLocation TEXTURE = ResourceLocation.withDefaultNamespace("textures/gui/container/furnace.png");
    private static final Component FILTER_NAME = Component.translatable("gui.recipebook.toggleRecipes.smeltable");
    private static final List<RecipeBookComponent.TabInfo> TABS = List.of(
            new RecipeBookComponent.TabInfo(Items.SMOOTH_STONE, FFRecipeBookCategories.STONE_FURNACE_BLOCKS_CATEGORY.get()),
            new RecipeBookComponent.TabInfo(Items.SAND, FFRecipeBookCategories.STONE_FURNACE_MISC_CATEGORY.get())
    );

    public StoneFurnaceScreen(StoneFurnaceMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title, FILTER_NAME, TEXTURE, LIT_PROGRESS_SPRITE, BURN_PROGRESS_SPRITE, TABS);
    }
}
