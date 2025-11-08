package com.example.ex0241.targil1;

public class Laptop implements Chargeable{
    @Override
    public void charge() {
        System.out.println("the laptop charged");
    }
    public void play()
    {
        System.out.println("you play wordle");
    }
}
