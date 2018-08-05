package zavar30.easytechnology;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ETRecipes
{
  public static void load()
  {
    GameRegistry.addRecipe(new ItemStack(ETItems.boer, 1), new Object[] 
    		{ "   ", " B ", " A ", 'A', ETItems.boer_case, 'B', ETItems.boer_main });
    GameRegistry.addRecipe(new ItemStack(ETItems.boer_main, 1), new Object[] 
    		{ " I ", "IDI", "IDI", 'D', Items.DIAMOND, 'I', Items.IRON_INGOT });
    GameRegistry.addRecipe(new ItemStack(ETItems.boer_case, 1), new Object[] 
    		{ "   ", "GI ", "GG ", 'G', new ItemStack(Blocks.WOOL, 1, 5), 'I', Items.IRON_INGOT });
  }
}

