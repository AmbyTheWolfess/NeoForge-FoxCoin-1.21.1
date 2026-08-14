package net.ambythewolfess.foxcoin.datagen.recipes;

import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class FCMixingRecipeGen extends MixingRecipeGen {
    public final GeneratedRecipe ROSEGGOLDINGOT = create("rosegold", b ->b
            .require(Items.COPPER_INGOT)
            .require(Items.GOLD_INGOT)
            .requiresHeat(HeatCondition.HEATED)
            .output(ModItems.ROSEGOLDINGOT.get(), 2)
            .duration(50)
    );

    public final GeneratedRecipe RAWROSEGOLD = create("rawrosegold", b ->b
            .require(Items.RAW_GOLD)
            .require(Items.RAW_COPPER)
            .output(ModItems.RAWROSEGOLD.get(), 2)
            .duration(50)
    );

    public FCMixingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, FoxCoin.MOD_ID);
    }
}
