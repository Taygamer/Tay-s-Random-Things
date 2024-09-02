
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tays.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.tays.TaysMod;

public class TaysModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaysMod.MODID);
	public static final RegistryObject<CreativeModeTab> TAYS_RANDOM_THINGS = REGISTRY.register("tays_random_things",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tays.tays_random_things")).icon(() -> new ItemStack(TaysModItems.GAMEFOOLS_AXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TaysModItems.VOLCURREN_INGOT.get());
				tabData.accept(TaysModItems.GAMEFOOLS_AXE.get());
				tabData.accept(TaysModItems.GAMEFOOL_TOTEM.get());
			})

					.build());
}
