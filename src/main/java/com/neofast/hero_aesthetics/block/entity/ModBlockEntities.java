package com.neofast.hero_aesthetics.block.entity;

import com.neofast.hero_aesthetics.HeroAes;
import com.neofast.hero_aesthetics.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HeroAes.MOD_ID);

    public static final RegistryObject<BlockEntityType<ItemDisplayBlockEntity>> ITEM_DISPLAY_BE =
            BLOCK_ENTITIES.register("item_display_be", () ->
                    BlockEntityType.Builder.of(ItemDisplayBlockEntity::new,
                            ModBlocks.ITEM_DISPLAY_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<DoorbellBlockEntity>> DOORBELL_BE =
            BLOCK_ENTITIES.register("doorbell_be", () ->
                    BlockEntityType.Builder.of(DoorbellBlockEntity::new,
                            ModBlocks.DOORBELL.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
