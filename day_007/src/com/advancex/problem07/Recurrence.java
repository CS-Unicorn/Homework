package com.advancex.problem07;

public class Recurrence {
    public static void main(String[] args) {
        int peach = peach(10);
        System.out.println("peach = " + peach);
    }

    public static int peach(int n){
        if(n ==1){
            return 1;
        }else{
            return (peach(n-1)+1)*2;
        }
    }
}