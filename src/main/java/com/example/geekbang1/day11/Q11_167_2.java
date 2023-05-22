package com.example.geekbang1.day11;

import cn.hutool.json.JSONArray;

/**
 * 两数之和 II - 输入有序数组
 * @author xutong
 */
public class Q11_167_2 {
    public static void main(String[] args) {
       int[] numbers = new int[]{2,7,11,15};
       int target = 9;
        System.out.println(new JSONArray(new Q11_167_2().twoSum(numbers, target)));
    }

    /**
     * 双指针
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int aim;
        int right = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
                aim = target- numbers[i];
            for (int j =i+1; j < right; j++) {
                if (numbers[j]==aim){
                    return new int[]{++i,++j};
                }else if (numbers[j]>aim){
                    right= j;
                }
            }
        }
        return numbers;
    }


}
