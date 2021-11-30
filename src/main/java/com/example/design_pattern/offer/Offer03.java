package com.example.design_pattern.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author xutong
 */
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        int tmp;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == i) {
                continue;
            }
            if (num == nums[num]) {
                return num;
            }
            tmp = nums[num];
            nums[num] = num;
            nums[i] = tmp;
            i--;
        }
        return -1;
    }

    public int bak1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
