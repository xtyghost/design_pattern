package com.example.studyplan_1;

import cn.hutool.json.JSONArray;

/**
 * @author xutong
 */
public class Q3_283 {
    public static void main(String[] args) {

        int[] ints = {0,1,0,3,12};
        new Q3_283().moveZeroes(ints);
        System.out.println(new JSONArray(ints));
    }
    public void moveZeroes(int[] nums) {
        int UnZeroIndex =nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[nums.length-1-i]==0){
                reverse(nums,nums.length-1-i,UnZeroIndex);
                UnZeroIndex--;
                reverse(nums,nums.length-1-i,UnZeroIndex);
            }
        }

    }

    public void reverse(int[] nums,int left ,int right){
        while (left<right){
            int tmp = nums[right];
            nums[right]= nums[left];
            nums[left] = tmp;
            left++;
            right--;
        }
    }
}
