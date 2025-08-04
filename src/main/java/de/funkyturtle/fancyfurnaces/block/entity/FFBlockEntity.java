package de.funkyturtle.fancyfurnaces.block.entity;

import de.funkyturtle.fancyfurnaces.FancyFurnaces;
import de.funkyturtle.fancyfurnaces.block.FFBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Set;
import java.util.function.Supplier;

public class FFBlockEntity {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, FancyFurnaces.MOD_ID);

    public static final Supplier<BlockEntityType<BrickFurnaceBlockEntity>> BRICK_FURNACE_TYPE =
            BLOCK_ENTITY_TYPES.register("brick_furnace_type", () -> {
                var block = FFBlocks.BRICK_FURNACE.get();
                return new BlockEntityType<>(BrickFurnaceBlockEntity::new, Set.of(block));
            });

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
