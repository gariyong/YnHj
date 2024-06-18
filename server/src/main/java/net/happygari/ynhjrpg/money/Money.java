package net.happygari.ynhjrpg.money;

import org.bukkit.inventory.ItemStack;

/**
 * 화폐 단위 기본
 */
public class Money extends ItemStack {
    protected final int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return "원";
    }
}