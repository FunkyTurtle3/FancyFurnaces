package de.funkyturtle.fancyfurnaces.menu.custom;

import de.funkyturtle.fancyfurnaces.menu.FFMenuTypes;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeTypes;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.RecipePropertySet;


public class GlassFurnaceMenu extends AbstractFurnaceMenu {

    public GlassFurnaceMenu(int containerId, Inventory inventory) {
        super(FFMenuTypes.GLASS_FURNACE_MENU.get(), FFRecipeTypes.GLASS_FURNACE_RECIPE.get(), RecipePropertySet.FURNACE_INPUT, RecipeBookType.FURNACE, containerId, inventory);
    }

    public GlassFurnaceMenu(int containerId, Inventory playerInventory, Container container, ContainerData data) {
        super(FFMenuTypes.GLASS_FURNACE_MENU.get(), FFRecipeTypes.GLASS_FURNACE_RECIPE.get(), RecipePropertySet.FURNACE_INPUT, RecipeBookType.FURNACE, containerId, playerInventory, container, data);
    }
}