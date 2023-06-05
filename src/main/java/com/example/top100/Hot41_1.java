package com.example.top100;

import org.springframework.util.Assert;

/**
 * 缺失的第一个正数
 */
public class Hot41_1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0,3,6,7};
        Hot41_1 hot411 = new Hot41_1();
        Assert.isTrue(hot411.firstMissingPositive(nums) == 4, "error");

    }

    public int firstMissingPositive(int[] nums) {
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            if (num <= 0 || num > nums.length) {
                nums[i] = -1;
                continue;
            }
            int destination = nums[num - 1];
            if (destination <= 0 || destination > nums.length || destination == num) {
                nums[num - 1] = num;
            } else {
                nums[i] = destination;
                nums[num - 1] = num;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }


}
