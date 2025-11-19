/*    */ package com.neofast.hero_aesthetics.worldgen.biome;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.data.worldgen.BiomeDefaultFeatures;
/*    */ import net.minecraft.data.worldgen.BootstapContext;
/*    */ import net.minecraft.data.worldgen.placement.VegetationPlacements;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobCategory;
/*    */ import net.minecraft.world.level.biome.AmbientMoodSettings;
/*    */ import net.minecraft.world.level.biome.Biome;
/*    */ import net.minecraft.world.level.biome.BiomeGenerationSettings;
/*    */ import net.minecraft.world.level.biome.BiomeSpecialEffects;
/*    */ import net.minecraft.world.level.biome.MobSpawnSettings;
/*    */ import net.minecraft.world.level.levelgen.GenerationStep;
/*    */ 
/*    */ public class ModdedBiomes {
/* 18 */   public static final ResourceKey<Biome> TREEVERSE = ResourceKey.m_135785_(Registries.f_256952_, new ResourceLocation("heroaes", "treeverse"));
/*    */ 
/*    */   
/*    */   public static void boostrap(BootstapContext<Biome> context) {
/* 22 */     context.m_255272_(TREEVERSE, testBiome(context));
/*    */   }
/*    */   
/*    */   public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
/* 26 */     BiomeDefaultFeatures.m_194720_(builder);
/* 27 */     BiomeDefaultFeatures.m_176857_(builder);
/* 28 */     BiomeDefaultFeatures.m_126806_(builder);
/* 29 */     BiomeDefaultFeatures.m_126810_(builder);
/* 30 */     BiomeDefaultFeatures.m_126765_(builder);
/* 31 */     BiomeDefaultFeatures.m_126771_(builder);
/*    */   }
/*    */   
/*    */   public static Biome testBiome(BootstapContext<Biome> context) {
/* 35 */     MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
/*    */     
/* 37 */     spawnBuilder.m_48376_(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.f_20499_, 5, 4, 4));
/*    */     
/* 39 */     BiomeDefaultFeatures.m_126734_(spawnBuilder);
/* 40 */     BiomeDefaultFeatures.m_126788_(spawnBuilder);
/*    */ 
/*    */     
/* 43 */     BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.m_255420_(Registries.f_256988_), context.m_255420_(Registries.f_257003_));
/*    */     
/* 45 */     globalOverworldGeneration(biomeBuilder);
/* 46 */     BiomeDefaultFeatures.m_126826_(biomeBuilder);
/* 47 */     BiomeDefaultFeatures.m_126706_(biomeBuilder);
/* 48 */     BiomeDefaultFeatures.m_126828_(biomeBuilder);
/* 49 */     BiomeDefaultFeatures.m_126814_(biomeBuilder);
/* 50 */     BiomeDefaultFeatures.m_126816_(biomeBuilder);
/*    */     
/* 52 */     biomeBuilder.m_255155_(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.f_195421_);
/*    */     
/* 54 */     BiomeDefaultFeatures.m_126730_(biomeBuilder);
/* 55 */     BiomeDefaultFeatures.m_126745_(biomeBuilder);
/*    */     
/* 57 */     return (new Biome.BiomeBuilder())
/* 58 */       .m_264558_(true)
/* 59 */       .m_47611_(0.8F)
/* 60 */       .m_47609_(0.7F)
/* 61 */       .m_47601_(biomeBuilder.m_255380_())
/* 62 */       .m_47605_(spawnBuilder.m_48381_())
/* 63 */       .m_47603_((new BiomeSpecialEffects.Builder())
/* 64 */         .m_48034_(15216187)
/* 65 */         .m_48037_(12524326)
/* 66 */         .m_48040_(3197208)
/* 67 */         .m_48045_(8324092)
/* 68 */         .m_48043_(13763580)
/* 69 */         .m_48019_(2269670)
/* 70 */         .m_48027_(AmbientMoodSettings.f_47387_).m_48018_())
/* 71 */       .m_47592_();
/*    */   }
/*    */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\worldgen\biome\ModdedBiomes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */