package zavar30.easytechnology;

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
  }
}
