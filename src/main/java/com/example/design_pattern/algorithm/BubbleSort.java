/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BubbleSort
 * Author:   xutong
 * Date:     2019/8/28 1:50 下午
 * Description: 冒泡排序算法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.algorithm;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈冒泡排序算法〉
 *
 * @author xutong
 * @create 2019/8/28
 * @since 1.0.0
 */
public class BubbleSort {
    /**
     * 冒泡排序：不停当进行一致性比较，并保证，最后两位一直性比较通过
     *
     * @param inst
     * @return
     */
    public static int[] bubbleSort(int[] inst) {
        for (int i = 1; i < inst.length; i++) {
            boolean flag = true;
            for (int j = 0; j < inst.length - 1; j++) {
                if (inst[j] > inst[j + 1]) {
                    int ex = inst[j];
                    inst[j] = inst[j + 1];
                    inst[j+1] = ex;
                    flag = false;
                }
            }
            if (flag) {
                //一致性比较通过
                return inst;
            }
        }
        return inst;
    }

    public static void main(String[] args) {
        int[] ints = bubbleSort(new int[]{2, 6, 1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));

    }
}