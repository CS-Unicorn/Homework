package com.advancex.problem02;

public class calc_arr_sum {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 50, 90, 60, 80, 70};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
