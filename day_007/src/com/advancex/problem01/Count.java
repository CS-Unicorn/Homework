package com.advancex.problem01;

public class Count {
    public long sum(int... nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            long sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return sum;
        }
    }

    public int max(int a, int... others) {
        a = others[0];
        for (int i = 1; i < others.length; i++) {
            if (a < others[i]) {
                a = others[i];
            }
        }
        return a;
    }

    public String concat(String... strings) {
        String con_str = "";
        for (int i = 0; i < strings.length; i++) {
            con_str+=strings[i];
        }
        return con_str;
    }

    public boolean isEven(int... nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                flag++;
            }
        }
        if(flag==nums.length){
            return true;
        }else{
            return false;
        }
    }
}