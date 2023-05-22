package com.example.studyplan_1;

/**
 * @author xutong
 */
public class Q1_35 {
    public static void main(String[] args) {
        System.out.println(new Q1_35().searchInsert(new int[]{1, 3,5},4));
    }

    public int searchInsert(int[] nums, int target) {
            if (nums[0]>target){
                return 0;
            }
        if (nums[nums.length-1]<target){
            return nums.length;
        }

        return searchInsert(nums,target,0,nums.length-1);
    }

    public int searchInsert(int[] nums ,int target, int left, int right){
        int mid = (left+right)>>1;
        if (right -left ==1){
            if (target ==nums[left]){
                return left;
            }
            if (target<=nums[right]){
                    return right;
            }
        }
        if (target == nums[mid]){
            return mid;
        }else if (target<nums[mid]){
            return searchInsert(nums,target,left,mid);
        }else {
            return searchInsert(nums,target,mid,right);
        }
    }
}
