package com.example.top100;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * 最小覆盖子串
 */
public class Hot76 {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        Hot76 hot76 = new Hot76();
        System.out.println(hot76.minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        SlideArray slideArray = new SlideArray(t.toCharArray(), t.length());
        s = slideArray.trimStr(s);
        if (s.length() < t.length()) {
            return "";
        }
        LinkedList<Node> nodes = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (slideArray.existKey(s.charAt(i))) {
                nodes.addLast(new Node(s.charAt(i), i));
            }
        }
        int l = 0;
        String minStr = "";
        for (int i = 0; i < nodes.size(); i++) {
            slideArray.remove(nodes.get(i).c);
            while (slideArray.isMatch()) {
                if (minStr.equals("")) {
                    minStr = s.substring(nodes.get(l).position, nodes.get(i).position + 1);
                } else if (minStr.length() > nodes.get(i).position - nodes.get(l).position + 1) {
                    minStr = s.substring(nodes.get(l).position, nodes.get(i).position + 1);
                }
                slideArray.add(nodes.get(l).c);
                l++;
            }

        }
        return minStr;
    }

    public static class SlideArray {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0;

        public SlideArray(char[] arr, int len) {
            for (int i = 0; i < len; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }

        public void remove(char c) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) - 1);
            }
        }

        private void add(char r) {
            if (map.containsKey(r)) {
                int rVal = map.get(r) + 1;
                map.put(r, rVal);
            }
        }

        public boolean isMatch() {
            return map.values().stream().allMatch(i -> i <= 0);
        }

        public boolean existKey(char c) {
            return map.containsKey(c);
        }

        public int differ() {
            return map.values().stream().mapToInt(o -> o).sum();
        }

        public String trimStr(String str) {
            int l = 0;
            int r = str.length() - 1;
            for (int i = 0; i < str.length(); i++) {
                if (map.containsKey(str.charAt(i))) {
                    l = i;
                    break;
                }
            }
            for (int i = str.length() - 1; i >= 0; i--) {
                if (map.containsKey(str.charAt(i))) {
                    r = i;
                    break;
                }
            }
            return str.substring(l, r + 1);
        }
    }

    public class Node {
        public Node(char c, int position) {
            this.c = c;
            this.position = position;
        }

        char c;
        int position;
    }
}
