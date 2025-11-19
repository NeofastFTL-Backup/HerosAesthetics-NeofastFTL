/*     */ package com.neofast.hero_aesthetics;
/*     */ 
/*     */ import com.mojang.logging.LogUtils;
/*     */ import com.neofast.hero_aesthetics.block.ModBlocks;
/*     */ import com.neofast.hero_aesthetics.item.ModItems;
/*     */ import com.neofast.hero_aesthetics.worldgen.biome.ModdedTerrablender;
/*     */ import com.neofast.hero_aesthetics.worldgen.biome.surface.ModdedSurfaceRules;
/*     */ import java.util.function.Supplier;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.world.item.CreativeModeTabs;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.FlowerPotBlock;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
/*     */ import net.minecraftforge.event.server.ServerStartingEvent;
/*     */ import net.minecraftforge.eventbus.api.IEventBus;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
/*     */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*     */ import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*     */ import org.slf4j.Logger;
/*     */ import terrablender.api.SurfaceRuleManager;
/*     */ 
/*     */ @Mod("heroaes")
/*     */ public class HeroAes
/*     */ {
/*     */   public static final String MOD_ID = "heroaes";
/*  33 */   public static final Logger LOGGER = LogUtils.getLogger();
/*     */   
/*     */   public HeroAes() {
/*  36 */     IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
/*     */     
/*  38 */     modEventBus.addListener(this::commonSetup);
/*  39 */     ModItems.register(modEventBus);
/*  40 */     ModBlocks.register(modEventBus);
/*  41 */     ModdedTerrablender.registerBiomes();
/*     */     
/*  43 */     MinecraftForge.EVENT_BUS.register(this);
/*  44 */     modEventBus.addListener(this::addCreative);
/*     */   }
/*     */   
/*     */   private void commonSetup(FMLCommonSetupEvent event) {
/*  48 */     event.enqueueWork(() -> {
/*     */           ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CARNATION.getId(), ModBlocks.POTTED_CARNATION);
/*     */           ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LILY.getId(), ModBlocks.POTTED_LILY);
/*     */           ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PETUNIA.getId(), ModBlocks.POTTED_PETUNIA);
/*     */           SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, "heroaes", ModdedSurfaceRules.makeRules());
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private void addCreative(BuildCreativeModeTabContentsEvent event) {
/*  58 */     if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
/*     */       
/*  60 */       event.accept(ModBlocks.JAP_MAP_LOG);
/*  61 */       event.accept(ModBlocks.SIL_MAP_LOG);
/*  62 */       event.accept(ModBlocks.DOU_FIR_LOG);
/*  63 */       event.accept(ModBlocks.REDWOOD_LOG);
/*  64 */       event.accept(ModBlocks.THUJA_LOG);
/*     */       
/*  66 */       event.accept(ModBlocks.STRIPPED_JAP_MAP_LOG);
/*  67 */       event.accept(ModBlocks.STRIPPED_SIL_MAP_LOG);
/*  68 */       event.accept(ModBlocks.STRIPPED_DOU_FIR_LOG);
/*  69 */       event.accept(ModBlocks.STRIPPED_REDWOOD_LOG);
/*  70 */       event.accept(ModBlocks.STRIPPED_THUJA_LOG);
/*     */       
/*  72 */       event.accept(ModBlocks.JAP_MAP_WOOD);
/*  73 */       event.accept(ModBlocks.SIL_MAP_WOOD);
/*  74 */       event.accept(ModBlocks.DOU_FIR_WOOD);
/*  75 */       event.accept(ModBlocks.REDWOOD_WOOD);
/*  76 */       event.accept(ModBlocks.THUJA_WOOD);
/*     */       
/*  78 */       event.accept(ModBlocks.CARNATION);
/*  79 */       event.accept(ModBlocks.LILY);
/*  80 */       event.accept(ModBlocks.PETUNIA);
/*     */       
/*  82 */       event.accept(ModBlocks.GERBERAS);
/*     */       
/*  84 */       event.accept(ModBlocks.STRIPPED_JAP_MAP_WOOD);
/*  85 */       event.accept(ModBlocks.STRIPPED_SIL_MAP_WOOD);
/*  86 */       event.accept(ModBlocks.STRIPPED_DOU_FIR_WOOD);
/*  87 */       event.accept(ModBlocks.STRIPPED_REDWOOD_WOOD);
/*  88 */       event.accept(ModBlocks.STRIPPED_THUJA_WOOD);
/*     */       
/*  90 */       event.accept(ModBlocks.JAP_MAP_PLANKS);
/*  91 */       event.accept(ModBlocks.SIL_MAP_PLANKS);
/*  92 */       event.accept(ModBlocks.DOU_FIR_PLANKS);
/*  93 */       event.accept(ModBlocks.REDWOOD_PLANKS);
/*  94 */       event.accept(ModBlocks.THUJA_PLANKS);
/*     */       
/*  96 */       event.accept(ModBlocks.JAP_MAP_LEAVES);
/*  97 */       event.accept(ModBlocks.SIL_MAP_LEAVES);
/*  98 */       event.accept(ModBlocks.DOU_FIR_LEAVES);
/*  99 */       event.accept(ModBlocks.REDWOOD_LEAVES);
/* 100 */       event.accept(ModBlocks.THUJA_LEAVES);
/*     */       
/* 102 */       event.accept(ModBlocks.JAP_MAP_SAPLING);
/* 103 */       event.accept(ModBlocks.SIL_MAP_SAPLING);
/* 104 */       event.accept(ModBlocks.DOU_FIR_SAPLING);
/* 105 */       event.accept(ModBlocks.REDWOOD_SAPLING);
/* 106 */       event.accept(ModBlocks.THUJA_SAPLING);
/*     */       
/* 108 */       event.accept(ModBlocks.BASSWOOD_LOG);
/* 109 */       event.accept(ModBlocks.STRIPPED_BASSWOOD_LOG);
/* 110 */       event.accept(ModBlocks.BASSWOOD_WOOD);
/* 111 */       event.accept(ModBlocks.STRIPPED_BASSWOOD_WOOD);
/* 112 */       event.accept(ModBlocks.BASSWOOD_PLANKS);
/* 113 */       event.accept(ModBlocks.BASSWOOD_LEAVES);
/* 114 */       event.accept(ModBlocks.BASSWOOD_SAPLING);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onServerStarting(ServerStartingEvent event) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private static void setRenderLayer(Supplier<? extends Block> supplier, RenderType type) {
/* 126 */     ItemBlockRenderTypes.setRenderLayer(supplier.get(), type);
/*     */   }
/*     */ 
/*     */   
/*     */   @EventBusSubscriber(modid = "heroaes", bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*     */   public static class ClientModEvents
/*     */   {
/*     */     @SubscribeEvent
/*     */     public static void onClientSetup(FMLClientSetupEvent event) {
/* 135 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.JAP_MAP_SAPLING, RenderType.cutout());
/* 136 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.SIL_MAP_SAPLING, RenderType.cutout());
/* 137 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.DOU_FIR_SAPLING, RenderType.cutout());
/* 138 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.REDWOOD_SAPLING, RenderType.cutout());
/* 139 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.THUJA_SAPLING, RenderType.cutout());
/* 140 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.BASSWOOD_SAPLING, RenderType.cutout());
/*     */       
/* 142 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.CARNATION, RenderType.cutout());
/* 143 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.POTTED_CARNATION, RenderType.cutout());
/*     */       
/* 145 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.LILY, RenderType.cutout());
/* 146 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.POTTED_LILY, RenderType.cutout());
/*     */       
/* 148 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.PETUNIA, RenderType.cutout());
/* 149 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.POTTED_PETUNIA, RenderType.cutout());
/*     */       
/* 151 */       HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.GERBERAS, RenderType.cutout());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\HeroAes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */