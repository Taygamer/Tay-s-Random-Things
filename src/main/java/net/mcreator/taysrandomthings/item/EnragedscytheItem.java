
package net.mcreator.taysrandomthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.taysrandomthings.procedures.EnragedscytheToolInHandTickProcedure;
import net.mcreator.taysrandomthings.init.TaysrandomthingsModItems;

public class EnragedscytheItem extends SwordItem {
	public EnragedscytheItem() {
		super(new Tier() {
			public int getUses() {
				return 16000;
			}

			public float getSpeed() {
				return 11.5f;
			}

			public float getAttackDamageBonus() {
				return 12.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TaysrandomthingsModItems.ENRAGED_ANCIENT_CRYSTAL.get()), new ItemStack(TaysrandomthingsModItems.VOLCURREN_INGOT.get()));
			}
		}, 3, -2f, new Item.Properties());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			EnragedscytheToolInHandTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
