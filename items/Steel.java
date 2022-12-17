package me.knightsy.betterarmour.items;

import me.knightsy.betterarmour.BetterArmour;
import net.minecraft.item.Item;

public class Steel extends Item {

    public Steel() {
        super(new Item.Properties().group(BetterArmour.TAB).maxStackSize(64));
    }

}
