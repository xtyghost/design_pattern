package com.example.geekbang1.day12;

import java.util.Stack;

/**
 *
 * 盛最多水的容器
 * @author xutong
 */
public class Q12_11_3 {

    public int maxArea(int[] height) {
        int i =0 ;
        int j = height.length-1;
        int ans = 0;
        while (i<j){
            ans = Math.max(ans,Math.min(height[i],height[j])*(j-i));
            if (height[i]<height[j]){
                i++;
            }else {
                j--;
            }
        }
        return ans;
    }




}
