package com.neofast.hero_aesthetics.worldgen;

import com.neofast.hero_aesthetics.HeroAes;
import com.neofast.hero_aesthetics.block.custom.ModWoodType;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> JAP_MAP_KEY = registerKey("jap_map");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SIL_MAP_KEY = registerKey("sil_map");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOU_FIR_KEY = registerKey("dou_fir");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDWOOD_KEY = registerKey("redwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> THUJA_KEY = registerKey("thuja");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASSWOOD_KEY = registerKey("basswood");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        registerTree(context, JAP_MAP_KEY, ModWoodType.JAP_MAP);
        registerTree(context, SIL_MAP_KEY, ModWoodType.SIL_MAP);
        registerTree(context, DOU_FIR_KEY, ModWoodType.DOU_FIR);
        registerTree(context, REDWOOD_KEY, ModWoodType.REDWOOD);
        registerTree(context, THUJA_KEY, ModWoodType.THUJA);
        registerTree(context, BASSWOOD_KEY, ModWoodType.BASSWOOD);
    }

    private static void registerTree(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, ModWoodType woodType) {
        register(context, key, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(woodType.set.log.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(woodType.set.leaves.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(HeroAes.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}