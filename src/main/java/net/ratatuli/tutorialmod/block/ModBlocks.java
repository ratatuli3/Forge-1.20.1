package net.ratatuli.tutorialmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ratatuli.tutorialmod.TutorialMod;
import net.ratatuli.tutorialmod.block.custom.KevinSoundBlock;
import net.ratatuli.tutorialmod.item.ModItems;
import net.ratatuli.tutorialmod.sound.ModSounds;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);


    public static final RegistryObject<Block> KEVIN_BLOCK = registerBlock("kevin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> KEVIN_ORE = registerBlock("kevin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE), UniformInt.of(3 ,7)));
    public static final RegistryObject<Block> DEEPSLATE_KEVIN_ORE = registerBlock("deepslate_kevin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE), UniformInt.of(4 ,9)));
    public static final RegistryObject<Block> NETHER_KEVIN_ORE = registerBlock("nether_kevin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK), UniformInt.of(4 ,9)));
    public static final RegistryObject<Block> KEVIN_SOUND_BLOCK = registerBlock("kevin_sound_block",
            () -> new KevinSoundBlock(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK).sound(ModSounds.KEVIN_SOUND_BLOCK_SOUNDS)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
