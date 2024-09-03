
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.taysrandomthings.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TaysrandomthingsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == TaysrandomthingsModVillagerProfessions.LITHUIUM_DEALER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(TaysrandomthingsModItems.LITHIUM.get()), 10, 10, 0.05f));
		}
		if (event.getType() == TaysrandomthingsModVillagerProfessions.LITHUIUM_DEALER.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32),

					new ItemStack(TaysrandomthingsModItems.HYDROPHOBIC_TEMPLATE.get()), 10, 15, 0.05f));
		}
	}
}
