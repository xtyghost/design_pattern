package com.example.studyplan_1;


import cn.hutool.json.JSONArray;

/**
 * 有序数组的平方
 * @author xutong
 */
public class Q2_977_2 {
    public static void main(String[] args) {
        int[] nums = {-10000,-9999,-7,-5,0,0,10000};
        String s =  new JSONArray(new Q2_977_2().sortedSquares(nums)).toString();
        System.out.println(s);
    }
    public int[] sortedSquares(int[] nums) {
        int[] ints = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for (int i = 0; i < ints.length; i++) {
            if (nums[left]*nums[left]>=nums[right]*nums[right]) {
                ints[ints.length-1-i]=nums[left]*nums[left];
                left++;
            }else {
                ints[ints.length-1-i]=nums[right]*nums[right];
                right-- ;
            }
        }

        return ints;
    }


}
