package com.example.studyplan_1;

/**
 * 二分查找法
 * @author xutong
 */
public class Q1_704_2 {
    public static void main(String[] args) {
       int[] nums = {-1,0,3,5,9,12};
       Integer target = 9;
//        System.out.println(new Q704().search(nums,target));
        nums = new int[]{-1, 0, 3, 5, 9, 12};
         target = 2;
        System.out.println(new Q1_704_2().search(nums,target));

    }

    public int search(int[] nums, int target) {
        if (nums == null && nums.length == 0){
            return -1;
        }
        if (nums[nums.length-1]<target){
            return -1;
        }
      return   binarySearch(nums,target,0,nums.length);
    }

    public int binarySearch(int[] nums,int target,int left,int right){
        if (right<left){
            return -1;
        }

        int mid = (left +right) >> 1;//注意java的int类型，可能导致循环

        if (nums[mid] == target){
            return mid;
        }else if (nums[mid]<target){
          return binarySearch(nums,target,mid+1,right);
        }else {
            return binarySearch(nums,target,left,mid-1);
        }
    }
}
