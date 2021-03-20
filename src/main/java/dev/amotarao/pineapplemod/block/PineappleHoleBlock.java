package dev.amotarao.pineapplemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class PineappleHoleBlock extends Block {
    public PineappleHoleBlock() {
        super(Properties
            .of(Material.METAL)
            .requiresCorrectToolForDrops()
            .strength(3.0F)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(2)
            .sound(SoundType.METAL)
            .randomTicks()
        );
    }

    @Override
    public void fallOn(World world, BlockPos blockPos, Entity entity, float height) {
        // 落ちた高さでインゴットをドロップ
        int count = (int)Math.floor(height);
        spawnItem(world, blockPos, count);
        super.fallOn(world, blockPos, entity, height);
    }

    @Override
    public void onPlace(BlockState blockState, World world, BlockPos blockPos, BlockState oldBlockState, boolean p_220082_5_) {
        System.out.println(blockState);
        System.out.println(oldBlockState);
        spawnItem(world, blockPos, 1);
        super.onPlace(blockState, world, blockPos, oldBlockState, p_220082_5_);
    }

    @Override
    public void randomTick(BlockState blockState, ServerWorld world, BlockPos blockPos, Random random) {
        System.out.println(random);
        spawnItem(world, blockPos, 1);
        super.randomTick(blockState, world, blockPos, random);
    }

    private void spawnItem(World world, BlockPos blockPos, int count) {
        if (count <= 0) {
            return;
        }

        for (int i = 0; i < count; i++) {
            ItemStack item = new ItemStack(this.asItem(), 1);
            popResource(world, blockPos.above(1), item);
        }
    }
}
