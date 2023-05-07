package com.advancex.problem01;

import java.util.Calendar;
import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a specific year:");
        int year = scanner.nextInt();
        // 利用多态的形式 接收一个Calendar 抽象类的实例对象
        Calendar calendar = Calendar.getInstance();  // 注意getInstance()会返回一个实例对象，故不用new
        calendar.set(year, 2, 1);     //国外月份是从0开始的，故2月1就是国内的3月1日
        // 3月1日减 1天就是2月的最后一天
        calendar.add(Calendar.DATE, -1);
        // 2月份的天数
        int day = calendar.get(Calendar.DATE);
        System.out.println(year + "年2月份有" + day + "天");
        // 进行闰年判断，如果2月份有29天，就是润年，如果2月份只有28天，则是平年
        if (day == 29) {
            System.out.println("是闰年，有366天");
        } else {
            System.out.println("是平年，有365天");
        }
    }
}