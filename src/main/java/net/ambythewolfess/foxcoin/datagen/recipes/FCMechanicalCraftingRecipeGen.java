package net.ambythewolfess.foxcoin.datagen.recipes;

import com.simibubi.create.api.data.recipe.MechanicalCraftingRecipeGen;
import net.ambythewolfess.foxcoin.FoxCoin;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class FCMechanicalCraftingRecipeGen extends MechanicalCraftingRecipeGen {




    public FCMechanicalCraftingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, FoxCoin.MOD_ID);
    }
}
