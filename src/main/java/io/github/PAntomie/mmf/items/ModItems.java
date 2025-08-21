package io.github.PAntomie.mmf.items;

import io.github.PAntomie.mmf.MMF;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static void init(IEventBus a) {
        ITEMS.register(a);
        ModFoods.init(a);
        ModTools.init(a);
        ModArmors.init(a);
    };
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MMF.MODID);
}