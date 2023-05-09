package com.advancex.problem01;

public class Demo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i += 2) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "---" + i);
                }
            }
        }).start();

        for (int i = 1; i <= 100; i += 2) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}
