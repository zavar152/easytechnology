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
    		{   "   ", 
    			" B ", 
    			" A ", 'A', ETItems.boer_case, 'B', ETItems.boer_main });
    GameRegistry.addRecipe(new ItemStack(ETItems.boer_main, 1), new Object[] 
    		{   " I ", 
    		    "IDI", 
    			"IDI", 'D', Items.DIAMOND, 'I', Items.IRON_INGOT });
    GameRegistry.addRecipe(new ItemStack(ETItems.boer_case, 1), new Object[] 
    		{   "GIG",
    	        "ICI",
    	        "GIG", 'G', new ItemStack(Blocks.WOOL, 1, 5), 'I', ETItems.boeryllium_ingot, 'C', ETItems.boer_controller });
    GameRegistry.addRecipe(new ItemStack(ETItems.boer_controller, 1), new Object[] 
    		{   "IRI",
    	        "PIS",
    	        "IRI", 'R', Items.REDSTONE, 'I', ETItems.boeryllium_ingot, 'P', Items.DIAMOND_PICKAXE, 'S', Items.DIAMOND_SHOVEL});
    GameRegistry.addRecipe(new ItemStack(ETBlocks.boery_block, 1), new Object[] 
    		{   "III",
    	        "III",
    	        "III", 'I', ETItems.boeryllium_ingot});
    GameRegistry.addRecipe(new ItemStack(ETItems.boeryllium_boots, 1), new Object[] 
    		{   "   ",
    	        "I I",
    	        "I I", 'I', ETItems.boeryllium_ingot});
    GameRegistry.addRecipe(new ItemStack(ETItems.boeryllium_chestplate, 1), new Object[] 
    		{   "I I",
    	        "III",
    	        "III", 'I', ETItems.boeryllium_ingot});
    GameRegistry.addRecipe(new ItemStack(ETItems.boeryllium_helmet, 1), new Object[] 
    		{   "III",
    	        "I I",
    	        "   ", 'I', ETItems.boeryllium_ingot});
    GameRegistry.addRecipe(new ItemStack(ETItems.boeryllium_leggings, 1), new Object[] 
    		{   "III",
    	        "I I",
    	        "I I", 'I', ETItems.boeryllium_ingot});
    GameRegistry.addRecipe(new ItemStack(ETBlocks.seed_block, 1), new Object[] 
    		{   "SSS",
    	        "SSS",
    	        "SSS", 'S', ETItems.seed});
    GameRegistry.addRecipe(new ItemStack(ETItems.boeryllium_pickaxe, 1), new Object[] 
    		{   "III",
    	        " S ",
    	        " S ", 'I', ETItems.boeryllium_ingot, 'S', Items.STICK});
    GameRegistry.addRecipe(new ItemStack(ETItems.boeryllium_axe, 1), new Object[] 
    		{   "II ",
    	        "IS ",
    	        " S ", 'I', ETItems.boeryllium_ingot, 'S', Items.STICK});
    GameRegistry.addRecipe(new ItemStack(ETItems.boeryllium_hoe, 1), new Object[] 
    		{   "II ",
    	        " S ",
    	        " S ", 'I', ETItems.boeryllium_ingot, 'S', Items.STICK});
    GameRegistry.addRecipe(new ItemStack(ETItems.boeryllium_spade, 1), new Object[] 
    		{   " I ",
    	        " S ",
    	        " S ", 'I', ETItems.boeryllium_ingot, 'S', Items.STICK});
    GameRegistry.addRecipe(new ItemStack(ETItems.boeryllium_sword, 1), new Object[] 
    		{   " I ",
    	        " I ",
    	        " S ", 'I', ETItems.boeryllium_ingot, 'S', Items.STICK});
    GameRegistry.addRecipe(new ItemStack(ETItems.simple_pack, 1), new Object[] 
    		{   "SSS",
    	        "PSP",
    	        " P ", 'S', ETItems.seed, 'P', Items.PAPER});
    GameRegistry.addRecipe(new ItemStack(ETItems.golden_pack, 1), new Object[] 
    		{   "SSS",
    	        "PSP",
    	        " P ", 'S', ETItems.seed_golden, 'P', Items.PAPER});
    
    GameRegistry.addSmelting(ETItems.boeryllium_ingot_raw, new ItemStack(ETItems.boeryllium_ingot), 1.0F);
  }
}

