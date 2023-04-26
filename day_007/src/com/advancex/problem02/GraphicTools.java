package com.advancex.problem02;

public class GraphicTools {
    public void printRectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*\t");
                if (j == 4) {
                    System.out.println();
                }
            }
        }
    }

    public void printRectangle(int line, int column, String sign) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sign + "\t");
                if (j == column - 1) {
                    System.out.println();
                }
            }
        }
    }

    public double getTriangleArea(double base, double height) {
        return base * height / 2;
    }

    public double getTriangleArea(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (b + c) > a) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            System.out.println("不能构成三角形");
            return 0;
        }
    }
}
