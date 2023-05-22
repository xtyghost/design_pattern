package com.example.geekbang1.day1;

/**
 *
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *  删除有序数组中的重复项
 * @author xutong
 */
public class Q1_26_1 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int x = new Q1_26_1().removeDuplicates(nums);
        System.out.println(x);
    }
    public  int removeDuplicates(int[] nums) {
        int statIndex =0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>nums[statIndex]){
                statIndex++;
                nums[statIndex]= nums[i];
            }
        }
        return ++statIndex;
    }
}
