package com.example.top100;

public class Hot240_1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 20;
        Hot240_1 hot2401 = new Hot240_1();
        System.out.println(hot2401.searchMatrix(matrix, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int targetArrayLength = binarySearchMatrix(matrix, target, 0, matrix.length - 1);
        if (targetArrayLength == -1) {
            return false;
        }
        int r = binarySearchMatrixRow(matrix, target, 0, targetArrayLength, targetArrayLength);
        if (r != -1) {
            return true;
        }
        int l = binarySearchMatrixLine(matrix, target, 0, targetArrayLength, targetArrayLength);
        if (l != -1) {
            return true;
        }
        return false;
    }

    private int binarySearchMatrixLine(int[][] matrix, int target, int top, int bottom, int targetArrayLength) {
        if (top > bottom) {
            return -1;
        }
        int mid = (top + bottom) / 2;
        if (matrix[mid][targetArrayLength] == target) {
            return mid;
        }
        if (matrix[mid][targetArrayLength] > target) {
            return binarySearchMatrixLine(matrix, target, top, mid - 1, targetArrayLength);
        } else {
            return binarySearchMatrixLine(matrix, target, mid + 1, bottom, targetArrayLength);
        }
    }

    private int binarySearchMatrixRow(int[][] matrix, int target, int l, int r, int targetArrayLength) {
        if (l > r) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (matrix[targetArrayLength][mid] == target) {
            return mid;
        }
        if (matrix[targetArrayLength][mid] > target) {
            return binarySearchMatrixRow(matrix, target, l, mid - 1, targetArrayLength);
        } else {
            return binarySearchMatrixRow(matrix, target, mid + 1, r, targetArrayLength);
        }
    }

    private int binarySearchMatrix(int[][] matrix, int target, int l, int r) {
        if (l > r) {
            return -1;
        }
        if (matrix[r][r] < target) {
            return -1;
        }
        if (matrix[l][l] == target) {
            return l;
        }
        if (matrix[r][r] == target) {
            return r;
        }
        if (matrix[l][l] < target && matrix[r][r] > target) {
            int mid = (l + r) / 2;
            if (matrix[mid][mid] > target) {
                return binarySearchMatrix(matrix, target, l, mid);
            } else if (matrix[mid][mid] == target) {
                return mid;
            } else {
                return binarySearchMatrix(matrix, target, mid + 1, r);
            }
        }
        if (l == r && matrix[l][l] > target) {
            return l;
        }
        return -1;
    }
}
