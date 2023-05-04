package com.advancex.problem03;

public class Test03 {
    {
        System.out.println("a");
    }

    static {
        System.out.println("b");
    }

    Test03() {
        System.out.println("c");
    }

    public static String getOut() {
        try {
            return "1";
        } catch (Exception e) {
            return "2";
        } finally {
            return "3";
//            System.out.println("3");
        }
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();
        Test03 test031 = new Test03();
        System.out.println("===============");
        System.out.println(getOut());
    }
}