package com.Marumasa.MarumasaMod.item;

import com.Marumasa.MarumasaMod.main.MarumasaMod;
import com.Marumasa.MarumasaMod.main.MarumasaModRarity;
import net.minecraft.world.item.Item;

public class ItemFirstIngot extends Item{
    public ItemFirstIngot() {
        super(new Item.Properties().tab(MarumasaMod.MARUMASAMOD_TAB).rarity(MarumasaModRarity.FIRST));
        this.setRegistryName("first_ingot");
    }
}
