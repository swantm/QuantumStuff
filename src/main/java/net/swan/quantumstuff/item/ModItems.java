package net.swan.quantumstuff.item;

import net.minecraft.ChatFormatting;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swan.quantumstuff.QuantumStuff;
import net.minecraft.network.chat.Component;
import net.swan.quantumstuff.item.custom.ModArmorItem;
import net.swan.quantumstuff.item.custom.QuantumBowItem;
import net.swan.quantumstuff.sound.ModSounds;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, QuantumStuff.MOD_ID);

    public static final RegistryObject<Item> QUANTUMINGOT = ITEMS.register("quantumingot",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> QUANTUMROD = ITEMS.register("quantumrod",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));


    public static final RegistryObject<Item> THOUSANDDOLLARWALLET = ITEMS.register("thousanddollarwallet",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
                    tooltip.add(Component.translatable("tooltip.quantumstuff.thousanddollarwallet"));
                    super.appendHoverText(stack, context, tooltip, flag);
                }
            });

    public static final RegistryObject<Item> NOISECOIN = ITEMS.register("noisecoin",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
                    tooltip.add(Component.translatable("tooltip.quantumstuff.noisecoin"));
                    super.appendHoverText(stack, context, tooltip, flag);
                }
            });

    public static final RegistryObject<Item> QUANTUM_SWORD = ITEMS.register("quantum_sword",
            () -> new SwordItem(ModToolTiers.QUANTUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.QUANTUM, 5, -2.4f))
                    .fireResistant()
                    .rarity(Rarity.EPIC)) {

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
                    tooltip.add(Component.translatable("tooltip.quantumstuff.quantum_sword")
                            .withStyle(ChatFormatting.DARK_PURPLE, ChatFormatting.ITALIC));
                    super.appendHoverText(stack, context, tooltip, flag);
                }
            });


    public static final RegistryObject<Item> QUANTUM_PICKAXE = ITEMS.register("quantum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.QUANTUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.QUANTUM, 1, -2.8f))
                    .fireResistant()
                    .rarity(Rarity.EPIC)) {

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
                    tooltip.add(Component.translatable("tooltip.quantumstuff.quantum_pickaxe")
                            .withStyle(ChatFormatting.DARK_PURPLE, ChatFormatting.ITALIC));
                    super.appendHoverText(stack, context, tooltip, flag);
                }
            });


    public static final RegistryObject<Item> QUANTUM_AXE = ITEMS.register("quantum_axe",
            () -> new AxeItem(ModToolTiers.QUANTUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.QUANTUM, 9, -3.2f))
                    .fireResistant()
                    .rarity(Rarity.EPIC)) {

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
                    tooltip.add(Component.translatable("tooltip.quantumstuff.quantum_axe")
                            .withStyle(ChatFormatting.DARK_PURPLE, ChatFormatting.ITALIC));
                    super.appendHoverText(stack, context, tooltip, flag);
                }
            });

    public static final RegistryObject<Item> QUANTUM_SHOVEL = ITEMS.register("quantum_shovel",
            () -> new ShovelItem(ModToolTiers.QUANTUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.QUANTUM, 1f, -3.0f))
                    .fireResistant()
                    .rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> QUANTUM_HOE = ITEMS.register("quantum_hoe",
            () -> new HoeItem(ModToolTiers.QUANTUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.QUANTUM, 0, -3.0f))
                    .fireResistant()
                    .rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> QUANTUM_HELMET = ITEMS.register("quantum_helmet",
            () -> new ModArmorItem(ModArmorMaterials.QUANTUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(909))
                            .fireResistant()
                    .rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> QUANTUM_CHESTPLATE = ITEMS.register("quantum_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.QUANTUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(625))
                            .fireResistant()
                            .rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> QUANTUM_LEGGINGS = ITEMS.register("quantum_leggings",
            () -> new ModArmorItem(ModArmorMaterials.QUANTUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(666))
                            .fireResistant()
                            .rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> QUANTUM_BOOTS = ITEMS.register("quantum_boots",
            () -> new ModArmorItem(ModArmorMaterials.QUANTUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(769))
                            .fireResistant()
                            .rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> QUANTUM_BOW = ITEMS.register("quantum_bow",
            () -> new QuantumBowItem(new Item.Properties()
                    .durability(9999)
                    .fireResistant()
                    .rarity(Rarity.EPIC)
            ));

    public static final RegistryObject<Item> SILENT_MUSIC_DISC = ITEMS.register("silent_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.AKTAR_KHAN_KEY).stacksTo(1)));


    public static final RegistryObject<Item> EMERALD_CARROT = ITEMS.register("emerald_carrot",
            () -> new Item(new Item.Properties().food(ModFoodProperties.EMERALD_CARROT)));

    public static final RegistryObject<Item> QUANTUM_APPLE = ITEMS.register("quantum_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.QUANTUM_APPLE)
                    .rarity(Rarity.EPIC)
                    .fireResistant()
            ));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
