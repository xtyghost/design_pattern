package com.example.top100;

import org.springframework.util.Assert;

/**
 * 和维k的子数组
 */
public class Hot560 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        Hot560 hot560 = new Hot560();
        Assert.isTrue(hot560.subarraySum(nums, k) == 2, "error");
    }

    public int subarraySum(int[] nums, int k) {
        int[][] ints = new int[nums.length][nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            ints[i][i] = nums[i];
            if (nums[i] == k) {
                sum++;
            }
        }
        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                ints[x][y] = ints[x][y - 1] + ints[y][y];
                if (ints[x][y] == k) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
