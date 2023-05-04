package com.advancex.problem01;

public class Test {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.num);	// 1
        System.out.println(((B)a).num);	// 2
        System.out.println(((A)((B)a)).num);	// 1
        System.out.println("-------------------");
        B b = new B();
        System.out.println(b.num);	// 2
        System.out.println(((A)b).num);	// 1
        System.out.println(((B)((A)b)).num);	// 2
    }
}
