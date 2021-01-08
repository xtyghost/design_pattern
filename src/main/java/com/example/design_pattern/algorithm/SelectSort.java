/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SelectSort
 * Author:   xutong
 * Date:     2019/8/28 2:27 下午
 * Description: 选择排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.algorithm;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈选择排序〉
 *
 * @author xutong
 * @create 2019/8/28
 * @since 1.0.0
 */
public class SelectSort {

    public static int[] selectSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            //保证ints[i]比后面要小
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    int ex = ints[i];
                    ints[i] = ints[j];
                    ints[j] = ex;
                }
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = selectSort(new int[]{2, 6, 1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));

    }
}