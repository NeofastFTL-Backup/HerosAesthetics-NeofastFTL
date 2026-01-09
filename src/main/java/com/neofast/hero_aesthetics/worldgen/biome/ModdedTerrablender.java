/*   */ package com.neofast.hero_aesthetics.worldgen.biome;
/*   */ 
/*   */ import com.neofast.hero_aesthetics.HeroAes;
import net.minecraft.resources.ResourceLocation;
/*   */ import terrablender.api.Regions;
/*   */ 
/*   */ public class ModdedTerrablender
/*   */ {
/*   */   public static void registerBiomes() {
/* 9 */     Regions.register(new ModdedOverworldRegion(new ResourceLocation("treeverse"), 5));
/*   */   }
/*   */ }