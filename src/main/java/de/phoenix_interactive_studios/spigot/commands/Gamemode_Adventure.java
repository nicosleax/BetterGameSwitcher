package de.phoenix_interactive_studios.spigot.commands;

import de.phoenix_interactive_studios.spigot.Main;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode_Adventure implements CommandExecutor {
    private Main main;

    public Gamemode_Adventure(Main main){
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player) {

            Player pl = (Player) sender;

            if (pl.getGameMode() == GameMode.ADVENTURE) {
                pl.sendMessage(ChatColor.translateAlternateColorCodes('&',main.getConfig().getString("Prefix") + main.getConfig().getString("Already_Adventure")));
            } else {
                pl.setGameMode(GameMode.ADVENTURE);
                pl.sendMessage(ChatColor.translateAlternateColorCodes('&',main.getConfig().getString("Prefix") + main.getConfig().getString("Set_Adventure")));
            }
        }
        return false;
    }
}
