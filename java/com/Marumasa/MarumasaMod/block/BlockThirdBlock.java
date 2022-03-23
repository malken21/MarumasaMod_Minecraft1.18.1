package com.Marumasa.MarumasaMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockThirdBlock extends Block {
    public BlockThirdBlock() {
        super(Properties.of(Material.METAL, MaterialColor.METAL).
                        requiresCorrectToolForDrops().
                        strength(6.0F, 8.0F).
                        sound(SoundType.METAL)
        );
        this.setRegistryName("third_block");
    }
}
