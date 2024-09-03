
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taysrandomthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.taysrandomthings.block.OverchargedEndstoneBlock;
import net.mcreator.taysrandomthings.TaysrandomthingsMod;

public class TaysrandomthingsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TaysrandomthingsMod.MODID);
	public static final RegistryObject<Block> OVERCHARGED_ENDSTONE = REGISTRY.register("overcharged_endstone", () -> new OverchargedEndstoneBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
