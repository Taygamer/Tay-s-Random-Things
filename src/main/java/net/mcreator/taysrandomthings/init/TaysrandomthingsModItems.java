
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysrandomthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.taysrandomthings.item.VolcurrenIngotItem;
import net.mcreator.taysrandomthings.item.VolcurrenArmorItem;
import net.mcreator.taysrandomthings.item.TaysSwordItem;
import net.mcreator.taysrandomthings.item.TayTotemItem;
import net.mcreator.taysrandomthings.item.SuperVItem;
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
import net.mcreator.taysrandomthings.item.EnderCrystalItem;
import net.mcreator.taysrandomthings.item.EndScytheItem;
import net.mcreator.taysrandomthings.item.EndAxeItem;
import net.mcreator.taysrandomthings.item.CompoundVItem;
import net.mcreator.taysrandomthings.item.Amethyst_ArmourArmorItem;
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
	public static final RegistryObject<Item> COMPOUND_V = REGISTRY.register("compound_v", () -> new CompoundVItem());
	public static final RegistryObject<Item> OVERCHARGED_ENDSTONE = block(TaysrandomthingsModBlocks.OVERCHARGED_ENDSTONE);
	public static final RegistryObject<Item> ENDER_CRYSTAL = REGISTRY.register("ender_crystal", () -> new EnderCrystalItem());
	public static final RegistryObject<Item> END_SCYTHE = REGISTRY.register("end_scythe", () -> new EndScytheItem());
	public static final RegistryObject<Item> END_AXE = REGISTRY.register("end_axe", () -> new EndAxeItem());
	public static final RegistryObject<Item> SUPER_V = REGISTRY.register("super_v", () -> new SuperVItem());
	public static final RegistryObject<Item> VOLCURREN_ARMOR_HELMET = REGISTRY.register("volcurren_armor_helmet", () -> new VolcurrenArmorItem.Helmet());
	public static final RegistryObject<Item> VOLCURREN_ARMOR_CHESTPLATE = REGISTRY.register("volcurren_armor_chestplate", () -> new VolcurrenArmorItem.Chestplate());
	public static final RegistryObject<Item> VOLCURREN_ARMOR_LEGGINGS = REGISTRY.register("volcurren_armor_leggings", () -> new VolcurrenArmorItem.Leggings());
	public static final RegistryObject<Item> VOLCURREN_ARMOR_BOOTS = REGISTRY.register("volcurren_armor_boots", () -> new VolcurrenArmorItem.Boots());
	public static final RegistryObject<Item> TAY_SPAWN_EGG = REGISTRY.register("tay_spawn_egg", () -> new ForgeSpawnEggItem(TaysrandomthingsModEntities.TAY, -6750055, -16711681, new Item.Properties()));
	public static final RegistryObject<Item> AMETHYST_ARMOUR_ARMOR_HELMET = REGISTRY.register("amethyst_armour_armor_helmet", () -> new Amethyst_ArmourArmorItem.Helmet());
	public static final RegistryObject<Item> AMETHYST_ARMOUR_ARMOR_CHESTPLATE = REGISTRY.register("amethyst_armour_armor_chestplate", () -> new Amethyst_ArmourArmorItem.Chestplate());
	public static final RegistryObject<Item> AMETHYST_ARMOUR_ARMOR_LEGGINGS = REGISTRY.register("amethyst_armour_armor_leggings", () -> new Amethyst_ArmourArmorItem.Leggings());
	public static final RegistryObject<Item> AMETHYST_ARMOUR_ARMOR_BOOTS = REGISTRY.register("amethyst_armour_armor_boots", () -> new Amethyst_ArmourArmorItem.Boots());
	public static final RegistryObject<Item> TAYS_SWORD = REGISTRY.register("tays_sword", () -> new TaysSwordItem());
	public static final RegistryObject<Item> TAY_TOTEM = REGISTRY.register("tay_totem", () -> new TayTotemItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
