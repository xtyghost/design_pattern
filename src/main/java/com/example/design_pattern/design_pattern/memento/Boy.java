/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boy Author: xutong Date: 2020/11/2 6:56 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.memento;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public class Boy {
  private String state = "";

  public void changeState() {
    this.state = "good luck";
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Memento createMemeto() {
    return new Memento(this.state);
  }

  public void restoreMemeto(Memento memento) {
    this.setState(memento.getState());
  }
}
