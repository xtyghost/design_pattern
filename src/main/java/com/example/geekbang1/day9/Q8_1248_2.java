package com.example.geekbang1.day9;

import java.util.HashMap;

/**
 * 统计[优美子数组]
 * @author xutong
 */
public class Q8_1248_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,1,1};int k = 3;
        System.out.println(new Q8_1248_2().numberOfSubarrays(nums,k));
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int sum =0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            nums[i]= nums[i]%2+sum;
            sum=nums[i];
            Integer in = map.get(sum);
            map.put(sum,in==null?1:++in);
            if (sum>=k){
                count+=map.get(sum-k);
            }
        }
        return count;
    }
}
