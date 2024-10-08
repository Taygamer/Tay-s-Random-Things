package net.mcreator.taysrandomthings.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class EnragedAncientCrystalRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 50, Level.ExplosionInteraction.NONE);
		if (world instanceof ServerLevel _level) {
			LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
			entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
			_level.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FALLING_LAVA, x, y, z, 50, 3, 3, 3, 1);
		itemstack.setCount(0);
	}
}
