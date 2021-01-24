package com.darrime.main;

import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("플러그인 활성화");
        getServer().getPluginManager().registerEvents(new event(), this);
        

    }

    @Override
    public void onDisable() {
        System.out.println("플러그인 비활성화");
    }
}
