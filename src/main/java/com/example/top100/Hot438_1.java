package com.example.top100;

import com.alibaba.fastjson.JSONArray;

import java.util.*;

/**
 * 找到字符串中所有字母异位词
 */
public class Hot438_1 {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        Hot438_1 hot4381 = new Hot438_1();
        System.out.println(JSONArray.toJSONString(hot4381.findAnagrams(s, p)));
    }

    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        SlideArray array = new SlideArray(s.toCharArray(), p.length());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            array.remove(p.charAt(i));
        }
        if (array.isMatch()) {
            list.add(0);
        }

        for (int i = 1; i <= s.length() - p.length(); i++) {
            array.moveLeft(s.charAt(i - 1), s.charAt(i + p.length() - 1));
            if (array.isMatch()) {
                list.add(i);
            }
        }
        return list;
    }

    public class SlideArray {
        HashMap<Character, Integer> map = new HashMap<>();

        public SlideArray(char[] arr, int len) {
            for (int i = 0; i < len; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }

        public void remove(char c) {
            int val = map.getOrDefault(c, 0) - 1;
            if (val == 0) {
                map.remove(c);
            } else {
                map.put(c, val);
            }
        }

        public void moveLeft(char l, char r) {
            remove(l);
            add(r);
        }

        private void add(char r) {
            int rVal = map.getOrDefault(r, 0) + 1;
            if (rVal == 0) {
                map.remove(r);
            } else {
                map.put(r, rVal);
            }
        }

        public boolean isMatch() {
            return map.isEmpty();
        }

        public int dffer() {
            return map.values().stream().mapToInt(o -> o).sum();
        }
    }
}
