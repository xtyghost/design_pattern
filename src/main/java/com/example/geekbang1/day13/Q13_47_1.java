package com.example.geekbang1.day13;

import cn.hutool.json.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 全排列2
 * @author xutong
 */
public class Q13_47_1 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new Q13_47_1().permuteUnique(new int[]{1, 1, 2});
        System.out.println(new JSONArray(lists));
    }

    ArrayList<List<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> t = new ArrayList<>();
    HashSet<String> set = new HashSet<>();
    List<Integer> nums =new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
         this.nums = Arrays.stream(nums).mapToObj(Integer::new).collect(Collectors.toList());
        permuteUnique(0);
        return ans;
    }
    public void permuteUnique(int index) {
        if (t.size()==nums.size()){
            String s = t.stream().map(Object::toString).collect(Collectors.joining(","));
            if (set.add(s)){
                ans.add(new ArrayList<>(t));
            }
        }
        ArrayList<Integer> res = new ArrayList<>(nums);
        for (Integer integer : t) {
            int i = res.indexOf(integer);
            res.remove(i);
        }
        for (Integer re : res) {
            t.add(re);
            permuteUnique(index+1);
            t.remove(t.size()-1);
        }
    }
}
