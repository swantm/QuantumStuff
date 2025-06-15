package net.swan.quantumstuff.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swan.quantumstuff.QuantumStuff;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, QuantumStuff.MOD_ID);

    public static final RegistryObject<Item> QUANTUMINGOT = ITEMS.register("quantumingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUANTUMROD = ITEMS.register("quantumrod",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
