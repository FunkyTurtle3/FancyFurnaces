package de.funkyturtle.fancyfurnaces;

import com.mojang.logging.LogUtils;
import de.funkyturtle.fancyfurnaces.block.FFBlocks;
import de.funkyturtle.fancyfurnaces.block.entity.FFBlockEntity;
import de.funkyturtle.fancyfurnaces.item.FFItem;
import de.funkyturtle.fancyfurnaces.menu.FFMenuTypes;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeSerializers;
import de.funkyturtle.fancyfurnaces.recipe.FFRecipeTypes;
import de.funkyturtle.fancyfurnaces.recipe.book.FFRecipeBookCategories;
import de.funkyturtle.fancyfurnaces.screen.BrickFurnaceScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(FancyFurnaces.MOD_ID)
public class FancyFurnaces {
    public static final String MOD_ID = "fancyfurnaces";
    private static final Logger LOGGER = LogUtils.getLogger();


    public FancyFurnaces(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        FFBlocks.register(modEventBus);
        FFItem.register(modEventBus);
        FFBlockEntity.register(modEventBus);
        FFMenuTypes.register(modEventBus);
        FFRecipeTypes.register(modEventBus);
        FFRecipeSerializers.register(modEventBus);
        FFRecipeBookCategories.register(modEventBus);

       NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event) {
            event.register(FFMenuTypes.BRICK_FURNACE_MENU.get(), BrickFurnaceScreen::new);
        }
    }
}