package com.example.top100;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数只和
 * 双指针法解决
 */
public class Hot15_2 {
    public static void main(String[] args) {
        Hot15_2 hot15 = new Hot15_2();
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0,0,0,0};
        System.out.println(JSONArray.toJSONString(hot15.threeSum(nums1)));
        System.out.println(JSONArray.toJSONString(hot15.threeSum(nums2)));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                int sum=nums[l]+nums[r]+nums[i];
                if(sum<0){
                    l++;
                }else if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    int lv=nums[l],rv=nums[r];
                    while(l<r&&nums[l]==lv){
                        l++;
                    }
                    while(l<r&&nums[r]==rv){
                        r--;
                    }
                }else{
                    r--;
                }
            }
            int val=nums[i];
            while(val==nums[i]&&i<nums.length-2){
                i++;
            }
            i--;
        }
        return res;
    }
}
