package com.example.geekbang1.day9;

/**
 * 最大子数组和
 * @author xutong
 */
public class Q9_53_1 {
    public static void main(String[] args) {
       int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Q9_53_1().maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] s = new int[n+1];
        int[] preMin = new int[n+1];
        s[0] =0;
        //求前缀和
        for (int i = 1; i < n; i++) {
            s[i] = s[i-1] +nums[i-1];
        }
        preMin[0] = s[0];
        for (int i = 1; i < n; i++) {
            preMin[i] = Math.min(preMin[i-1],s[i]);
        }
        int ans = -100000;
        for (int i = 1; i < n; i++) {
            ans= Math.max(ans,s[i]-preMin[i-1]);
        }
        return ans;
    }
}
