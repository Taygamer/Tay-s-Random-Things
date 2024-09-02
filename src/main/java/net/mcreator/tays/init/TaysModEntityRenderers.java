
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tays.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.tays.client.renderer.GamefoolRenderer;
import net.mcreator.tays.client.renderer.FlopsterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TaysModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TaysModEntities.GAMEFOOL.get(), GamefoolRenderer::new);
		event.registerEntityRenderer(TaysModEntities.FLOPSTER.get(), FlopsterRenderer::new);
	}
}
