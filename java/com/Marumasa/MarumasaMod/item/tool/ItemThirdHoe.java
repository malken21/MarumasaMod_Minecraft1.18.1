package com.Marumasa.MarumasaMod.item.tool;

import com.Marumasa.MarumasaMod.main.MarumasaMod;
import com.Marumasa.MarumasaMod.main.MarumasaModRarity;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

public class ItemThirdHoe extends HoeItem {
    public ItemThirdHoe() {
        super(MarumasaTires.THIRD, 0, -3.0F, new Item.Properties().tab(MarumasaMod.MARUMASAMOD_TAB).rarity(MarumasaModRarity.THIRD).fireResistant());
        this.setRegistryName("third_hoe");
    }
}
