package com.Marumasa.MarumasaMod.item.tool;

import com.Marumasa.MarumasaMod.regi.MarumasaModItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum MarumasaTires implements Tier {

    THIRD(4, 2531, 14.0F, 6.0F, 22,Ingredient.of(MarumasaModItems.THIRD_INGOT));

    private int uses;
    private int level;
    private int enchantmentValue;
    private float speed;
    private float damage;
    private Ingredient repairIngredient;

    MarumasaTires(int level, int uses, float speed, float damage, int enchantmentValue, Ingredient repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
