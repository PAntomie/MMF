package io.github.PAntomie.mmf.items;

import io.github.PAntomie.mmf.MMF;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModArmors {
    static void init(IEventBus a) {ARMORS.register(a);}
    public static final DeferredRegister<Item> ARMORS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MMF.MODID);
}
