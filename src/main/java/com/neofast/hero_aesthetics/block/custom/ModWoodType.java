package com.neofast.hero_aesthetics.block.custom;

import com.neofast.hero_aesthetics.block.ModBlocks;
import com.neofast.hero_aesthetics.worldgen.tree.*;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;

import java.util.function.Supplier;

public enum ModWoodType {
    JAP_MAP(ModBlocks.JAP_MAP),
    SIL_MAP(ModBlocks.SIL_MAP),
    DOU_FIR(ModBlocks.DOU_FIR),
    REDWOOD(ModBlocks.REDWOOD),
    THUJA(ModBlocks.THUJA),
    BASSWOOD(ModBlocks.BASSWOOD);

    public final WoodSets set;

    ModWoodType(WoodSets set) {
        this.set = set;
    }
}