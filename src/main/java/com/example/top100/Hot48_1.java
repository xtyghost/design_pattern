package com.example.top100;


import com.alibaba.fastjson.JSONArray;


class Hot48_1 {

    public static void main(String[] args) {
        int[][] matrlx1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        Hot48_1 hot481 = new Hot48_1();
//        hot481.rotate(matrlx1);
        hot481.rotate(matrix2);
//        System.out.println(JSONArray.toJSONString(matrlx1));
        System.out.println(JSONArray.toJSONString(matrix2));
//        [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
    }

    public void rotate(int[][] matrlx) {
        int r = 0;
        int m = matrlx[0].length - 1;
        int n = matrlx[0].length;
        int tmp;
        for (int l = r; l < m - r; l++) {
            tmp = matrlx[r][l];
            int i = m - r;
            matrlx[r][l] = matrlx[l][i];
            matrlx[l][i] = tmp;
            tmp = matrlx[r][l];
            matrlx[r][l] = matrlx[i][i - l+r];
            matrlx[i][i - l+r] = tmp;
            tmp = matrlx[r][l];
            matrlx[r][l] = matrlx[i - l+r][r];
            matrlx[i - l+r][r] = tmp;
            if (i - 1 == l) {
                r++;
                l = r-1;
            }
            if (r > n / 2) {
                return;
            }
        }
    }
}
