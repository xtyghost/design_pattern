/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Employee Author: xutong Date: 2020/11/1 7:25 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class Employee {
  private String name;
  private String dept;
  private int salary;
  private List<Employee> subordinates;

  public Employee(String name, String dept, int salary) {
    this.name = name;
    this.dept = dept;
    this.salary = salary;
    this.subordinates = new ArrayList<>();
  }

  public void add(Employee employee) {
    this.subordinates.add(employee);
  }

  public boolean remove(Employee employee) {
    return subordinates.remove(employee);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public List<Employee> getSubordinates() {
    return subordinates;
  }

  public void setSubordinates(List<Employee> subordinates) {
    this.subordinates = subordinates;
  }

  public void offDuty() {
    System.out.println(name + "离开了" + dept + "回家休息" + ",他赚" + salary);
    for (Employee subordinate : this.subordinates) {
      subordinate.offDuty();
    }
  }
}
