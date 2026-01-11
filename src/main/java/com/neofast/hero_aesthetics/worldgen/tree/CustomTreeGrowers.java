package com.neofast.hero_aesthetics.worldgen.tree;

import com.neofast.hero_aesthetics.worldgen.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class CustomTreeGrowers {
    public static class JapaneseMaple extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.JAPANESE_MAPLE_KEY;
        }
    }

    public static class SilverMaple extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.SILVER_MAPLE_KEY;
        }
    }

    public static class DouglasFir extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.DOUGLAS_FIR_KEY;
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

    public static class QuakingAspen extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.QUAKING_ASPEN_KEY;
        }
    }

    public static class Palm extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.PALM_KEY;
        }
    }

    public static class Ebony extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.EBONY_KEY;
        }
    }

    public static class Teak extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.TEAK_KEY;
        }
    }

    public static class Mahogany extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.MAHOGANY_KEY;
        }
    }

    public static class Cedar extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.CEDAR_KEY;
        }
    }

    public static class Cypress extends AbstractTreeGrower {
        @Override
        protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
            return ModConfiguredFeatures.CYPRESS_KEY;
        }
    }
}