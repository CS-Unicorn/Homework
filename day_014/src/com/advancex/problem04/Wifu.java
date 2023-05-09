package com.advancex.problem04;

import java.util.Random;

public class Wifu implements Runnable {
    Bank bank;

    public Wifu(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (bank) {
                int withDrawCash = random.nextInt(10000);
                // 如果取的钱超出了账户余额，则调用wait进行等待
                if (withDrawCash > bank.getBalance()) {
                    try {
                        bank.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("当前账户：" + bank.getId() + "---余额为：" + bank.getBalance());
                // 如果当前账户余额足够，则取钱
                int v = bank.getBalance() - withDrawCash;
                // 更新账户余额
                bank.setBalance(v);
                System.out.println("妻子本次取钱：" + withDrawCash + "---目前账户：" + bank.getId() + "---余额：" + bank.getBalance());
                System.out.println("====================================================");
            }
        }
    }
}
