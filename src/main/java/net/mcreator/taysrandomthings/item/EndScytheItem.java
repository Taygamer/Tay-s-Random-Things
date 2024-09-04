
package net.mcreator.taysrandomthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.taysrandomthings.procedures.EndScytheToolInInventoryTickProcedure;
import net.mcreator.taysrandomthings.procedures.EndScytheToolInHandTickProcedure;
import net.mcreator.taysrandomthings.procedures.EndScytheRightclickedProcedure;
import net.mcreator.taysrandomthings.init.TaysrandomthingsModItems;
import net.mcreator.taysrandomthings.init.TaysrandomthingsModBlocks;

import java.util.List;

public class EndScytheItem extends SwordItem {
	public EndScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 20000;
			}

			public float getSpeed() {
				return 15f;
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
				return Ingredient.of(new ItemStack(TaysrandomthingsModItems.ENDER_CRYSTAL.get()), new ItemStack(TaysrandomthingsModBlocks.OVERCHARGED_ENDSTONE.get()));
			}
		}, 3, -1f, new Item.Properties().fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		EndScytheRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Overloaded on Power!"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		EndScytheRightclickedProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			EndScytheToolInHandTickProcedure.execute(entity);
		EndScytheToolInInventoryTickProcedure.execute(entity);
	}
}
