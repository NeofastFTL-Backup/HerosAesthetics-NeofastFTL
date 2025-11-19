/*    */ package com.neofast.hero_aesthetics.worldgen.tree;
/*    */ 
/*    */ import com.neofast.hero_aesthetics.worldgen.CustomConfiguredFeaturesJapMap;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.level.block.grower.AbstractTreeGrower;
/*    */ import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class JapMapTreeGrower
/*    */   extends AbstractTreeGrower {
/*    */   @Nullable
/*    */   protected ResourceKey<ConfiguredFeature<?, ?>> m_213888_(RandomSource pRandom, boolean pHasFlowers) {
/* 14 */     return CustomConfiguredFeaturesJapMap.JAP_MAP_KEY;
/*    */   }
/*    */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\worldgen\tree\JapMapTreeGrower.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */