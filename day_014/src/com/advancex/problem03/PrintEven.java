package com.advancex.problem03;

import java.util.concurrent.ThreadLocalRandom;

public class PrintEven implements Runnable {
    Object o;
    Control c;
    int num = 2;

    public PrintEven(Object o, Control c) {
        this.o = o;
        this.c = c;
    }

    @Override
    public void run() {
        // 实现同步
        while (true) {
            synchronized (o) {
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (!c.isFlag()) {
                    // 当前线程 输出偶数
                    System.out.println(Thread.currentThread().getName() + "---" + num);
                    num += 2;
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    c.setFlag(true);
                    o.notify();
                }
            }
        }
    }
}