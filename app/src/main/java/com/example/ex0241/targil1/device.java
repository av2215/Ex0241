package com.example.ex0241.targil1;

public class device {
    public static void main(String[] args)
    {
        Chargeable[] electronics = new Chargeable[3];
        electronics[0] = new Laptop();
        electronics[1] = new Phone();
        electronics[2] = new Tablet();
        for (Chargeable electron : electronics)
        {
            electron.charge();
        }
    }
}
