package net.ambythewolfess.foxcoin.datagen;

import com.simibubi.create.api.data.recipe.BaseRecipeProvider;
import com.simibubi.create.content.kinetics.crusher.CrushingRecipe;
import com.simibubi.create.content.kinetics.mixer.MixingRecipe;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import net.ambythewolfess.foxcoin.block.ModBlocks;
import net.ambythewolfess.foxcoin.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAWSILVER, ModItems.CRUSHEDRAWSILVER,
                ModBlocks.SILVERORE, ModBlocks.DEEPSLATESILVERORE);

        List<ItemLike> ROSEGOLD_SMELTABLES = List.of(ModItems.RAWROSEGOLD, ModItems.CRUSHEDRAWROSEGOLD);

        List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAWPLATINUM, ModItems.CRUSHEDRAWPLATINUM,
               ModBlocks.PLATINUMORE, ModBlocks.DEEPSLATEPLATINUMORE);

        //Coins
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.COPPER_INGOT),
                RecipeCategory.MISC,ModItems.COPPERCOIN)
                        .unlockedBy("has_copper", has(Items.COPPER_INGOT)).save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.SILVERINGOT.get()),
                        RecipeCategory.MISC,ModItems.SILVERCOIN)
                .unlockedBy("has_silver", has(ModItems.SILVERINGOT.get())).save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.GOLD_INGOT),
                        RecipeCategory.MISC,ModItems.GOLDCOIN)
                .unlockedBy("has_gold", has(Items.GOLD_INGOT)).save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.ROSEGOLDINGOT.get()),
                        RecipeCategory.MISC,ModItems.ROSEGOLDCOIN)
                .unlockedBy("has_rosegold", has(ModItems.ROSEGOLDINGOT.get())).save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModItems.PLATINUMINGOT.get()),
                        RecipeCategory.MISC,ModItems.PLATINUMCOIN)
                .unlockedBy("has_platinum", has(ModItems.PLATINUMINGOT.get())).save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.NETHERITE_INGOT),
                        RecipeCategory.MISC,ModItems.NETHERITECOIN)
                .unlockedBy("has_netherite", has(Items.NETHERITE_INGOT)).save(recipeOutput);

        //Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVERBLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.SILVERINGOT.get())
                .unlockedBy("has_silver", has(ModItems.SILVERINGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSEGOLDBLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.ROSEGOLDINGOT.get())
                .unlockedBy("has_rosegold", has(ModItems.ROSEGOLDINGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLATINUMBLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.PLATINUMINGOT.get())
                .unlockedBy("has_platinum", has(ModItems.PLATINUMINGOT)).save(recipeOutput);

        //Raw blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAWSILVERBLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.RAWSILVER.get())
                .unlockedBy("has_rawsilver", has(ModItems.RAWSILVER)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAWROSEGOLDBLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.RAWROSEGOLD.get())
                .unlockedBy("has_rawrosegold", has(ModItems.RAWROSEGOLD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAWPLATINUMBLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.RAWPLATINUM.get())
                .unlockedBy("has_rawplatinum", has(ModItems.RAWPLATINUM)).save(recipeOutput);

        //Rawblocks to raw
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.RAWSILVER.get(), 9)
                .requires(ModBlocks.RAWSILVERBLOCK)
                .unlockedBy("has_rawsilverblock", has(ModBlocks.RAWSILVERBLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.RAWROSEGOLD.get(), 9)
                .requires(ModBlocks.RAWROSEGOLDBLOCK)
                .unlockedBy("has_rawrosegoldblock", has(ModBlocks.RAWROSEGOLDBLOCK)).save(recipeOutput, "rawrosegold_from_rawrosegoldblock");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.RAWPLATINUM.get(), 9)
                .requires(ModBlocks.RAWPLATINUMBLOCK)
                .unlockedBy("has_rawplatinumblock", has(ModBlocks.RAWPLATINUMBLOCK)).save(recipeOutput);


        //blocks to ingots
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.SILVERINGOT.get(), 9)
                .requires(ModBlocks.SILVERBLOCK)
                .unlockedBy("has_silverblock", has(ModBlocks.SILVERBLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.ROSEGOLDINGOT.get(), 9)
                .requires(ModBlocks.ROSEGOLDBLOCK)
                .unlockedBy("has_rosegoldblock", has(ModBlocks.ROSEGOLDBLOCK)).save(recipeOutput,"rosegoldingot_from_rosegoldblock");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.PLATINUMINGOT.get(), 9)
                .requires(ModBlocks.PLATINUMBLOCK)
                .unlockedBy("has_platinumblock", has(ModBlocks.PLATINUMBLOCK)).save(recipeOutput);

        //Ingots to nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.SILVERNUGGET.get(), 9)
                .requires(ModItems.SILVERINGOT)
                .unlockedBy("has_silveringot", has(ModItems.SILVERINGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.ROSEGOLDNUGGET.get(), 9)
                .requires(ModItems.ROSEGOLDINGOT)
                .unlockedBy("has_rosegoldingot", has(ModItems.ROSEGOLDINGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.PLATINUMNUGGET.get(), 9)
                .requires(ModItems.PLATINUMINGOT)
                .unlockedBy("has_platinumingot", has(ModItems.PLATINUMINGOT)).save(recipeOutput);

        //Nuggets to ingot
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVERINGOT.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.SILVERNUGGET.get())
                .unlockedBy("has_silvernugget", has(ModItems.SILVERNUGGET)).save(recipeOutput, "silveringot_from_nuggets");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSEGOLDINGOT.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.ROSEGOLDNUGGET.get())
                .unlockedBy("has_rosegoldnugget", has(ModItems.ROSEGOLDNUGGET)).save(recipeOutput, "rosegoldingot_from_nuggets");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUMINGOT.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.PLATINUMNUGGET.get())
                .unlockedBy("has_platinumnugget", has(ModItems.PLATINUMNUGGET)).save(recipeOutput, "platinum_from_nugget");

        //Rosegold
        //Food recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSEGOLDCARROT.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('B', ModItems.ROSEGOLDNUGGET.get())
                .define('A', Items.CARROT)
                .unlockedBy("has_rosegoldnugget", has(ModItems.ROSEGOLDNUGGET))
                .unlockedBy("has_apple", has(Items.CARROT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSEGOLDAPPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('B', ModItems.ROSEGOLDINGOT.get())
                .define('A', Items.APPLE)
                .unlockedBy("has_rosegoldnugget", has(ModItems.ROSEGOLDINGOT))
                .unlockedBy("has_apple", has(Items.APPLE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENCHANTEDROSEGOLDAPPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('B', ModBlocks.ROSEGOLDBLOCK.get())
                .define('A', Items.APPLE)
                .unlockedBy("has_rosegoldblock", has(ModBlocks.ROSEGOLDBLOCK))
                .unlockedBy("has_apple", has(Items.APPLE)).save(recipeOutput);

        //Charcoal Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHARCOALBLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.CHARCOAL)
                .unlockedBy("has_charcoal", has(Items.CHARCOAL)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,Items.CHARCOAL, 9)
                .requires(ModBlocks.CHARCOALBLOCK)
                .unlockedBy("has_charcoalblock", has(ModBlocks.CHARCOALBLOCK)).save(recipeOutput,"charcoal_from_charcoalblock");

        //Create Recipes


        //Smelting
        oreSmelting(recipeOutput, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVERINGOT.get(),.5f,200,"silver");
        oreBlasting(recipeOutput, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVERINGOT.get(),.5f,100,"silver");

        oreSmelting(recipeOutput, ROSEGOLD_SMELTABLES, RecipeCategory.MISC, ModItems.ROSEGOLDINGOT.get(),.5f,200,"rosegold");
        oreBlasting(recipeOutput, ROSEGOLD_SMELTABLES, RecipeCategory.MISC, ModItems.ROSEGOLDINGOT.get(),.5f,100,"rosegold");

        oreSmelting(recipeOutput, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUMINGOT.get(),.6f,200,"platinum");
        oreBlasting(recipeOutput, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUMINGOT.get(),.6f,100,"platinum");

    }
}
