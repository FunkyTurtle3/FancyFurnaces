package de.funkyturtle.fancyfurnaces.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class FFFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public FFFurnaceBlockEntity(BlockPos pos, BlockState blockState) {
        super(FFBlockEntity.FURNACE_TYPE.get(), pos, blockState, RecipeType.SMELTING);
    }

    protected @NotNull Component getDefaultName() {
        return Component.translatable("container.fancyfurnaces.furnace");
    }

    protected @NotNull AbstractContainerMenu createMenu(int id, @NotNull Inventory player) {
        return new FurnaceMenu(id, player, this, this.dataAccess);
    }
}
