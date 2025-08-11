package de.funkyturtle.fancyfurnaces.block.entity;

import de.funkyturtle.fancyfurnaces.menu.custom.GlassFurnaceMenu;
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

public class GlassFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public GlassFurnaceBlockEntity(BlockPos pos, BlockState blockState) {
        super(FFBlockEntity.GLASS_FURNACE_TYPE.get(), pos, blockState, FFRecipeTypes.GLASS_FURNACE_RECIPE.get());
    }

    @Override
    public @NotNull Component getDefaultName() {
        return Component.translatable("blockentity.fancyfurnaces.name.glass_furnace");
    }

    protected int getBurnDuration(@NotNull FuelValues values, @NotNull ItemStack itemStack) {
        return super.getBurnDuration(values, itemStack) / 2;
    }

    @Override
    public @NotNull AbstractContainerMenu createMenu(int i, @NotNull Inventory inventory) {
        return new GlassFurnaceMenu(i, inventory, this, this.dataAccess);
    }
}
