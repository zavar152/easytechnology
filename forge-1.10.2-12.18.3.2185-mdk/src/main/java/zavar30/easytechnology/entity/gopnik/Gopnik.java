package zavar30.easytechnology.entity.gopnik;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import zavar30.easytechnology.ETItems;

public class Gopnik extends EntityMob
{
	public Gopnik(World worldIn) 
	{
		super(worldIn);
		this.setSize(2.0F, 2.0F);
	}
	
	@Override 
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
       // this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
      //  this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, ETItems.seed_golden, false));
      //  this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(7, new EntityAIAttackMelee(this, 5F, true));
        this.applyEntityAI();
    }

	protected void applyEntityAI()
    { 
    	this.targetTasks.addTask(7, new EntityAINearestAttackableTarget<EntityMob>(this, EntityMob.class, true));
    }

	@Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
    }

	@Override
	public float getEyeHeight() 
	{
		return 1.3F;
	}
}
