package com.advancex.problem05;

import java.math.BigDecimal;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入转账金额：");
        String currency = scanner.next();
        double resullt = convertYuanToFen(currency);
        System.out.println(resullt);
    }

    private static double convertYuanToFen(String currency) {
        BigDecimal c1 = new BigDecimal(currency);
        BigDecimal c2 = new BigDecimal("100");
        // 变为分
        BigDecimal multiply = c1.multiply(c2);
        // 变为元
        BigDecimal divide = multiply.divide(c2, 2, BigDecimal.ROUND_DOWN);
        return divide.doubleValue();
    }
}