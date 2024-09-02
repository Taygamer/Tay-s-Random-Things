package net.mcreator.tays.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class FlopstersScytheRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
			entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(
					(entity instanceof ServerPlayer _player && !_player.level().isClientSide())
							? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getXSpawn())
							: 0,
					(entity instanceof ServerPlayer _player && !_player.level().isClientSide())
							? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getYSpawn())
							: 0,
					(entity instanceof ServerPlayer _player && !_player.level().isClientSide())
							? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getZSpawn())
							: 0)));;
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
