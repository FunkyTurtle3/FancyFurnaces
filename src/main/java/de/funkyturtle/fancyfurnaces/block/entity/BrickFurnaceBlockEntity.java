package de.funkyturtle.fancyfurnaces.block.entity;

import de.funkyturtle.fancyfurnaces.menu.custom.BrickFurnaceMenu;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.FuelValues;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BrickFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public BrickFurnaceBlockEntity(BlockPos pos, BlockState blockState) {
        super(FFBlockEntity.BRICK_FURNACE_TYPE.get(), pos, blockState, FFRecipeTypes.BRICK_FURNACE_RECIPE.get());
    }

    @Override
    public @NotNull Component getDefaultName() {
        return Component.translatable("blockentity.fancyfurnaces.name.brick_furnace");
    }

    protected int getBurnDuration(@NotNull FuelValues values, @NotNull ItemStack itemStack) {
        return super.getBurnDuration(values, itemStack) / 2;
    }

    @Override
    public @NotNull AbstractContainerMenu createMenu(int i, @NotNull Inventory inventory) {
        return new BrickFurnaceMenu(i, inventory, this, this.dataAccess);
    }
}
