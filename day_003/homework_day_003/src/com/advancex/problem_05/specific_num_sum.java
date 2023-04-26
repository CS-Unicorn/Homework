package com.advancex.problem_05;

import java.util.Scanner;

public class specific_num_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int data = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 100; i <= data; i++) {
            if (((i % 10) != 7) && ((i % 100) / 10 != 5) && (i / 100 != 3)) {
                count++;
                System.out.println("i = " + i);
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
