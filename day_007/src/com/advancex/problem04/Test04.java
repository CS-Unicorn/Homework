package com.advancex.problem04;

public class Test04 {
    public static void main(String[] args) {
        PassParamDemo passParamDemo = new PassParamDemo();
        int a = 100;
        passParamDemo.doubleNumber(a);
        System.out.println("a = " + a);

        char b = 'a';
        passParamDemo.toUpperCase(b);
        System.out.println("b = " + b);

        Circle circle = new Circle();
        circle.radius = 4;
        passParamDemo.expandCircle(circle, 5);
        System.out.println("circle.radius = " + circle.radius);

        int[] arr = {11, 5, 7, 9, 2, 3, 4};
        passParamDemo.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
