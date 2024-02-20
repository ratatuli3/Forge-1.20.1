package net.ratatuli.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ratatuli.tutorialmod.TutorialMod;
import net.ratatuli.tutorialmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MOD_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KEVIN.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KEVIN.get());
                        pOutput.accept(ModItems.RAW_KEVIN.get());
                        pOutput.accept(ModItems.KEVIN_DETECTOR.get());
                        pOutput.accept(ModItems.KEVIN_FOOD.get());
                        pOutput.accept(ModItems.KEVIN_COAL.get());
                        pOutput.accept(ModBlocks.KEVIN_BLOCK.get());
                        pOutput.accept(ModBlocks.KEVIN_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_KEVIN_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_KEVIN_ORE.get());
                        pOutput.accept(ModBlocks.KEVIN_SOUND_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
