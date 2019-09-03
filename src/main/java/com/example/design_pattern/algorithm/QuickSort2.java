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
 * 〈〉
 *
 * @author xutong
 * @create 2019/9/2
 * @since 1.0.0
 */
public class QuickSort2 {
    public int[] sort(int[] sourceArray) throws Exception {
        int[] ints = Arrays.copyOf(sourceArray, sourceArray.length);
        return quickSort(ints, 0, ints.length - 1);
    }

    private int[] quickSort(int[] ints, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(ints, left, right);
            quickSort(ints, left, partitionIndex - 1);
            quickSort(ints, partitionIndex + 1, right);

        }
        return ints;
    }

    private int partition(int[] ints, int left, int right) {
        int privot = left;
        int index = privot + 1;
        //将小于放在indexindex-2的空间上
        for (int i = index; i <= right; i++) {
            if (ints[i] < ints[privot]) {
                swap(ints, i, index);
                index++;
            }

        }
        swap(ints, privot, index - 1);
        return index - 1;
    }

    private void swap(int[] ints, int i, int index) {
        int temp = ints[i];
        ints[i] = ints[index];
        ints[index] = temp;
    }

}