package com.advancex.problem_03;

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数:");
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        System.out.println("请选择运算:\n 0 加法\n 1 减法\n 2 乘法\n 3 除法");
        int crtl_num = sc.nextInt();
        switch(crtl_num){
            case 0:
                System.out.println(data1 +"+"+data2+"="+(data1+data2));
                break;
            case 1:
                System.out.println(data1 +"-"+data2+"="+(data1-data2));
                break;
            case 2:
                System.out.println(data1 +"*"+data2+"="+(data1*data2));
                break;
            case 3:
                System.out.println(data1 +"/"+data2+"="+(data1/data2));
                break;
            default:
                System.out.println("输入错误!");
        }
    }
}
