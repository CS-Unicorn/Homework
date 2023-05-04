package com.advancex.problem03;

public class Base {
    Base() {
        method(100);// 这里隐含的是this.method()
    }

    public void method(int i) {
        System.out.println("base: " + i);
    }
}
