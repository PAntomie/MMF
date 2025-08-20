package io.github.PAntomie.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class SoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "moremorefun");
    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () ->
                SoundEvent.createVariableRangeEvent(new ResourceLocation("moremorefun", name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }



    public static final RegistryObject<SoundEvent> WDFMSL = registerSoundEvent("wdfmsl");
}