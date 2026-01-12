/*     */ package com.neofast.hero_aesthetics;
/*     */ 
/*     */ import com.mojang.logging.LogUtils;
/*     */ import com.neofast.hero_aesthetics.block.ModBlocks;
/*     */ import com.neofast.hero_aesthetics.block.custom.ModWoodType;
import com.neofast.hero_aesthetics.block.custom.WoodSets;
import com.neofast.hero_aesthetics.block.custom.WoodenTable;
import com.neofast.hero_aesthetics.item.ModItems;
/*     */
import com.neofast.hero_aesthetics.tabs.HeroTabs;
import com.neofast.hero_aesthetics.worldgen.ModConfiguredFeatures;
import com.neofast.hero_aesthetics.worldgen.biome.ModdedTerrablender;
/*     */ import com.neofast.hero_aesthetics.worldgen.biome.surface.ModdedSurfaceRules;
/*     */
/*     */
/*     */
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.CreativeModeTabs;
/*     */
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.FlowerPotBlock;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
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

import java.util.Set;
import java.util.concurrent.CompletableFuture;

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
              HeroTabs.register(modEventBus);
/*  39 */     ModItems.register(modEventBus);
/*  40 */     ModBlocks.register(modEventBus);
/*     */     
/*  43 */     MinecraftForge.EVENT_BUS.register(this);
/*  44 */     modEventBus.addListener(this::addCreative);
/*     */   }
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new DatapackBuiltinEntriesProvider(output, lookupProvider,
                new RegistrySetBuilder()
                        .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap),
                Set.of(HeroAes.MOD_ID)));
    }
/*     */   
/*     */   private void commonSetup(FMLCommonSetupEvent event) {
/*  48 */     event.enqueueWork(() -> {
/*     */           ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.CARNATION.getId(), ModBlocks.POTTED_CARNATION);
/*     */           ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LILY.getId(), ModBlocks.POTTED_LILY);
/*     */           ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.PETUNIA.getId(), ModBlocks.POTTED_PETUNIA);
                    ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.GERBERAS.getId(), ModBlocks.POTTED_GERBERAS);
                    ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.MARIGOLD.getId(), ModBlocks.POTTED_MARIGOLD);
                    ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.BEGONIA.getId(), ModBlocks.POTTED_BEGONIA);
                    ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.LAVENDER.getId(), ModBlocks.POTTED_LAVENDER);
                    ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.FOXGLOVE.getId(), ModBlocks.POTTED_FOXGLOVE);
                    ModdedTerrablender.registerBiomes();
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
    }
 }
}