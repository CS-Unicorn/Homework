package com.advancex.problem09;

import java.util.ArrayList;

public class Test09_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //通过不断的创建对象达到OOM
        while (true) {
            list.add(new Object());
        }
    }
}