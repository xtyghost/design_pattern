/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ShellSort
 * Author:   xutong
 * Date:     2019/8/29 3:19 下午
 * Description: 对插入排序的一种增强，构造两种极端情况提高插入排序效率
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.algorithm;

import org.springframework.util.StopWatch;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 〈一句话功能简述〉<br>
 * 〈对插入排序的一种增强，构造两种极端情况提高插入排序效率〉
 * 可以把插入排序看作希尔排序的一种特殊情况，即间隔是一个的时候的希尔排序
 * 而且，插入排序是希尔排序的最后一步
 * 通过一轮轮优化简化最后插入排序的速度，
 * len
 * 一共有多少轮未决定，但是公式是 1 ，1+g，1+2*g ,...., len/2 +1
 *
 * @author xutong
 * @create 2019/8/29
 * @since 1.0.0
 */
public class ShellSort {

    private static StopWatch stopWatch = new StopWatch();

    public static int[] sort(int[] sourc) {
        int[] ints = Arrays.copyOf(sourc, sourc.length);
        int gap = ints.length / 2 + 1;
        //因为确定开始的index比较多好确
        //确定gap
        for (int i = gap; i > 0; i /= 2) {
            //反向思考，6到10，亦可以是5到0
//       开始插入，此处不进行，长度限制，因为，不会造成，性能消耗
            for (int w = 0; w < ints.length; w++) {
                //确定操作到数组
                for (int j = gap; j < ints.length; j += gap) {
                    //操作数据
                    //找出比ints[j]小的数
//                对比到数
                    int k = j;
                    while (ints[gap] > ints[k - gap]&&k-gap>0) {
                        int ex = ints[k];
                        ints[k] = ints[k + gap];
                        ints[k + gap] = ex;
                        k -= gap;
                    }
                }
            }
        }
        return ints;

    }

    private static void simpleSort(int[] ints, int sr) {
        for (int i = 0; i < ints.length - sr; i++) {
            if (ints[i] > ints[i + sr]) {
                int ex = ints[i];
                ints[i] = ints[i + sr];
                ints[i + sr] = ex;
            }
        }
//        System.out.println(Arrays.toString(ints));
    }

    public static void main(String[] args) throws Exception {
        int[] ints1 = new Random().ints(1000, 20, 1000).toArray();

        stopWatch.start("insertSort3");
        int[] ints2 = InsertSort3.insertSort(ints1);
        System.out.println(Arrays.toString(ints2));
        stopWatch.stop();
        System.out.println(Arrays.toString(ints1));
        ints1 = new Random().ints(1000, 20, 1000).toArray();
        stopWatch.start("shellSort");
        int[] ints = sort(ints1);
        System.out.println(Arrays.toString(ints));
        stopWatch.stop();


        System.out.println(stopWatch.prettyPrint());

    }
}