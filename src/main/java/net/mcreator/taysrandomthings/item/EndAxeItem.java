
package net.mcreator.taysrandomthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.taysrandomthings.procedures.EndScytheRightclickedProcedure;
import net.mcreator.taysrandomthings.procedures.EndAxeToolInHandTickProcedure;
import net.mcreator.taysrandomthings.init.TaysrandomthingsModItems;
import net.mcreator.taysrandomthings.init.TaysrandomthingsModBlocks;

public class EndAxeItem extends AxeItem {
	public EndAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 18000;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TaysrandomthingsModItems.ENDER_CRYSTAL.get()), new ItemStack(TaysrandomthingsModItems.VOLCURREN_INGOT.get()), new ItemStack(TaysrandomthingsModBlocks.OVERCHARGED_ENDSTONE.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		EndScytheRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			EndAxeToolInHandTickProcedure.execute(entity);
	}
}
