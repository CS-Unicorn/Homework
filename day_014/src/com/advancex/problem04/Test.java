package com.advancex.problem04;

public class Test {
    public static void main(String[] args) {
        // 设置账户初始信息
        Bank bank = new Bank(510108, 0);
        Husband husband = new Husband(bank);
        Wifu wifu = new Wifu(bank);
        new Thread(husband).start();
        new Thread(wifu).start();
    }
}