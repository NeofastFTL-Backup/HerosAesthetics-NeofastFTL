/*   */ package com.neofast.hero_aesthetics.worldgen.biome;
/*   */ 
/*   */ import com.neofast.hero_aesthetics.HeroAes;
import net.minecraft.resources.ResourceLocation;
/*   */ import terrablender.api.Regions;
/*   */ 
/*   */ public class ModdedTerrablender
/*   */ {
/*   */   public static void registerBiomes() {
/* 9 */     Regions.register(new ModdedOverworldRegion(new ResourceLocation(HeroAes.MOD_ID, "treeverse"), 5));
/*   */   }
/*   */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\worldgen\biome\ModdedTerrablender.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */