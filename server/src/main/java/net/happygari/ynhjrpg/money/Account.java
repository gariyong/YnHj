package net.happygari.ynhjrpg.money;

import org.bukkit.entity.Player;

public class Account {
    public final Player player;
    protected int balance = 0; //잔고

    public Account(Player player) {
        this.player = player;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(Money m) {

    }

    public void transfer(Account acc0, Money m) {

    }

    public void transfer(Account acc0, int amount) {

    }

    public void withdraw(int amount) {
        this.player.getInventory().addItem(new Money(amount));
        // 현재 위치 구해서 거래소 지정된 블록에서 거리(건물 크기 + 15) 내외면 10% 적립
    }
}