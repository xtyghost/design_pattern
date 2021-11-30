package com.example.leetcode.string2int;

import org.springframework.util.StringUtils;

/**
 * @author xutong
 */
public class ParseString {

    public int myAtoi(String s) {

        long l = getLong(s);
        if (l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (l < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) l;
        }

    }

    private long getLong(String s) {
        s = s.trim();
        if (StringUtils.isEmpty(s)){
            return 0;
        }
      Integer.parseInt()
    }
}
