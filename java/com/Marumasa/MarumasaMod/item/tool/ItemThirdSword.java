package com.Marumasa.MarumasaMod.item.tool;

import com.Marumasa.MarumasaMod.main.MarumasaMod;
import com.Marumasa.MarumasaMod.main.MarumasaModRarity;
import net.minecraft.world.item.SwordItem;

public class ItemThirdSword extends SwordItem {
    public ItemThirdSword() {
        super(MarumasaTires.THIRD, 3, -2.4F, new Properties().tab(MarumasaMod.MARUMASAMOD_TAB).rarity(MarumasaModRarity.THIRD).fireResistant());
        this.setRegistryName("third_sword");
    }
}
