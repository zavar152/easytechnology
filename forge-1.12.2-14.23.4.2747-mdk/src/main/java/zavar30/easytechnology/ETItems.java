package zavar30.easytechnology;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import zavar30.easytechnology.items.BoerItem;
import zavar30.easytechnology.items.SeedItem;
import zavar30.easytechnology.items.SimpleItem;

public class ETItems
{
  public static SimpleItem boer_case;
  public static BoerItem boer;
  public static SimpleItem boer_main;
  public static SeedItem seed;
  public static SeedItem seed_golden;
  public static SeedItem pack;
  public static SeedItem golden_pack;
  private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {});//(new Block[] {Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH, Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE});
  private static ToolMaterial boerToolMaterial = EnumHelper.addToolMaterial("BOER", 3, 1000, 15.0F, 0.0F, 0);
  
  public static void load()
  {
	  seed = new SeedItem("seed", 1, 1, false).setCreativeTab(EasyTechnology.tab);
	  seed_golden = new SeedItem("seed_golden", 3, 5, false).setCreativeTab(EasyTechnology.tab);
	  pack = new SeedItem("simple_pack", 5, 5, false).setCreativeTab(EasyTechnology.tab);
	  golden_pack = new SeedItem("golden_pack", 7, 7, false).setCreativeTab(EasyTechnology.tab).setEffect(21, 3000, 10);
	  boer_main = new SimpleItem("boer_main").setCreativeTab(EasyTechnology.tab);
	  boer_case = new SimpleItem("boer_case").setCreativeTab(EasyTechnology.tab);
	  boer = new BoerItem(-1.0F, -1.0F, boerToolMaterial, EFFECTIVE_ON, "boer").setCreativeTab(EasyTechnology.tab);
  }
}
