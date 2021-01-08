/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Invoker Author: xutong Date: 2020/11/1 8:35 上午
 * Description: 负责任 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.commend;

/**
 * 〈一句话功能简述〉<br>
 * 〈负责人〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class Invoker {
  private Commend commend;

  public void setCommend(Commend commend) {
    this.commend = commend;
  }

  public void action() {
    this.commend.execute();
  }
}
