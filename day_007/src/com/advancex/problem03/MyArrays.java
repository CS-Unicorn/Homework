package com.advancex.problem03;

public class MyArrays {

    public int binarySearch(int[] arr, int value) {
        // 使用bubble sort进行排序
/*        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }*/

        MyArrays.sort(arr);
        //进行二分查找
        int l = 0;
        int r = arr.length - 1;
        int flag = 0;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (value > arr[mid]) {
                l = mid + 1;
            } else if (value < arr[mid]) {
                r = mid - 1;
            } else {
//                System.out.println("index = " + mid);
                flag++;
                break;
            }
        }
        if(flag==0){
            return -1;
        }else{
            return mid;
        }
    }


    public int  binarySearch(char[]  arr,  char  value){
        // 使用bubble sort进行排序
/*        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }*/

        MyArrays.sort(arr);
        // 查找
        int l = 0;
        int r = arr.length - 1;
        int flag = 0;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (value > arr[mid]) {
                l = mid + 1;
            } else if (value < arr[mid]) {
                r = mid - 1;
            } else {
//                System.out.println("index = " + mid);
                flag++;
                break;
            }
        }
        if(flag==0){
            return -1;
        }else{
            return mid;
        }
    }

    public int  binarySearch(double[]  arr,  double  value){
        // 使用bubble sort进行排序
/*        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }*/


        MyArrays.sort(arr);
        // 查找
        int l = 0;
        int r = arr.length - 1;
        int flag = 0;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (value > arr[mid]) {
                l = mid + 1;
            } else if (value < arr[mid]) {
                r = mid - 1;
            } else {
//                System.out.println("index = " + mid);
                flag++;
                break;
            }
        }
        if(flag==0){
            return -1;
        }else{
            return mid;
        }
    }

    public int[]  copy(int[] arr , int length){
        int[] new_arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }
        return new_arr;
    }

    public double[]  copy(double[] arr , int length){
        double[] new_arr = new double[length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }
        return new_arr;
    }

    public char[]  copy(char[] arr , int length){
        char[] new_arr = new char[length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }
        return new_arr;
    }

    public static void sort(int[] arr){
        // 使用bubble sort进行排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sort(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sort(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
