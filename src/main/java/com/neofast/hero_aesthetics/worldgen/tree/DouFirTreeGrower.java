/*    */ package com.neofast.hero_aesthetics.worldgen.tree;
/*    */ 
/*    */ import com.neofast.hero_aesthetics.worldgen.CustomConfiguredFeaturesDouFir;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.level.block.grower.AbstractTreeGrower;
/*    */ import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class DouFirTreeGrower
/*    */   extends AbstractTreeGrower {
/*    */   @Nullable
/*    */   protected ResourceKey<ConfiguredFeature<?, ?>> m_213888_(RandomSource pRandom, boolean pHasFlowers) {
/* 14 */     return CustomConfiguredFeaturesDouFir.DOU_FIR_KEY;
/*    */   }
/*    */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\worldgen\tree\DouFirTreeGrower.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */