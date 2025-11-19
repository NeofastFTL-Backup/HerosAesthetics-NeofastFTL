/*    */ package com.neofast.hero_aesthetics.item;
/*    */ 
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraftforge.eventbus.api.IEventBus;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModItems
/*    */ {
/* 13 */   public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "heroaes");
/*    */   
/*    */   public static void register(IEventBus eventBus) {
/* 16 */     ITEMS.register(eventBus);
/*    */   }
/*    */ }


/* Location:              C:\Users\stefa\Downloads\Hero's Aesthetics 0.3.jar!\com\neofast\hero_aesthetics\item\ModItems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */