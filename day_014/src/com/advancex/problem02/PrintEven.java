package com.advancex.problem02;

public class PrintEven extends Thread {
    private int num = 1;

    @Override
    public void run() {
        while (num <= 10) {
            synchronized (Thread.class) {
                for (int i = 1; i <= 5; i++) {
                    num += 2;
                    System.out.println("偶数线程---" + i + "---" + num);
                    try {
                        Thread.sleep(500L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class PrintOdd extends Thread {
    int num = 2;

    @Override
    public void run() {
        while (num <= 10) {
            synchronized (Thread.class) {
                for (int i = 1; i <= 5; i++) {
                    num += 2;
                    System.out.println("奇数线程---" + i + "---" + num);
                    try {
                        Thread.sleep(500L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
