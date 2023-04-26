package com.advancex.problem03;

public class find_min {
    public static void main(String[] args) {
        int[] arr = {100, 50, 90, 60, 80, 70};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min);
    }
}
