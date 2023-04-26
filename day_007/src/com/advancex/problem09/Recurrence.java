package com.advancex.problem09;

import java.util.Scanner;

public class Recurrence {
    public static void main(String[] args) {
        System.out.println("请输入需要登上的台阶数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int step = steps(n);
        System.out.println("step = " + step);
    }
    public static int steps(int n){
        if(n == 1||n ==2){
            return 1;
        }else {
            return steps(n - 2) + steps(n - 1);
        }
    }
}
