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

public class HeroTabTimbers {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HeroAes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HERO_GREENERY_TAB = CREATIVE_MODE_TABS.register("hero_timbers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CARNATION.get()))
                    .title(Component.translatable("creativetab.hero_timbers_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.BASSWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.DOU_FIR_WOOD.get());
                        pOutput.accept(ModBlocks.JAP_MAP_WOOD.get());
                        pOutput.accept(ModBlocks.REDWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.SIL_MAP_WOOD.get());
                        pOutput.accept(ModBlocks.THUJA_WOOD.get());
                        pOutput.accept(ModBlocks.BASSWOOD_LOG.get());
                        pOutput.accept(ModBlocks.DOU_FIR_LOG.get());
                        pOutput.accept(ModBlocks.JAP_MAP_LOG.get());
                        pOutput.accept(ModBlocks.REDWOOD_LOG.get());
                        pOutput.accept(ModBlocks.SIL_MAP_LOG.get());
                        pOutput.accept(ModBlocks.THUJA_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BASSWOOD_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_DOU_FIR_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_JAP_MAP_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_REDWOOD_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_SIL_MAP_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_THUJA_LOG.get());
                        pOutput.accept(ModBlocks.BASSWOOD_PLANKS.get());
                        pOutput.accept(ModBlocks.DOU_FIR_PLANKS.get());
                        pOutput.accept(ModBlocks.JAP_MAP_PLANKS.get());
                        pOutput.accept(ModBlocks.REDWOOD_PLANKS.get());
                        pOutput.accept(ModBlocks.SIL_MAP_PLANKS.get());
                        pOutput.accept(ModBlocks.THUJA_PLANKS.get());
                        pOutput.accept(ModBlocks.STRIPPED_BASSWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_DOU_FIR_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_JAP_MAP_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_REDWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_SIL_MAP_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_THUJA_WOOD.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
