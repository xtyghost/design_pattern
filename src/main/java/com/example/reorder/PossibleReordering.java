/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: PossibleReordering Author: xutong Date: 2020/4/14
 * 10:03 上午 Description: 对java代码重排序的研究 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.reorder;

/**
 * 〈一句话功能简述〉<br>
 * 〈对java代码重排序的研究〉
 *
 * @author xutong
 * @create 2020/4/14
 * @since 1.0.0
 */
public class PossibleReordering {
  static int x = 0, y = 0;
  static int a = 0, b = 0;

  public static void main(String[] args) throws InterruptedException {
    Thread one =
        new Thread(
                () -> {
                  a = 1;
                  x = b;
                });

    Thread other =
        new Thread(
                () -> {
                  b = 1;
                  y = a;
                });
    one.start();
    other.start();
    one.join();
    other.join();
    System.out.println("（" + x + "," + y + ")");
  }
}
