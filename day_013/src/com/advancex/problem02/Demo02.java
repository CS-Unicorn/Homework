package com.advancex.problem02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) throws ParseException {
        // 入职日期字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入入职日期，格式为YYYY-MM-dd");
        // 录入入职日期
        String enrollStr = scanner.next();
        // 设置日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        // 利用parse方法将录入的字符串转换成日期对象
        Date enrollDate = sdf.parse(enrollStr);
        // 获取入职日期的毫秒值
        long enrollDateTime = enrollDate.getTime();
        // 获取当前的毫秒值
        long currentTimeMillis = System.currentTimeMillis();
        // 计算时间的差值
        long term = currentTimeMillis - enrollDateTime;
        // 将时间毫秒差值转换成为天数
        long day = term / 1000 / 60 / 60 / 24;
        // 将时间差值转换成为年
        int year = (int) day / 365;
        // 输出结果
        System.out.println("您的入职时间为" + year + "年");
    }
}
