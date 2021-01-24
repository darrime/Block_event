package com.darrime.main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class event implements Listener{



    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        if(player.isOp()) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
            player.sendMessage("스폰에서 블럭 파괴는 불가능합니다");
        }
    }
    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        if(p.isOp()) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
            p.sendMessage("스폰에서 블럭 설치는 불가능합니다");
        }
    }

}
