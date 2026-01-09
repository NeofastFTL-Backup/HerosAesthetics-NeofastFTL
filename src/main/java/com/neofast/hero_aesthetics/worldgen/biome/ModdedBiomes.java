/*    */  package com.neofast.hero_aesthetics.worldgen.biome;
/*    */ import com.neofast.hero_aesthetics.HeroAes;
         import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.data.worldgen.BiomeDefaultFeatures;
/*    */ import net.minecraft.data.worldgen.BootstapContext;
/*    */ import net.minecraft.data.worldgen.placement.VegetationPlacements;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
         import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobCategory;
/*    */ import net.minecraft.world.level.biome.Biome;
/*    */ import net.minecraft.world.level.biome.BiomeGenerationSettings;
/*    */ import net.minecraft.world.level.biome.MobSpawnSettings;
/*    */ import net.minecraft.world.level.levelgen.GenerationStep;
/*    */ 
/*    */ public class ModdedBiomes {
/* 18 */   public static final ResourceKey<Biome> TREEVERSE = ResourceKey.create(Registries.BIOME, new ResourceLocation(HeroAes.MOD_ID, "treeverse"));
/*    */ 
/*    */   
/*    */   public static void boostrap(BootstapContext<Biome> context) {
/* 22 */     context.register(TREEVERSE, treeverse(context));
/*    */   }
/*    */   
/*    */   public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
    BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
    BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
    BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
    BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
    BiomeDefaultFeatures.addDefaultSprings(builder);
    BiomeDefaultFeatures.addSurfaceFreezing(builder);
/*    */   }
/*    */
/*    */   public static Biome treeverse(BootstapContext<Biome> context) {
    MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

    spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));

    BiomeDefaultFeatures.farmAnimals(spawnBuilder);
    BiomeDefaultFeatures.commonSpawns(spawnBuilder);

    BiomeGenerationSettings.Builder biomeBuilder =
            new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
    //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
    globalOverworldGeneration(biomeBuilder);
    BiomeDefaultFeatures.addMossyStoneBlock(biomeBuilder);
    BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
    BiomeDefaultFeatures.addFerns(biomeBuilder);
    BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
    BiomeDefaultFeatures.addExtraGold(biomeBuilder);

    biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_PLAINS);

    BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
    BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);

/* 57 */     return (new Biome.BiomeBuilder())
            .hasPrecipitation(true)
            .downfall(0.8f)
            .temperature(0.7f)
            .generationSettings(biomeBuilder.build())
            .mobSpawnSettings(spawnBuilder.build())
/* 71 */    .build();
/*    */   }
/*    */ }