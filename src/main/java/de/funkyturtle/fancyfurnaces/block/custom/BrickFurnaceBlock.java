package de.funkyturtle.fancyfurnaces.block.custom;

import com.mojang.serialization.MapCodec;
import de.funkyturtle.fancyfurnaces.block.entity.BrickFurnaceBlockEntity;
import de.funkyturtle.fancyfurnaces.block.entity.FFBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BrickFurnaceBlock extends AbstractFurnaceBlock {

    public static final MapCodec<BrickFurnaceBlock> CODEC = simpleCodec(BrickFurnaceBlock::new);

    public BrickFurnaceBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull MapCodec<? extends AbstractFurnaceBlock> codec() {
        return CODEC;
    }

    @Override
    protected void openContainer(@NotNull Level level, @NotNull BlockPos blockPos, @NotNull Player player) {
        BlockEntity blockentity = level.getBlockEntity(blockPos);
        if (blockentity instanceof BrickFurnaceBlockEntity) {
            player.openMenu((MenuProvider) blockentity);
            player.awardStat(Stats.INTERACT_WITH_FURNACE);
        }

    }

    @javax.annotation.Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level level, @NotNull BlockState state, @NotNull BlockEntityType<T> type) {
        return createFurnaceTicker(level, type, FFBlockEntity.BRICK_FURNACE_TYPE.get());
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        return new BrickFurnaceBlockEntity(blockPos, blockState);
    }
}
