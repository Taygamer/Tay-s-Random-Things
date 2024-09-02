
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.tays.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TaysModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == TaysModVillagerProfessions.LITHUIUM_DEALER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(TaysModItems.LITHIUM.get()), 10, 10, 0.05f));
		}
		if (event.getType() == TaysModVillagerProfessions.LITHUIUM_DEALER.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32),

					new ItemStack(TaysModItems.HYDROPHOBIC_TEMPLATE.get()), 10, 15, 0.05f));
		}
	}
}
