package de.funkyturtle.fancyfurnaces.creativetab;

import de.funkyturtle.fancyfurnaces.FancyFurnaces;
import de.funkyturtle.fancyfurnaces.block.FFBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FFCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FancyFurnaces.MOD_ID);

    public static final Supplier<CreativeModeTab> FFCREATIVE_TAB = CREATIVE_MODE_TABS.register("fancy_furnaces_creativetab", () -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 9)
            .icon(()-> new ItemStack(FFBlocks.BRICK_FURNACE.get()))
            .title(Component.translatable("creativetab.fancyfurnaces.fancyfurnaces"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(FFBlocks.BRICK_FURNACE);
                output.accept(FFBlocks.STONE_FURNACE);
                output.accept(FFBlocks.SPONGE_DRYER);
                output.accept(FFBlocks.GLASS_FURNACE);
                output.accept(FFBlocks.GRANITE_FURNACE);
                output.accept(FFBlocks.DIORITE_FURNACE);
                output.accept(FFBlocks.DEEPSLATE_FURNACE);
                output.accept(FFBlocks.BLACKSTONE_FURNACE);
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}