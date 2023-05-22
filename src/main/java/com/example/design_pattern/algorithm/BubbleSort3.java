package com.example.design_pattern.algorithm;

import java.util.Arrays;

/**
 * 鸡尾酒冒泡排序
 *
 * @author xutong
 */
public class BubbleSort3 {
    public static void sort(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swrap(array, j);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            isSorted = true;
            for (int j = array.length-1-i; j > 1; j--) {
                if (array[j]<array[j-1]){
                    swrap(array,j-1);
                    isSorted =false;
                }
            }
            if (isSorted){
                break;
            }
        }
    }

    private static void swrap(int[] array, int j) {
        int tmp;
        tmp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = tmp;
    }


    public static void main(String[] args) {
        int[] array = new int[]{2,7,3,23,231,23,45,23,2,56,7,78,23,2};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
