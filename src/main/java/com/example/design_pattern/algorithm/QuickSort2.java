/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: QuickSort2
 * Author:   xutong
 * Date:     2019/9/2 12:06 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.algorithm;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉双边快速排序
 *
 * @author xutong
 * @create 2019/9/2
 * @since 1.0.0
 */
public class QuickSort2 {
    public int[] sort(int[] sourceArray) throws Exception {
        int[] ints = Arrays.copyOf(sourceArray, sourceArray.length);
        quickSort(ints,0,ints.length-1);
        return ints;
    }
    private void quickSort(int[] arr , int left ,int right){
        if (left == right||left<0||right<0){
            return;
        }
        int aleft = left;
        int aright = right;
        int pivot = arr[left];

        while (aleft<aright){
            if (pivot<=arr[aleft]){
                aleft++;
                continue;
            }else {
                swap(arr,aleft,aright);
            }
            if (pivot> arr[aright]){
                aright--;
            }else {
                swap(arr,aleft,aright);
            }
        }
        swap(arr,aleft,left);
        quickSort(arr,left,aleft-1);
        quickSort(arr,aleft+1,right);
    }



    private void swap(int[] ints, int i, int index) {
        int temp = ints[i];
        ints[i] = ints[index];
        ints[index] = temp;
    }
    public static void main(String[] args) throws Exception {
        int[] ints = new QuickSort2().sort(new int[]{2, 6, 1, 2, 213,23,6,8});
        System.out.println(Arrays.toString(ints));
    }
}