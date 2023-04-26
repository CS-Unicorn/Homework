package com.advancex.problem02;

import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = find_max(a, b, c);
        System.out.println("max = " + max);
    }

    public static int find_max(int a, int b, int c) {
        int temp = a > b ? a : b;
        return temp > c ? temp : c;
    }
}
