package bunchofstuff.bunchofstuff;


import bunchofstuff.bunchofstuff.commands.BOSHelp;
import bunchofstuff.bunchofstuff.commands.Fireworks;
import bunchofstuff.bunchofstuff.commands.Tictactoe;
import bunchofstuff.bunchofstuff.utility.DelayTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bunchofstuff extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Bunchofstuff is enabled. Type /boshelp to see available options.");
        getCommand("menu").setExecutor(new Tictactoe(this));
        getCommand("boshelp").setExecutor(new BOSHelp());
        getCommand("fireworks").setExecutor(new Fireworks());
        new DelayTask(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Bunchofstuff is disabled");
    }
}
