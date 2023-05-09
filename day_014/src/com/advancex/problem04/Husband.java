package com.advancex.problem04;


import java.util.Random;

public class Husband implements Runnable {
    Bank bank;

    public Husband(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (bank) {
                // 输出当前账户余额
                System.out.println("当前账户：" + bank.getId() + "---余额为：" + bank.getBalance());
                // 丈夫存钱0~10000
                int withCash = random.nextInt(10000);
                int v = bank.getBalance() + withCash;
                // 更新账户余额
                bank.setBalance(v);
                System.out.println("丈夫本次存钱：" + withCash + "---目前账户：" + bank.getId() + "---余额：" + bank.getBalance());
                System.out.println("====================================================");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 唤醒妻子进行取钱
                bank.notify();
            }
        }
    }
}
