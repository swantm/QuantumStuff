package net.swan.quantumstuff.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.swan.quantumstuff.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.swan.quantumstuff.QuantumStuff;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;




public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, QuantumStuff.MOD_ID);

            public static final RegistryObject<Block> QUANTUM_BLOCK = registerBlock("quantum_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(4f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> NETHER_STAR_BLOCK = registerBlock("nether_star_block",
                      () -> new Block(BlockBehaviour.Properties.of()
                              .strength(3f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK = registerBlock("compressed_diamond_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

            private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
                RegistryObject<T> toReturn = BLOCKS.register(name, block);
                registerBlockItem(name, toReturn);
                return toReturn;
            }

            private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
               ModItems.ITEMS.register(name, () -> new BlockItem (block.get(), new Item.Properties()));
            }

            public static void register(IEventBus eventBus) {
              BLOCKS.register(eventBus);
            }
}
