package com.example.ex0241.targil2;

public class instrument {
    public static void main(String[] args)
    {
        Playable[] instruments = new Playable[3];
        instruments[0] = new Drum();
        instruments[1] = new Guitar();
        instruments[2] = new Piano();
        for (Playable instrum : instruments)
        {
            instrum.play();
        }
    }
}
