package com.example.studyplan_1;

import cn.hutool.json.JSONArray;

/**
 * 轮转数组
 * @author xutong
 */
public class Q2_189_2 {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5,6,7};
       int k = 3;
       new Q2_189_2().rotate(nums,k);
        System.out.println(new JSONArray(nums));
    }

        public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);

        }
        public void reverse(int[] nums, int start,int end){
             while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
             }
        }



}
