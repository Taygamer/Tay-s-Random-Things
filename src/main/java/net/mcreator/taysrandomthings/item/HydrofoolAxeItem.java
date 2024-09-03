
package net.mcreator.taysrandomthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.taysrandomthings.procedures.HydrofoolAxeRightclickedProcedure;
import net.mcreator.taysrandomthings.init.TaysrandomthingsModItems;

import java.util.List;

public class HydrofoolAxeItem extends AxeItem {
	public HydrofoolAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 15000;
			}

			public float getSpeed() {
				return 7.5f;
			}

			public float getAttackDamageBonus() {
				return 12.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TaysrandomthingsModItems.VOLCURREN_INGOT.get()), new ItemStack(TaysrandomthingsModItems.LITHIUM.get()));
			}
		}, 1, -3.3f, new Item.Properties().fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		HydrofoolAxeRightclickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Infused with Lithium to make it Lighter"));
	}
}
