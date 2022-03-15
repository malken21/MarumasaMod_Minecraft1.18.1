package com.Marumasa.MarumasaMod.main;

import com.Marumasa.MarumasaMod.regi.MarumasaModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MarumasaModTab  extends CreativeModeTab {

    public MarumasaModTab() {
        super("marumasamod_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(MarumasaModItems.THIRD_INGOT);
    }
}
