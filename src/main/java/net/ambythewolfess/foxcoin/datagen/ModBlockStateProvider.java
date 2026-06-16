package net.ambythewolfess.foxcoin.datagen;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FoxCoin.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SILVERBLOCK);
        blockWithItem(ModBlocks.ROSEGOLDBLOCK);
        blockWithItem(ModBlocks.PLATINUMBLOCK);

        blockWithItem(ModBlocks.RAWSILVERBLOCK);
        blockWithItem(ModBlocks.RAWROSEGOLDBLOCK);
        blockWithItem(ModBlocks.RAWPLATINUMBLOCK);

        blockWithItem(ModBlocks.SILVERORE);
        blockWithItem(ModBlocks.PLATINUMORE);
        blockWithItem(ModBlocks.DEEPSLATESILVERORE);
        blockWithItem(ModBlocks.DEEPSLATEPLATINUMORE);

        blockWithItem(ModBlocks.CHARCOALBLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
