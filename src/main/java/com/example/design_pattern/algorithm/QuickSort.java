/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: QuickSort
 * Author:   xutong
 * Date:     2019/8/30 5:11 下午
 * Description: 快速排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.algorithm;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈快速排序〉
 *
 * @author xutong
 * @create 2019/8/30
 * @since 1.0.0
 */
public class QuickSort {
    public static int[] sort(int[] source) {
        int[] ints = Arrays.copyOf(source, source.length);
        //先排序后递归
        return quickSort(ints, 0, ints.length - 1);
    }

    private static int[] quickSort(int[] ints, int left, int right) {
        //决定分区
        int cachef = left;
        int cacher = right;
        int cachem = (left + right) / 2;
        if (left >= right) {
            return ints;
        }
        int mid = ints[left];
        //将head的作为dumhead
        for (int i = left + 1; i <= right; ) {
            if (mid < ints[i]) {
                //如果大于mid，和尾部交互
                //索引不变
                int ex = ints[i];
                ints[i] = ints[right];
                ints[right] = ex;
                right--;
            } else {
                //和dumhead进行交互
                int ex = ints[i];
                ints[i] = ints[left];
                ints[left] = ex;
                left++;
                i++;
            }
        }
        quickSort(ints, cachef, cachem);
        //让mid+加一防止0，1循环
        quickSort(ints, cachem+1, cacher);
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = sort(new int[]{2, 6, 1, 2, 213,});
        System.out.println(Arrays.toString(ints));
    }

}