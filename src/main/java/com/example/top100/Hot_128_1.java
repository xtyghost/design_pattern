package com.example.top100;

import org.springframework.util.Assert;

import java.util.HashMap;

/**
 * 最长连续序列
 */
public class Hot_128_1 {

    public static void main(String[] args) {
        Hot_128_1 hot1281 = new Hot_128_1();
        int[] nums1 = {100, 4, 200, 1, 3, 2};

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
//        Assert.isTrue(hot1281.longestConsecutive(nums1) == 4, "error");
        Assert.isTrue(hot1281.longestConsecutive(nums2) == 9, "error");
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                int value = map.getOrDefault(num - 1, 0) + map.getOrDefault(num + 1, 0) + 1;
                map.put(num, value);
                if (value > 1) {
                    fillArray(map, num, value);
                }
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    private void fillArray(HashMap<Integer, Integer> map, int num, int value) {
        for (int i = 1; i < value; i++) {
            if (!map.containsKey(i + num)) {
                break;
            } else {
                map.put(i + num, value);
            }
        }
        for (int i = 1; i < value; i++) {
            if (!map.containsKey(num - i)) {
                break;
            } else {
                map.put(num - i, value);
            }
        }

    }
}
