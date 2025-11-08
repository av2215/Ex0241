package com.example.ex0241.targil1;

public class Phone implements Chargeable{
    @Override
    public void charge() {
        System.out.println("the phone charged");
    }
    public void watch()
    {
        System.out.println("you watching netflix");
    }
}
