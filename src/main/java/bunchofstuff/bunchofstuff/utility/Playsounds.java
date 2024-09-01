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
            int song_timer=0;
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .5f);
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .6f);
            }, song_timer+=2);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .7f);
            }, song_timer+=2);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .8f);
            }, song_timer+=2);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .9f);
            }, song_timer+=2);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, 1f);
            }, song_timer+=2);
        }
        else if (songname.contains("desc")) { //descending
            int song_timer = 0;
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, 1f);
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .9f);
            }, song_timer+=2);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .8f);
            }, song_timer+=2);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .7f);
            }, song_timer+=2);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .6f);
            }, song_timer+=2);
            new DelayTask(() -> {
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_FLUTE, 1f, .5f);
            }, song_timer+=2);
        }
        else if (songname.contains("hell")) {
            int song_timer = 0;
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(1, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.B));
            }, song_timer+=15);
        }
        else if (songname.contains("wish")) {
            int song_timer = 0;
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.D));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=10);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.B));
            }, song_timer+=20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(1, Note.Tone.F));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.C));
            }, song_timer+=10);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.D));
            }, song_timer+=20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.C));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.B));
            }, song_timer+=20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=20);

        }
        else if (songname.contains("when")) {
            int song_timer = 0;
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=10);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=6);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=6);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=6);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=6);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=4);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=6);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=18);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.C));
            }, song_timer+=5);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=4);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=8);
        }
        else if (songname.contains("go")) {
            int song_timer = 0;
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.C));
            }, song_timer+=10);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.C));
            }, song_timer+=10);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=10);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=20);



        }
        else if (songname.contains("unknown")) {
            int song_timer = 0;
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(0, Note.Tone.D));
            }, song_timer+=10);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=15);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(0, Note.Tone.D));
            }, song_timer+=5);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(1, Note.Tone.F));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(0, Note.Tone.D));
            }, song_timer+=5);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);

        }
        else if (songname.contains("world")) {
            int song_timer=0;
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=5);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=8);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=8);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=8);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=4);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=4);


        }
        else if (songname.contains("bare")) {
            int song_timer=0;
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.A));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=3);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=8);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=3);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.A));
            }, song_timer+=5);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.G));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.A));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);


        }
        else if (songname.contains("wont")) {
            int song_timer=0;
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=6);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=4);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=4);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=6);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=15);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.A));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.G));
            }, song_timer+=15);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=15);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.A));
            }, song_timer+=20);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.A));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.A));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.B));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.C));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=10);
        }
        else if (songname.contains("spoonful")) {
            int song_timer=0;
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(1, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(1, Note.Tone.F));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=8);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(1, Note.Tone.F));
            }, song_timer+=3);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.C));
            }, song_timer+=3);


            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(1, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=3);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=3);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.B));
            }, song_timer+=5);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(1, Note.Tone.G));
            }, song_timer+=15);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(1, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(1, Note.Tone.F));
            }, song_timer+=3);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(1, Note.Tone.F));
            }, song_timer+=3);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.F));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, sharp(1, Note.Tone.F));
            }, song_timer+=5);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.D));
            }, song_timer+=10);

            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=3);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=3);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, flat(0, Note.Tone.E));
            }, song_timer+=10);
            new DelayTask(() -> {
                player.playNote(player.getLocation(), Instrument.PIANO, natural(0, Note.Tone.E));
            }, song_timer+=5);
        }
    }
}
