package me.knightsy.betterarmour.items;

import me.knightsy.betterarmour.BetterArmour;
import net.minecraft.item.Item;

public class IronChunk extends Item {

    public IronChunk() {
        super(new Item.Properties().group(BetterArmour.TAB).maxStackSize(16));
    }

}
