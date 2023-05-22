package com.example.geekbang1.day11;

import cn.hutool.json.JSONArray;

import java.util.HashMap;

/**
 * 两数之和
 * @author xutong
 */
public class Q11_1_1 {
    public static void main(String[] args) {
       int[] nums =new  int[]{2,7,11,15};
       int target = 9;
        System.out.println(new JSONArray(new Q11_1_1().twoSum(nums,target)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer aim = map.get(target - nums[i]);
            if (aim !=null){
                return new int[]{i,aim};
            }else {
                map.put(nums[i],i );
            }
        }
        return nums;
    }


}
