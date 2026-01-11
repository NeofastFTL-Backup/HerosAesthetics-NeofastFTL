package com.neofast.hero_aesthetics.block.custom;

import com.neofast.hero_aesthetics.block.ModBlocks;

public enum ModWoodType {
    JAPANESE_MAPLE(ModBlocks.JAPANESE_MAPLE),
    SILVER_MAPLE(ModBlocks.SILVER_MAPLE),
    DOUGLAS_FIR(ModBlocks.DOUGLAS_FIR),
    REDWOOD(ModBlocks.REDWOOD),
    THUJA(ModBlocks.THUJA),
    BASSWOOD(ModBlocks.BASSWOOD),
    QUAKING_ASPEN(ModBlocks.QUAKING_ASPEN),
    PALM(ModBlocks.PALM),
    EBONY(ModBlocks.EBONY),
    TEAK(ModBlocks.TEAK),
    MAHOGANY(ModBlocks.MAHOGANY),
    CEDAR(ModBlocks.CEDAR),
    CYPRESS(ModBlocks.CYPRESS);

    public final WoodSets set;

    ModWoodType(WoodSets set) {
        this.set = set;
    }
}