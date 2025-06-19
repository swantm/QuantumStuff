package net.swan.quantumstuff.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.swan.quantumstuff.QuantumStuff;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_QUANTUM_TOOL = createTag("needs_quantum_tool");
        public static final TagKey<Block> INCORRECT_FOR_QUANTUM_TOOL = createTag("incorrect_for_quantum_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(QuantumStuff.MOD_ID, name));
        }

    }

    public static class Items{

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(QuantumStuff.MOD_ID, name));
        }
    }
}
