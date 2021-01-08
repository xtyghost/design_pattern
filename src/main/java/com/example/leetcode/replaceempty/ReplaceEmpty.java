/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ReplaceEmpty Author: xutong Date: 2020/5/15 3:54 下午
 * Description: 将一个字符串中的空格替换成 "%20"。 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.leetcode.replaceempty;

/**
 * 〈一句话功能简述〉<br>
 * 〈将一个字符串中的空格替换成 "%20"。〉
 *
 * @author xutong
 * @create 2020/5/15
 * @since 1.0.0
 */
public class ReplaceEmpty {

  public static void main(String[] args) {
    //
    String str = "A B C";
    System.out.println(replace(new StringBuilder(str), " "));
  }

  private static String replace(StringBuilder stringBuilder, String s) {
    StringBuilder newBuilder = new StringBuilder(Math.min(stringBuilder.length()*3,Integer.MAX_VALUE));
    for (int i = 0; i < stringBuilder.length(); i++) {
      if (stringBuilder.charAt(i) == ' ') {
        newBuilder.append("%20");
      } else {
          newBuilder.append(stringBuilder.charAt(i));
      }
    }
    return newBuilder.toString();
  }
}
