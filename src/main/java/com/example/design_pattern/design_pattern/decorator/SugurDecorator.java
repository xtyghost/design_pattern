/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: SugurDecorator Author: xutong Date: 2020/11/1 10:54
 * 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.decorator;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class SugurDecorator extends Decorator {

  public SugurDecorator() {
  }

  public SugurDecorator(Component component) {
    super(component);
  }

  private void wakeup() {
    System.out.println("I'm wakeup");
  }

  @Override
  public void operate() {
    wakeup();
    super.operate();
  }
}
