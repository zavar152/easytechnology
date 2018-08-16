package zavar30.easytechnology;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import zavar30.easytechnology.entity.gopnik.EntityGopnik;
import zavar30.easytechnology.entity.gopnik.RenderGopnik;

public class ETMobs 
{
	public static void load()
	{
		registerEntity(EntityGopnik.class, "gopnik", 228, 50, 000000, 000000);
	}
	
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int id, int trackingRange, int eggPrimary, int eggSecondary)
	{
		EntityRegistry.registerModEntity(ETConstants.GOPNIK, entityClass, entityName, id, EasyTechnology.instance, trackingRange, 1, true, eggPrimary, eggSecondary);
	}
	
	public static void registerRenderGopnik()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityGopnik.class, new IRenderFactory<EntityGopnik>()
		{
			@Override
			public Render<? super EntityGopnik> createRenderFor(RenderManager manager) 
			{
				return new RenderGopnik(manager);
			}			
		});
	}
}
