package com.advancex.problem01;

public class Test01 {
    public static void main(String[] args) {
        Count count = new Count();
        long sum = count.sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("sum = " + sum);

        int max = count.max(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("max = " + max);

        String concat = count.concat("周芷若", "赵敏");
        System.out.println("concat = " + concat);

        boolean even1 = count.isEven(1, 2, 3, 4, 5, 6, 7);
        System.out.println("even1 = " + even1);
        boolean even2 = count.isEven(2, 4, 6, 8);
        System.out.println("even2 = " + even2);
    }
}
