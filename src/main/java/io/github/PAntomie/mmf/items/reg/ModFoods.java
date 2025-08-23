package io.github.PAntomie.mmf.items.reg;

import io.github.PAntomie.mmf.MMF;
import io.github.PAntomie.mmf.items.lgc.SPFoods.QJFItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFoods {
    public static void init(IEventBus a) {FOODS.register(a);}
    public static final DeferredRegister<Item> FOODS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MMF.MODID);
    public static final RegistryObject<Item> EXAMPLE_ITEM = FOODS.register("example_item", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .alwaysEat()
                    .nutrition(1)
                    .saturationMod(2f)
                    .build())));
    public static final RegistryObject<Item> QJF = FOODS.register("qjf", QJFItem::new);
}
