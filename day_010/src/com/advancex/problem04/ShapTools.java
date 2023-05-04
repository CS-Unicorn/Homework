package com.advancex.problem04;

/**
 * @author advancex
 */

public class ShapTools {
    public static void printRectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int line, int column, String sign) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sign + "\t");
            }
            System.out.println();
        }
    }
}