package me.knightsy.betterarmour;

import me.knightsy.betterarmour.events.ModClientEvents;
import me.knightsy.betterarmour.register.ModBlocks;
import me.knightsy.betterarmour.register.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BetterArmour.MOD_ID)
public class BetterArmour {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "betterarmour";

    public BetterArmour() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);

        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(new ModClientEvents());
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    public static final ItemGroup TAB = new ItemGroup("BetterArmour") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }

    };

}
