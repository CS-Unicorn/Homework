package com.advancex.problem04;

public class Test04 {
    static int i = 0;

    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        try {
            return ++i; // i = 1，压栈（栈底）
        } finally {
            return ++i; // i = 2，压栈（栈顶）
        }
    }
}