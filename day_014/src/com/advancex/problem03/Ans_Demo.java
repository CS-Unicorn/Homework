package com.advancex.problem03;

public class Ans_Demo {
    public static void main(String[] args) {
        Ans_PrintNum ans_printNum = new Ans_PrintNum();
        new Thread(ans_printNum).start();
        new Thread(ans_printNum).start();
    }
}