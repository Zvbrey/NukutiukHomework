package com.hillel.nukutiuk.homeworks.homework16;

import com.hillel.nukutiuk.homeworks.homework16.impl.ClassicMusic;
import com.hillel.nukutiuk.homeworks.homework16.impl.PopMusic;
import com.hillel.nukutiuk.homeworks.homework16.impl.RockMusic;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = {
                new ClassicMusic("Bahi nad gorodom"),
                new ClassicMusic("Hlopok"),
                new PopMusic("Jest dobroy voli"),
                new PopMusic("Bandera avtomobil"),
                new RockMusic("Ne ho4y yezjat"),
                new RockMusic("RVKIN")
        };

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }


    }
}

