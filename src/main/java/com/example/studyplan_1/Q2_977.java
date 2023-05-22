package com.example.studyplan_1;


import cn.hutool.json.JSONArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 有序数组的平方
 * @author xutong
 */
public class Q2_977 {
    public static void main(String[] args) {
        int[] nums = {-10000,-9999,-7,-5,0,0,10000};
        String s =  new JSONArray(new Q2_977().sortedSquares(nums)).toString();
        System.out.println(s);
    }
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int num : nums) {
            if (num<0){
                list1.add(num*num);
            }else {
                list2.add(num*num);
            }
        }
        Collections.reverse(list1);
        if (list1.size()>list2.size()){
            int left = 0;
            for (Integer target : list2) {
                if (list1.get(0)>target){
                  list1.add(0,target);
                  continue;
                }
                if (list1.get(list1.size()-1)<target){
                    list1.add(target);
                    continue;
                }
                left = binarySearch(list1, target, left, list1.size() - 1);
                list1.add(left,target);
            }
            for (int i = 0; i < list1.size(); i++) {
                nums[i] = list1.get(i);
            }
            return nums;
        }else {
            int left = 0;
            for (Integer target : list1) {
                if (list2.get(0)>target){
                    list2.add(0,target);
                    continue;
                }
                if (list2.get(list2.size()-1)<target){
                    list2.add(target);
                    continue;
                }
                left = binarySearch(list2, target, left, list2.size() - 1);
                list2.add(left,target);
            }
            for (int i = 0; i < list2.size(); i++) {
                nums[i] = list2.get(i);
            }
            return nums;
        }


    }

    public int binarySearch(List<Integer> list,int target,int left ,int right){
        if (right -left==1){
            if (list.get(left)==target){
                return left;
            }
            if (list.get(right)>=target){
                return right;
            }
        }
        int mid = left+ (right-left)/2;
        if (list.get(mid) ==target){
            return mid;
        }else if (list.get(mid)<target){
            return binarySearch(list,target,mid,right);
        }else {
            return binarySearch(list,target,left,mid);
        }
    }

}
