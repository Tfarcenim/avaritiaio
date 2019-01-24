package com.tfar.avaritiaio.init;

import com.tfar.avaritiaio.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block GRAIN_BLOCK = new BlockBase("grainblock", Material.ROCK);
}
