package com.neofast.hero_aesthetics.tabs;

import com.neofast.hero_aesthetics.HeroAes;
import com.neofast.hero_aesthetics.block.ModBlocks;
import com.neofast.hero_aesthetics.block.custom.ModWoodType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class HeroTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HeroAes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HERO_GREENERY_TAB = CREATIVE_MODE_TABS.register("hero_greenery_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CARNATION.get()))
                    .title(Component.translatable("creativetab.hero_greenery_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        for (ModWoodType type : ModWoodType.values()) {
                            pOutput.accept(type.set.sapling.get());
                            pOutput.accept(type.set.leaves.get());
                        }
                        pOutput.accept(ModBlocks.GERBERAS.get());
                        pOutput.accept(ModBlocks.LAVENDER.get());
                        pOutput.accept(ModBlocks.FOXGLOVE.get());
                        pOutput.accept(ModBlocks.CARNATION.get());
                        pOutput.accept(ModBlocks.LILY.get());
                        pOutput.accept(ModBlocks.PETUNIA.get());
                        pOutput.accept(ModBlocks.MARIGOLD.get());
                        pOutput.accept(ModBlocks.BEGONIA.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> HERO_TIMBERS_TAB = CREATIVE_MODE_TABS.register("hero_timbers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.JAPANESE_MAPLE.log.get()))
                    .title(Component.translatable("creativetab.hero_timbers_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        for (ModWoodType type : ModWoodType.values()) {
                            pOutput.accept(type.set.log.get());
                            pOutput.accept(type.set.wood.get());
                            pOutput.accept(type.set.strippedLog.get());
                            pOutput.accept(type.set.strippedWood.get());
                            pOutput.accept(type.set.planks.get());
                            pOutput.accept(type.set.stairs.get());
                            pOutput.accept(type.set.fence.get());
                            pOutput.accept(type.set.fenceGate.get());
                            pOutput.accept(type.set.pressurePlate.get());
                            pOutput.accept(type.set.table.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}