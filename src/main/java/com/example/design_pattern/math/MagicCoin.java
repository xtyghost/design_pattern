/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MagicCoin
 * Author:   xutong
 * Date:     2019/11/12 5:37 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.math;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019/11/12
 * @since 1.0.0
 */
public class MagicCoin {

    private static StringBuffer out = new StringBuffer();

    public static void main(String[] args) {

        test(10L);
        System.out.println(out.reverse().toString());

    }

    private static void test(Long x) {
        if (x == 0) {
            return;
        }
        if (x % 2 == 0) {
            out.append(2);
            test(methed2(x));
        } else {
            out.append(1);
            test(methed1(x));
        }
    }

    private static Long methed1(Long x) {
        return (x - 1) / 2;
    }

    private static Long methed2(Long x) {
        return (x - 2) / 2;
    }
}