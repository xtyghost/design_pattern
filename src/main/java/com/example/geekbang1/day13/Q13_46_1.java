package com.example.geekbang1.day13;

import cn.hutool.json.JSONArray;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xutong
 */
public class Q13_46_1 {
    public static void main(String[] args) {
        System.out.println(new JSONArray(new Q13_46_1().permute(new int[]{1,2,3})));
    }
    ArrayList<List<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> t = new ArrayList<>();
    List<Integer> nums = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        this.nums=Arrays.stream(nums).mapToObj(Integer::new).collect(Collectors.toList());
        permute(0);
        return ans;
    }

    public void permute(int index) {
        if (t.size()==nums.size()){
            ans.add(new ArrayList<>(t));
        }
        ArrayList<Integer> res = new ArrayList<>(nums);
        res.removeAll(t);
        for (Integer re : res) {
            t.add(re);
            permute(index+1);
            t.remove(t.size()-1);
        }
    }
}
