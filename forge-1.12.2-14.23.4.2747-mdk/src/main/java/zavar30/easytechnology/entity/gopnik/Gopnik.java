package zavar30.easytechnology.entity.gopnik;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import zavar30.easytechnology.ETItems;

public class Gopnik extends EntityCreature
{
	public Gopnik(World worldIn) 
	{
		super(worldIn);
		this.setSize(2.0F, 2.0F);
		this.setHealth(20);
		this.setAIMoveSpeed((float) 10.0D);
	}
	
	@Override
	protected Item getDropItem() 
	{
		return new ItemStack(ETItems.golden_pack).getItem();
	}
	
	@Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIMoveTowardsRestriction(this, 10.0D));
        this.tasks.addTask(0, new EntityAIWander(this, 10.0D));
        this.tasks.addTask(0, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
        this.tasks.addTask(0, new EntityAILookIdle(this));
    }
}
