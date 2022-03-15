package com.Marumasa.MarumasaMod.item.tool;

import com.Marumasa.MarumasaMod.main.MarumasaMod;
import com.Marumasa.MarumasaMod.main.MarumasaModRarity;
import net.minecraft.world.item.AxeItem;

public class ItemThirdAxe extends AxeItem {
    public ItemThirdAxe() {
        super(MarumasaTires.THIRD, 6.0F, -3.2F, new Properties().tab(MarumasaMod.MARUMASAMOD_TAB).rarity(MarumasaModRarity.THIRD).fireResistant());
        this.setRegistryName("third_axe");
    }
}
