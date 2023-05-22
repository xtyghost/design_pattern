package com.example.geekbang1.day1;


import cn.hutool.json.JSONArray;

/**
 * 合并两个有序数组
 * @author xutong
 */
public class Q1_88_1 {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int m = 3;
       int[] nums2 = {2,5,6};
       int n = 3;
       new Q1_88_1().merge(nums1,m,nums2,n);
        System.out.println(new JSONArray(nums1));
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ints = new int[nums1.length];
        int left = 0;
        int right = 0;
        for (int i = 0; i < ints.length; i++) {
            if (right>=n){
                ints[i] = nums1[left++];
                continue;
            }
            if (left>=m){
                ints[i]= nums2[right++];
                continue;
            }
            if (nums1[left]>=nums2[right]){
                ints[i] =nums2[right++];
            }else {
                ints[i] =nums1[left++];
            }
        }
        System.arraycopy(ints,0,nums1,0,ints.length);
    }

    public void swap(int[] nums ,int left ,int right){
        int tmp = nums[left];
        nums[left]= nums[right];
        nums[right]= tmp;
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {

    }
}
