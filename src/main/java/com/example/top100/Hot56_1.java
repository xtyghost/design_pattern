package com.example.top100;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Hot56_1 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Hot56_1 hot561 = new Hot56_1();
        System.out.println(JSONArray.toJSONString(hot561.merge(intervals)));
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> ints = new LinkedList<>();
        ints.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] last = ints.getLast();
            if (last[1] >= intervals[i][0]) {
                last[1] = Math.max(intervals[i][1],last[1]);
            } else {
                ints.addLast(intervals[i]);
            }
        }
        return ints.toArray(new int[0][0]);
    }
}
