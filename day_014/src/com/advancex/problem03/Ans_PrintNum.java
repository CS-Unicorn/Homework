package com.advancex.problem03;

public class Ans_PrintNum extends Thread {
    private static int num;

    public void run() {
        while (true) {
            // 用synchronized修饰需要同步的代码块
            synchronized (this) {
                try {
                    // 使用 notify 和 wait 实现两个线程同步
                    this.notify();

                    Thread.sleep(1000L);
                    System.out.println(Thread.currentThread().getName() + "--->" + ++num);

                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
