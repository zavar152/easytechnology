package zavar30.easytechnology.blocks.machines;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.item.ItemStack;
import zavar30.easytechnology.ETBlocks;
import zavar30.easytechnology.ETItems;

public class DoubleFurnaceRecipes2 
{	
		private static final DoubleFurnaceRecipes2 INSTANCE = new DoubleFurnaceRecipes2();
		private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
		private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
		
		public static DoubleFurnaceRecipes2 getInstance()
		{
			return INSTANCE;
		}
		
		private DoubleFurnaceRecipes2() 
		{
			addRecipe(new ItemStack(ETItems.seed), new ItemStack(ETItems.seed_golden), new ItemStack(ETBlocks.seed_block), 1.0F);
		}

		
		public void addRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
		{
			if(getResult(input1, input2) != ItemStack.EMPTY) return;
			this.smeltingList.put(input1, input2, result);
			this.experienceList.put(result, Float.valueOf(experience));
		}
		
		public ItemStack getResult(ItemStack input1, ItemStack input2) 
		{
			for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
			{
				if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
				{
					for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
					{
						if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
						{
							return (ItemStack)ent.getValue();
						}
					}
				}
			}
			return ItemStack.EMPTY;
		}
		
		private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
		{
			return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
		}
		
		public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList()
		{
			return this.smeltingList;
		}
		
		public float getExperience(ItemStack stack)
		{
			for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
			{
				if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
				{
					return ((Float)entry.getValue()).floatValue();
				}
			}
			return 0.0F;
		}
}
