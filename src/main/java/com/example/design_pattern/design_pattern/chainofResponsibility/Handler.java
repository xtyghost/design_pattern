/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Handler Author: xutong Date: 2020/4/3 5:04 下午
 * Description: 定义了一个抽象的handle History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.chainofResponsibility;

/**
 * 〈一句话功能简述〉<br>
 * 〈定义了一个抽象的handle〉
 *
 * @author xutong
 * @create 2020/4/3
 * @since 1.0.0
 */
public abstract class Handler {
  private Handler nextHandler;
  private int level;

  public Handler(int level) {
    this.level = level;
  }

  public void setNextHandler(Handler handler) {
    this.nextHandler = handler;
  }

  public final void handleMessage(Request request) {
    if (level == request.getRequestLevel()) {
      this.echo(request);
    } else {
      if (this.nextHandler != null) {
        this.nextHandler.handleMessage(request);
      } else {
        System.out.println("can't next Handle! please definition suitable handle");
      }
    }
  }

  protected abstract void echo(Request request);

  public static class Request {
    private int level;

    public Request(int level) {
      this.level = level;
    }

    public int getRequestLevel() {
      return this.level;
    }
  }
}
