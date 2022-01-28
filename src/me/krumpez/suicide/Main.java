package me.krumpez.suicide;

import me.krumpez.suicide.command.SuicideCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Time to suicide XD");

        getCommand("suicide").setExecutor(new SuicideCommand());
    }
}
