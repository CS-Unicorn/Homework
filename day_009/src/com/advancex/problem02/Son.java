package com.advancex.problem02;

public class Son extends Father {
    int x = 30;

    public Son() {
        this.print();
        x = 40;
    }

    @Override
    public void print() {
        System.out.println("Son.x = " + x);
    }
}
