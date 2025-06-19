package net.swan.quantumstuff;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.swan.quantumstuff.block.ModBlocks;
import net.swan.quantumstuff.effect.ModEffects;
import net.swan.quantumstuff.item.ModCreativeModeTabs;
import net.swan.quantumstuff.item.ModItems;
import net.swan.quantumstuff.potion.ModPotions;
import net.swan.quantumstuff.sound.ModSounds;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(QuantumStuff.MOD_ID)
public class QuantumStuff {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "quantumstuff";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();



    public QuantumStuff(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);
        ModSounds.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
         if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
             event.accept(ModItems.QUANTUMINGOT);
             event.accept(ModItems.QUANTUMROD);
             event.accept(ModItems.THOUSANDDOLLARWALLET);
             event.accept(ModItems.NOISECOIN);
         }

         if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
             event.accept(ModBlocks.QUANTUM_BLOCK);
             event.accept(ModBlocks.NETHER_STAR_BLOCK);
             event.accept(ModBlocks.COMPRESSED_DIAMOND_BLOCK);
         }

        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.QUANTUM_PICKAXE);
            event.accept(ModItems.QUANTUM_AXE);
            event.accept(ModItems.QUANTUM_SHOVEL);
            event.accept(ModItems.QUANTUM_HOE);
        }

        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.QUANTUM_SWORD);
            event.accept(ModItems.QUANTUM_HELMET);
            event.accept(ModItems.QUANTUM_CHESTPLATE);
            event.accept(ModItems.QUANTUM_LEGGINGS);
            event.accept(ModItems.QUANTUM_BOOTS);
            event.accept(ModItems.QUANTUM_BOW);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
