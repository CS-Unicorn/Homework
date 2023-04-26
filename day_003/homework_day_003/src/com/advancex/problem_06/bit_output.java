package com.advancex.problem_06;

public class bit_output {
    public static void main(String[] args) {
        int count = 0;
        int num1 = 0;   // (i%10)
        int num2 = 0;   // ((i%100)/10)
        int num3 = 0;   // ((i%1000)/100)
        int num4 = 0;   // i/1000
        for (int i = 1000; i < 10000; i++) {
            if ((i % 10) + (i / 1000) == ((i % 1000) / 100) + ((i % 100) / 10)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("满足条件的四位数共有" + count + "个");
    }
}