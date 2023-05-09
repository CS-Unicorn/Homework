package com.advancex.problem05;

public class Tunnel implements Runnable {
    // 设置变量用来记录通过隧道的人数
    private int crossNum = 0;

    @Override
    public void run() {
        // 在run方法中调用cross
        cross();
    }

    public void cross() {
        // 进行同步通过隧道
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "开始通过隧道");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 增加通过人次
            crossNum++;
            System.out.println(Thread.currentThread().getName() + "已经通过隧道，是第 " + crossNum + " 个通过的");
        }
    }
}