package de.phoenix_interactive_studios.spigot;

import de.phoenix_interactive_studios.spigot.commands.Gamemode_Adventure;
import de.phoenix_interactive_studios.spigot.commands.Gamemode_Creative;
import de.phoenix_interactive_studios.spigot.commands.Gamemode_Spectator;
import org.bukkit.plugin.java.JavaPlugin;
import de.phoenix_interactive_studios.spigot.commands.Gamemode_Survival;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

    getConfig().options().copyDefaults();
    saveDefaultConfig();

    getCommand("gms").setExecutor(new Gamemode_Survival(this));
    getCommand("gmc").setExecutor(new Gamemode_Creative(this));
    getCommand("gmsp").setExecutor(new Gamemode_Spectator(this));
    getCommand("gma").setExecutor(new Gamemode_Adventure(this));


    }

}
