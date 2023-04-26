package com.advancex.problem05;

public class calc_avg_excceptMaxMin {
    public static void main(String[] args) {
        int[] arr = {100, 50, 90, 60, 80, 70};
        //calc_sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
        //calc_max
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
        //calc_min
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min);
        //minus_max_min
        sum -= (max + min);
        //calc_avg
        int avg = sum / (arr.length - 2);
        System.out.println("avg = " + avg);
    }
}