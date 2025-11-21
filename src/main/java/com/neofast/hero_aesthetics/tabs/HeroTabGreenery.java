package com.neofast.hero_aesthetics.tabs;

import com.neofast.hero_aesthetics.HeroAes;
import com.neofast.hero_aesthetics.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class HeroTabGreenery {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HeroAes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HERO_GREENERY_TAB = CREATIVE_MODE_TABS.register("hero_greenery_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CARNATION.get()))
                    .title(Component.translatable("creativetab.hero_greenery_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.BASSWOOD_LEAVES.get());
                        pOutput.accept(ModBlocks.DOU_FIR_LEAVES.get());
                        pOutput.accept(ModBlocks.JAP_MAP_LEAVES.get());
                        pOutput.accept(ModBlocks.REDWOOD_LEAVES.get());
                        pOutput.accept(ModBlocks.SIL_MAP_LEAVES.get());
                        pOutput.accept(ModBlocks.THUJA_LEAVES.get());
                        pOutput.accept(ModBlocks.BASSWOOD_SAPLING.get());
                        pOutput.accept(ModBlocks.DOU_FIR_SAPLING.get());
                        pOutput.accept(ModBlocks.JAP_MAP_SAPLING.get());
                        pOutput.accept(ModBlocks.REDWOOD_SAPLING.get());
                        pOutput.accept(ModBlocks.SIL_MAP_SAPLING.get());
                        pOutput.accept(ModBlocks.THUJA_SAPLING.get());
                        pOutput.accept(ModBlocks.GERBERAS.get());
                        pOutput.accept(ModBlocks.CARNATION.get());
                        pOutput.accept(ModBlocks.LILY.get());
                        pOutput.accept(ModBlocks.PETUNIA.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
