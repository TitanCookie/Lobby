package de.Mondei1.Lobby.Main;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Lobby extends JavaPlugin {
    
    //Variablen
    public static String prx;

    @Override
    public void onEnable() {
        initConfig();
    }

    @Override
    public void onDisable() {
        
    }
    
    public void loadCommands() {
        getCommand("kick").setExecutor(new CMD_Kick());
    }
    
    public void initConfig() {
        getConfig();
        saveConfig();
        prx = getConfig().get("Config.Prefix") != null ? getConfig().getString("Config.Prefix") : "[&cMC&aLeben&f]";
        
        getConfig().set("Config.Prefix", prx);
        prx = ChatColor.translateAlternateColorCodes('&', prx);
        saveConfig();
    }
    
}
