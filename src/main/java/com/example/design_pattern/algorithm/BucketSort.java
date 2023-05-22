package com.example.design_pattern.algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 桶排序
 *
 * @author xutong
 */
public class BucketSort {

    public static double[] bucketSort(double[] arr) {
        //1.得到数组的最大值和最新值
        double max = arr[0];
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        double d = max - min;
//           2.初始化桶
        int bucketNum = arr.length;
        ArrayList<LinkedList<Double>> bucketList = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<>());
        }
//        3.遍历原始数组，将每个元素放入桶中
        for (int i = 0; i < arr.length; i++) {
            int num = (int) ((arr[i]-min)*(bucketNum-1)/d);
            bucketList.get(num).add(arr[i]);
        }
//        4.对每个桶内部进行排序
        for (int i = 0; i < bucketList.size(); i++) {
            Collections.sort(bucketList.get(i));
        }
        double[] sortedArray = new double[arr.length];
        int index = 0;
        for (LinkedList<Double> list : bucketList) {
            for (Double element : list) {
                sortedArray[index] = element;
                index ++;
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        double[] array = {4.12, 6.233, 0.022, 3.0, 4};
        double[] doubles = bucketSort(array);
        System.out.println(Arrays.toString(doubles));
    }
}
