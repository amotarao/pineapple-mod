package dev.amotarao.pineapplemod;

import dev.amotarao.pineapplemod.block.PineappleHoleBlock;
import dev.amotarao.pineapplemod.item.PineappleHoleBlockItem;
import dev.amotarao.pineapplemod.item.PineappleIngot;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(PineappleMod.MOD_ID)
public class PineappleMod {
    public static final String MOD_ID = "pineapplemod";

    public PineappleMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Items.register(modEventBus);
        Blocks.register(modEventBus);
    }

    public static class Items {
        private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
        public static final RegistryObject<Item> PINEAPPLE_INGOT = ITEMS.register("pineapple_ingot", () -> new PineappleIngot());
        public static final RegistryObject<Item> PINEAPPLE_HOLE_BLOCK = ITEMS.register("pineapple_hole_block", () -> new PineappleHoleBlockItem());

        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
    }

    public static class Blocks {
        private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
        public static final RegistryObject<Block> PINEAPPLE_HOLE_BLOCK = BLOCKS.register("pineapple_hole_block", () -> new PineappleHoleBlock());

        public static void register(IEventBus eventBus) {
            BLOCKS.register(eventBus);
        }
    }
}