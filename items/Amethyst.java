package me.knightsy.betterarmour.items;

import me.knightsy.betterarmour.BetterArmour;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Amethyst extends Item {

    public Amethyst() {
        super(new Item.Properties().group(BetterArmour.TAB).maxStackSize(9));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
