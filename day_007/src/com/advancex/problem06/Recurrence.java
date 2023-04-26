package com.advancex.problem06;

public class Recurrence {
    public static void main(String[] args) {
        int rabbit = rabbit(24);
        System.out.println("rabbit = " + rabbit);
    }

    public static int rabbit(int n){
        if(n == 1||n ==2){
            return 1;
        }else {
            return rabbit(n - 2) + rabbit(n - 1);
        }
    }
}
