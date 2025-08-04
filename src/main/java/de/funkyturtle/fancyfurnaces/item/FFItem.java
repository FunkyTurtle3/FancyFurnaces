package de.funkyturtle.fancyfurnaces.item;

import de.funkyturtle.fancyfurnaces.FancyFurnaces;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FFItem {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FancyFurnaces.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
