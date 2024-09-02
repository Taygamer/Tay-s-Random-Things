
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tays.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.tays.item.VolcurrenIngotItem;
import net.mcreator.tays.item.GamefoolsAxeItem;
import net.mcreator.tays.item.GamefoolTotemItem;
import net.mcreator.tays.item.FlopstersScytheItem;
import net.mcreator.tays.item.FlopTotemItem;
import net.mcreator.tays.TaysMod;

public class TaysModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TaysMod.MODID);
	public static final RegistryObject<Item> VOLCURREN_INGOT = REGISTRY.register("volcurren_ingot", () -> new VolcurrenIngotItem());
	public static final RegistryObject<Item> GAMEFOOLS_AXE = REGISTRY.register("gamefools_axe", () -> new GamefoolsAxeItem());
	public static final RegistryObject<Item> GAMEFOOL_SPAWN_EGG = REGISTRY.register("gamefool_spawn_egg", () -> new ForgeSpawnEggItem(TaysModEntities.GAMEFOOL, -16777216, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> GAMEFOOL_TOTEM = REGISTRY.register("gamefool_totem", () -> new GamefoolTotemItem());
	public static final RegistryObject<Item> FLOPSTERS_SCYTHE = REGISTRY.register("flopsters_scythe", () -> new FlopstersScytheItem());
	public static final RegistryObject<Item> FLOPSTER_SPAWN_EGG = REGISTRY.register("flopster_spawn_egg", () -> new ForgeSpawnEggItem(TaysModEntities.FLOPSTER, -6749953, -65281, new Item.Properties()));
	public static final RegistryObject<Item> FLOP_TOTEM = REGISTRY.register("flop_totem", () -> new FlopTotemItem());
	// Start of user code block custom items
	// End of user code block custom items
}
