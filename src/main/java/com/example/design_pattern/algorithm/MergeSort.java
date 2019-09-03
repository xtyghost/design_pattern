/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MergeSort
 * Author:   xutong
 * Date:     2019/8/30 10:38 上午
 * Description: 归并排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.algorithm;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈归并排序〉
 *
 * @author xutong
 * @create 2019/8/30
 * @since 1.0.0
 */
public class MergeSort {
    public static int[] sort(int[] source) {
        int[] ints = Arrays.copyOf(source, source.length);
        //先切分,一直切到1返回
        if (ints.length == 1) {
            return ints;
        }

        int len = ints.length / 2;
        int[] leftInts = sort(Arrays.copyOf(source, len));
        System.out.println(Arrays.toString(leftInts));
        int[] rightInts = sort(Arrays.copyOfRange(source, len, ints.length));
        System.out.println(Arrays.toString(rightInts));
        //将队列分为左右连个队列，分别递归，使用插入排序
        return mergeSort(leftInts, rightInts);
    }

    private static int[] mergeSort(int[] leftInts, int[] rightInts) {
        int[] ints = Arrays.copyOf(leftInts, leftInts.length + rightInts.length);
        int size = leftInts.length - 1;
        for (int rightInt : rightInts) {
            for (int i = size; i >= 0; i--) {

                if (ints[i] < rightInt) {
                    ints[i + 1] = rightInt;
                    break;
                }
                //假设right开始在size+1处
                //交互位置
                ints[i + 1] = ints[i];
                ints[i] = rightInt;
            }
            size++;
        }
//        System.out.println(Arrays.toString(ints));
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = sort(new int[]{2, 6, 1, 2, 213, 44, 6, 9, 3, 4});
        System.out.println(Arrays.toString(ints));

    }
}