/*    */ package com.neofast.hero_aesthetics.worldgen.biome;
/*    */ 
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.function.Consumer;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.biome.Biome;
/*    */ import net.minecraft.world.level.biome.Biomes;
/*    */ import net.minecraft.world.level.biome.Climate;
/*    */ import terrablender.api.ModifiedVanillaOverworldBuilder;
/*    */ import terrablender.api.Region;
/*    */ import terrablender.api.RegionType;
/*    */ 
/*    */ public class ModdedOverworldRegion
/*    */   extends Region {
/*    */   public ModdedOverworldRegion(ResourceLocation name, int weight) {
/* 18 */     super(name, RegionType.OVERWORLD, weight);
/*    */   }
/*    */ 
/*    */   
/*    */   public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
          this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
                modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, ModdedBiomes.TREEVERSE);
          });
/*    */   }
/*    */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\worldgen\biome\ModdedOverworldRegion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */