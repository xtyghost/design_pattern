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
 * 从有序队列中找出比要插入数小的值，插入到它后面
 * 如果没有查到开头
 *
 * @author xutong
 * @create 2019/8/28
 * @since 1.0.0
 */
public class InsertSort3 {
    public static int[] insertSort(int[] sourc) {
        int[] ints = Arrays.copyOf(sourc, sourc.length);
        //队列1
        for (int i = 1; i < ints.length; i++) {
            //记录要插入的数据
            int tmp = ints[i];
            //从右边开始查找比它小的值
            int j = i;
            while (j > 0 && ints[j - 1] > tmp) {
                ints[j] = ints[j - 1];
                j--;
            }
            if (j != i) {
                ints[j] = tmp;
            }
        }

        return ints;
    }

    public static void main(String[] args) {
        int[] ints = insertSort(new int[]{2, 6, 1, 2, 213, 44, 6, 9, 3, 4});
        System.out.println(Arrays.toString(ints));

    }
}