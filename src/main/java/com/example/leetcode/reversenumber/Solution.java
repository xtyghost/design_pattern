package com.example.leetcode.reversenumber;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）
 *
 * @author xutong
 */
public class Solution {
    public static int reverse(int x) {
        boolean flag = x < 0;
        x=Math.abs(x);
        StringBuilder n = new StringBuilder();
        while (x != 0) {
            n.append(x % 10);
            x = x / 10;
        }
        try {
            int i = Integer.parseInt(n.toString());
            return flag ? -i : i;
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

}