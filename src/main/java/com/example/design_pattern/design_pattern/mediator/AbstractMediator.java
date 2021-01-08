/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: AbstractMediator Author: xutong Date: 2020/10/31
 * 10:32 下午 Description: 抽象中介者 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.mediator;

/**
 * 〈一句话功能简述〉<br>
 * 〈抽象中介者〉
 *
 * @author xutong
 * @create 2020/10/31
 * @since 1.0.0
 */
public abstract class AbstractMediator {
  protected Purchase purchase;
  protected Sale sale;
  protected Stock stock;
  // 构造函数
  public AbstractMediator() {
    purchase = new Purchase(this);
    sale = new Sale(this);
    stock = new Stock(this);
  }
  // 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
  public abstract void execute(String str, Object... objects);
}
