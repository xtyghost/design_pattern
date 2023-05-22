package com.example.geekbang1.day10;

/**
 * 二维区域和检索 - 矩阵不可变
 * @author xutong
 */
public class Q10_304_1 {
    public static void main(String[] args) {
//[[[[],[],[],[]]],[],[1,1,1,2],[0,1,0,2]]
        NumMatrix numMatrix = new NumMatrix(new int[][]{{8,-4,5}, {-1,4,4}, {-2,3,1}, {-4,4,3}});
        System.out.println(numMatrix.sumRegion(0,1,0,2));

    }

   public static class NumMatrix {
        int[][] matrix;
        public NumMatrix(int[][] matrix) {
            this.matrix = matrix;
            //计算前缀和
            for (int i = 1; i < matrix[0].length; i++) {
                matrix[0][i]= matrix[0][i]+matrix[0][i-1];
            }
            for (int j = 1; j < matrix.length; j++) {
                matrix[j][0]=matrix[j][0]+matrix[j-1][0];

            }
            for (int i = 1; i < matrix[0].length; i++) {
                for (int j = 1; j < matrix.length; j++) {
                    matrix[j][i]=matrix[j-1][i]+matrix[j][i-1]-matrix[j-1][i-1]+matrix[j][i];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            if (row1==0&&col1==0){
                return matrix[row2][col2];
            }
                if (row1==0){
                 return  matrix[row2][col2]-matrix[row2][col1-1];
                }
                if (col1==0){
                    return matrix[row2][col2]-matrix[row1-1][col2];
                }
            return matrix[row2][col2]+matrix[row1-1][col1-1]-matrix[row2][col1-1]-matrix[row1-1][col2];
        }
    }
}
