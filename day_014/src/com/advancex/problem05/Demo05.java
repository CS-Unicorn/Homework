package com.advancex.problem05;


public class Demo05 {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();

        for (int i = 0; i < 10; i++) {
            new Thread(tunnel, "p" + i).start();
        }
    }
}