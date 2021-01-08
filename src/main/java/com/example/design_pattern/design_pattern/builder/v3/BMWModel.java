/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: BMWModel Author: xutong Date: 2020/10/30 3:45 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.builder.v3;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/10/30
 * @since 1.0.0
 */
public class BMWModel extends CarModel {
  private final String name = "BMW";

  @Override
  public void start() {
    System.out.println(name + "start");
  }

  @Override
  public void stop() {
    System.out.println(name + "stop");
  }

  @Override
  public void alarm() {
    System.out.println(name + "alarm");
  }

  @Override
  public void engineBoom() {
    System.out.println(name + "engineBoom");
  }

  @Override
  public void run() {
    System.out.println(name + "run");
  }

  @Override
  public void setSequence(ArrayList sequence) {}
}
