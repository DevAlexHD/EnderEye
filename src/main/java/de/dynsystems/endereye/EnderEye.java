package de.dynsystems.endereye;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Alexander on 23.04.2017.
 */
public class EnderEye extends JavaPlugin {

    private static EnderEye instance;
    @Override
    public void onEnable() {
        instance = this;

        start();
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    private void start() {
        Bukkit.getConsoleSender().sendMessage("§aStarting EnderEye...");

    }

    public static EnderEye getInstance() {
        return instance;
    }
}
