package com.Marumasa.MarumasaMod.item;

import com.Marumasa.MarumasaMod.main.MarumasaMod;
import com.Marumasa.MarumasaMod.main.MarumasaModRarity;
import net.minecraft.world.item.Item;

public class ItemSecondIngot extends Item {
    public ItemSecondIngot() {
        super(new Properties().tab(MarumasaMod.MARUMASAMOD_TAB).rarity(MarumasaModRarity.SECOND));
        this.setRegistryName("second_ingot");
    }
}
