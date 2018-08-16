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
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boer"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boer_case"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boer_main"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boer_controller"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boeryllium_block"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "seed_block"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "simple_pack"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "golden_pack"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boeryllium_pickaxe"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boeryllium_sword"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boeryllium_spade"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boeryllium_axe"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boeryllium_hoe"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boeryllium_helmet"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boeryllium_chestplate"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boeryllium_leggings"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "boeryllium_boots"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "seed"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation(ETConstants.MODID, "seed_golden"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  
	  FurnaceRecipes.instance().addSmelting(ETItems.boeryllium_ingot_raw, new ItemStack(ETItems.boeryllium_ingot), 1.0F);
  }
}