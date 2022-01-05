package com.example.leetcode.string2int;

/**
 * @author xutong
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(new Solution().myAtoi("20000000000000000000"));
        System.out.println(Integer.MAX_VALUE + "");
    }

    public int myAtoi(String s) {
        s = s.trim();
        if ("".equals(s)) {
            return 0;
        }
        char start = s.charAt(0);
        int end, firstNoDigital;
        switch (start) {
            case '+':
                s = s.substring(1);

                end = findFirstNoDigital(s);
                firstNoDigital = findNoZoreIndex(s);
                s = s.substring(firstNoDigital, end);
                if ("".equals(s)) {
                    return 0;
                }
                if (s.length() > 10) {
                    return Integer.MAX_VALUE;
                }
                if (Long.parseLong(s) > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                return (int) Long.parseLong(s);
            case '-':
                s = s.substring(1);
                end = findFirstNoDigital(s);
                firstNoDigital = findNoZoreIndex(s);
                s = s.substring(firstNoDigital, end);
                if ("".equals(s)) {
                    return 0;
                }
                if (s.length() > 10) {
                    return Integer.MIN_VALUE;
                }
                while ((Long.parseLong(s) - 1L) > Integer.MAX_VALUE) {
                    return Integer.MIN_VALUE;
                }
                return (int) (0 - Long.parseLong(s));
            default:
                end = findFirstNoDigital(s);
                firstNoDigital = findNoZoreIndex(s);
                s = s.substring(firstNoDigital, end);
                if ("".equals(s)) {
                    return 0;
                }
                if (s.length() > 10) {
                    return Integer.MAX_VALUE;
                }
                if (Long.parseLong(s) > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                return (int) Long.parseLong(s);
        }

    }

    public int findNoZoreIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                return i;
            }
        }
        return str.length();
    }

    public int findFirstNoDigital(String str) {
        char v = 0;
        for (int i = 0; i < str.length(); i++) {
            v = str.charAt(i);
            if (v < '0' || v > '9') {
                return i;
            }
        }
        return str.length();
    }
}
