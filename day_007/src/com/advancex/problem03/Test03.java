package com.advancex.problem03;

public class Test03 {
    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();

        int[] arr_i = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        char[] arr_c = {'你', '好', '啊'};
        double[] arr_d = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        int arr_i_index = myArrays.binarySearch(arr_i, 3);
        System.out.println("arr_i_index = " + arr_i_index);

        int arr_c_index = myArrays.binarySearch(arr_c, '你');
        System.out.println("arr_c_index = " + arr_c_index);

        int arr_d_index = myArrays.binarySearch(arr_d, 8);
        System.out.println("arr_d_index = " + arr_d_index);

        int[] copy_arr_i = myArrays.copy(arr_i, 100);
        for (int i = 0; i < arr_i.length; i++) {
            System.out.print(copy_arr_i[i] + " ");
        }
        System.out.println();

        char[] copy_arr_c = myArrays.copy(arr_c, 100);
        for (int i = 0; i < arr_c.length; i++) {
            System.out.print(copy_arr_c[i] + " ");
        }
        System.out.println();

        double[] copy_arr_d = myArrays.copy(arr_d, 100);
        for (int i = 0; i < arr_d.length; i++) {
            System.out.print(copy_arr_d[i] + " ");
        }
        System.out.println();

        MyArrays.sort(arr_d);
        for (int i = 0; i < arr_d.length; i++) {
            System.out.print(arr_d[i] + " ");
        }

        MyArrays.sort(arr_i);
        for (int i = 0; i < arr_i.length; i++) {
            System.out.print(arr_i[i] + " ");
        }

        MyArrays.sort(arr_c);
        for (int i = 0; i < arr_c.length; i++) {
            System.out.print(arr_c[i] + " ");
        }
    }
}
