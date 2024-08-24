package bunchofstuff.bunchofstuff.utility;

import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import static org.bukkit.Note.*;

public class Playsounds {
    public static void playSong(Player player, String songname) {
        songname = songname.toLowerCase().trim();


        if (songname.contains("zip")) {
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.E));
            }, 0);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.E));
            }, 5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.F));
            }, 10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.G));
            }, 15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.C));
            }, 25);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.A));
            }, 40);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.A));
            }, 45);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.F));
            }, 50);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.G));
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.E));
            }, 55);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.A));
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.C));
            }, 75);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.A));
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.C));
            }, 85);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.A));
            }, 95);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(1, Note.Tone.G));
            }, 100);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.E));
            }, 105);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.C));
            }, 110);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.E));
            }, 115);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.C));
            }, 120);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.E));
            }, 125);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.B));
                player.playNote(player.getLocation(), Instrument.GUITAR, natural(0, Note.Tone.D));
            }, 130);
        }
        else if (songname.contains("asc")) {
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
        }
        else if (songname.contains("desc")) { //descending
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
        else if (songname.contains("hell")) {
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 0);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, 15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, 20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 35);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.E));
            }, 40);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, 45);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, 50);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 55);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 75);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 80);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 85);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 90);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, 95);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, 100);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 115);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.E));
            }, 120);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, 125);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, 130);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 135);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, 150);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, 155);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, 160);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, 165);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, 170);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, 175);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, 180);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, 185);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(1, Note.Tone.B));
            }, 190);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, 195);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, 200);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, 215);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, 220);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, 225);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, 230);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 235);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 240);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, 255);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, 260);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 265);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, 270);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, 285);
        }
        else if (songname.contains("wish")) {
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.G));
            }, 0);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, 10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, 20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, 30);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.D));
            }, 40);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, 50);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, 60);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.B));
            }, 80);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, 90);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, 100);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, 110);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(1, Note.Tone.F));
            }, 120);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, 130);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.C));
            }, 140);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.D));
            }, 160);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.C));
            }, 170);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, 180);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, 190);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, 200);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, 210);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, 220);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, 230);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, 240);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.B));
            }, 260);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, 280);

        }
    }
}
