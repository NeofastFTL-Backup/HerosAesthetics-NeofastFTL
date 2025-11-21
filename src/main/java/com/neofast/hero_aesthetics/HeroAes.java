/*     */ package com.neofast.hero_aesthetics;
/*     */ 
/*     */ import com.mojang.logging.LogUtils;
/*     */ import com.neofast.hero_aesthetics.block.ModBlocks;
/*     */ import com.neofast.hero_aesthetics.item.ModItems;
/*     */ import com.neofast.hero_aesthetics.tabs.HeroTabGreenery;
import com.neofast.hero_aesthetics.tabs.HeroTabTimbers;
import com.neofast.hero_aesthetics.worldgen.biome.ModdedTerrablender;
/*     */ import com.neofast.hero_aesthetics.worldgen.biome.surface.ModdedSurfaceRules;
/*     */
/*     */
/*     */
/*     */ import net.minecraft.world.item.CreativeModeTabs;
/*     */
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
/*     */ @Mod("hero_aesthetics")
/*     */ public class HeroAes
/*     */ {
/*     */   public static final String MOD_ID = "hero_aesthetics";
/*  33 */   public static final Logger LOGGER = LogUtils.getLogger();
/*     */   
/*     */   public HeroAes() {
/*  36 */     IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
/*     */     
/*  38 */     modEventBus.addListener(this::commonSetup);
/*  39 */     ModItems.register(modEventBus);
/*  40 */     ModBlocks.register(modEventBus);
/*  41 */     ModdedTerrablender.registerBiomes();
              HeroTabGreenery.register(modEventBus);
              HeroTabTimbers.register(modEventBus);
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
                    ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.GERBERAS.getId(), ModBlocks.POTTED_GERBERAS);
/*     */           SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, ModdedSurfaceRules.makeRules());
/*     */         });

/*     */   }
/*     */ 
/*     */   
/*     */   private void addCreative(BuildCreativeModeTabContentsEvent event) {
/*  58 */     if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onServerStarting(ServerStartingEvent event) {}

/*     */
/*     */
/*     */   @EventBusSubscriber(modid = "hero_aesthetics", bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*     */   public static class ClientModEvents
/*     */   {
/*     */     @SubscribeEvent
/*     */     public static void onClientSetup(FMLClientSetupEvent event) {
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\HeroAes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */