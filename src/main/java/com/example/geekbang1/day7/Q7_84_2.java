package com.example.geekbang1.day7;

/**
 * @author xutong
 */
public class Q7_84_2 {
    public static void main(String[] args) {
        System.out.println(new Q7_84_2().largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }

    public int largestRectangleArea(int[] heights) {
        int max =0;
        int last = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            if (height*heights.length<=max||last== height){
                last = height;
                continue;
            }
            int tmp = getLeft(heights,i)+getRight(heights,i);
            if (max<tmp){
                max = tmp;
            }
            last = height;
        }
        return max;
    }

    private int getRight(int[] heights, int i) {
        int height = heights[i];
        int sum = 0;
        for (int j = i+1; j < heights.length; j++) {
            if (height<=heights[j]){
                sum+=height;
            }else {
                break;
            }

        }
        return sum;
    }

    private int getLeft(int[] heights, int i) {
        int height = heights[i];
        int sum = 0;
        for (int j = i; j >=0; j--) {
            if (height<=heights[j]){
                sum+=height;
            }else {
                break;
            }
        }
        return sum;
    }


}
