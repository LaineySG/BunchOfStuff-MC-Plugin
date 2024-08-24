package bunchofstuff.bunchofstuff.commands;

import bunchofstuff.bunchofstuff.utility.DelayTask;
import bunchofstuff.bunchofstuff.utility.Playsounds;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fireworks implements CommandExecutor {
    enum Moods {
        JOY,
        SADNESS,
        FEAR,
        ANGER,
        DISGUST,
        ANXIETY,
        ENVY,
        EMBARRASSMENT,
        ENNUI,
        NOSTALGIA
    }
    enum Speeds {
        SLOW,
        MED,
        FAST,
        HYPER
    }
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Moods chosen_mood = Moods.JOY;
        if (args.length > 0) {
            for (Moods mood : Moods.values()) {
                if (mood.toString().equalsIgnoreCase(args[0])) {
                    chosen_mood = mood;
                }
            }
        }
        switch (chosen_mood) {
            case JOY:
                Playsounds.playSong(player, "Zip"); //zip-a-dee-doo-dah
                break;
            case ANGER:
                Playsounds.playSong(player, "Hellfire");
                break;
            case NOSTALGIA:
                Playsounds.playSong(player, "Wish"); //When you wish upon a star
                break;
            case SADNESS:
                Playsounds.playSong(player, "When"); //When she loved me
                break;
        }
        createFireworkShow(player, chosen_mood, player.getTargetBlock(null,100).getLocation());
        return true;
    }
    public void createFireworkShow(Player player, Moods mood, Location loc) {
        List<Color> colors = new ArrayList<>();
        Speeds speed = Speeds.MED;
        Random rand = new Random();
        int fw_count = 0;
        switch (mood) {
            case JOY:
                colors.add(Color.YELLOW);
                colors.add(Color.ORANGE);
                colors.add(Color.BLUE);
                speed = Speeds.FAST;
                fw_count = rand.nextInt(75) + 5;
                break;
            case SADNESS:
                colors.add(Color.BLUE);
                colors.add(Color.NAVY);
                colors.add(Color.AQUA);
                colors.add(Color.BLACK);
                speed = Speeds.SLOW;
                fw_count = rand.nextInt(35) + 2;
                break;
            case FEAR:
                colors.add(Color.PURPLE);
                colors.add(Color.FUCHSIA);
                speed = Speeds.HYPER;
                fw_count = rand.nextInt(35) + 10;
                break;
            case DISGUST:
                colors.add(Color.GREEN);
                colors.add(Color.LIME);
                colors.add(Color.OLIVE);
                speed = Speeds.MED;
                fw_count = rand.nextInt(40) + 4;
                break;
            case ANXIETY:
                colors.add(Color.ORANGE);
                colors.add(Color.YELLOW);
                colors.add(Color.WHITE);
                speed = Speeds.HYPER;
                fw_count = rand.nextInt(120) + 15;
                break;
            case ENVY:
                colors.add(Color.TEAL);
                colors.add(Color.AQUA);
                colors.add(Color.PURPLE);
                speed = Speeds.MED;
                fw_count = rand.nextInt(65) + 4;
                break;
            case EMBARRASSMENT:
                colors.add(Color.FUCHSIA);
                colors.add(Color.SILVER);
                colors.add(Color.PURPLE);
                colors.add(Color.RED);
                speed = Speeds.SLOW;
                fw_count = rand.nextInt(10) + 5;
                break;
            case ENNUI:
                colors.add(Color.NAVY);
                colors.add(Color.BLUE);
                colors.add(Color.PURPLE);
                speed = Speeds.SLOW;
                fw_count = rand.nextInt(15) + 4;
                break;
            case NOSTALGIA:
                colors.add(Color.BLACK);
                colors.add(Color.WHITE);
                colors.add(Color.GRAY);
                colors.add(Color.SILVER);
                speed = Speeds.SLOW;
                fw_count = rand.nextInt(25) + 8;
                break;
            case ANGER:
                colors.add(Color.RED);
                colors.add(Color.MAROON);
                colors.add(Color.BLACK);
                speed = Speeds.HYPER;
                fw_count = rand.nextInt(85) + 6;
                break;
        }
        for (int i = 0; i <= fw_count; i++) { //for each firework

            Random rand_speed = new Random(); //calculate a speed (value to wait for next firework
            float chosen_speed = 0f;
            switch (speed) {
                case SLOW:
                    chosen_speed = rand_speed.nextFloat() * 5F;
                    break;
                case MED:
                    chosen_speed = rand_speed.nextFloat() * 3F;
                    break;
                case FAST:
                    chosen_speed = rand_speed.nextFloat();
                    break;
                case HYPER:
                    chosen_speed = rand_speed.nextFloat() * 0.5F;
                    break;
            }
            float delayTime = chosen_speed * 20 * (i+1); //20 = 1 second
            long dt = (long) delayTime;
            new DelayTask(() -> {
                createFirework(colors,player,loc);
            }, dt); //speed * 1000 since it's in ticks, times iteration to properly delay.

        }
    }
    public void createFirework(List<Color> colors, Player player, Location loc) {
        Random rand = new Random();
        //Randomize colors
        int color_int1 = rand.nextInt(colors.size());
        Color chosencolor1 = colors.get(color_int1);
        int color_int2 = rand.nextInt(colors.size());
        Color chosencolor2 = colors.get(color_int2);
        int fw_type = rand.nextInt(5); // 0 to 4
        FireworkEffect.Type fw_effect = FireworkEffect.Type.BURST;
        switch (fw_type) {
            case 0:
                fw_effect = FireworkEffect.Type.BURST;
                break;
            case 1:
                fw_effect = FireworkEffect.Type.BALL;
                break;
            case 2:
                fw_effect = FireworkEffect.Type.BALL_LARGE;
                break;
            case 3:
                fw_effect = FireworkEffect.Type.STAR;
                break;
            case 4:
                fw_effect = FireworkEffect.Type.CREEPER;
                break;
        }
        int pwr = rand.nextInt(5) + 1;
        //generate firework
        Firework fw = player.getWorld().spawn(loc, Firework.class);
        FireworkMeta fw_data = fw.getFireworkMeta();
        fw_data.addEffects(FireworkEffect.builder().withColor(chosencolor1, chosencolor2)
                .with(fw_effect).withFlicker().withTrail().build());
        fw_data.setPower(pwr);
        fw.setFireworkMeta(fw_data);
    }

}
