package com.example.geekbang1.day11;

import cn.hutool.json.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * @author xutong
 */
public class Q11_15_1 {
    public static void main(String[] args) {
        System.out.println(new JSONArray(new Q11_15_1().threeSum(new int[]{0,1,1})));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
       
        for (int i = 0; i < nums.length;) {

            int r = nums.length-1;
            for (int j = i+1; j < nums.length&&r>j;) {
                while (r>0&&nums[i]+nums[j]+nums[r]>0){
                    r--;
                }
                if (r<=j){
                    continue;
                }
                if (nums[i]+nums[j]+nums[r]==0){
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(nums[i]);
                    arrayList.add(nums[j]);
                    arrayList.add(nums[r]);
                    lists.add(arrayList);
                }
                j++;
                while (j < nums.length&&nums[j]==nums[j-1]){
                    j++;
                }
            }
            i++;
            while (i < nums.length&&nums[i]==nums[i-1]){
                i++;
            }
        }
        return lists;
    }
}
