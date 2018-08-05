package zavar30.easytechnology.entity.gopnik;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class GopnikRender extends RenderLiving<Gopnik>
{
	public static final ResourceLocation textures = new ResourceLocation("easytechnology:textures/entity/gopnik.png");
	
	public GopnikRender(RenderManager rendermanagerIn) 
	{
		super(rendermanagerIn, new ModelGopnik(), 1.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Gopnik entity) 
	{
		return textures;
	}
	
	@Override
	protected float interpolateRotation(float prevYawOffset, float yawOffset, float partialTicks) 
	{
		return super.interpolateRotation(prevYawOffset, yawOffset, partialTicks);
	}
}
