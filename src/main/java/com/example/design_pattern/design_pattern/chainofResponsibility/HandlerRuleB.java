/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: HandlerB Author: xutong Date: 2020/4/3 5:14 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.chainofResponsibility;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/4/3
 * @since 1.0.0
 */
public class HandlerRuleB extends Handler {

  public HandlerRuleB(int level) {
    super(level);
  }

  @Override
  protected void echo(Request request) {
    System.out.println("I'm handlerB, finally It's my turn®");
  }
}
