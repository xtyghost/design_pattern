/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Handler Author: xutong Date: 2020/11/1 10:32 上午
 * Description: 抽象处理者 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.responsechain;

/**
 * 〈一句话功能简述〉<br>
 * 〈抽象处理者〉 请求对象复杂，且特征不明显，需要多种方式校验时，使用责任链模式
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public abstract class AbstractHandler {
  private AbstractHandler nextHandler;
  private boolean support;

  public AbstractHandler getNextHandler() {
    return nextHandler;
  }

  public void setNextHandler(AbstractHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public boolean isSupport() {
    return support;
  }

  public void setSupport(boolean support) {
    this.support = support;
  }

  public Response handleMessage(Request request) {
    if (isSupport()) {
      return doHandlerMessage(request);
    } else {
      return getNextHandler().handleMessage(request);
    }
  }

  public Response doHandlerMessage(Request request) {
    return new Response();
  }
}
