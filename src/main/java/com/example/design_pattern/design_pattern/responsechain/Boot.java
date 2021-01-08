/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Boot
 * Author:   xutong
 * Date:     2020/11/1 10:42 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.responsechain;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
      AbstractHandler handler1 = new AbstractHandlerImpl();
      AbstractHandler handler2= new AbstractHandlerImpl();
      AbstractHandler handler3 = new AbstractHandlerImpl();
      handler1.setNextHandler(handler2);
      handler2.setNextHandler(handler3);
      Response response = handler1.handleMessage(new Request());
  }
}