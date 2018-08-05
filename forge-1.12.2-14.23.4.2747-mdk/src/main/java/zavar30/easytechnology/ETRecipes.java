package zavar30.easytechnology;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

public class ETRecipes
{
  public static void load()
  {
    /*GameRegistry.addRecipe(new ItemStack(ETItems.boer, 1), new Object[] 
    		{ "   ", " B ", " A ", 'A', ETItems.boer_case, 'B', ETItems.boer_main });
    GameRegistry.addRecipe(new ItemStack(ETItems.boer_main, 1), new Object[] 
    		{ " I ", "IDI", "IDI", 'D', Items.DIAMOND, 'I', Items.IRON_INGOT });
    GameRegistry.addRecipe(new ItemStack(ETItems.boer_case, 1), new Object[] 
    		{ "   ", "GI ", "GG ", 'G', new ItemStack(Blocks.WOOL, 1, 5), 'I', Items.IRON_INGOT });*/
	  CraftingHelper.register(new ResourceLocation("easytechnology", "boer"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation("easytechnology", "boer_case"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	  CraftingHelper.register(new ResourceLocation("easytechnology", "boer_main"), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
  }
}
