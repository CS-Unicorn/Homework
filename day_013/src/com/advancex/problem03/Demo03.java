package com.advancex.problem03;

import java.util.Arrays;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新商品的价格：");
        double newPrice = scanner.nextDouble();
        // 定义一个老数组，存储老商品的价格
        double[] oldArr = {1.2, 2.3, 3.4, 4.5, 9.5, 6.1, 8.9};
        // 定义新数组，将新商品的价格添加到新数组中
        double[] newArr = new double[oldArr.length + 1];
        // 将老数组复制到新数组中
        System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
        // 将新添加的商品价格添加到新数组中去
        newArr[newArr.length - 1] = newPrice;
        // 利用sort方法进行排序
        Arrays.sort(newArr);
        // 输出排序后的数组
        System.out.println(Arrays.toString(newArr));
    }
}