package com.Marumasa.MarumasaMod.item.tool;

import com.Marumasa.MarumasaMod.main.MarumasaMod;
import com.Marumasa.MarumasaMod.main.MarumasaModRarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;

public class ItemThirdPickaxe extends PickaxeItem {
    public ItemThirdPickaxe() {
        super(MarumasaTires.THIRD, 1, -2.8F, new Item.Properties().tab(MarumasaMod.MARUMASAMOD_TAB).rarity(MarumasaModRarity.THIRD).fireResistant());
        this.setRegistryName("third_pickaxe");
    }
}
