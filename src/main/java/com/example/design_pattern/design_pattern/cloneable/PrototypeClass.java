/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: PrototypeClass
 * Author:   xutong
 * Date:     2020/10/31 11:47 上午
 * Description: 原型模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.cloneable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈原型模式〉
 * 使用clone方法时构造器不会被执行
 *
 * @author xutong
 * @create 2020/10/31
 * @since 1.0.0
 */
public class PrototypeClass implements Cloneable {
    final int a = 1;
    public PrototypeClass() {
    System.out.println("create a PrototypeClass by construct");
    }

    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        return (PrototypeClass) super.clone();
    }

  public static void main(String[] args) throws CloneNotSupportedException {
      PrototypeClass prototypeClass = new PrototypeClass();
      PrototypeClass clone = prototypeClass.clone();
  }
}