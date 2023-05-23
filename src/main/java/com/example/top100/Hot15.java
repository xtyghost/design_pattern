package com.example.top100;

import com.alibaba.fastjson.JSONArray;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数只和
 */
public class Hot15 {
    public static void main(String[] args) {
        Hot15 hot15 = new Hot15();
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 0, 0, 0};
        System.out.println(JSONArray.toJSONString(hot15.threeSum(nums2)));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > 0) {
                break;
            }
            int l = nums.length - 1;
            // left point >>1
            for (int y = x + 1; y < nums.length; y++) {
                if (nums[x] + nums[y] > 0) {
                    break;
                }
                for (int z = l; z > y; z--) {
                    if (nums[x] + nums[y] + nums[z] == 0) {
                        lists.add(Arrays.asList(nums[x], nums[y], nums[z]));
                    }
                    //clear tail‘s  repeat elements
                    while (z - 1 >= 0 && nums[z] == nums[z - 1]) {
                        z--;
                    }
                    if (nums[x] + nums[y] + nums[z] < 0) {
                        break;
                    } else {
                        // right point <<1
                        l = z - 1;
                    }
                }
                y = getAnInt(nums, y);
            }
            x = getAnInt(nums, x);
        }
        return lists;
    }

    private static int getAnInt(int[] nums, int z) {
        while (z + 1 < nums.length && nums[z] == nums[z + 1]) {
            z++;
        }
        return z;
    }
}
