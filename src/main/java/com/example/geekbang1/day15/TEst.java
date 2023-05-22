package com.example.geekbang1.day15;

import cn.hutool.json.JSONArray;

/**
 * @author xutong
 */
public class TEst {
    public static void main(String[] args) {
     int[]   nums1 = new int[]{1,2,3,0,0,0}; int m = 3;int[] nums2 = new int[]{2,5,6};int n = 3;
        new TEst().merge(nums1,m,nums2,n);
        System.out.println(new JSONArray(nums1));

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int l=0;
        int r = 0;
        for (int i = 0; i < res.length; i++) {
            if (l>=m){
                res[i]=nums2[r++];
                continue;
            }
            if (r>=n){
                res[i]= nums1[l++];
                continue;
            }
            if (nums1[l]>=nums2[r]) {
                res[i]=nums2[r++];

            }else {
                res[i]=nums1[l++];
            }
        }
        System.arraycopy(res,0,nums1,0,m+n);
    }


}
