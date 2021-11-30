package com.example.design_pattern.offer;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        try {
            int length = matrix.length;
            int height = matrix[0].length;
            for (int i = length - 1; i >= 0; i--) {
                if (matrix[i][height - 1] < target) {
                    continue;
                }
                int i1 = Collections.binarySearch(Arrays.stream(matrix[i]).mapToObj(ele -> ele).collect(Collectors.toList()), target);
                if (i1 >= 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean bak(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
