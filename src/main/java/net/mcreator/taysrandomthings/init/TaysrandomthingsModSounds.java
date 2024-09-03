
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysrandomthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.taysrandomthings.TaysrandomthingsMod;

public class TaysrandomthingsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TaysrandomthingsMod.MODID);
	public static final RegistryObject<SoundEvent> HEARTBEAT = REGISTRY.register("heartbeat", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("taysrandomthings", "heartbeat")));
}
