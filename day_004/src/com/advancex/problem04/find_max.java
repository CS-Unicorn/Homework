package com.advancex.problem04;

public class find_max {
    public static void main(String[] args) {
        int[] arr = {100, 50, 90, 60, 80, 70};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}