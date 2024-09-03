
package net.mcreator.taysrandomthings.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HydrophobicTemplateItem extends Item {
	public HydrophobicTemplateItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
