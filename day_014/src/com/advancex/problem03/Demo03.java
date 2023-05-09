package com.advancex.problem03;

import com.advancex.problem05.Tunnel;

public class Demo03 {
    public static void main(String[] args) {
        Object o = new Object();
        Control control = new Control(true);
//        new Thread(new PrintEven(o, control)).start();
        PrintOdd printOdd = new PrintOdd(o, control);
        new Thread(printOdd).start();
        new Thread(printOdd).start();
    }
}