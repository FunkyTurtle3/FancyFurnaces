package de.funkyturtle.fancyfurnaces.block;

import de.funkyturtle.fancyfurnaces.FancyFurnaces;
import de.funkyturtle.fancyfurnaces.block.custom.*;
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

    public static final DeferredBlock<StoneFurnaceBlock> STONE_FURNACE = registerBlock("stone_furnace", () -> new StoneFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, "stone_furnace")))));

    public static final DeferredBlock<SpongeDryerBlock> SPONGE_DRYER = registerBlock("sponge_dryer", () -> new SpongeDryerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, "sponge_dryer")))));

    public static final DeferredBlock<GlassFurnaceBlock> GLASS_FURNACE = registerBlock("glass_furnace", () -> new GlassFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, "glass_furnace")))));

    public static final DeferredBlock<WoodFurnaceBlock> WOOD_FURNACE = registerBlock("wood_furnace", () -> new WoodFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, "wood_furnace")))));

    public static final DeferredBlock<FFFurnaceBlock> BLACKSTONE_FURNACE = registerBlock("blackstone_furnace", () -> new FFFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, "blackstone_furnace")))));

    public static final DeferredBlock<FFFurnaceBlock> GRANITE_FURNACE = registerBlock("granite_furnace", () -> new FFFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, "granite_furnace")))));

    public static final DeferredBlock<FFFurnaceBlock> DIORITE_FURNACE = registerBlock("diorite_furnace", () -> new FFFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, "diorite_furnace")))));

    public static final DeferredBlock<FFFurnaceBlock> DEEPSLATE_FURNACE = registerBlock("deepslate_furnace", () -> new FFFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, "deepslate_furnace")))));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        FFItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FancyFurnaces.MOD_ID, name)))));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
