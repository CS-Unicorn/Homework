package com.advancex.problem06;

public class Test {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.x);    // 成员变量看变量是属于哪个类型的，成员方法看是接收的哪个类型的
    }
}
