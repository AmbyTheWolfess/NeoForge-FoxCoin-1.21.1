package net.ambythewolfess.foxcoin.datagen.recipes;

import com.simibubi.create.AllItems;
import com.simibubi.create.Create;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.block.ModBlocks;
import net.ambythewolfess.foxcoin.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class FCCrushingGen extends CrushingRecipeGen {

    GeneratedRecipe

    SILVERORE = stoneOre(() -> ModBlocks.SILVERORE, () -> ModItems.CRUSHEDRAWSILVER, 1.75f, 250),
    PLATINUMORE = stoneOre(() -> ModBlocks.PLATINUMORE, () -> ModItems.CRUSHEDRAWSILVER, 1.5f, 250),

    DEEPSLATESIVLERORE = deepslateOre(() -> ModBlocks.DEEPSLATESILVERORE, ()->ModItems.CRUSHEDRAWSILVER,1.75f, 300),
    DEEPSLATEPLATINUMORE = deepslateOre(() -> ModBlocks.DEEPSLATEPLATINUMORE, ()->ModItems.CRUSHEDRAWPLATINUM,1.5f, 300),

    RAWROSEGOLD = create(()-> ModItems.RAWROSEGOLD, b -> b.duration(200)
            .output(ModItems.CRUSHEDRAWROSEGOLD)
            .output(0.5f, ModItems.CRUSHEDRAWROSEGOLD)
            .output(.5f, AllItems.EXP_NUGGET)),


    RAWSILVER = create(()-> ModItems.RAWSILVER, b -> b.duration(200)
            .output(ModItems.CRUSHEDRAWSILVER)
            .output(0.75f, ModItems.CRUSHEDRAWSILVER)
            .output(.5f, AllItems.EXP_NUGGET)),

    RAWPLATINUM = create(()-> ModItems.RAWPLATINUM, b -> b.duration(200)
            .output(ModItems.CRUSHEDRAWPLATINUM)
            .output(0.5f, ModItems.CRUSHEDRAWPLATINUM)
            .output(.75f, AllItems.EXP_NUGGET));


    public FCCrushingGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, FoxCoin.MOD_ID);
    }
}
