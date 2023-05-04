package com.advancex.problem03;

public class Test11 {
    public static void main(String[] args) {
        Out out = new Out();
        out.Print(3);
    }
}

class Out {
    private int age = 12;

    public void Print(final int x) {
        class In {
            public void inPrint() {
                System.out.println(x);//3，调用传递的参数为3，在局部内，x=3
                System.out.println(age);//12, 在外部类的内部，可以直接调用外部类的成员变量
            }
        }
        new In().inPrint();
    }
}