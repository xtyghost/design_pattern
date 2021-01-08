/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: AbstractEmployee Author: xutong Date: 2020/11/2 7:06
 * 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.visitor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public abstract class AbstractEmployee {
  public static final int MALE = 0;
  public static final int FEMALE = 1;
  private String name;
  private int salary;
  private int sex;
  public abstract void accept(IVisitor visitor);

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }
}
