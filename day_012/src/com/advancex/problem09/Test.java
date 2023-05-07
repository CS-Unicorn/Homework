package com.advancex.problem09;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int big = 0;
        int small = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                big++;
            }
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                small++;
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num++;
            }
        }

        System.out.println("big : " + big);
        System.out.println("small : " + small);
        System.out.println("num : " + num);

    }
}
