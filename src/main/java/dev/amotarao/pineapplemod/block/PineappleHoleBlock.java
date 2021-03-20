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
                .strength(3.0F)
                .harvestLevel(1)
                .sound(SoundType.METAL)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
