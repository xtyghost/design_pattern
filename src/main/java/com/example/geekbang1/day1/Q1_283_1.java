package com.example.geekbang1.day1;


import cn.hutool.json.JSONArray;

/**
 * @author xutong
 */
public class Q1_283_1 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new Q1_283_1().moveZeroes(nums);
        System.out.println(new JSONArray(nums));
    }
    public void moveZeroes(int[] nums) {
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                if (currentIndex!=i){
                    swap(nums,currentIndex,i);
                }
                currentIndex++;
            }
        }
    }

    public void swap(int[] nums ,int left ,int right){
        int tmp = nums[left];
        nums[left]= nums[right];
        nums[right]= tmp;
    }
}
