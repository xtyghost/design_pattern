package com.example.studyplan_2;

/**
 * 最大子数组和，贪心算法
 * @author xutong
 */
public class Q1_53 {
    public static void main(String[] args) {
        int[] ints = {-1};
        int i = new Q1_53().maxSubArray(ints);
        System.out.println(i);
    }

    public int maxSubArray(int[] nums) {
        int max=nums[0];int current=0;
        //每次通知从0-i的最大子数组和，并记录最大值，如果当前最大和小于等于0说明下个数组没有必要包含前一个数组，
        for (int i = 0; i < nums.length; i++) {
            current=current+nums[i];
            if (current>max){
                max= current;
            }
            if (current<0){
                 current = 0;
            }

        }
        return max;
    }
}
