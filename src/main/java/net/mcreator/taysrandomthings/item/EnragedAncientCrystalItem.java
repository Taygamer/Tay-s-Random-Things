
package net.mcreator.taysrandomthings.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.taysrandomthings.procedures.EnragedAncientCrystalRightclickedProcedure;

import java.util.List;

public class EnragedAncientCrystalItem extends Item {
	public EnragedAncientCrystalItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Holds the Power of a Million Wardens"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		EnragedAncientCrystalRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), ar.getObject());
		return ar;
	}
}
