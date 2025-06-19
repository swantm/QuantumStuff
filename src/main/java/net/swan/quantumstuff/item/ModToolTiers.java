package net.swan.quantumstuff.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.swan.quantumstuff.util.ModTags;

public class ModToolTiers {
    public static final Tier QUANTUM = new ForgeTier(
            9999,                     // maxUses
            100,                      // miningSpeed
            10f,                      // attackDamageBonus
            15,                       // enchantability
            ModTags.Blocks.NEEDS_QUANTUM_TOOL,
            () -> Ingredient.of(ModItems.QUANTUMINGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_QUANTUM_TOOL
    );
}
