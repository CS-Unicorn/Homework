package com.advancex.problem01;

interface A {
    int x = 0;
}

class B {
    int x = 1;
}


public class C extends B implements A {
    public void printX() {
//        System.out.println(x); 产生了歧义，B.x 和 A.x均匹配
        System.out.println(super.x);
        System.out.println(A.x);
    }

    public static void main(String[] args) {
        new C().printX();
    }
}