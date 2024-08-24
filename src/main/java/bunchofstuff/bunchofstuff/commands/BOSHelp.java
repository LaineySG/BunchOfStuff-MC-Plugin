package bunchofstuff.bunchofstuff.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BOSHelp implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("Bunch Of Stuff help:");
        sender.sendMessage("/boshelp, /bos: Display help menu.");
        sender.sendMessage("/tic, /tictactoe, /game: Play tic-tac-toe with a rudimentary AI.");
        return true;
    }
}
