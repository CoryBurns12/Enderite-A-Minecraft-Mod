package net.CBTD.enderite.datagen;

import net.CBTD.enderite.Enderite;
import net.CBTD.enderite.item.customitems.ModItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItem.ENDERITE_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("B")
                .define('A', ModItem.ENDERITE_INGOT.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItem.ENDERITE_INGOT.get()), has(ModItem.ENDERITE_INGOT.get()))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.ENDERITE_PICKAXE.get())
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', ModItem.ENDERITE_INGOT.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItem.ENDERITE_INGOT.get()), has(ModItem.ENDERITE_INGOT.get()))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pRecipeOutput);
    }
}
