package net.swan.quantumstuff.effect;

import net.swan.quantumstuff.QuantumStuff;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, QuantumStuff.MOD_ID);

    public static final RegistryObject<MobEffect> INVINCIBILITY_EFFECT = MOB_EFFECTS.register("invincibility",
            () -> new InvincibilityEffect(MobEffectCategory.BENEFICIAL, 0x7DF9FF));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
