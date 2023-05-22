package com.example.geekbang1.day13;

import cn.hutool.json.JSONArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xutong
 */
public class Q13_90_1 {
    public static void main(String[] args) {
        System.out.println(new JSONArray(new Q13_90_1().subsetsWithDup(new int[]{1, 2, 2})));
    }

    List<List<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> t = new ArrayList<>();
    HashSet<String> set = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
         subsetsWithDup(nums,0);
         return ans;
    }

    public void subsetsWithDup(int[] nums,int i) {
        if (i==nums.length){
            String s = t.stream().sorted().map(Object::toString).collect(Collectors.joining(","));
            if (set.add(s)) {
                ans.add(new ArrayList<>(t));
            }
            return;
        }
        t.add(nums[i]);
        subsetsWithDup(nums,i+1);
        t.remove(t.size()-1);
        subsetsWithDup(nums,i+1);
    }
}
