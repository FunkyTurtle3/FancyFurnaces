package de.funkyturtle.fancyfurnaces.menu.custom;

import de.funkyturtle.fancyfurnaces.menu.FFMenuTypes;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeTypes;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipePropertySet;

import java.util.List;

public class BrickFurnaceMenu extends AbstractFurnaceMenu {
    private static final List<Ingredient> ingredients = List.of(
            Ingredient.of(Items.CLAY_BALL),
            Ingredient.of(Items.CLAY_BALL)
    );

    public BrickFurnaceMenu(int containerId, Inventory inventory) {
        super(FFMenuTypes.BRICK_FURNACE_MENU.get(), FFRecipeTypes.BRICK_FURNACE_RECIPE.get(), RecipePropertySet.FURNACE_INPUT, RecipeBookType.FURNACE, containerId, inventory);
    }

    public BrickFurnaceMenu(int containerId, Inventory playerInventory, Container container, ContainerData data) {
        super(FFMenuTypes.BRICK_FURNACE_MENU.get(), FFRecipeTypes.BRICK_FURNACE_RECIPE.get(), RecipePropertySet.FURNACE_INPUT, RecipeBookType.FURNACE, containerId, playerInventory, container, data);
    }
}