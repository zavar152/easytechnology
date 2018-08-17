package zavar30.easytechnology;

import net.minecraftforge.fml.common.registry.GameRegistry;
import zavar30.easytechnology.blocks.BoerylliumBlock;
import zavar30.easytechnology.blocks.BoerylliumOreBlock;
import zavar30.easytechnology.blocks.SeedBlock;
import zavar30.easytechnology.blocks.machines.double_furnace.DoubleFurnaceBlock;
import zavar30.easytechnology.blocks.machines.double_furnace.DoubleFurnaceTileEntity;

public class ETBlocks 
{
	public static SeedBlock seed_block;
	public static BoerylliumOreBlock boery_ore;
	public static BoerylliumBlock boery_block;
	public static DoubleFurnaceBlock double_furnace;
	
	public static void load()
	{
		boery_ore = new BoerylliumOreBlock("boeryllium_ore_block").setCreativeTab(EasyTechnology.tab);
		boery_block = new BoerylliumBlock("boeryllium_block").setCreativeTab(EasyTechnology.tab);
		seed_block = new SeedBlock("seed_block").setCreativeTab(EasyTechnology.tab);
		double_furnace = new DoubleFurnaceBlock("double_furnace").setCreativeTab(EasyTechnology.tab);
		loadTileEntities();
	} 
	
	@SuppressWarnings("deprecation")
	private static void loadTileEntities()
	{
	    GameRegistry.registerTileEntity(DoubleFurnaceTileEntity.class, "double_furnace");
	}
}

