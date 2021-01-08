/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: CarModel Author: xutong Date: 2020/10/30 3:38 下午
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
public abstract class CarModel {
  private ArrayList<String> sequence = new ArrayList<>();

  public abstract void start();

  public abstract void stop();

  public abstract void alarm();

  public abstract void engineBoom();

  public abstract void run();

  public void setSequence(ArrayList sequence) {
    this.sequence = sequence;
  }
}
