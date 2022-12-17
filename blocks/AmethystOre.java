package me.knightsy.betterarmour.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AmethystOre extends Block {

    public AmethystOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(5.0f, 6.0f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(3)
                .setRequiresTool()
                .setLightLevel(value -> 10)
                .sound(SoundType.STONE));
    }

}
