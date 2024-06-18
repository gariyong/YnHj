package net.happygari.ynhjrpg;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onLoad() {
        System.out.println("로딩 중..");
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