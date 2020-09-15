/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: symmetry Author: xutong Date: 2020/4/3 10:19 上午
 * Description: 最长回文字符串 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.leetcode;

import com.sun.tools.javac.util.List;

import java.util.Arrays;
import java.util.function.BiPredicate;

/**
 * 〈一句话功能简述〉<br>
 * 〈最长回文字符串〉 dynamic string
 *
 * @author xutong
 * @create 2020/4/3
 * @since 1.0.0
 */
public class Symmetry2 {
  public static void main(String[] args) {
    System.out.println(new Symmetry2().longestPalindrome("ac"));
  }

  /**
   * 将字符创反转
   *
   * @param s
   * @return
   */
  public String longestPalindrome(String s) {
    if (s == null || "".equals(s) || s.length() == 1) {
      return s;
    }
    int length = s.length();
    Boolean[][] palindrom = new Boolean[length + 1][length + 1];
    BiPredicate<Integer, Integer> baseCase = (x, y) -> x.equals(y) || 1 + x == y;

    // palindrom[i + 1][j - 1],如何实现,外减,内加
    String maxStr = String.valueOf(s.charAt(0));
    for (int j = 0; j < length + 1; j++) {
      for (int i = j; i >= 0; i--) {
        if (baseCase.test(i, j)) {
          palindrom[i][j] = true;
        } else if (s.charAt(i) == s.charAt(j - 1) && palindrom[i + 1][j - 1]) {
          palindrom[i][j] = true;
          if (maxStr.length() < j - i) {
            maxStr = s.substring(i, j);
          }
        } else {
          palindrom[i][j] = false;
        }
      }

      //
    }
    return maxStr;
  }
}
