package com.advancex.problem08;

import java.util.Scanner;

public class Recurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要计算的累加边界：");
        int n = sc.nextInt();
        long result = f(n);
        System.out.println("result = " + result);
    }

    public static long f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + f(n - 1);
        }
    }
}
