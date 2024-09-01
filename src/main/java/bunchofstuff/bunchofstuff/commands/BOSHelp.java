package bunchofstuff.bunchofstuff.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BOSHelp implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("Bunch Of Stuff help:");
        sender.sendMessage("/boshelp, /bos: Display help menu.");
        sender.sendMessage("/sing [songname]: Play a song (zip, hellfire, wish, asc, desc, when, go, unknown, wont, world, bare, spoonful).");
        sender.sendMessage("/tictactoe: Play tic-tac-toe with a rudimentary AI.");
        sender.sendMessage("/fw [emotion]: Play a small fireworks show based on an emotion from Inside Out. Valid emotions include: joy, sadness, fear, anger, disgust, anxiety, envy, embarrassment, nostalgia, and ennui");
        return true;
    }
}
