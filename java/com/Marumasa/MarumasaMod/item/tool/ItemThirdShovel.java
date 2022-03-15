package com.Marumasa.MarumasaMod.item.tool;

import com.Marumasa.MarumasaMod.main.MarumasaMod;
import com.Marumasa.MarumasaMod.main.MarumasaModRarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;

public class ItemThirdShovel extends ShovelItem {
    public ItemThirdShovel() {
        super(MarumasaTires.THIRD, 1.5F, -3.0F, new Item.Properties().tab(MarumasaMod.MARUMASAMOD_TAB).rarity(MarumasaModRarity.THIRD).fireResistant());
        this.setRegistryName("third_shovel");
    }
}
