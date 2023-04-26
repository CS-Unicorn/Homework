package com.advancex.problem_02;

import java.util.Scanner;

public class ascend_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的工作年限:");
        int work_year = sc.nextInt();
        System.out.println("请输入你的基本工资:");
        int basic_salary = sc.nextInt();
         if(work_year>=10 && work_year<15){
             System.out.println("您目前工作了"+work_year+"年"+"基本工资为"+basic_salary+"元"+"应该涨工资20000元,涨后工资"+(basic_salary+20000)+"元");
         }
         else if(work_year>=5 && work_year<10){
             System.out.println("您目前工作了"+work_year+"年"+"基本工资为"+basic_salary+"元"+"应该涨工资10000元,涨后工资"+(basic_salary+10000)+"元");
         }
         else if(work_year>=3 && work_year<5){
             System.out.println("您目前工作了"+work_year+"年"+"基本工资为"+basic_salary+"元"+"应该涨工资20000元,涨后工资"+(basic_salary+5000)+"元");
         }
         else if (work_year>=1 && work_year<3) {
             System.out.println("您目前工作了"+work_year+"年"+"基本工资为"+basic_salary+"元"+"应该涨工资20000元,涨后工资"+(basic_salary+3000)+"元");
         }
         else{
             System.out.println("无匹配方案,请检查是否输入了正确的信息!");
         }
    }
}
