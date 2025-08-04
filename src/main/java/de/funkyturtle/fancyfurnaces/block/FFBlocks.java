package de.funkyturtle.fancyfurnaces.block;

import de.funkyturtle.fancyfurnaces.FancyFurnaces;
import de.funkyturtle.fancyfurnaces.block.custom.BrickFurnaceBlock;
import de.funkyturtle.fancyfurnaces.item.FFItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FFBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FancyFurnaces.MOD_ID);

    public static final DeferredBlock<BrickFurnaceBlock> BRICK_FURNACE = registerBlock("brick_furnace", () -> new BrickFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, "brick_furnace")))));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        FFItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, "brick_furnace")))));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
