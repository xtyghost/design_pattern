/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Subject Author: xutong Date: 2020/11/1 8:06 下午
 * Description: 被观察者 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.observer.v2;

import java.util.LinkedList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈被观察者〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public abstract class Subject {
  private List<Observer> observers = new LinkedList<>();

  public void addObserver(Observer observer) {
    this.observers.add(observer);
  }

  public void deleteObserver(Observer observer) {
    this.observers.remove(observer);
  }
  public void notifyObservers(){
    for (Observer observer : this.observers) {
        observer.update();
      //
    }
  }
}
