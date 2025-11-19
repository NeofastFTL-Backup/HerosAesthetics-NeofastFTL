/*     */ package com.neofast.hero_aesthetics.block;
/*     */ import java.util.function.Supplier;
/*     */ import com.neofast.hero_aesthetics.block.custom.ModFlammableRotatedPillarBlock;
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
/*  26 */   public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "heroaes");
/*     */ 
/*     */   
/*  29 */   public static final RegistryObject<Block> CARNATION = registerBlock("carnation", () ->     new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
/*     */ 
/*     */   
/*  32 */   public static final RegistryObject<Block> POTTED_CARNATION = BLOCKS.register("potted_carnation", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CARNATION, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
/*     */ 
/*     */ 
/*     */   
/*  36 */   public static final RegistryObject<Block> LILY = registerBlock("lily", () ->     new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
/*     */ 
/*     */   
/*  39 */   public static final RegistryObject<Block> POTTED_LILY = BLOCKS.register("potted_lily", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CARNATION, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
/*     */ 
/*     */ 
/*     */   
/*  43 */   public static final RegistryObject<Block> PETUNIA = registerBlock("petunia", () ->     new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
/*     */ 
/*     */   
/*  46 */   public static final RegistryObject<Block> POTTED_PETUNIA = BLOCKS.register("potted_petunia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), PETUNIA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   public static final RegistryObject<Block> GERBERAS = registerBlock("gerberas", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion().noCollission()));
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final RegistryObject<Block> JAP_MAP_LOG = registerBlock("jap_map_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3.0F)));
/*     */   
/*  58 */   public static final RegistryObject<Block> SIL_MAP_LOG = registerBlock("sil_map_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3.0F)));
/*     */   
/*  60 */   public static final RegistryObject<Block> DOU_FIR_LOG = registerBlock("dou_fir_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3.0F)));
/*     */   
/*  62 */   public static final RegistryObject<Block> REDWOOD_LOG = registerBlock("redwood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3.0F)));
/*     */   
/*  64 */   public static final RegistryObject<Block> THUJA_LOG = registerBlock("thuja_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3.0F)));
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   public static final RegistryObject<Block> JAP_MAP_WOOD = registerBlock("jap_map_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3.0F)));
/*     */   
/*  71 */   public static final RegistryObject<Block> SIL_MAP_WOOD = registerBlock("sil_map_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3.0F)));
/*     */   
/*  73 */   public static final RegistryObject<Block> DOU_FIR_WOOD = registerBlock("dou_fir_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3.0F)));
/*     */   
/*  75 */   public static final RegistryObject<Block> REDWOOD_WOOD = registerBlock("redwood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3.0F)));
/*     */   
/*  77 */   public static final RegistryObject<Block> THUJA_WOOD = registerBlock("thuja_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3.0F)));
/*     */ 
/*     */ 
/*     */   
/*  81 */   public static final RegistryObject<Block> STRIPPED_JAP_MAP_LOG = registerBlock("stripped_jap_map_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3.0F)));
/*     */   
/*  83 */   public static final RegistryObject<Block> STRIPPED_SIL_MAP_LOG = registerBlock("stripped_sil_map_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3.0F)));
/*     */   
/*  85 */   public static final RegistryObject<Block> STRIPPED_DOU_FIR_LOG = registerBlock("stripped_dou_fir_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3.0F)));
/*     */   
/*  87 */   public static final RegistryObject<Block> STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3.0F)));
/*     */   
/*  89 */   public static final RegistryObject<Block> STRIPPED_THUJA_LOG = registerBlock("stripped_thuja_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3.0F)));
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  94 */   public static final RegistryObject<Block> STRIPPED_JAP_MAP_WOOD = registerBlock("stripped_jap_map_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3.0F)));
/*     */   
/*  96 */   public static final RegistryObject<Block> STRIPPED_SIL_MAP_WOOD = registerBlock("stripped_sil_map_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3.0F)));
/*     */   
/*  98 */   public static final RegistryObject<Block> STRIPPED_DOU_FIR_WOOD = registerBlock("stripped_dou_fir_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3.0F)));
/*     */   
/* 100 */   public static final RegistryObject<Block> STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3.0F)));
/*     */   
/* 102 */   public static final RegistryObject<Block> STRIPPED_THUJA_WOOD = registerBlock("stripped_thuja_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3.0F)));
/*     */ 
/*     */ 
/*     */   
/* 106 */   public static final RegistryObject<Block> JAP_MAP_SAPLING = registerBlock("jap_map_sapling", () -> new SaplingBlock(new JapMapTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
/*     */   
/* 108 */   public static final RegistryObject<Block> SIL_MAP_SAPLING = registerBlock("sil_map_sapling", () -> new SaplingBlock(new SilMapTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
/*     */   
/* 110 */   public static final RegistryObject<Block> DOU_FIR_SAPLING = registerBlock("dou_fir_sapling", () -> new SaplingBlock(new DouFirTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
/*     */   
/* 112 */   public static final RegistryObject<Block> REDWOOD_SAPLING = registerBlock("redwood_sapling", () -> new SaplingBlock(new RedwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
/*     */   
/* 114 */   public static final RegistryObject<Block> THUJA_SAPLING = registerBlock("thuja_sapling", () -> new SaplingBlock(new TujaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 119 */   public static final RegistryObject<Block> JAP_MAP_PLANKS = registerBlock("jap_map_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 123 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 128 */           return 20;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 133 */           return 5;
/*     */         }
/*     */       });
/* 136 */   public static final RegistryObject<Block> SIL_MAP_PLANKS = registerBlock("sil_map_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 140 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 145 */           return 20;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 150 */           return 5;
/*     */         }
/*     */       });
/*     */   
/* 154 */   public static final RegistryObject<Block> DOU_FIR_PLANKS = registerBlock("dou_fir_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 158 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 163 */           return 20;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 168 */           return 5;
/*     */         }
/*     */       });
/* 171 */   public static final RegistryObject<Block> REDWOOD_PLANKS = registerBlock("redwood_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 175 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 180 */           return 20;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 185 */           return 5;
/*     */         }
/*     */       });
/* 188 */   public static final RegistryObject<Block> THUJA_PLANKS = registerBlock("thuja_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 192 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 197 */           return 20;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 202 */           return 5;
/*     */         }
/*     */       });
/*     */ 
/*     */   
/* 207 */   public static final RegistryObject<Block> JAP_MAP_LEAVES = registerBlock("jap_map_leaves", () -> new CherryLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 211 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 216 */           return 60;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 221 */           return 30;
/*     */         }
/*     */       });
/* 224 */   public static final RegistryObject<Block> SIL_MAP_LEAVES = registerBlock("sil_map_leaves", () -> new CherryLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 228 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 233 */           return 60;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 238 */           return 30;
/*     */         }
/*     */       });
/*     */   
/* 242 */   public static final RegistryObject<Block> DOU_FIR_LEAVES = registerBlock("dou_fir_leaves", () -> new CherryLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 246 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 251 */           return 60;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 256 */           return 30;
/*     */         }
/*     */       });
/*     */   
/* 260 */   public static final RegistryObject<Block> REDWOOD_LEAVES = registerBlock("redwood_leaves", () -> new CherryLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 264 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 269 */           return 60;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 274 */           return 30;
/*     */         }
/*     */       });
/*     */   
/* 278 */   public static final RegistryObject<Block> THUJA_LEAVES = registerBlock("thuja_leaves", () -> new CherryLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 282 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 287 */           return 60;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 292 */           return 30;
/*     */         }
/*     */       });
/*     */ 
/*     */   
/* 297 */   public static final RegistryObject<Block> BASSWOOD_LOG = registerBlock("basswood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3.0F)));
/*     */   
/* 299 */   public static final RegistryObject<Block> STRIPPED_BASSWOOD_LOG = registerBlock("stripped_basswood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3.0F)));
/*     */ 
/*     */ 
/*     */   
/* 303 */   public static final RegistryObject<Block> BASSWOOD_WOOD = registerBlock("basswood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3.0F)));
/*     */   
/* 305 */   public static final RegistryObject<Block> STRIPPED_BASSWOOD_WOOD = registerBlock("stripped_basswood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3.0F)));
/*     */ 
/*     */ 
/*     */   
/* 309 */   public static final RegistryObject<Block> BASSWOOD_SAPLING = registerBlock("basswood_sapling", () -> new SaplingBlock(new BasswoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
/*     */ 
/*     */ 
/*     */   
/* 313 */   public static final RegistryObject<Block> BASSWOOD_PLANKS = registerBlock("basswood_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 317 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 322 */           return 20;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 327 */           return 5;
/*     */         }
/*     */       });
/*     */ 
/*     */   
/* 332 */   public static final RegistryObject<Block> BASSWOOD_LEAVES = registerBlock("basswood_leaves", () -> new CherryLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES))
/*     */       {
/*     */         public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
/*     */         {
/* 336 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 341 */           return 60;
/*     */         }
/*     */ 
/*     */         
/*     */         public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
/* 346 */           return 30;
/*     */         }
/*     */       });
/*     */ 
/*     */ 
/*     */   
/*     */   private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
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


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\necopyast\hero_aesthetics\block\ModBlocks.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */