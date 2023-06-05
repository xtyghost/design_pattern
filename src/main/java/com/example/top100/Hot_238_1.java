package com.example.top100;

import com.alibaba.fastjson.JSONArray;

public class Hot_238_1 {
    public static void main(String[] args) {
        Hot_238_1 hot2381 = new Hot_238_1();
        int[] arr = {1, 2, 3, 4};
        System.out.println(JSONArray.toJSONString(hot2381.productExceptSelf(arr)));

    }

    public int[] productExceptSelf(int[] nums) {
        int[] ints = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int last = i - 1;
            ints[i] = nums[i] * (last >= 0 ? ints[last] : 1);
        }
        int rightArray = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0) {
                ints[0] = rightArray;
                break;
            }
            ints[i] = ints[i - 1] * rightArray;
            rightArray = nums[i] * (i + 1 >= nums.length ? 1 : rightArray);
        }
        return ints;
    }
}
