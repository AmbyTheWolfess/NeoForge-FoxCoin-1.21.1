package net.ambythewolfess.foxcoin.datagen.recipes;

import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class FCSequencedAssemblyRecipeGen extends SequencedAssemblyRecipeGen {

    public FCSequencedAssemblyRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, FoxCoin.MOD_ID);
    }
}
