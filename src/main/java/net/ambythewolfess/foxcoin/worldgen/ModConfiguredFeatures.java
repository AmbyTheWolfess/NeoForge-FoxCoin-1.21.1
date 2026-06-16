package net.ambythewolfess.foxcoin.worldgen;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVERORE_KEY = registerKey("silverore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUMORE_KEY = registerKey("platinumore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?,?>> context){

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldsilverOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SILVERORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATESILVERORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldplatinumOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.PLATINUMORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATESILVERORE.get().defaultBlockState()));

        register(context, OVERWORLD_SILVERORE_KEY, Feature.ORE, new OreConfiguration(overworldsilverOres, 6));

        register(context, OVERWORLD_PLATINUMORE_KEY, Feature.ORE, new OreConfiguration(overworldplatinumOres, 4));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(FoxCoin.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
