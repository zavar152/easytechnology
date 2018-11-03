package zavar30.easytechnology.items;

import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import zavar30.easytechnology.EasyTechnology;

public class BoerItem extends ItemTool
{
	private Material[] m = {Material.ROCK, Material.ANVIL, Material.CORAL, Material.GROUND, Material.CLAY, Material.GRASS, Material.IRON, Material.SAND, Material.SNOW, Material.PISTON, Material.CIRCUITS, Material.CRAFTED_SNOW, Material.DRAGON_EGG};
	private float e;
	private ITextComponent tct = new TextComponentTranslation("boer.info.text", "dank");
	private ITextComponent tct2 = new TextComponentTranslation("boer.reload.text", "dank");
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public BoerItem(float attackDamage, float attackSpeed, ToolMaterial material, Set effectiveBlocks, String name)
	{
	  super(attackSpeed, attackSpeed, material, effectiveBlocks);
	  this.setRegistryName(name);
	  this.setUnlocalizedName(name);
	  this.setHarvestLevel("shovel", material.getHarvestLevel());
	  this.setHarvestLevel("pickaxe", material.getHarvestLevel());
	  this.efficiency = material.getEfficiency();
	  e = material.getEfficiency();
	  this.setMaxDamage(material.getMaxUses());
	  this.setMaxStackSize(1);
	  this.attackSpeed = attackSpeed;
	  this.attackDamage = attackDamage; 
	  registerItem(name);
	}

	@Override
	public BoerItem setCreativeTab(CreativeTabs tab)
	{
	  super.setCreativeTab(tab);
	  return this;
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) 
	{
		tooltip.add(tct.getFormattedText() + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage() + " " + tct2.getFormattedText());
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		ItemStack boer = playerIn.inventory.getCurrentItem();
		for (int i = 0; i < playerIn.inventory.getSizeInventory(); i++)
		{
		  ItemStack coal = playerIn.inventory.getStackInSlot(i);
		  if ((isCoal(coal)) && (coal.getCount() == 64) && (boer.getItemDamage() == boer.getMaxDamage() - 1))
		  {
		    //coal.setCount(coal.getCount() - 32);
		    boer.setItemDamage(0);
		    //if(coal.getCount() == 0)
		    //{
		    	playerIn.inventory.deleteStack(coal);
		    //}
		 }
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) 
	{
		stack.setItemDamage(stack.getMaxDamage() - 1);
		super.onCreated(stack, worldIn, playerIn);
	}
		
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
	{
	  if (isSelected) {
	    if (stack.getItemDamage() >= stack.getMaxDamage() - 1) 
	    {
	      this.efficiency = -1.0F;
	    } 
	    else 
	    {
	      this.efficiency = e;
	    }
	  }
	  super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}

	protected boolean isCoal(@Nullable ItemStack stack)
	{
	  return (stack != null) && ((stack.getItem() instanceof ItemCoal));
	}

	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state) 
	{
	  for(int k = 0; k < m.length; k++)
	  {
		if(state.getMaterial() == m[k] | state.getBlock().isToolEffective("shovel", state) | state.getBlock().isToolEffective("pickaxe", state))
		{
			return this.efficiency;
		}
		}
	  return 1.0F;
	}
	
	@Override
	public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
	{
	  if (!world.isRemote) {
	    if(stack.getDestroySpeed(state) != 1.0F)
	    {
	      float pitch = entityLiving.rotationPitch;
	      EnumFacing o = entityLiving.getHorizontalFacing();
	      int i = pos.getX();
	      int j = pos.getY();
	      int k = pos.getZ();
	      if((pitch > 45.0f && pitch <= 90.0f) | (pitch < -45.0f && pitch >= -90.0f))
	      {
	        for (int i1 = i + 1; i1 >= i - 1; i1--) {
	          for (int k1 = k + 1; k1 >= k - 1; k1--) {
	            if (!Block.isEqualTo(world.getBlockState(new BlockPos(i1, j, k1)).getBlock(), Blocks.BEDROCK) && stack.getDestroySpeed(world.getBlockState(new BlockPos(i1, j, k1))) != 1.0F)
	            {
	              world.getBlockState(new BlockPos(i1, j, k1)).getBlock().dropBlockAsItem(world, new BlockPos(i1, j, k1), world.getBlockState(new BlockPos(i1, j, k1)), 1);
	              world.setBlockToAir(new BlockPos(i1, j, k1));
	            }
	          }
	        }
	      }
	      else if (o.getIndex() == 5 && (pitch <= 45.0f || pitch > 90.0f) | (pitch < -45.0f && pitch >= -90.0f))
	      {
	            for (int j1 = j + 1; j1 >= j - 1; j1--) {
	              for (int k1 = k + 1; k1 >= k - 1; k1--) {
	                if (!Block.isEqualTo(world.getBlockState(new BlockPos(i, j1, k1)).getBlock(), Blocks.BEDROCK) && stack.getDestroySpeed(world.getBlockState(new BlockPos(i, j1, k1))) != 1.0F)
	                {
	                  world.getBlockState(new BlockPos(i, j1, k1)).getBlock().dropBlockAsItem(world, new BlockPos(i, j1, k1), world.getBlockState(new BlockPos(i, j1, k1)), 1);
	                  world.setBlockToAir(new BlockPos(i, j1, k1));
	                }
	              }
	            }
	      }
	      else if (o.getIndex() == 4 && (pitch <= 45.0f || pitch > 90.0f) | (pitch < -45.0f && pitch >= -90.0f))
	          {
	            for (int j1 = j + 1; j1 >= j - 1; j1--) {
	              for (int k1 = k + 1; k1 >= k - 1; k1--) {
	                if (!Block.isEqualTo(world.getBlockState(new BlockPos(i, j1, k1)).getBlock(), Blocks.BEDROCK) && stack.getDestroySpeed(world.getBlockState(new BlockPos(i, j1, k1))) != 1.0F)
	                {
	                  world.getBlockState(new BlockPos(i, j1, k1)).getBlock().dropBlockAsItem(world, new BlockPos(i, j1, k1), world.getBlockState(new BlockPos(i, j1, k1)), 1);
	                  world.setBlockToAir(new BlockPos(i, j1, k1));
	                }
	              }
	            }
	          }
	      else if (o.getIndex() == 3 && (pitch <= 45.0f || pitch > 90.0f) | (pitch < -45.0f && pitch >= -90.0f))
	      {
	            for (int i1 = i - 1; i1 <= i + 1; i1++) {
	              for (int j1 = j + 1; j1 >= j - 1; j1--) {
	                if (!Block.isEqualTo(world.getBlockState(new BlockPos(i1, j1, k)).getBlock(), Blocks.BEDROCK) && stack.getDestroySpeed(world.getBlockState(new BlockPos(i1, j1, k))) != 1.0F)
	                {
	                  world.getBlockState(new BlockPos(i1, j1, k)).getBlock().dropBlockAsItem(world, new BlockPos(i1, j1, k), world.getBlockState(new BlockPos(i1, j1, k)), 1);
	                  world.setBlockToAir(new BlockPos(i1, j1, k));
	                }
	              }
	            }
	      }
	      else if (o.getIndex() == 2 && (pitch <= 45.0f || pitch > 90.0f) | (pitch < -45.0f && pitch >= -90.0f))
	      {
	            for (int i1 = i - 1; i1 <= i + 1; i1++) {
	              for (int j1 = j + 1; j1 >= j - 1; j1--) {
	                if (!Block.isEqualTo(world.getBlockState(new BlockPos(i1, j1, k)).getBlock(), Blocks.BEDROCK) && stack.getDestroySpeed(world.getBlockState(new BlockPos(i1, j1, k))) != 1.0F)
	                {
	                  world.getBlockState(new BlockPos(i1, j1, k)).getBlock().dropBlockAsItem(world, new BlockPos(i1, j1, k), world.getBlockState(new BlockPos(i1, j1, k)), 1);
	                  world.setBlockToAir(new BlockPos(i1, j1, k));
	                }
	              }
	            }
	          }
	      stack.damageItem(1, entityLiving);
	    }
	  }
	  return true;
	 }

	private void registerItem(String name)
	{
		ForgeRegistries.ITEMS.register(this);
	    EasyTechnology.proxy.registerItemRenderer(this, 0, name);
	}
}

