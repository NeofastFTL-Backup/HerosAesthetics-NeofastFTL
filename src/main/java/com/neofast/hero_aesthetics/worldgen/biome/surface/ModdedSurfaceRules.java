/*    */ package com.neofast.hero_aesthetics.worldgen.biome.surface;
/*    */ import com.neofast.hero_aesthetics.worldgen.biome.ModdedBiomes;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.levelgen.SurfaceRules;
/*    */ 
/*    */ public class ModdedSurfaceRules {
/*  9 */   private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.f_50493_);
/* 10 */   private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.f_50440_);
/*    */   
/*    */   public static SurfaceRules.RuleSource makeRules() {
/* 13 */     SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.m_189382_(-1, 0);
/*    */     
/* 15 */     SurfaceRules.RuleSource grassSurface = SurfaceRules.m_198272_(new SurfaceRules.RuleSource[] { SurfaceRules.m_189394_(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT });
/*    */     
/* 17 */     return SurfaceRules.m_198272_(new SurfaceRules.RuleSource[] {
/* 18 */           SurfaceRules.m_198272_(new SurfaceRules.RuleSource[] { SurfaceRules.m_189394_(SurfaceRules.m_189416_(new ResourceKey[] {
/*    */ 
/*    */                     
/*    */                     ModdedBiomes.TREEVERSE
/* 22 */                   }, ), SurfaceRules.m_189394_(SurfaceRules.f_189375_, grassSurface)) })
/*    */         });
/*    */   }
/*    */   
/*    */   private static SurfaceRules.RuleSource makeStateRule(Block block) {
/* 27 */     return SurfaceRules.m_189390_(block.defaultBlockState());
/*    */   }
/*    */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\worldgen\biome\surface\ModdedSurfaceRules.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */