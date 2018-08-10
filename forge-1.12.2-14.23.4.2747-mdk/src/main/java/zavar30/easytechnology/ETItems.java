package zavar30.easytechnology;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import zavar30.easytechnology.items.BoerItem;
import zavar30.easytechnology.items.BoerylliumAxeItem;
import zavar30.easytechnology.items.BoerylliumPickaxeItem;
import zavar30.easytechnology.items.BoerylliumSpadeItem;
import zavar30.easytechnology.items.BoerylliumSwordItem;
import zavar30.easytechnology.items.SeedItem;
import zavar30.easytechnology.items.SimpleItem;

public class ETItems
{
  public static SimpleItem boer_case;
  public static BoerItem boer;
  public static SimpleItem boer_main;
  public static SimpleItem boeryllium_ingot;
  public static SimpleItem boeryllium_ingot_raw;
  public static SimpleItem boer_controller;
  public static SeedItem seed;
  public static SeedItem seed_golden;
  public static SeedItem pack;
  public static SeedItem golden_pack;
  public static BoerylliumPickaxeItem pickaxe;
  public static BoerylliumSwordItem sword;
  public static BoerylliumSpadeItem spade;
  public static BoerylliumAxeItem axe;
  private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {});
  private static ToolMaterial boerToolMaterial = EnumHelper.addToolMaterial("BOER", 3, 1000, 15.0F, 0.0F, 0);
  private static ToolMaterial boerylliumToolMaterial = EnumHelper.addToolMaterial("boeryllium", 3, 500, 10.0F, 7.0F, 5);
  
  public static void load()
  {
	  seed = new SeedItem("seed", 1, 1, false).setCreativeTab(EasyTechnology.tab);
	  seed_golden = new SeedItem("seed_golden", 3, 5, false).setCreativeTab(EasyTechnology.tab);
	  pack = new SeedItem("simple_pack", 5, 5, false).setCreativeTab(EasyTechnology.tab);
	  golden_pack = new SeedItem("golden_pack", 7, 7, false).setCreativeTab(EasyTechnology.tab).setEffect(21, 3000, 10);
	  boer_main = new SimpleItem("boer_main").setCreativeTab(EasyTechnology.tab);
	  boer_case = new SimpleItem("boer_case").setCreativeTab(EasyTechnology.tab);
	  boer = new BoerItem(-1.0F, -1.0F, boerToolMaterial, EFFECTIVE_ON, "boer").setCreativeTab(EasyTechnology.tab);
	  boeryllium_ingot = new SimpleItem("boeryllium_ingot").setCreativeTab(EasyTechnology.tab);
	  boeryllium_ingot_raw = new SimpleItem("boeryllium_ingot_raw").setCreativeTab(EasyTechnology.tab);
	  boer_controller = new SimpleItem("boer_controller").setCreativeTab(EasyTechnology.tab);
	  pickaxe = new BoerylliumPickaxeItem(boerylliumToolMaterial, "boeryllium_pickaxe").setCreativeTab(EasyTechnology.tab);
	  sword = new BoerylliumSwordItem(boerylliumToolMaterial, "boeryllium_sword").setCreativeTab(EasyTechnology.tab);
	  spade = new BoerylliumSpadeItem(boerylliumToolMaterial, "boeryllium_spade").setCreativeTab(EasyTechnology.tab);
	  axe = new BoerylliumAxeItem(boerylliumToolMaterial, "boeryllium_axe").setCreativeTab(EasyTechnology.tab);
  }
}
