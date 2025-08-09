package de.funkyturtle.fancyfurnaces.block.custom;

import com.mojang.serialization.MapCodec;
import de.funkyturtle.fancyfurnaces.block.entity.FFBlockEntity;
import de.funkyturtle.fancyfurnaces.block.entity.FFFurnaceBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
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

import javax.annotation.Nullable;

public class FFFurnaceBlock extends AbstractFurnaceBlock {
    public static final MapCodec<FFFurnaceBlock> CODEC = simpleCodec(FFFurnaceBlock::new);

    public @NotNull MapCodec<FFFurnaceBlock> codec() {
        return CODEC;
    }

    public FFFurnaceBlock(BlockBehaviour.Properties p_53627_) {
        super(p_53627_);
    }

    public BlockEntity newBlockEntity(@NotNull BlockPos p_153277_, @NotNull BlockState p_153278_) {
        return new FFFurnaceBlockEntity(p_153277_, p_153278_);
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level p_153273_, @NotNull BlockState p_153274_, @NotNull BlockEntityType<T> p_153275_) {
        return createFurnaceTicker(p_153273_, p_153275_, FFBlockEntity.FURNACE_TYPE.get());
    }

    protected void openContainer(Level level, @NotNull BlockPos pos, @NotNull Player player) {
        BlockEntity blockentity = level.getBlockEntity(pos);
        if (blockentity instanceof FFFurnaceBlockEntity) {
            player.openMenu((MenuProvider)blockentity);
            player.awardStat(Stats.INTERACT_WITH_FURNACE);
        }

    }

    public void animateTick(BlockState p_221253_, @NotNull Level p_221254_, @NotNull BlockPos p_221255_, @NotNull RandomSource p_221256_) {
        if (p_221253_.getValue(LIT)) {
            double d0 = (double)p_221255_.getX() + (double)0.5F;
            double d1 = p_221255_.getY();
            double d2 = (double)p_221255_.getZ() + (double)0.5F;
            if (p_221256_.nextDouble() < 0.1) {
                p_221254_.playLocalSound(d0, d1, d2, SoundEvents.FURNACE_FIRE_CRACKLE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction direction = p_221253_.getValue(FACING);
            Direction.Axis direction$axis = direction.getAxis();
            double d4 = p_221256_.nextDouble() * 0.6 - 0.3;
            double d5 = direction$axis == Direction.Axis.X ? (double) direction.getStepX() * 0.52 : d4;
            double d6 = p_221256_.nextDouble() * (double) 6.0F / (double)16.0F;
            double d7 = direction$axis == Direction.Axis.Z ? (double) direction.getStepZ() * 0.52 : d4;
            p_221254_.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0F, 0.0F, 0.0F);
            p_221254_.addParticle(ParticleTypes.FLAME, d0 + d5, d1 + d6, d2 + d7, 0.0F, 0.0F, 0.0F);
        }
    }
}
