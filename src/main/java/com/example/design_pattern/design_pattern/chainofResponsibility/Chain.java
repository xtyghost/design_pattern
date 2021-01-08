/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Chain Author: xutong Date: 2020/4/3 5:17 下午
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
public class Chain {
  public static void main(String[] args) {
    //
    HandlerRuleA handlerRuleA = new HandlerRuleA(1);
    HandlerRuleB handlerRuleB = new HandlerRuleB(2);
    handlerRuleA.setNextHandler(handlerRuleB);
    handlerRuleA.handleMessage(new Handler.Request(2));
  }
}
