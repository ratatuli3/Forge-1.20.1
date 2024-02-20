package net.ratatuli.tutorialmod.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ratatuli.tutorialmod.TutorialMod;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TutorialMod.MOD_ID);

    public static final RegistryObject<SoundEvent> KEVIN_DETECTOR_FOUND_ORE = registerSoundEvents("kevin_detector_found_ore");

    public static final RegistryObject<SoundEvent> KEVIN_SOUND_BLOCK_BREAK = registerSoundEvents("kevin_sound_block_break");
    public static final RegistryObject<SoundEvent> KEVIN_SOUND_BLOCK_STEP = registerSoundEvents("kevin_sound_block_step");
    public static final RegistryObject<SoundEvent> KEVIN_SOUND_BLOCK_FALL = registerSoundEvents("kevin_sound_block_fall");
    public static final RegistryObject<SoundEvent> KEVIN_SOUND_BLOCK_PLACE = registerSoundEvents("kevin_sound_block_place");
    public static final RegistryObject<SoundEvent> KEVIN_SOUND_BLOCK_HIT = registerSoundEvents("kevin_sound_block_hit");
    public static final RegistryObject<SoundEvent> KEVIN_SOUND_BLOCK_USE = registerSoundEvents("kevin_sound_block_use");

    public static final ForgeSoundType KEVIN_SOUND_BLOCK_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.KEVIN_SOUND_BLOCK_BREAK, ModSounds.KEVIN_SOUND_BLOCK_STEP, ModSounds.KEVIN_SOUND_BLOCK_PLACE, ModSounds.KEVIN_SOUND_BLOCK_HIT,
            ModSounds.KEVIN_SOUND_BLOCK_FALL);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(TutorialMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
