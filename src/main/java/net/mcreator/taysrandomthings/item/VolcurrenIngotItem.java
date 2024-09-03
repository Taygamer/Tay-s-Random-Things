
package net.mcreator.taysrandomthings.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class VolcurrenIngotItem extends Item {
	public VolcurrenIngotItem() {
		super(new Item.Properties().stacksTo(4).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0.5f;
	}
}
