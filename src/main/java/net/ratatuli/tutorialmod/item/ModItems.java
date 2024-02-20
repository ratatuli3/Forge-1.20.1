package net.ratatuli.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ratatuli.tutorialmod.TutorialMod;
import net.ratatuli.tutorialmod.item.custom.FuelItem;
import net.ratatuli.tutorialmod.item.custom.KevinDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> KEVIN = ITEMS.register("kevin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_KEVIN = ITEMS.register("raw_kevin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEVIN_COAL = ITEMS.register("kevin_coal",
            () -> new FuelItem(new Item.Properties(), 400));
    public static final RegistryObject<Item> KEVIN_FOOD = ITEMS.register("kevin_food",
            () -> new Item(new Item.Properties().food(ModFoods.KEVIN_FOOD)));
    public static final RegistryObject<Item> KEVIN_DETECTOR = ITEMS.register("kevin_detector",
            () -> new KevinDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
