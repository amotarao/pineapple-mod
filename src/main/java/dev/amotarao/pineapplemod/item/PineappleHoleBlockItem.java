package dev.amotarao.pineapplemod.item;

import dev.amotarao.pineapplemod.PineappleMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class PineappleHoleBlockItem extends BlockItem {
    public PineappleHoleBlockItem() {
        super(PineappleMod.Blocks.PINEAPPLE_HOLE_BLOCK.get(), new Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS));
    }
}
