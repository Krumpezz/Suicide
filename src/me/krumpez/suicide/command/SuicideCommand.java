package me.krumpez.suicide.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class SuicideCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("suicide")){

            if (sender instanceof Player) {
                Player p = (Player) sender;
                p.setHealth(0);
                p.sendMessage(ChatColor.AQUA + "You have choose to suicide. - Krumpez");

            }else if (sender instanceof ConsoleCommandSender) {
                System.out.println("This command can't be ran by a console!");
            }

        }
        return true;
    }
}
