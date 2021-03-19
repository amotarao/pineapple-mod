package dev.amotarao.pineapplemod.block;

import dev.amotarao.pineapplemod.PineappleMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraftforge.common.ToolType;

import java.util.ArrayList;
import java.util.List;

public class PineappleHoleBlock extends Block {
    public PineappleHoleBlock() {
        super(Properties
                .of(Material.METAL)
                .requiresCorrectToolForDrops()
                .friction(3.0F)
                .speedFactor(3.0F)
                .strength(3.0F)
                .harvestLevel(1)
                .sound(SoundType.METAL)
                .harvestTool(ToolType.PICKAXE)
        );
    }

    @Override
    public List<ItemStack> getDrops(BlockState p_220076_1_, LootContext.Builder p_220076_2_) {
        List<ItemStack> list = new ArrayList<>();
        list.add(new ItemStack(PineappleMod.Items.PINEAPPLE_HOLE_BLOCK.get()));
        return list;
    }
}
