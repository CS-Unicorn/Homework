package com.advncex.problem01;

public class NewPhone extends OldPhone{

    public NewPhone() {
    }

    public NewPhone(String brand, int price) {
        super(brand, price);
    }

    public void game(){
        System.out.println("玩游戏");
    }
}
