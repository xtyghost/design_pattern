package com.example.geekbang1.day11;

import cn.hutool.json.JSONArray;

/**
 * 两数之和 II - 输入有序数组
 * @author xutong
 */
public class Q11_167_3 {
    public static void main(String[] args) {
       int[] numbers = new int[]{2,7,11,15};
       int target = 9;
        System.out.println(new JSONArray(new Q11_167_3().twoSum(numbers, target)));
    }

    /**
     * 双指针
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length-1;
        for (int i = 0; i < numbers.length; i++) {
            while (i<j&&numbers[i]+numbers[j]>target)j--;
            if (i<j&&numbers[i]+numbers[j]==target){
                return new int[]{++i,++j};
            }
        }
        return numbers;
    }


}
