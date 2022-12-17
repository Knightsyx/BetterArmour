package me.knightsy.betterarmour.register;

import me.knightsy.betterarmour.BetterArmour;
import me.knightsy.betterarmour.items.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterArmour.MOD_ID);

    //Gems

    //Ruby -> Adds Fire Resistance
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", Ruby::new);
    //Sapphire -> Adds Resistance
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", Sapphire::new);
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", Amethyst::new);
    public static final RegistryObject<Item> RUBY_FRAGMENT = ITEMS.register("ruby_fragment", RubyFragment::new);
    public static final RegistryObject<Item> SAPPHIRE_FRAGMENT = ITEMS.register("sapphire_fragment", SapphireFragment::new);
    public static final RegistryObject<Item> AMETHYST_FRAGMENT = ITEMS.register("amethyst_fragment", AmethystFragment::new);

    //Metal
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", SteelNugget::new);
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel_ingot", Steel::new);

    //Items
    /* NEEDS TEXTURE */
    public static final RegistryObject<Item> STONE_CHUNK = ITEMS.register("stone_chunk", StoneChunk::new);

    /* NEEDS TEXTURE */
    public static final RegistryObject<Item> IRON_CHUNK = ITEMS.register("iron_chunk", IronChunk::new);

    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
            () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties().group(BetterArmour.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block",
            () -> new BlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), new Item.Properties().group(BetterArmour.TAB)));
    
    public static final RegistryObject<Item> AMETHYST_ORE_ITEM = ITEMS.register("amethyst_ore",
            () -> new BlockItem(ModBlocks.AMETHYST_ORE.get(), new Item.Properties().group(BetterArmour.TAB)));

}
