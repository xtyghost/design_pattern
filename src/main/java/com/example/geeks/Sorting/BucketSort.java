package com.example.geeks.Sorting;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class BucketSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr, 5);
        System.out.println(JSONArray.toJSONString(arr));
    }

    private static void sort(int arr[], int bucketNum) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int range = (max - min) / bucketNum + 1;
        List<Integer>[] buckets = new List[bucketNum];
        for (int i = 0; i < arr.length; i++) {
            List bucket = buckets[(arr[i] - min) / range];
            if (bucket == null) {
                bucket = new ArrayList();
                buckets[(arr[i] - min) / range] = bucket;
            }
            bucket.add(arr[i]);
        }
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                Collections.sort(buckets[i]);
            }
        }
        int lIndex = 0;
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] == null) {
                continue;
            }
            for (int x = 0; x < buckets[i].size(); x++) {
                arr[lIndex] = buckets[i].get(x);
                lIndex++;
            }

        }
    }
}
