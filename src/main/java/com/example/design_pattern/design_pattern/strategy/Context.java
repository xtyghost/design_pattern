/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Context Author: xutong Date: 2020/11/1 12:50 下午
 * Description: 锦囊类 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.strategy;

/**
 * 〈一句话功能简述〉<br>
 * 〈锦囊类〉
 * 命令模式封装的是行为逻辑
 * 策略模式封装的是算法逻辑，是对一种问题对多种处理方案对封装
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class Context {
  private IStrategy strategy;

  public Context(IStrategy strategy) {
    this.strategy = strategy;
  }

  public void operate() {
    this.strategy.operate();
  }
}
