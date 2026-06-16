package net.ambythewolfess.foxcoin.datagen;

import net.ambythewolfess.foxcoin.block.ModBlocks;
import net.ambythewolfess.foxcoin.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.SILVERBLOCK.get());
        dropSelf(ModBlocks.ROSEGOLDBLOCK.get());
        dropSelf(ModBlocks.PLATINUMBLOCK.get());

        dropSelf(ModBlocks.RAWSILVERBLOCK.get());
        dropSelf(ModBlocks.RAWROSEGOLDBLOCK.get());
        dropSelf(ModBlocks.RAWPLATINUMBLOCK.get());
        dropSelf(ModBlocks.CHARCOALBLOCK.get());

        add(ModBlocks.SILVERORE.get(),
                block -> createOreDrop(ModBlocks.SILVERORE.get(), ModItems.RAWSILVER.get()));
        add(ModBlocks.DEEPSLATESILVERORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATESILVERORE.get(), ModItems.RAWSILVER.get()));

        add(ModBlocks.PLATINUMORE.get(),
                block -> createOreDrop(ModBlocks.PLATINUMORE.get(), ModItems.RAWPLATINUM.get()));
        add(ModBlocks.DEEPSLATEPLATINUMORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATEPLATINUMORE.get(), ModItems.RAWPLATINUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
