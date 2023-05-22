package com.example.design_pattern.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * 基于栈的快速排序,每一次sort至少确定一个元素的位置
 * @author xutong
 */
public class QuickSort3BaseStack {
    public static void quickSort(int[] arr,int startIndex,int endIndex){
        //用一个集合栈来替代递归的函数栈
        Stack<Map<String ,Integer>> quickSortStack = new Stack<>();
        Map<String ,Integer> tempMap = new HashMap<>();
        tempMap.put("startIndex",startIndex);
        tempMap.put("endIndex",endIndex);
        quickSortStack.push(tempMap);
        while (!quickSortStack.isEmpty()){
            Map<String, Integer> pop = quickSortStack.pop();
            Integer start = pop.get("startIndex");
            Integer end = pop.get("endIndex");
            if (end<= start){
                continue;
            }
            int pivot =  arr[start];
            for (int i = start+1; i <= end; i++) {
                if (arr[i]<=pivot){
                    swrap(arr,start,i);
                    start++;
                }
                if (arr[i]>pivot){
                    swrap(arr,end,i);
                    i--;
                    end--;
                }
            }
            quickSort(arr,startIndex,start-1);
            quickSort(arr,start+1,endIndex);
        }

    }



    public static void swrap(int[] arr,int left,int right){
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }


    public static void main(String[] args) {
        int[] ints = {2, 6, 1, 2, 213, 23, 6, 8};
        quickSort(ints,0,7);
        System.out.println(Arrays.toString(ints));
    }
}
