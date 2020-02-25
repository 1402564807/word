package com.dnui.linsihan18.RandomNumber;

public class RandomDouble {

    public static double RunDouble(int i){

        double b = Math.random() * i;
        b = ((int) (b * 100)) / 100.0;
        return b;
    }
}
