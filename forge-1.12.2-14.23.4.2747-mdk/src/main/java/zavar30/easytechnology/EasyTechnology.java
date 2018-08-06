package zavar30.easytechnology;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zavar30.easytechnology.proxy.CommonProxy;

@Mod(modid="easytechnology", useMetadata=true, acceptedMinecraftVersions="[1.12.2]")
public class EasyTechnology
{
  @Instance("easytechnology")
  public static EasyTechnology instance;  
	
  @SidedProxy(clientSide="zavar30.easytechnology.proxy.ClientProxy", serverSide="zavar30.easytechnology.proxy.CommonProxy")
  public static CommonProxy proxy;
  
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    System.out.println("EasyTechnology Mod PRE-INIT");
    proxy.preInit(event);
    ETBlocks.load();
    ETItems.load();
    ETMobs.load();
  }
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent event)
  {
    System.out.println("EasyTechnology Mod INIT");
    proxy.init(event);
    ETRecipes.load();
  }
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event)
  {
    System.out.println("EasyTechnology Mod POST-INIT");
    proxy.postInit(event);
  }
  
  public static CreativeTabs tab = new CreativeTabs("ETtab")
  {
    public ItemStack getTabIconItem()
    {
      return new ItemStack(ETItems.boer);
    }
  };
}
