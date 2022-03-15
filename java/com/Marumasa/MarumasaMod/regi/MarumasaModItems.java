package com.Marumasa.MarumasaMod.regi;

import com.Marumasa.MarumasaMod.item.ItemFirstIngot;
import com.Marumasa.MarumasaMod.item.ItemSecondIngot;
import com.Marumasa.MarumasaMod.item.ItemThirdIngot;
import com.Marumasa.MarumasaMod.item.tool.*;
import com.Marumasa.MarumasaMod.main.MarumasaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(MarumasaMod.MOD_ID)
public class MarumasaModItems {

    public static final ItemThirdIngot THIRD_INGOT = new ItemThirdIngot();
    public static final ItemSecondIngot SECOND_INGOT = new ItemSecondIngot();
    public static final ItemFirstIngot FIRST_INGOT = new ItemFirstIngot();
    public static final ItemThirdSword THIRD_SWORD = new ItemThirdSword();
    public static final ItemThirdShovel THIRD_SHOVEL = new ItemThirdShovel();
    public static final ItemThirdPickaxe THIRD_PICKAXE = new ItemThirdPickaxe();
    public static final ItemThirdAxe THIRD_AXE = new ItemThirdAxe();
    public static final ItemThirdHoe THIRD_HOE = new ItemThirdHoe();

    @Mod.EventBusSubscriber(modid = MarumasaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{
        @SubscribeEvent
        public static void RegisterItems(final RegistryEvent.Register<Item> event){
            final Item[] items = {
                    THIRD_INGOT,
                    SECOND_INGOT,
                    FIRST_INGOT,
                    THIRD_SWORD,
                    THIRD_SHOVEL,
                    THIRD_PICKAXE,
                    THIRD_AXE,
                    THIRD_HOE
            };
            event.getRegistry().registerAll(items);
        }
    }
}
