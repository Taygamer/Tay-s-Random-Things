package net.mcreator.taysrandomthings.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.taysrandomthings.TaysrandomthingsMod;

public class AmethystArmourArmorChestplateTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 10, 1));
		TaysrandomthingsMod.queueServerWork(9999, () -> {
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(5);
		});
	}
}
