package me.knightsy.betterarmour.register;

import me.knightsy.betterarmour.BetterArmour;
import me.knightsy.betterarmour.blocks.AmethystBlock;
import me.knightsy.betterarmour.blocks.AmethystOre;
import me.knightsy.betterarmour.blocks.RubyBlock;
import me.knightsy.betterarmour.blocks.SapphireBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterArmour.MOD_ID);

    //Blocks

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", SapphireBlock::new);
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", AmethystBlock::new);
    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", AmethystOre::new);
}
