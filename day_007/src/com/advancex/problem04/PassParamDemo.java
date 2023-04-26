package com.advancex.problem04;

public class PassParamDemo {

    public void doubleNumber(int num) {
        num *= 2;
    }

    public void toUpperCase(char letter) {
        letter = (char) (letter - 32);
    }

    public void expandCircle(Circle c, double times) {
        c.radius *= times;
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}