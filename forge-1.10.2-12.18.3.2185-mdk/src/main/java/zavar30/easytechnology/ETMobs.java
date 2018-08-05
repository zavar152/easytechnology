package zavar30.easytechnology;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import zavar30.easytechnology.entity.gopnik.Gopnik;
import zavar30.easytechnology.entity.gopnik.GopnikRender;

public class ETMobs 
{
	public static void load()
	{
		registerEntity(Gopnik.class, "gopnik", 228, 50, 000000, 000000);
	}
	
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int id, int trackingRange, int eggPrimary, int eggSecondary)
	{
		EntityRegistry.registerModEntity(entityClass, entityName, id, EasyTechnology.instance, trackingRange, 1, true, eggPrimary, eggSecondary);
	}
	
	public static void registerRenderGopnik()
	{
		RenderingRegistry.registerEntityRenderingHandler(Gopnik.class, new IRenderFactory<Gopnik>()
		{
			@Override
			public Render<? super Gopnik> createRenderFor(RenderManager manager) 
			{
				return new GopnikRender(manager);
			}			
		});
	}
}
