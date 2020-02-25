package com.dnui.linsihan18.InAndOut;

public class OutPut {
    public static void show(String s) {
        int l = s.length();
        if (l > 15) l = 15;
        s = "\n" + s + "\n";
        for (int i = 0; i < l * 2 - 1; i++) {
            s = "=" + s + "=";
        }
        System.out.println(s);
    }
}
