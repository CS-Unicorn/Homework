package com.advancex.problem04;

import java.util.HashSet;
import java.util.Random;

public class problem_04 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] redBall = new int[6];
        HashSet<Integer> hs_redBall = new HashSet<Integer>();
        int[] blueBall = new int[1];

        // redBall
//        for (int i = 0; i < redBall.length; i++) {
//            redBall[i] = rd.nextInt(33) + 1;
//        }
//        HashSet<Integer> hs = new HashSet<Integer>();
//        for (int i = 0; i < redBall.length; i++) {
//            hs.add(redBall[i]);
//        }
//        for (Integer h : hs) {
//            System.out.print(h+" ");
//        }

        for (int i = 0; i < 100; i++) {
            hs_redBall.add(rd.nextInt(33) + 1);
            if (hs_redBall.size() == 6) {
                break;
            }
        }
        System.out.println("哈希红球集合:");
        for (Integer i : hs_redBall) {
            System.out.print(i + " ");
        }

        //存入 redBall 数组中
        int a = 0;
        for (Integer i : hs_redBall) {
            redBall[a] = i;
            a++;
        }
        for (int i = 0; i < redBall.length; i++) {
            for (int j = 0; j < redBall.length - i - 1; j++) {
                if (redBall[j] > redBall[j + 1]) {
                    int temp = redBall[j];
                    redBall[j] = redBall[j + 1];
                    redBall[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("红球:");
        for (int i = 0; i < redBall.length; i++) {
            System.out.print(redBall[i] + " ");
        }


        System.out.println();

        // blueBall
        for (int i = 0; i < blueBall.length; i++) {
            blueBall[i] = rd.nextInt(16) + 1;
        }
        System.out.println("蓝球:");
        for (int i = 0; i < blueBall.length; i++) {
            System.out.print(blueBall[i]);
        }

        System.out.println();
//        int[] mrg = new int[redBall.length + blueBall.length];
//
//        for (int i = 0; i < redBall.length; i++) {
//            mrg[i] = redBall[i];
//        }
//        for (int i = 0; i < blueBall.length; i++) {
//            mrg[redBall.length + i] = blueBall[i];
//        }

        System.out.println("双色球:");
        for (int i = 0; i < redBall.length; i++) {
            if(redBall[i]<10){
                System.out.print("0"+redBall[i]+" ");
            }else{
            System.out.print(redBall[i] + " ");
            }
        }
        for (int i = 0; i < blueBall.length; i++) {
            System.out.print(blueBall[i]);
        }
    }
}