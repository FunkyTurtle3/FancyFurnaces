package de.funkyturtle.fancyfurnaces.menu;

import de.funkyturtle.fancyfurnaces.FancyFurnaces;
import de.funkyturtle.fancyfurnaces.menu.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FFMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(BuiltInRegistries.MENU, FancyFurnaces.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<BrickFurnaceMenu>> BRICK_FURNACE_MENU = MENUS.register("brick_furnace_menu", () -> new MenuType<>(BrickFurnaceMenu::new, FeatureFlags.DEFAULT_FLAGS));

    public static final DeferredHolder<MenuType<?>, MenuType<StoneFurnaceMenu>> STONE_FURNACE_MENU = MENUS.register("stone_furnace_menu", () -> new MenuType<>(StoneFurnaceMenu::new, FeatureFlags.DEFAULT_FLAGS));

    public static final DeferredHolder<MenuType<?>, MenuType<SpongeDryerMenu>> SPONGE_DRYER_MENU = MENUS.register("sponge_dryer_menu", () -> new MenuType<>(SpongeDryerMenu::new, FeatureFlags.DEFAULT_FLAGS));

    public static final DeferredHolder<MenuType<?>, MenuType<GlassFurnaceMenu>> GLASS_FURNACE_MENU = MENUS.register("glass_furnace_menu", () -> new MenuType<>(GlassFurnaceMenu::new, FeatureFlags.DEFAULT_FLAGS));

    public static final DeferredHolder<MenuType<?>, MenuType<WoodFurnaceMenu>> WOOD_FURNACE_MENU = MENUS.register("wood_furnace_menu", () -> new MenuType<>(WoodFurnaceMenu::new, FeatureFlags.DEFAULT_FLAGS));


    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
