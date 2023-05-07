package com.advancex.problem10;

public class Test {
    public static void main(String[] args) {
        String initstr = "上海自来水来自海上";
        String inits = "上海";
        System.out.println(isSyn(initstr));
        System.out.println(isSyn(inits));
    }

    public static boolean isSyn(String str) {
        if (str == null) {
            return false;
        }

        StringBuilder stringBuilder = new StringBuilder(str);
        String s = stringBuilder.reverse().toString();
        return s.equals(str);
    }
}
