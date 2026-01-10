/*     */ package com.neofast.hero_aesthetics.block;
/*     */ import java.util.function.Supplier;
/*     */ import com.neofast.hero_aesthetics.block.custom.ModFlammableRotatedPillarBlock;
import com.neofast.hero_aesthetics.block.custom.ModWoodType;
import com.neofast.hero_aesthetics.block.custom.WoodSets;
import com.neofast.hero_aesthetics.item.ModItems;
import com.neofast.hero_aesthetics.worldgen.tree.*;
import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.block.*;
/*     */ import net.minecraft.world.level.block.grower.AbstractTreeGrower;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
/*     */ 
/*     */ public class ModBlocks {
          public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "hero_aesthetics");
/*     */   
/*  29 */   public static final RegistryObject<Block> CARNATION = registerBlock("carnation", () ->     new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
/*  32 */   public static final RegistryObject<Block> POTTED_CARNATION = BLOCKS.register("potted_carnation", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CARNATION, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
/*  36 */   public static final RegistryObject<Block> LILY = registerBlock("lily", () ->     new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
/*  39 */   public static final RegistryObject<Block> POTTED_LILY = BLOCKS.register("potted_lily", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.LILY, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
/*  43 */   public static final RegistryObject<Block> PETUNIA = registerBlock("petunia", () ->     new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
/*  46 */   public static final RegistryObject<Block> POTTED_PETUNIA = BLOCKS.register("potted_petunia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), PETUNIA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
/*  51 */   public static final RegistryObject<Block> GERBERAS = registerBlock("gerberas", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion().noCollission()));
            public static final RegistryObject<Block> POTTED_GERBERAS = BLOCKS.register("potted_gerberas", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), GERBERAS, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final WoodSets JAP_MAP =
            new WoodSets("jap_map", CustomTreeGrowers.JapMap::new);

    public static final WoodSets SIL_MAP =
            new WoodSets("sil_map", CustomTreeGrowers.SilMap::new);

    public static final WoodSets DOU_FIR =
            new WoodSets("dou_fir", CustomTreeGrowers.DouFir::new);

    public static final WoodSets REDWOOD =
            new WoodSets("redwood", CustomTreeGrowers.Redwood::new);

    public static final WoodSets THUJA =
            new WoodSets("thuja", CustomTreeGrowers.Thuja::new);

    public static final WoodSets BASSWOOD =
            new WoodSets("basswood", CustomTreeGrowers.Basswood::new);

/*     */   public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
/* 353 */     RegistryObject<T> toReturn = BLOCKS.register(name, block);
/* 354 */     registerBlockItem(name, toReturn);
/* 355 */     return toReturn;
/*     */   }
/*     */   
/*     */   private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
/* 359 */     return ModItems.ITEMS.register(name, () -> new BlockItem((Block)block.get(), new Item.Properties()));
/*     */   }
/*     */   
/*     */   public static void register(IEventBus eventBus) {
/* 363 */     BLOCKS.register(eventBus);
/*     */   }
/*     */ }