package com.xiaostudios.theforgemodtwo.item;

import com.xiaostudios.theforgemodtwo.TheForgeModTwo;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import oshi.hardware.common.AbstractUsbDevice;

public class ModItems {
    //this is a list of our items and it's going to be under our MOD_ID "theforgemodtwo"
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheForgeModTwo.MOD_ID);

    //this is an item sceantine
    public static final RegistryObject<Item> SCEANTINE_INGOT = ITEMS.register("sceantine_ingot",
            () -> new Item(new Item.Properties()));

    //further sceantine items
    public static final RegistryObject<Item> SCEANTINE_NUGGET = ITEMS.register("sceantine_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCEANTINE_PAPER = ITEMS.register("sceantine_paper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WRENCH = ITEMS.register("wrench",
            () -> new Item(new Item.Properties()));

    //this is actually registering that to forge
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
