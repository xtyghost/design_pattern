/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: SearchInArray Author: xutong Date: 2020/5/15 3:35 下午
 * Description: 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。 History: <author> <time>
 * <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.leetcode.searchinarray;

/**
 * 〈一句话功能简述〉<br>
 * 〈给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。〉
 *
 * @author xutong
 * @create 2020/5/15
 * @since 1.0.0
 */
public class SearchInArray {
  public static void main(String[] args) {
    //
    int[][] arrs = new int[5][5];
    arrs[0] = new int[] {1, 4, 7, 11, 15};
    arrs[1] = new int[] {2, 5, 8, 12, 19};
    arrs[2] = new int[] {3, 6, 9, 16, 22};
    arrs[3] = new int[] {10, 13, 14, 17, 24};
    arrs[4] = new int[] {18, 21, 23, 26, 30};
    System.out.println(isContain(arrs, 20));
  }

  private static boolean isContain(int[][] arrs, int i) {
    int start1 = 0;
    int start2 = arrs.length - 1;
    while (true) {
      if (start2 < 0 || start1 >= arrs.length) {
        return false;
      }
      if (arrs[start1][start2] == i) {
        return true;
      } else if (arrs[start1][start2] > i) {
        start2--;
      } else {
        start1++;
      }
    }
  }
}
