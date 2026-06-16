package net.ambythewolfess.foxcoin.worldgen;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> SILVERORE_PLACED_KEY = registerKey("silverore_placed");
    public static final ResourceKey<PlacedFeature> PLATINUM_PLACED_KEY = registerKey("platinum_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, SILVERORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILVERORE_KEY),
                ModOrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(64))));

        register(context, PLATINUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLATINUMORE_KEY),
                ModOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(14))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(FoxCoin.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
