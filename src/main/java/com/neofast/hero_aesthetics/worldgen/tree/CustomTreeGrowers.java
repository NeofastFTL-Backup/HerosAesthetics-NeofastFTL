package com.neofast.hero_aesthetics.worldgen.tree;

import com.neofast.hero_aesthetics.worldgen.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class CustomTreeGrowers {
    public static class JapMap extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.JAP_MAP_KEY;
        }
    }

    public static class SilMap extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.SIL_MAP_KEY;
        }
    }

    public static class DouFir extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.DOU_FIR_KEY;
        }
    }

    public static class Redwood extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.REDWOOD_KEY;
        }
    }

    public static class Thuja extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.THUJA_KEY;
        }
    }

    public static class Basswood extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.BASSWOOD_KEY;
        }
    }
}