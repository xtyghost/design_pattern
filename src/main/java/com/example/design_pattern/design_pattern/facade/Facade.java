/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Facade Author: xutong Date: 2020/11/2 6:46 上午
 * Description: 门面模式 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.facade;

/**
 * 〈一句话功能简述〉<br>
 * 〈门面模式〉
 *渐变封装在子系统中，对外部提供同意的访问接口
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public class Facade {
  private ClassA classA = new ClassA();
  private ClassB classB = new ClassB();
  private ClassC classC = new ClassC();

  public void doSomethingA() {
    classA.doSomethingA();
  }

  public void doSomethingB() {
    classB.doSomethingB();
  }

  public void doSomethingC() {
    classC.doSomethingB();
  }
}
