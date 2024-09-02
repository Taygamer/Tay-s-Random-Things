
package net.mcreator.tays.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.tays.procedures.GamefoolsAxeToolInHandTickProcedure;
import net.mcreator.tays.procedures.FlopstersScytheRightclickedProcedure;

import java.util.List;

public class FlopstersScytheItem extends SwordItem {
	public FlopstersScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 16000;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 11.4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.DIAMOND));
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		FlopstersScytheRightclickedProcedure.execute(world, entity);
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("A Scythe Made From Ancient Crystals"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			GamefoolsAxeToolInHandTickProcedure.execute(entity);
	}
}
