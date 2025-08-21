package io.github.PAntomie.mmf.items;

import io.github.PAntomie.mmf.MMF;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTools {
    static void init(IEventBus a) {TOOLS.register(a);}
    public static final DeferredRegister<Item> TOOLS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MMF.MODID);
}
