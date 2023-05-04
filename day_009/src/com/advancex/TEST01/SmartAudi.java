package com.advancex.TEST01;

public class SmartAudi extends Audi {
    @Override
    public void drive() {
        System.out.println("智能奥迪车在跑");
    }

    public void automaticParking() {
        System.out.println("智能奥迪在自动泊车");
    }

    public void automaticDrive() {
        System.out.println("智能奥迪在无人驾驶");
    }
}
