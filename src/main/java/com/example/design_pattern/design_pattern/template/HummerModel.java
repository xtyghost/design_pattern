/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: HummerModel Author: xutong Date: 2020/10/21 9:52 上午
 * Description: 模版类 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.template;

/**
 * 〈一句话功能简述〉<br>
 * 〈模版类〉
 *
 * @author xutong
 * @create 2020/10/21
 * @since 1.0.0
 */
public abstract class HummerModel {
  protected abstract void start();

  protected abstract void stop();

  protected abstract void alarm();

  protected abstract void engineBoom();

  public final void run() {
    start();
    engineBoom();
    alarm();
    start();
  }
}
