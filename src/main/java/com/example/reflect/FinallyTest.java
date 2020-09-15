/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: FinallyTest Author: xutong Date: 2020/4/13 6:39 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.reflect;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/4/13
 * @since 1.0.0
 */
public class FinallyTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("result = " + testString2());
    System.out.println("result = " + testFinal1());
    System.out.println("result = " + testFinal2());
  }

  public static StringBuffer testString2() {
    StringBuffer sb = new StringBuffer("Hello");
    try {
      sb.append(" 111 ");
      return sb;
    } finally {
      sb.append("world!");
      System.out.println("complete work!");
    }
  }

  public static int testFinal1() {
    int result = 0;
    try {
      result = 1;
      return result;
    } catch (Exception e) {
      result = 2;
      return result;
    } finally {
      result = 3;
      System.out.println("execute finally");
    }
  }

  public static int testFinal2() {
    int result = 0;
    try {
      result = 1;
      //      throw new Exception("'sdf'");
      int a = 0 / 0;
      //      return result;
    } catch (Exception e) {
      result = 2;
      return result;
    } finally {
      result = 3;
      System.out.println("execute finally");
    }
    return 4;
  }
}
