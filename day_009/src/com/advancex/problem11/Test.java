package com.advancex.problem11;

public class Test {
    public static void main(String[] args) {
        Person[] all = new Person[3];
        all[0] = new Chinese();
        all[1] = new American();
        all[2] = new Indian();

        for (int i = 0; i < all.length; i++) {
            all[i].eat();
        }
    }
}
