package com.xiaostudios.theforgemodtwo.block;

import com.xiaostudios.theforgemodtwo.TheForgeModTwo;
import com.xiaostudios.theforgemodtwo.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;
import java.util.function.Supplier;

public class ModBlocks {
    //the deferred register
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheForgeModTwo.MOD_ID);

    //The Blocks/list of blocks
    public static final RegistryObject<Block> SCEANTINE_ORE = registerBlock("sceantine_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .speedFactor(1f)
                    .sound(SoundType.STONE)
                    .strength(4f)
            ));

    public static final RegistryObject<Block> DEEPSLATE_SCEANTINE_ORE = registerBlock("deepslate_sceantine_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
            ));



    //helper methods to register the block as an item alongside registering it as a block
    //register the block
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    //registering the block item as a block texture/model in the inventory
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //the function for registering it to TheForgeModTwo.java
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
