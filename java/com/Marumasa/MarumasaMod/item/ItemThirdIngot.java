package com.Marumasa.MarumasaMod.item;

import com.Marumasa.MarumasaMod.main.MarumasaMod;
import com.Marumasa.MarumasaMod.main.MarumasaModRarity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemThirdIngot extends Item {
    public ItemThirdIngot() {
        super(new Properties().tab(MarumasaMod.MARUMASAMOD_TAB).rarity(MarumasaModRarity.THIRD).fireResistant());
        this.setRegistryName("third_ingot");
    }
    public InteractionResultHolder<ItemStack> use(Level p_41432_, Player p_41433_, InteractionHand p_41434_) {
        ItemStack itemstack = p_41433_.getItemInHand(p_41434_);
        p_41433_.startUsingItem(p_41434_);
        p_41433_.sendMessage(new TextComponent("test"),p_41433_.getUUID());
        return InteractionResultHolder.consume(itemstack);
    }
}
