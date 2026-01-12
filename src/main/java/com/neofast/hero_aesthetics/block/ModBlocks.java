/*     */ package com.neofast.hero_aesthetics.block;
/*     */ import java.util.function.Supplier;
/*     */
import com.neofast.hero_aesthetics.block.custom.WoodSets;
import com.neofast.hero_aesthetics.item.ModItems;
import com.neofast.hero_aesthetics.worldgen.tree.*;
/*     */
/*     */ import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
/*     */
/*     */ import net.minecraft.world.level.block.*;
/*     */
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */
/*     */ import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
/*     */ 
/*     */ public class ModBlocks {
          public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "hero_aesthetics");
/*     */   
/*  29 */   public static final RegistryObject<Block> CARNATION = registerBlock("carnation", () ->     new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
/*  32 */   public static final RegistryObject<Block> POTTED_CARNATION = BLOCKS.register("potted_carnation", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CARNATION, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
/*  36 */   public static final RegistryObject<Block> LILY = registerBlock("lily", () ->     new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
/*  39 */   public static final RegistryObject<Block> POTTED_LILY = BLOCKS.register("potted_lily", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.LILY, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
/*  43 */   public static final RegistryObject<Block> PETUNIA = registerBlock("petunia", () ->     new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
/*  46 */   public static final RegistryObject<Block> POTTED_PETUNIA = BLOCKS.register("potted_petunia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), PETUNIA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
/*  51 */   public static final RegistryObject<Block> GERBERAS = registerBlock("gerberas", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion().noCollission()));
            public static final RegistryObject<Block> POTTED_GERBERAS = BLOCKS.register("potted_gerberas", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), GERBERAS, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> MARIGOLD = registerBlock("marigold", () -> new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_MARIGOLD = BLOCKS.register("potted_marigold", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), MARIGOLD, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> BEGONIA = registerBlock("begonia", () -> new FlowerBlock(() -> MobEffects.DIG_SPEED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_BEGONIA = BLOCKS.register("potted_begonia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BEGONIA, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> LAVENDER = registerBlock("lavender", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_LAVENDER = BLOCKS.register("potted_lavender", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), LAVENDER, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> FOXGLOVE = registerBlock("foxglove", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_FOXGLOVE = BLOCKS.register("potted_foxglove", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), FOXGLOVE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final WoodSets JAPANESE_MAPLE =
            new WoodSets("japanese_maple", CustomTreeGrowers.JapaneseMaple::new);

    public static final WoodSets SILVER_MAPLE =
            new WoodSets("silver_maple", CustomTreeGrowers.SilverMaple::new);

    public static final WoodSets DOUGLAS_FIR =
            new WoodSets("douglas_fir", CustomTreeGrowers.DouglasFir::new);

    public static final WoodSets REDWOOD =
            new WoodSets("redwood", CustomTreeGrowers.Redwood::new);

    public static final WoodSets THUJA =
            new WoodSets("thuja", CustomTreeGrowers.Thuja::new);

    public static final WoodSets BASSWOOD =
            new WoodSets("basswood", CustomTreeGrowers.Basswood::new);

    public static final WoodSets QUAKING_ASPEN =
            new WoodSets("quaking_aspen", CustomTreeGrowers.QuakingAspen::new);

    public static final WoodSets PALM =
            new WoodSets("palm", CustomTreeGrowers.Palm::new);

    public static final WoodSets EBONY =
            new WoodSets("ebony", CustomTreeGrowers.Ebony::new);

    public static final WoodSets TEAK =
            new WoodSets("teak", CustomTreeGrowers.Teak::new);

    public static final WoodSets MAHOGANY =
            new WoodSets("mahogany", CustomTreeGrowers.Mahogany::new);

    public static final WoodSets CEDAR =
            new WoodSets("cedar", CustomTreeGrowers.Cedar::new);

    public static final WoodSets CYPRESS =
            new WoodSets("cypress", CustomTreeGrowers.Cypress::new);



/*     */   public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
/* 353 */     RegistryObject<T> toReturn = BLOCKS.register(name, block);
/* 354 */     registerBlockItem(name, toReturn);
/* 355 */     return toReturn;
/*     */   }
/*     */   
/*     */   private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
/* 359 */     return ModItems.ITEMS.register(name, () -> new BlockItem((Block)block.get(), new Item.Properties()));
/*     */   }
/*     */   
/*     */   public static void register(IEventBus eventBus) {
/* 363 */     BLOCKS.register(eventBus);
/*     */   }
/*     */ }