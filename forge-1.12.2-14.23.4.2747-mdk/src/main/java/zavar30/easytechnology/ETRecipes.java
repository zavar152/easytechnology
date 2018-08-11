package zavar30.easytechnology;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

public class ETRecipes
{
  public static void load()
  { 
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boer"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boer_case"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boer_main"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boer_controller"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boeryllium_block"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "seed_block"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "simple_pack"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "golden_pack"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boeryllium_pickaxe"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boeryllium_sword"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boeryllium_spade"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boeryllium_axe"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boeryllium_hoe"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boeryllium_helmet"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boeryllium_chestplate"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boeryllium_leggings"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(Constants.MODID, "boeryllium_boots"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  
	  FurnaceRecipes.instance().addSmelting(ETItems.boeryllium_ingot_raw, new ItemStack(ETItems.boeryllium_ingot), 1.0F);
  }
}