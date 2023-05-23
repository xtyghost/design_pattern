package com.example.top100;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 最长连续序列
 */
public class Hot_128_3 {

    public static void main(String[] args) {
        Hot_128_3 hot_128_2 = new Hot_128_3();
        int[] nums1 = {100, 4, 200, 1, 3, 2};

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] nums3 = {-7, -1, 3, -9, -4, 7, -3, 2, 4, 9, 4, -9, 8, -7, 5, -1, -7};
//        Assert.isTrue(hot_128_2.longestConsecutive(nums1) == 4, "error");
//        Assert.isTrue(hot_128_2.longestConsecutive(nums2) == 9, "error");
        Assert.isTrue(hot_128_2.longestConsecutive(nums3) == 4, "error");

    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            //找出起始点
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }


}
