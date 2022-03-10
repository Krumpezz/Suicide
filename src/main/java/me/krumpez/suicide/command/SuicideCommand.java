package me.krumpez.suicide.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuicideCommand implements CommandExecutor {

    private String permission;

    public SuicideCommand(String perms) {
        this.permission = perms;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        if(player.hasPermission(permission)) {
            player.setHealth(0);
            player.sendMessage(ChatColor.YELLOW + "[SuicidePlugin]:" + ChatColor.GREEN + " You've nothing to do but suicide, and you did");
        }else{
            player.sendMessage(ChatColor.YELLOW + "[SuicidePlugin]:" + ChatColor.RED + " You don't have required permission to use this command!");
        }
        return true;
    }
}

