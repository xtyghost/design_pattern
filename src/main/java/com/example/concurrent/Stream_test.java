/**
 * Copyright (C), 2015-2019, XXX有限公司 FileName: Stream_test Author: xutong Date: 2019/12/23 2:12 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.concurrent;

import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019/12/23
 * @since 1.0.0
 */
public class Stream_test {
  public static void main(String[] args) {
    //
    ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4, 5);
    integers.stream().forEach(integers::remove);
    System.out.println(integers);
  }
}
