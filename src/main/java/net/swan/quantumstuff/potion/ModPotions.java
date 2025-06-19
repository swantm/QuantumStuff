package net.swan.quantumstuff.potion;

import net.swan.quantumstuff.QuantumStuff;
import net.swan.quantumstuff.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, QuantumStuff.MOD_ID);

    public static final RegistryObject<Potion> INVINCIBILITY_POTION = POTIONS.register("invincibility_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.INVINCIBILITY_EFFECT.getHolder().get(), 600, 0)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}