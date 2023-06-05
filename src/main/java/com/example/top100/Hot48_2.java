package com.example.top100;


import com.alibaba.fastjson.JSONArray;

/**
 * 方法 2：两次翻转
 * 先沿右上 - 左下的对角线翻转（
 * 270
 * °
 * +
 * 270°+ 一次镜像），再沿水平中线上下翻转（
 * −
 * 180
 * °
 * +
 * −180°+ 一次镜像），可以实现顺时针
 * 90
 * 90 度的旋转效果
 * <p>
 * 作者：ChopinXBP
 * 链接：https://leetcode.cn/problems/rotate-image/solution/zi-wai-xiang-nei-shun-shi-zhen-xun-huan-jiao-huan-/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
class Hot48_2 {

    public static void main(String[] args) {
        int[][] matrlx1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        Hot48_2 hot481 = new Hot48_2();
//        hot481.rotate(matrlx1);
        hot481.rotate(matrix2);
//        System.out.println(JSONArray.toJSONString(matrlx1));
        System.out.println(JSONArray.toJSONString(matrix2));
//        [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
    }

    public void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return;
        }
        int nums = matrix.length;
        int tmp;
        for (int r = 0; r < nums; r++) {
            for (int l = 0; l < nums - r; l++) {
                tmp = matrix[r][l];
                matrix[r][l] = matrix[nums - l - 1][nums - r - 1];
                matrix[nums - l - 1][nums - r - 1] = tmp;
            }
        }
        for (int r = 0; r < nums / 2; r++) {
            for (int l = 0; l < nums; l++) {
                tmp = matrix[r][l];
                matrix[r][l] = matrix[nums - 1 - r][l];
                matrix[nums - 1 - r][l] = tmp;
            }
        }
    }
}
