package com.advancex.TEST01;

public class Test {
    public static void main(String[] args) {
        Audi car = new SmartAudi();
        car.drive();
        SmartAudi smartAudi = (SmartAudi) car;
        smartAudi.automaticDrive();
        smartAudi.automaticParking();
    }
}
