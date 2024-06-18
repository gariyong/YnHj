package net.happygari.ynhjrpg;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.google.common.collect.Lists;

import net.happygari.ynhjrpg.money.Account;

public class Main extends JavaPlugin implements Listener {
    protected static List<Account> accounts = Lists.newArrayList();

    @Override
    public void onLoad() {
        System.out.println("로딩 중..");

        // Account 로딩
        
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        System.out.println("반갑노 게이야..");
    }

    @Override
    public void onDisable() {
        System.out.println("잘가라 게이야..");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.getPlayer().sendMessage("안녕 게이야");
    }
}