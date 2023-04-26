package com.advancex.problem07;

public class Count {
    public int sum(int n){
        if(n==10){//第10天
            return 1;
        }else{
            /*
             * 第9天没吃之前是  第10天+1个的2倍
             * 第8天没吃之前是  第9天+1个的2倍
             * 。。。。
             */
            return (sum(n+1)+1)*2;
        }
    }
}
