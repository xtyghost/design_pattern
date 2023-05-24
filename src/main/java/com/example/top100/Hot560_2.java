package com.example.top100;

import org.springframework.util.Assert;

import java.util.HashMap;

/**
 * 和为k的子数组--两数之差问题
 */
public class Hot560_2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        Hot560_2 hot560 = new Hot560_2();
        Assert.isTrue(hot560.subarraySum(nums, k) == 2, "error");
    }

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(nums[i]);
            }
            map.put(sum, map.getOrDefault(nums[i], 0) + 1);
        }

        return count;
    }
}
