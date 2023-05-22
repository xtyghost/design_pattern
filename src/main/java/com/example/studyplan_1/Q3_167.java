package com.example.studyplan_1;

import cn.hutool.json.JSONArray;

/**
 *
 * @author xutong
 */
public class Q3_167 {
    public static void main(String[] args) {
      int[]  numbers = {2,3,4};
      int target = 8;
        System.out.println(new JSONArray(new Q3_167().twoSum(numbers,target)));
    }
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length-1; i++) {
            int target1 = target - numbers[i];
            if (target1>=numbers[i+1]){
                int result = binarySearch(numbers, target1, i + 1, numbers.length - 1);
                if (result !=-1){
                    return new int[]{i+1,result+1};
                }
            }
        }
        return numbers;
    }

    public int binarySearch(int[] numbers,int target,int left ,int right){
        if (right<left){
            return -1;
        }
        int mid = left +(right-left)/2;
        if (target == numbers[mid]){
            return mid;
        }else if (target>numbers[mid]){
            return binarySearch(numbers,target,++mid,right);
        }else {
            return binarySearch(numbers,target,left,--mid);
        }
    }
}
