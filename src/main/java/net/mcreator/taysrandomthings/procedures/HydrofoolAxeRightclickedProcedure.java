package net.mcreator.taysrandomthings.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

public class HydrofoolAxeRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 1, Level.ExplosionInteraction.NONE);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1000, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
