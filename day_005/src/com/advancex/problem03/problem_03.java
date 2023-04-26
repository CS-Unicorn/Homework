package com.advancex.problem03;

import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        System.out.println("请输入一个小数:");
        Scanner sc = new Scanner(System.in);
        double data = sc.nextDouble();
        double abs_num = abs(data);
        System.out.println("abs_num = " + abs_num);
    }

    public static double abs(double a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }
}