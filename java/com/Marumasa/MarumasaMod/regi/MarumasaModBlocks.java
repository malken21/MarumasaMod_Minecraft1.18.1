package com.Marumasa.MarumasaMod.regi;

import com.Marumasa.MarumasaMod.block.BlockThirdBlock;
import com.Marumasa.MarumasaMod.main.MarumasaMod;
import com.Marumasa.MarumasaMod.main.MarumasaModRarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(MarumasaMod.MOD_ID)
public class MarumasaModBlocks {
    public static final BlockThirdBlock THIRD_BLOCK = null;
    @Mod.EventBusSubscriber(modid = MarumasaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{
        @SubscribeEvent
        public static void RegisterBlocks(final RegistryEvent.Register<Block> event){
            final Block[] blocks = {
                    new BlockThirdBlock()
            };
            event.getRegistry().registerAll(blocks);
        }
        @SubscribeEvent
        public static void RegisterBlockItems(final RegistryEvent.Register<Item> event){
            final BlockItem[] blockItems = {
                    new BlockItem(THIRD_BLOCK,new Item.Properties().tab(MarumasaMod.MARUMASAMOD_TAB).rarity(MarumasaModRarity.THIRD).fireResistant())
            };
            for (BlockItem item : blockItems){
                final Block block = item.getBlock();
                final ResourceLocation RegistryName = block.getRegistryName();
                event.getRegistry().register(item.setRegistryName(RegistryName));
            }
        }
    }
}
