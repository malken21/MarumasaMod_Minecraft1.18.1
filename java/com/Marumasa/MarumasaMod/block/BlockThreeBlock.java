package com.Marumasa.MarumasaMod.block;

import com.Marumasa.MarumasaMod.main.MarumasaMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockThreeBlock extends Block {
    public BlockThreeBlock() {
        super(Properties.of(Material.METAL, MaterialColor.METAL).
                        requiresCorrectToolForDrops().
                        strength(5.0F, 6.0F).
                        sound(SoundType.METAL)
        );
        this.setRegistryName("third_block");
    }
}
