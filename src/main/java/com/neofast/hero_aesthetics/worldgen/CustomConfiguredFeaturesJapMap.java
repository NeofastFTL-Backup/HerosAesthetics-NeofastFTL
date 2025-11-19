/*    */ package com.neofast.hero_aesthetics.worldgen;
/*    */ import com.neofast.hero_aesthetics.block.ModBlocks;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.data.worldgen.BootstapContext;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.util.valueproviders.ConstantInt;
/*    */ import net.minecraft.util.valueproviders.IntProvider;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
/*    */ import net.minecraft.world.level.levelgen.feature.Feature;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.featuresize.FeatureSize;
/*    */ import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
/*    */ import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
/*    */ import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;

/*    */
/*    */ public class CustomConfiguredFeaturesJapMap {
/* 20 */   public static final ResourceKey<ConfiguredFeature<?, ?>> JAP_MAP_KEY = registerKey("jap_map");
/*    */   
/*    */   public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
/* 23 */     register(context, JAP_MAP_KEY, Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
/* 24 */           (BlockStateProvider)BlockStateProvider.simple((Block)ModBlocks.JAP_MAP_LOG.get()), (TrunkPlacer)new StraightTrunkPlacer(5, 4, 3),
/*    */ 
/*    */           
/* 27 */           (BlockStateProvider)BlockStateProvider.simple((Block)ModBlocks.JAP_MAP_LEAVES.get()), (FoliagePlacer)new BlobFoliagePlacer(
/* 28 */             (IntProvider)ConstantInt.of(3), (IntProvider)ConstantInt.of(2), 3), (FeatureSize)new TwoLayersFeatureSize(1, 0, 2)))
/*    */         
/* 30 */         .build());
/*    */   }
/*    */ 
/*    */   
/*    */   public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
/* 35 */     return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("heroaes", name));
/*    */   }
/*    */ 
/*    */   
/*    */   private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
/* 40 */     context.register(key, new ConfiguredFeature((Feature)feature, (FeatureConfiguration)configuration));
/*    */   }
/*    */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\worldgen\CustomConfiguredFeaturesJapMap.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */