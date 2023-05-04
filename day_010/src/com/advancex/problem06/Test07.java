package com.advancex.problem06;

public class Test07 {
    public static void main(String[] args) {
        Worker w = new Worker();
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");

        w.pickApple(new CompareAble() {
        }, a1, a2);

        w.pickApple(new CompareAble() {
            @Override
            public void compare(Apple a1, Apple a2) {
                System.out.println("挑红的：");
                if ("红色".equals(a1.getColor())) {
                    System.out.println(a1);
                }
                if ("红色".equals(a2.getColor())) {
                    System.out.println(a2);
                }
            }
        }, a1, a2);
    }
}

class Apple {
    private double size;
    private String color;

    public Apple(double size, String color) {
        super();
        this.size = size;
        this.color = color;
    }

    public Apple() {
        super();
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return size + "-" + color;
    }
}

interface CompareAble {
    default void compare(Apple a1, Apple a2) {
        System.out.println("默认挑大的：");
        if (a1.getSize() > a2.getSize()) {
            System.out.println(a1);
        } else {
            System.out.println(a2);
        }
    }
}

class Worker {
    public void pickApple(CompareAble c, Apple a1, Apple a2) {
        c.compare(a1, a2);
    }
}