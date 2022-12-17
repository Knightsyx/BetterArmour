package me.knightsy.betterarmour.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AmethystBlock extends Block {

    public AmethystBlock() {
        super(Block.Properties.create(Material.IRON)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(6.0f, 7.0f)
                .setLightLevel(value -> 5)
                .sound(SoundType.METAL)
                .setRequiresTool());
    }

}
