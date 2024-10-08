
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysrandomthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.taysrandomthings.TaysrandomthingsMod;

public class TaysrandomthingsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaysrandomthingsMod.MODID);
	public static final RegistryObject<CreativeModeTab> TAYS_RANDOM_THINGS = REGISTRY.register("tays_random_things",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.taysrandomthings.tays_random_things")).icon(() -> new ItemStack(TaysrandomthingsModItems.GAMEFOOLS_AXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TaysrandomthingsModItems.VOLCURREN_INGOT.get());
				tabData.accept(TaysrandomthingsModItems.GAMEFOOLS_AXE.get());
				tabData.accept(TaysrandomthingsModItems.GAMEFOOL_TOTEM.get());
				tabData.accept(TaysrandomthingsModItems.FLOPSTERS_SCYTHE.get());
				tabData.accept(TaysrandomthingsModItems.FLOP_TOTEM.get());
				tabData.accept(TaysrandomthingsModItems.LITHIUM.get());
				tabData.accept(TaysrandomthingsModItems.HYDROPHOBIC_TEMPLATE.get());
				tabData.accept(TaysrandomthingsModItems.HYDROFOOL_AXE.get());
				tabData.accept(TaysrandomthingsModItems.ENRAGED_ANCIENT_CRYSTAL.get());
				tabData.accept(TaysrandomthingsModItems.ENRAGEDTEMPLATE.get());
				tabData.accept(TaysrandomthingsModItems.ENRAGEDSCYTHE.get());
				tabData.accept(TaysrandomthingsModItems.COMPOUND_V.get());
				tabData.accept(TaysrandomthingsModBlocks.OVERCHARGED_ENDSTONE.get().asItem());
				tabData.accept(TaysrandomthingsModItems.ENDER_CRYSTAL.get());
				tabData.accept(TaysrandomthingsModItems.END_SCYTHE.get());
				tabData.accept(TaysrandomthingsModItems.END_AXE.get());
				tabData.accept(TaysrandomthingsModItems.SUPER_V.get());
				tabData.accept(TaysrandomthingsModItems.VOLCURREN_ARMOR_HELMET.get());
				tabData.accept(TaysrandomthingsModItems.VOLCURREN_ARMOR_CHESTPLATE.get());
				tabData.accept(TaysrandomthingsModItems.VOLCURREN_ARMOR_LEGGINGS.get());
				tabData.accept(TaysrandomthingsModItems.VOLCURREN_ARMOR_BOOTS.get());
				tabData.accept(TaysrandomthingsModItems.AMETHYST_ARMOUR_ARMOR_HELMET.get());
				tabData.accept(TaysrandomthingsModItems.AMETHYST_ARMOUR_ARMOR_CHESTPLATE.get());
				tabData.accept(TaysrandomthingsModItems.AMETHYST_ARMOUR_ARMOR_LEGGINGS.get());
				tabData.accept(TaysrandomthingsModItems.AMETHYST_ARMOUR_ARMOR_BOOTS.get());
				tabData.accept(TaysrandomthingsModItems.TAYS_SWORD.get());
				tabData.accept(TaysrandomthingsModItems.TAY_TOTEM.get());
			})

					.build());
}
