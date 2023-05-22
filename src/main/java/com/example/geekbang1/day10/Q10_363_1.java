package com.example.geekbang1.day10;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * 矩形区域不超过 K 的最大数值和
 * @author xutong
 */
public class Q10_363_1 {
    public static void main(String[] args) {
        System.out.println(new Q10_363_1().maxSumSubmatrix(new int[][]{{2, 2, -1}}, 0));

    }
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int[][] ans = new int[matrix.length+1][matrix[0].length+1];

        int max =-1100000;
        for (int i =1; i < ans.length; i++) {
            for (int j = 1; j < ans[0].length; j++) {
                ans[i][j]= ans[i-1][j]+ans[i][j-1]-ans[i-1][j-1]+matrix[i-1][j-1];
            }
        }
        return max;
    }


}
