/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/11/2 7:13 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉 访问者模式，把被访问者交给访问者，方便查看信息，二不该便本访问者的引用 把展示功能和数据对象分开，符合单一职责原则
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    for (AbstractEmployee emp : mockEmployee()) {
      emp.accept(new Visitor());
    }
  }
  // 模拟出公司的人员情况，我们可以想象这个数据是通过持久层传递过来的
  public static List<AbstractEmployee> mockEmployee() {
    List<AbstractEmployee> empList = new ArrayList<AbstractEmployee>();
    // 产生张三这个员工
    CommonEmployee zhangSan = new CommonEmployee();
    zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
    zhangSan.setName("张三");
    zhangSan.setSalary(1800);
    zhangSan.setSex(AbstractEmployee.MALE);
    empList.add(zhangSan);
    // 产生李四这个员工
    CommonEmployee liSi = new CommonEmployee();
    liSi.setJob("页面美工，审美素质太不流行了！");
    liSi.setName("李四");
    liSi.setSalary(1900);
    liSi.setSex(AbstractEmployee.FEMALE);
    empList.add(liSi);
    // 再产生一个经理
    Manager wangWu = new Manager();
    wangWu.setName("王五");
    wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
    wangWu.setSalary(18750);
    wangWu.setSex(AbstractEmployee.MALE);
    empList.add(wangWu);
    return empList;
  }
}
