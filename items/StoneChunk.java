package me.knightsy.betterarmour.items;

import me.knightsy.betterarmour.BetterArmour;
import net.minecraft.item.Item;

public class StoneChunk extends Item {

    public StoneChunk() {
        super(new Item.Properties().group(BetterArmour.TAB).maxStackSize(32));
    }

}
