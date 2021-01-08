/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ConcreteObserver Author: xutong Date: 2020/11/1 10:18
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.observer.v2;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class ConcreteObserver implements Observer {

  @Override
  public void update() {
    System.out.println("接收到消息，并进行处理！");
  }
}
