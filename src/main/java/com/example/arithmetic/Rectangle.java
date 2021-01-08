/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Rectangle Author: xutong Date: 2020/1/16 4:11 下午
 * Description: 回形矩阵，回形取数 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.arithmetic;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈回形矩阵，回形取数〉 例如：
 *
 * <p>输入数字2，则程序输出： 1 2
 *                         4 3
 *
 * <p>输入数字3，则程序输出： 1 2 3
 *                         8 9 4
 *                         7 6 5
 *
 *
 * @author xutong
 * @create 2020/1/16
 * @since 1.0.0
 */
public class Rectangle {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入矩阵阶数：");
    int n = scanner.nextInt();
    printRectangle(n);
  }

  private static void printRectangle(int n) {
    int[][] array = new int[n][n];
    int number = 1;
    // 控制圈数
    for (int i = 0; i < (n + 1) / 2; i++) {
      //控制四种可能，注意以圈数为边界
      for (int j = i; j <=n - i-1; j++) {
        // y=i不变x++
        array[j][i] = number++;
      }

      for (int j = i+1; j <= n - i-1; j++) {
        // x=n-i;y++
        array[n - i-1][j] = number++;
      }
      for (int j = n - i-2; j >= i; j--) {
        // y=n-i,x++
        array[j][n - i-1] = number++;
      }
      for (int j = n - i-2; j >= i+1; j--) {
        // y不变x++,y=i
        array[i][j] = number++;
      }
    }
    // 打印
    for (int i = 0; i < n; i++) {
      //
      for (int j = 0; j < n; j++) {
        //
        System.out.print(array[j][i] + "\t");
      }
      System.out.println();
    }
  }
}
