/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Context Author: xutong Date: 2020/11/2 7:27 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.state;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉 可以方便的拓展环境类，和状态类，符合组合聚合原则
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public class Context {
  public static final State STATE1 = new ConcreteState1();
  public static final State STATE2 = new ConcreteState2();
  private State currentState;

  public State getCurrentState() {
    return currentState;
  }

  public void setCurrentState(State currentState) {
    this.currentState = currentState;
    this.currentState.setContext(this);
  }

  public void handle1() {
    this.currentState.handle1();
  }

  public void handle2() {
    this.currentState.handle2();
  }
}
