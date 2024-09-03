
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysrandomthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.taysrandomthings.item.VolcurrenIngotItem;
import net.mcreator.taysrandomthings.item.LithiumItem;
import net.mcreator.taysrandomthings.item.HydrophobicTemplateItem;
import net.mcreator.taysrandomthings.item.HydrofoolAxeItem;
import net.mcreator.taysrandomthings.item.GamefoolsAxeItem;
import net.mcreator.taysrandomthings.item.GamefoolTotemItem;
import net.mcreator.taysrandomthings.item.FlopstersScytheItem;
import net.mcreator.taysrandomthings.item.FlopTotemItem;
import net.mcreator.taysrandomthings.item.EnragedtemplateItem;
import net.mcreator.taysrandomthings.item.EnragedscytheItem;
import net.mcreator.taysrandomthings.item.EnragedAncientCrystalItem;
import net.mcreator.taysrandomthings.TaysrandomthingsMod;

public class TaysrandomthingsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TaysrandomthingsMod.MODID);
	public static final RegistryObject<Item> VOLCURREN_INGOT = REGISTRY.register("volcurren_ingot", () -> new VolcurrenIngotItem());
	public static final RegistryObject<Item> GAMEFOOLS_AXE = REGISTRY.register("gamefools_axe", () -> new GamefoolsAxeItem());
	public static final RegistryObject<Item> GAMEFOOL_SPAWN_EGG = REGISTRY.register("gamefool_spawn_egg", () -> new ForgeSpawnEggItem(TaysrandomthingsModEntities.GAMEFOOL, -16777216, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> GAMEFOOL_TOTEM = REGISTRY.register("gamefool_totem", () -> new GamefoolTotemItem());
	public static final RegistryObject<Item> FLOPSTERS_SCYTHE = REGISTRY.register("flopsters_scythe", () -> new FlopstersScytheItem());
	public static final RegistryObject<Item> FLOPSTER_SPAWN_EGG = REGISTRY.register("flopster_spawn_egg", () -> new ForgeSpawnEggItem(TaysrandomthingsModEntities.FLOPSTER, -6749953, -65281, new Item.Properties()));
	public static final RegistryObject<Item> FLOP_TOTEM = REGISTRY.register("flop_totem", () -> new FlopTotemItem());
	public static final RegistryObject<Item> LITHIUM = REGISTRY.register("lithium", () -> new LithiumItem());
	public static final RegistryObject<Item> HYDROPHOBIC_TEMPLATE = REGISTRY.register("hydrophobic_template", () -> new HydrophobicTemplateItem());
	public static final RegistryObject<Item> HYDROFOOL_AXE = REGISTRY.register("hydrofool_axe", () -> new HydrofoolAxeItem());
	public static final RegistryObject<Item> ENRAGED_ANCIENT_CRYSTAL = REGISTRY.register("enraged_ancient_crystal", () -> new EnragedAncientCrystalItem());
	public static final RegistryObject<Item> ENRAGEDTEMPLATE = REGISTRY.register("enragedtemplate", () -> new EnragedtemplateItem());
	public static final RegistryObject<Item> ENRAGEDSCYTHE = REGISTRY.register("enragedscythe", () -> new EnragedscytheItem());
	// Start of user code block custom items
	// End of user code block custom items
}
