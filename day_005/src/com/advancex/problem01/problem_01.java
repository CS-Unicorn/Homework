package com.advancex.problem01;

import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个小数");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = return_min(a, b);
        System.out.println("min = " + result);
    }

    public static double return_min(double a, double b) {
        return a < b ? a : b;
    }
}