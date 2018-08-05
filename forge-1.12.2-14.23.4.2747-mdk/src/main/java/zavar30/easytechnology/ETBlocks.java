package zavar30.easytechnology;

import zavar30.easytechnology.blocks.SeedBlock;

public class ETBlocks 
{
	public static SeedBlock seed_block;
	
	public static void load()
	{
		seed_block = new SeedBlock("seed_block").setCreativeTab(EasyTechnology.tab);
	}
}
