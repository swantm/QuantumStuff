package net.swan.quantumstuff.event;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.swan.quantumstuff.QuantumStuff;
import net.swan.quantumstuff.potion.ModPotions;
import net.swan.quantumstuff.item.ModItems;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.event.brewing.BrewingRecipeRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(modid = QuantumStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)

public class ModEvents {
    @SubscribeEvent
    public static void onBrewingRecipeRegister(BrewingRecipeRegisterEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();

        builder.addMix(Potions.AWKWARD, ModItems.QUANTUMINGOT.get(), ModPotions.INVINCIBILITY_POTION.getHolder().get());
    }
}
