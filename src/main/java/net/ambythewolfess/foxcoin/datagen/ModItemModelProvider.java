package net.ambythewolfess.foxcoin.datagen;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FoxCoin.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.COPPERCOIN.get());
        basicItem(ModItems.SIVLERCOIN.get());
        basicItem(ModItems.GOLDCOIN.get());
        basicItem(ModItems.ROSEGOLDCOIN.get());
        basicItem(ModItems.PLATINUMCOIN.get());
        basicItem(ModItems.NETHERITECOIN.get());

        basicItem(ModItems.RAWSILVER.get());
        basicItem(ModItems.RAWROSEGOLD.get());
        basicItem(ModItems.RAWPLATINUM.get());

        basicItem(ModItems.SILVERINGOT.get());
        basicItem(ModItems.ROSEGOLDINGOT.get());
        basicItem(ModItems.PLATINUMINGOT.get());

        basicItem(ModItems.SILVERNUGGET.get());
        basicItem(ModItems.ROSEGOLDNUGGET.get());
        basicItem(ModItems.PLATINUMNUGGET.get());

        basicItem(ModItems.ROSEGOLDCARROT.get());
        basicItem(ModItems.ROSEGOLDAPPLE.get());
        basicItem(ModItems.ENCHANTEDROSEGOLDAPPLE.get());

    }
}
