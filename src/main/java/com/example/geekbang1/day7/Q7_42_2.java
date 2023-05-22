package com.example.geekbang1.day7;

import java.util.Stack;

/**
 * 接雨水
 * 单调栈
 * @author xutong
 */
public class Q7_42_2 {
    public static void main(String[] args) {
        System.out.println(new Q7_42_2().trap(new int[]{4,2,0,3,2,5}));
    }
    public int trap(int[] arr) {

        return  0;
    }


    private int getMax(int[] arr, int max) {
        for (int i : arr) {
            if (i> max){
                max = i;
            }
        }
        return max;
    }

    public static class Node{
        public Node(int width, int height) {
            this.width = width;
            this.height = height;
        }

        int width;
        int height;
    }

}
