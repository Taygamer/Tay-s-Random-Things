
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysrandomthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.taysrandomthings.entity.TayEntity;
import net.mcreator.taysrandomthings.entity.GamefoolEntity;
import net.mcreator.taysrandomthings.entity.FlopsterEntity;
import net.mcreator.taysrandomthings.TaysrandomthingsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TaysrandomthingsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TaysrandomthingsMod.MODID);
	public static final RegistryObject<EntityType<GamefoolEntity>> GAMEFOOL = register("gamefool",
			EntityType.Builder.<GamefoolEntity>of(GamefoolEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GamefoolEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FlopsterEntity>> FLOPSTER = register("flopster",
			EntityType.Builder.<FlopsterEntity>of(FlopsterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(500).setUpdateInterval(3).setCustomClientFactory(FlopsterEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TayEntity>> TAY = register("tay",
			EntityType.Builder.<TayEntity>of(TayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(TayEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GamefoolEntity.init();
			FlopsterEntity.init();
			TayEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GAMEFOOL.get(), GamefoolEntity.createAttributes().build());
		event.put(FLOPSTER.get(), FlopsterEntity.createAttributes().build());
		event.put(TAY.get(), TayEntity.createAttributes().build());
	}
}
