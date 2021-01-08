/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Visitor Author: xutong Date: 2020/11/2 7:10 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.visitor;

import com.example.design_pattern.design_pattern.combination.Employee;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public class Visitor implements IVisitor {
  // 访问普通员工，打印出报表
  public void visit(CommonEmployee commonEmployee) {
    System.out.println(this.getCommonEmployee(commonEmployee));
  }
  // 访问部门经理，打印出报表
  public void visit(Manager manager) {
    System.out.println(this.getManagerInfo(manager));
  }
  // 组装出基本信息
  private String getBasicInfo(AbstractEmployee employee) {
    String info = "姓名：" + employee.getName() + "\t";
    info = info + "性别：" + (employee.getSex() == AbstractEmployee.FEMALE ? "女" : "男") + "\t";
    info = info + "薪水：" + employee.getSalary() + "\t";
    return info;
  }
  // 组装出部门经理的信息
  private String getManagerInfo(Manager manager) {
    String basicInfo = this.getBasicInfo(manager);
    String otherInfo = "业绩：" + manager.getPerformance() + "\t";
    return basicInfo + otherInfo;
  }
  // 组装出普通员工信息
  private String getCommonEmployee(CommonEmployee commonEmployee) {
    String basicInfo = this.getBasicInfo(commonEmployee);
    String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
    return basicInfo + otherInfo;
  }
}
