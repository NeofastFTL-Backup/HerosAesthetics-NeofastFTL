package com.neofast.hero_aesthetics.block.custom;

import com.neofast.hero_aesthetics.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
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
    public final RegistryObject<Block> stairs;
    public final RegistryObject<Block> fence;
    public final RegistryObject<Block> fenceGate;
    public final RegistryObject<Block> pressurePlate;
    public final RegistryObject<Block> table;
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
                () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

        leaves = ModBlocks.registerBlock(name + "_leaves",
                () -> new ModFlammableLeavesBlock(
                        BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

        sapling = ModBlocks.registerBlock(name + "_sapling",
                () -> new SaplingBlock(treeGrower.get(),
                        BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

        stairs = ModBlocks.registerBlock(name + "_stairs",
                () -> new ModFlammableStairBlock(() -> planks.get().defaultBlockState(),
                        BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));

        fence = ModBlocks.registerBlock(name + "_fence",
                () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

        fenceGate = ModBlocks.registerBlock(name + "_fence_gate",
                () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));

        pressurePlate = ModBlocks.registerBlock(name + "_pressure_plate",
                () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                        BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
        table = ModBlocks.registerBlock(name + "_table",
                () -> new WoodenTable(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.5F).sound(SoundType.WOOD).ignitedByLava(), () -> BlockEntityType.CHEST));
    }

    public void addToCreativeTab(CreativeModeTab.Output output) {
        output.accept(wood.get());
        output.accept(log.get());

        output.accept(strippedLog.get());
        output.accept(strippedWood.get());

        output.accept(planks.get());
        output.accept(leaves.get());
        output.accept(sapling.get());

        output.accept(stairs.get());
        output.accept(fence.get());
        output.accept(fenceGate.get());
        output.accept(pressurePlate.get());

        output.accept(table.get());
    }
}
