package com.neofast.hero_aesthetics.block.custom;

import com.neofast.hero_aesthetics.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CherryLeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class WoodSets {
    public final RegistryObject<Block> log;
    public final RegistryObject<Block> wood;
    public final RegistryObject<Block> strippedLog;
    public final RegistryObject<Block> strippedWood;
    public final RegistryObject<Block> planks;
    public final RegistryObject<Block> leaves;
    public final RegistryObject<Block> sapling;

    public WoodSets(
            String name,
            Supplier<AbstractTreeGrower> treeGrower
    ) {
        log = ModBlocks.registerBlock(name + "_log",
                () -> new ModFlammableRotatedPillarBlock(
                        BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

        wood = ModBlocks.registerBlock(name + "_wood",
                () -> new ModFlammableRotatedPillarBlock(
                        BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

        strippedLog = ModBlocks.registerBlock("stripped_" + name + "_log",
                () -> new ModFlammableRotatedPillarBlock(
                        BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

        strippedWood = ModBlocks.registerBlock("stripped_" + name + "_wood",
                () -> new ModFlammableRotatedPillarBlock(
                        BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

        planks = ModBlocks.registerBlock(name + "_planks",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

        leaves = ModBlocks.registerBlock(name + "_leaves",
                () -> new CherryLeavesBlock(
                        BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

        sapling = ModBlocks.registerBlock(name + "_sapling",
                () -> new SaplingBlock(treeGrower.get(),
                        BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    }
    public void addToCreativeTab(CreativeModeTab.Output output) {
        output.accept(wood.get());
        output.accept(log.get());

        output.accept(strippedLog.get());
        output.accept(strippedWood.get());

        output.accept(planks.get());
        output.accept(leaves.get());
        output.accept(sapling.get());
    }
}
