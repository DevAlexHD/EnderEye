package de.dynsystems.endereye.hook;

import de.dynsystems.endereye.EnderEye;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

/**
 * Created by Alexander on 23.04.2017.
 */
public interface IEnderAPI {

    public List getPlayers();

    public FileConfiguration getConfig();

    public EnderEye getEnderInstance();


}
