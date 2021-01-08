/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Client
 * Author:   xutong
 * Date:     2020/11/2 7:32 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.state;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public class Client {
  public static void main(String[] args) {
    //
      Context context = new Context();
      context.setCurrentState(new ConcreteState1());
      context.handle1();
      context.handle2();
  }
}