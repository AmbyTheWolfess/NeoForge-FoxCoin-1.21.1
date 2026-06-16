package net.ambythewolfess.foxcoin.datagen;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FoxCoin.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SILVERBLOCK.get())
                .add(ModBlocks.ROSEGOLDBLOCK.get())
                .add(ModBlocks.PLATINUMBLOCK.get())

                .add(ModBlocks.RAWSILVERBLOCK.get())
                .add(ModBlocks.RAWROSEGOLDBLOCK.get())
                .add(ModBlocks.RAWPLATINUMBLOCK.get())

                .add(ModBlocks.SILVERORE.get())
                .add(ModBlocks.PLATINUMORE.get())
                .add(ModBlocks.DEEPSLATESILVERORE.get())
                .add(ModBlocks.DEEPSLATEPLATINUMORE.get())

                .add(ModBlocks.CHARCOALBLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVERBLOCK.get())
                .add(ModBlocks.ROSEGOLDBLOCK.get())
                .add(ModBlocks.PLATINUMBLOCK.get())

                .add(ModBlocks.RAWSILVERBLOCK.get())
                .add(ModBlocks.RAWROSEGOLDBLOCK.get())
                .add(ModBlocks.RAWPLATINUMBLOCK.get())

                .add(ModBlocks.SILVERORE.get())
                .add(ModBlocks.PLATINUMORE.get())
                .add(ModBlocks.DEEPSLATESILVERORE.get())
                .add(ModBlocks.DEEPSLATEPLATINUMORE.get());

    }
}
