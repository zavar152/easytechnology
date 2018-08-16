package zavar30.easytechnology.blocks.machines;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotDoubleFurnaceFuel extends Slot 
{
		public SlotDoubleFurnaceFuel(IInventory inventory, int index, int x, int y) 
		{
			super(inventory, index, x, y);
		}
		
		@Override
		public boolean isItemValid(ItemStack stack)
		{
			return DoubleFurnaceTileEntity.isItemFuel(stack);
		}
		
		@Override
		public int getItemStackLimit(ItemStack stack) 
		{
			return super.getItemStackLimit(stack);
		}
}
