package net.ambythewolfess.foxcoin.datagen.recipes;

import com.simibubi.create.api.data.recipe.CompactingRecipeGen;
import net.ambythewolfess.foxcoin.FoxCoin;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class FCCompactingRecipeGen extends CompactingRecipeGen {


    public FCCompactingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, FoxCoin.MOD_ID);
    }
}
