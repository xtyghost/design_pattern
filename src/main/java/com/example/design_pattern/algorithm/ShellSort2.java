/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ShellSort2
 * Author:   xutong
 * Date:     2019/8/29 4:00 下午
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
 * @create 2019/8/29
 * @since 1.0.0
 */
public class ShellSort2  {

    public static int[] sort(int[] source) throws Exception {
        int[] ints = Arrays.copyOf(source, source.length);

        int gap = 1;
        while (gap < ints.length) {
            gap = gap * 3 + 1;
        }
        while (gap > 0) {
            for (int i = gap; i < ints.length; i++) {
                int ex = ints[i];
                int j = i - gap;
                while (j > -0 && ints[j] > ex) {
                    ints[j + gap] = ints[j];
                    j -= gap;
                }
                ints[j + gap] = ex;
            }
            gap = (int) Math.floor(gap / 3);
        }
        return ints;
    }

}