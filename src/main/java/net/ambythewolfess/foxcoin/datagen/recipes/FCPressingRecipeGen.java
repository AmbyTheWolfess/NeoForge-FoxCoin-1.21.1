package net.ambythewolfess.foxcoin.datagen.recipes;

import com.simibubi.create.api.data.recipe.PressingRecipeGen;
import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class FCPressingRecipeGen extends PressingRecipeGen {

        GeneratedRecipe

    SILVERINGOT = create(ModItems.SILVERINGOT::get, b -> b.output(ModItems.SILVERSHEET.get())),

    ROSEGOLDINGOT = create(ModItems.ROSEGOLDINGOT::get, b -> b.output(ModItems.ROSEGOLDSHEET.get())),

    PLATINUMINGOT = create(ModItems.PLATINUMINGOT::get, b -> b.output(ModItems.PLATINUMSHEET.get())),

    NETHERITE_INGOT = create(() -> Items.NETHERITE_INGOT, b -> b.output(ModItems.NETHERITESHEET.get()));



    public FCPressingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, FoxCoin.MOD_ID);
    }
}
