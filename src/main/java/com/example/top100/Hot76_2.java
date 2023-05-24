package com.example.top100;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 最小覆盖子串
 */
public class Hot76_2 {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        Hot76_2 hot76 = new Hot76_2();
        System.out.println(hot76.minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        // 记录字符出现次数的数组
        int[] target = new int[128];
        // 统计 t 中字符的出现次数
        for (char c : t.toCharArray()) {
            target[c]++;
        }

        int left = 0;  // 窗口左指针
        int right = 0; // 窗口右指针
        int count = t.length(); // 记录窗口内已经包含了 t 中字符的数量
        int minLen = Integer.MAX_VALUE; // 记录最小窗口长度
        int minStart = 0; // 记录最小窗口起始位置

        while (right < s.length()) {
            // 当前字符在 t 中出现次数大于等于1，表示是需要的字符
            if (target[s.charAt(right)] >= 1) {
                count--;
            }
            target[s.charAt(right)]--;
            right++;

            // 窗口内已经包含了 t 中所有字符
            while (count == 0) {
                // 更新最小窗口长度和起始位置
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }

                // 左指针向右移动，缩小窗口
                target[s.charAt(left)]++;
                if (target[s.charAt(left)] > 0) {
                    count++;
                }
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(minStart, minStart + minLen);
        }
    }

}
