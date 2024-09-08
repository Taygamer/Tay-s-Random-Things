
package net.mcreator.taysrandomthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.taysrandomthings.procedures.TaysSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.taysrandomthings.procedures.EndScytheRightclickedProcedure;
import net.mcreator.taysrandomthings.init.TaysrandomthingsModItems;

public class TaysSwordItem extends SwordItem {
	public TaysSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 15000;
			}

			public float getSpeed() {
				return 3.5f;
			}

			public float getAttackDamageBonus() {
				return 12.5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 50;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TaysrandomthingsModItems.ENDER_CRYSTAL.get()));
			}
		}, 3, -2.5f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		TaysSwordLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		EndScytheRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}
}
