
package net.mcreator.tays.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.tays.procedures.GamefoolsAxeToolInHandTickProcedure;
import net.mcreator.tays.init.TaysModItems;

import java.util.List;

public class GamefoolsAxeItem extends AxeItem {
	public GamefoolsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 15000;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TaysModItems.VOLCURREN_INGOT.get()));
			}
		}, 1, -3.4f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Forged In The Ever Lasting of Volcurren"));
		list.add(Component.literal(""));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			GamefoolsAxeToolInHandTickProcedure.execute(entity);
	}
}
