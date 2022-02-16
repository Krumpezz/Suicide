package me.krumpez.suicide;

import me.krumpez.suicide.command.SuicideCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Suicide extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("suicide").setExecutor(new SuicideCommand());
    }
}