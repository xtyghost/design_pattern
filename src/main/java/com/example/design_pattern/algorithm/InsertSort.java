/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: InsertSort
 * Author:   xutong
 * Date:     2019/8/28 4:11 下午
 * Description: 插入排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.algorithm;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈插入排序〉
 * 默认0到0是有序到序列
 * 1到x是另一个无序队列，
 *
 * @author xutong
 * @create 2019/8/28
 * @since 1.0.0
 */
public class InsertSort {
    public static int[] insertSort(int[] ints) {
        //队列1
        for (int i = 1; i < ints.length; i++) {
            //队列2

            for (int j = 0; j < i; j++) {
                //选择位置
                //插入

                if (ints[i] <= ints[0]) {
                    int ex = ints[i];
                    for (int k = i; k >= 1; k--) {
                        ints[k] = ints[k - 1];
                    }
                    ints[0] = ex;
                    continue;
                }
                if (ints[i] >= ints[i - 1]) {
                    continue;
                }
                if (ints[i] > ints[j] && ints[i] <= ints[j + 1]) {
                    int ex = ints[i];
                    for (int k = i; k >= j + 2; k--) {
                        ints[k] = ints[k - 1];
                    }
                    ints[j + 1] = ex;
                    break;
                }
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = insertSort(new int[]{2, 6, 1, 2, 213, 44, 6, 9, 3, 4});
        System.out.println(Arrays.toString(ints));

    }
}