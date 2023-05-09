package com.advancex.problem03;

import java.util.Comparator;

public class PrintOdd implements Runnable {
    Object o;
    Control c;
    int num;

    public PrintOdd(Object o, Control c) {
        this.o = o;
        this.c = c;
    }

    @Override
    public void run() {
        // 实现同步
//        while (true) {
//            synchronized (o) {
//                while (c.isFlag()) {
//                    // 当前进程 输出奇数
//                    System.out.println(Thread.currentThread().getName() + "---" + num);
//                    num += 2;
//                    try {
//                        Thread.sleep(1000L);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    c.setFlag(false);
//                    o.notify();
//                }
//            }
//        }
        while (true) {
            synchronized (c) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + ":" + ++num);

                c.notify();
                try {
                    c.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
