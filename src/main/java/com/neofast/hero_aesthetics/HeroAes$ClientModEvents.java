/*     */ package com.neofast.hero_aesthetics;
/*     */ 
/*     */ import com.neofast.hero_aesthetics.block.ModBlocks;
/*     */ import java.util.function.Supplier;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber(modid = "heroaes", bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*     */ public class ClientModEvents
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onClientSetup(FMLClientSetupEvent event) {
/* 135 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.JAP_MAP_SAPLING, RenderType.m_110463_());
/* 136 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.SIL_MAP_SAPLING, RenderType.m_110463_());
/* 137 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.DOU_FIR_SAPLING, RenderType.m_110463_());
/* 138 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.REDWOOD_SAPLING, RenderType.m_110463_());
/* 139 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.THUJA_SAPLING, RenderType.m_110463_());
/* 140 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.BASSWOOD_SAPLING, RenderType.m_110463_());
/*     */     
/* 142 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.CARNATION, RenderType.m_110463_());
/* 143 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.POTTED_CARNATION, RenderType.m_110463_());
/*     */     
/* 145 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.LILY, RenderType.m_110463_());
/* 146 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.POTTED_LILY, RenderType.m_110463_());
/*     */     
/* 148 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.PETUNIA, RenderType.m_110463_());
/* 149 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.POTTED_PETUNIA, RenderType.m_110463_());
/*     */     
/* 151 */     HeroAes.setRenderLayer((Supplier<? extends Block>)ModBlocks.GERBERAS, RenderType.m_110463_());
/*     */   }
/*     */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\HeroAes$ClientModEvents.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */