package com.example.studyplan_1;

/**
 * 二分查找法
 * @author xutong
 */
public class Q1_704 {
    public static void main(String[] args) {
       int[] nums = {-1,0,3,5,9,12};
       Integer target = 9;
//        System.out.println(new Q704().search(nums,target));
        nums = new int[]{-1, 0, 3, 5, 9, 12};
         target = 2;
        System.out.println(new Q1_704().search(nums,target));

    }

    public int search(int[] nums, int target) {
        if (nums == null && nums.length == 0){
            return -1;
        }
      return   binarySearch(nums,target,0,nums.length);
    }

    public int binarySearch(int[] nums,int target,int small,int max){
        if (small ==max){
            return -1;
        }
        int index = (small +max) >> 1;//注意java的int类型，可能导致循环
        if (max - small==1){
            if (nums.length>max &&  nums[max]==target){
                return max;
            }else if (nums[small]==target){
                return small;
            }else {
                return -1;
            }
        }
        if (nums[index] == target){
            return index;
        }else if (nums[index]<target){
          return binarySearch(nums,target,index,max);
        }else {
            return binarySearch(nums,target,small,index);
        }
    }
}
