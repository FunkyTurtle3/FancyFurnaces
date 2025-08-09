package de.funkyturtle.fancyfurnaces.menu.custom;

import de.funkyturtle.fancyfurnaces.menu.FFMenuTypes;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeTypes;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.RecipePropertySet;


public class StoneFurnaceMenu extends AbstractFurnaceMenu {

    public StoneFurnaceMenu(int containerId, Inventory inventory) {
        super(FFMenuTypes.STONE_FURNACE_MENU.get(), FFRecipeTypes.STONE_FURNACE_RECIPE.get(), RecipePropertySet.FURNACE_INPUT, RecipeBookType.FURNACE, containerId, inventory);
    }

    public StoneFurnaceMenu(int containerId, Inventory playerInventory, Container container, ContainerData data) {
        super(FFMenuTypes.STONE_FURNACE_MENU.get(), FFRecipeTypes.STONE_FURNACE_RECIPE.get(), RecipePropertySet.FURNACE_INPUT, RecipeBookType.FURNACE, containerId, playerInventory, container, data);
    }
}