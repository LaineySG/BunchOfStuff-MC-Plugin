package bunchofstuff.bunchofstuff.commands;

import bunchofstuff.bunchofstuff.utility.Playsounds;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlaySong implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0) {
            args[0] = args[0].toLowerCase();
            Playsounds.playSong((Player) sender, args[0]);
        } else {
            sender.sendMessage("Please specify a song to test!");
        }
        return true;
    }
}
