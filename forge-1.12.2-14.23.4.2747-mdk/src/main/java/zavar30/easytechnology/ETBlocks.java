package zavar30.easytechnology;

import zavar30.easytechnology.blocks.BoerylliumBlock;
import zavar30.easytechnology.blocks.BoerylliumOreBlock;
import zavar30.easytechnology.blocks.SeedBlock;

public class ETBlocks 
{
	public static SeedBlock seed_block;
	public static BoerylliumOreBlock boery_ore;
	public static BoerylliumBlock boery_block;
	
	public static void load()
	{
		boery_ore = new BoerylliumOreBlock("boeryllium_ore_block").setCreativeTab(EasyTechnology.tab);
		boery_block = new BoerylliumBlock("boeryllium_block").setCreativeTab(EasyTechnology.tab);
		seed_block = new SeedBlock("seed_block").setCreativeTab(EasyTechnology.tab);
	} 
}
