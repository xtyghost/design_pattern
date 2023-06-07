package com.example.geeks.Sorting;

import com.alibaba.fastjson.JSONArray;


public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1,0};
        sort(arr);
        System.out.println(JSONArray.toJSONString(arr));
    }

    private static void sort(int arr[]) {
        int[] countArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            countArr[i]++;
        }
        int lIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int y = lIndex; y < countArr.length; y++) {
                if (countArr[y] <= 0) {
                    continue;
                }
                countArr[y]--;
                arr[i] = y;
                lIndex= y;
                break;
            }
        }
    }
}
