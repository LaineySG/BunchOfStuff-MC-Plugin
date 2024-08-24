package bunchofstuff.bunchofstuff.commands;

import bunchofstuff.bunchofstuff.Bunchofstuff;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tictactoe implements CommandExecutor, Listener {
    enum Outcome {
        BLUE,
        RED,
        NONE
    }
    public Tictactoe(Bunchofstuff plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equalsIgnoreCase("Tic Tac Toe")) {
            return;
        }
        Player player = (Player) event.getWhoClicked();
        Inventory menu = event.getInventory();
        ItemStack item = event.getCurrentItem();
        int slot = event.getSlot(); //get the clicked slot
        if (checkWin(menu, player)) {
            event.setCancelled(true);
            return;
        }
        if (item == null) {
            return;
        } else if (item.getType() == Material.AIR) {
            event.setCancelled(true);
            menu.setItem(slot, getItem(new ItemStack(Material.REDSTONE_BLOCK), "&aX", ""));
            if (!checkWin(menu, player)) {
                int move_to = enemyMoveAvailable(menu);
                if (move_to == -1) {
                    drawGame(menu, player);
                    event.setCancelled(true);
                    return;
                } else {
                    enemyMove(menu, move_to);
                }
                checkWin(menu, player);
            }
        } else {
            event.setCancelled(true);
            return;
        }
    }
    public void drawGame(Inventory menu, Player player) {
        player.sendMessage(ChatColor.BLUE + "Game ended in a draw!");
    }
    public void enemyMove(Inventory menu, int slot) {
        menu.setItem(slot, getItem(new ItemStack(Material.LAPIS_BLOCK), "&aO", ""));
    }
    public int enemyMoveAvailable(Inventory menu) {
        List<Integer> checked = new ArrayList<>();
        while (true) {
            Random rand = new Random();
            int int_to_check = rand.nextInt(9); //random int from 0 to 9
            if (int_to_check <= 2) {
                int_to_check += 3;
            } else if (int_to_check >= 3 && int_to_check < 6) {
                int_to_check += 9;
            } else if (int_to_check >= 6) {
                int_to_check += 15;
            }
            if (!checked.contains(int_to_check)) {
                checked.add(int_to_check);
                if (menu.getItem(int_to_check) == null) { //if null, move is valid
                    return int_to_check;
                } //otherwise continue through loop
            }
            if (checked.size() >= 9) { //if all squares are filled, no move is available.
                return -1;
            }
        }
    }
    public boolean checkWin(Inventory menu, Player player) {
        int[][] arrayOfArrays = {
            {3, 4, 5},
            {12, 13, 14},
            {21, 22, 23},
            {3, 12, 21},
            {4, 13, 22},
            {5, 14, 23},
            {3, 13, 23},
            {5, 13, 21}
        };
        for (int i=0; i < arrayOfArrays.length; i++) {
            Outcome out = Outcome.NONE;
            for (int j=0; j < arrayOfArrays[i].length; j++) {
                int slot = arrayOfArrays[i][j];
                if (menu.getItem(slot) == null) {
                    if (out != Outcome.NONE) {
                        out = Outcome.NONE;
                    }
                    break;
                }
                if (out == Outcome.BLUE) {
                    if (menu.getItem(slot).getType() == Material.LAPIS_BLOCK) {
                        continue;
                    } else {
                        out = Outcome.NONE;
                        break;
                    }
                }
                else if (out == Outcome.RED) {
                    if (menu.getItem(slot).getType() == Material.REDSTONE_BLOCK) {
                        continue;
                    } else {
                        out = Outcome.NONE;
                        break;
                    }
                }
                else if (out == Outcome.NONE && j == 0) { //if outcome is not set yet, and it's the first one checked
                    if (menu.getItem(slot).getType() == Material.REDSTONE_BLOCK) {
                        out = Outcome.RED;
                    } else if (menu.getItem(slot).getType() == Material.LAPIS_BLOCK) {
                        out = Outcome.BLUE;
                    }
                }
                if (out == Outcome.NONE) {
                    break;
                }
            }
            if (out == Outcome.BLUE) {
//                menu.clear();
//                player.closeInventory();
                player.sendMessage(ChatColor.DARK_RED + "You lost!");
                return true;
            } else if (out == Outcome.RED) {
//                menu.clear();
//                player.closeInventory();
                player.sendMessage(ChatColor.DARK_GREEN + "You won!");
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command.");
            return false;
        }

        Player player = (Player) sender;
        Inventory menu = Bukkit.createInventory(player, 9*3, "Tic Tac Toe");
        player.openInventory(menu);
        menu.setItem(0, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(1, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(2, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(9, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(10, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(11, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(18, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(19, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(20, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));

        menu.setItem(8, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(7, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(6, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(17, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(16, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(15, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(24, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(25, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));
        menu.setItem(26, getItem(new ItemStack(Material.STAINED_GLASS_PANE), "", ""));

        return true;
    }
    private ItemStack getItem(ItemStack item, String name, String ... lore) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        List<String> info = new ArrayList<>();
        for (String str : lore) {
            info.add(ChatColor.translateAlternateColorCodes('&', str));
        }
        meta.setLore(info);
        item.setItemMeta(meta);
        return item;
    }
}
