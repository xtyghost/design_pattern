package com.example.geekbang1.day11;

import cn.hutool.json.JSONArray;

/**
 * 两数之和 II - 输入有序数组
 * @author xutong
 */
public class Q11_167_1 {
    public static void main(String[] args) {
       int[] numbers = new int[]{2,7,11,15};
       int target = 9;
        System.out.println(new JSONArray(new Q11_167_1().twoSum(numbers, target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int j = binarySearch(numbers, i+1, numbers.length-1, target - numbers[i]);
            if (j !=-1) {
                return new int[]{++i,++j};
            }
        }
        return numbers;
    }
    public int binarySearch(int[] numbers,int left ,int right,int target){
        if (left>right){
           return -1;
        }
        int mid = left+(right-left)/2;
        int midVal = numbers[mid];
        if (midVal ==target){
            return mid;
        }else if (midVal>target){
           return binarySearch(numbers,left,mid-1,target);
        }else {
            return binarySearch(numbers,mid+1,right,target);
        }
    }

}
