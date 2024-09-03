
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysrandomthings.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.taysrandomthings.client.renderer.GamefoolRenderer;
import net.mcreator.taysrandomthings.client.renderer.FlopsterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TaysrandomthingsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TaysrandomthingsModEntities.GAMEFOOL.get(), GamefoolRenderer::new);
		event.registerEntityRenderer(TaysrandomthingsModEntities.FLOPSTER.get(), FlopsterRenderer::new);
	}
}
