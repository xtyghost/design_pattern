/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: HandlerRuleA Author: xutong Date: 2020/4/3 5:12 下午
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
public class HandlerRuleA extends Handler {

  public HandlerRuleA(int level) {
    super(level);
  }

  @Override
  protected void echo(Handler.Request request) {
    System.out.println(" I'm handlerA; it's my duty to deal this program ");
  }
}
