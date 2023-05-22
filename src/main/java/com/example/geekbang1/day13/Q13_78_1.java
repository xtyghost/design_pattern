package com.example.geekbang1.day13;

import cn.hutool.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 * @author xutong
 */
public class Q13_78_1 {
    public static void main(String[] args) {
        System.out.println(new JSONArray(new Q13_78_1().subsets(new int[]{1, 2, 3})));
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        for (int num : nums) {
            ArrayList<List<Integer>> lists2 = new ArrayList<>();
            for (List<Integer> list : lists) {
                ArrayList<Integer> list2 = new ArrayList<>(list);
                list2.add(num);
                lists2.add(list2);
            }
            lists.addAll(lists2);
        }
        return lists;
    }


}
