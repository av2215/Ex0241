package com.example.ex0241.targil2;

public class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("the piano playing");
    }
    public void sleep()
    {
        System.out.println("go sleep under piano");
    }
}
