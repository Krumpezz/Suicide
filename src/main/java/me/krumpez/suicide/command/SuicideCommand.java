package me.krumpez.suicide.command;

import me.krumpez.suicide.Suicide;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class SuicideCommand implements CommandExecutor {
    Plugin plugin = Suicide.getPlugin(Suicide.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String permission = plugin.getConfig().getString("Permission");

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission(permission)) {
                player.setHealth(0);
                player.sendMessage(ChatColor.YELLOW + "[SuicidePlugin]:" + ChatColor.GREEN + " You've nothing to do but suicide, and you did");
            }else{
                player.sendMessage(ChatColor.YELLOW + "[SuicidePlugin]:" + ChatColor.RED + " You don't have required permission to use this command!");
            }
        }
        return false;
    }
}

