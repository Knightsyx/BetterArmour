package me.knightsy.betterarmour.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SapphireBlock extends Block {

    public SapphireBlock() {
        super(Block.Properties.create(Material.IRON)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(5.0f, 6.0f)
                .setLightLevel(value -> 10)
                .sound(SoundType.METAL)
                .setRequiresTool());
    }

}
