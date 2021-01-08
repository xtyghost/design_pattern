/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ZigZig Author: xutong Date: 2020/5/15 4:41 下午
 * Description: Z 字形变换 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.leetcode.zigzig;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈 Z 字形变换〉
 *
 * @author xutong
 * @create 2020/5/15
 * @since 1.0.0
 */
public class ZigZig {

  public static void main(String[] args) {
    //
    System.out.println(convert("LEETCODEISHIRING", 3));
  }

  public static String convert(String s, int numRows) {
      if (s == null ||numRows<=1) {
          return s;
      }
    int position = 0;
      //看图可以发现，把z可以拆解为v
      //每个v长度为zs
      int zs = 2 * numRows - 2;
    ArrayList<StringBuilder> sbs = new ArrayList<>(numRows);
    for (int i = 0; i < numRows; i++) {
      sbs.add(new StringBuilder());
    }

    for (int i = 0; i < s.length(); i++) {
      int Row = i % zs;
      //在numRows以内的
      if (Row < numRows) {
        sbs.get(Row).append(s.charAt(i));
      } else {
          //在numRows以外的，这里要求，numRows>=2
        sbs.get(2*numRows -2-Row).append(s.charAt(i));
      }
    }

    for (int i = 1; i < numRows; i++) {
      sbs.get(0).append(sbs.get(i));
    }
    return sbs.get(0).toString();
  }
}
