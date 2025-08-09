package de.funkyturtle.fancyfurnaces.menu.custom;

import de.funkyturtle.fancyfurnaces.menu.FFMenuTypes;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeTypes;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.RecipePropertySet;


public class SpongeDryerMenu extends AbstractFurnaceMenu {

    public SpongeDryerMenu(int containerId, Inventory inventory) {
        super(FFMenuTypes.SPONGE_DRYER_MENU.get(), FFRecipeTypes.SPONGE_DRYER_RECIPE.get(), RecipePropertySet.FURNACE_INPUT, RecipeBookType.FURNACE, containerId, inventory);
    }

    public SpongeDryerMenu(int containerId, Inventory playerInventory, Container container, ContainerData data) {
        super(FFMenuTypes.SPONGE_DRYER_MENU.get(), FFRecipeTypes.SPONGE_DRYER_RECIPE.get(), RecipePropertySet.FURNACE_INPUT, RecipeBookType.FURNACE, containerId, playerInventory, container, data);
    }
}