package de.dynsystems.endereye.hook;

import de.dynsystems.endereye.EnderEye;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

/**
 * Created by Alexander on 23.04.2017.
 */
public class EnderAPI implements IEnderAPI {

    public EnderAPI() {

    }

    public List getPlayers() {
        return null;
    }

    public FileConfiguration getConfig() {
        return null;
    }

    public EnderEye getEnderInstance() {
        return EnderEye.getInstance();
    }


}
