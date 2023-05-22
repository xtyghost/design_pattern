package com.example.geekbang1.day10;

/**
 * 二维区域和检索 - 矩阵不可变
 * @author xutong
 */
public class Q10_304_2 {
    public static void main(String[] args) {
//[[[[],[],[],[]]],[],[1,1,1,2],[0,1,0,2]]
        NumMatrix numMatrix = new NumMatrix(new int[][]{{8,-4,5}, {-1,4,4}, {-2,3,1}, {-4,4,3}});
        System.out.println(numMatrix.sumRegion(0,1,0,2));

    }

   public static class NumMatrix {
        int[][] sum;
        public NumMatrix(int[][] matrix) {
            sum= new int[matrix.length+1][matrix[0].length+1];
            //计算前缀和
            for (int i = 1; i <= matrix[0].length; i++) {
                for (int j = 1; j <= matrix.length; j++) {
                    sum[j][i]=sum[j-1][i]+sum[j][i-1]-sum[j-1][i-1]+matrix[j-1][i-1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            row1++;
            col1++;
            row2++;
            col2++;
            return sum[row2][col2]+sum[row1-1][col1-1]-sum[row2][col1-1]-sum[row1-1][col2];
        }
    }
}
