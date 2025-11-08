package com.example.ex0241.targil2;

public class Drum implements Playable{
    @Override
    public void play() {
        System.out.println("the drum playing");
    }
    public void sit()
    {
        System.out.println("sit on drum");
    }
}
