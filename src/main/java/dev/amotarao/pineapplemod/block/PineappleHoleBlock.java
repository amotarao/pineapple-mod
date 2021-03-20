package dev.amotarao.pineapplemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

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
