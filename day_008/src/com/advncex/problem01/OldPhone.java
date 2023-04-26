package com.advncex.problem01;

public class OldPhone {
    private String brand;
    private int price;

    public OldPhone() {
    }

    public OldPhone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void message() {
        System.out.println("发短信");
    }
}
