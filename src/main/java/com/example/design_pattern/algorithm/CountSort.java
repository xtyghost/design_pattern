package com.example.design_pattern.algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 基数排序
 * @author xutong
 */
public class CountSort {

    public static int[] countSort(int[] array){
        int max = getMax(array);
        //根据数列最大值确定数组长度
        int[] countArray = new int[max+1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        int index = 0;
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index++] = i;
            }

        }
        return sortedArray;
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {2,3,55,3,8,9,22};
        int[] ints = countSort(array);

        System.out.println(Arrays.toString(ints));

    }
}
