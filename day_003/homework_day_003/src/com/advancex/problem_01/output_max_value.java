package com.advancex.problem_01;

import java.util.Scanner;

public class output_max_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数:");
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        int data3 = sc.nextInt();
        int temp = 0;

        if (data1 > data2) {
            temp = data1;
        } else {
            temp = data2;
        }
        if(temp>data3){
            System.out.println(temp);
        }else{
            System.out.println(data3);
        }
    }
}
