/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Boost
 * Author:   xutong
 * Date:     2020/11/1 10:56 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.decorator;

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
    //
      Component component = new ConcreteComponent();
      component = new SugurDecorator(component);
      component = new SugurDecorator(component);
      component = new SugurDecorator(component);
      component.operate();
  }
}