package bunchofstuff.bunchofstuff.utility;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class Playsounds {
    public static void playSong(Player player, boolean is_ascending) {
        if (is_ascending) {
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .5f);
            }, 10);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .6f);
            }, 12);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .7f);
            }, 14);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .8f);
            }, 16);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .9f);
            }, 18);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, 1f);
            }, 20);
        } else { //descending
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, 1f);
            }, 10);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .9f);
            }, 12);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .8f);
            }, 14);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .7f);
            }, 16);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .6f);
            }, 18);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .5f);
            }, 20);
        }
    }
}
