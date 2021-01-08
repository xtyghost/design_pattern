/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/11/1 7:43 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.combination;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉 组合模式，把一组相似的对象组成树型结构， 一般在页面权限控制的时候使用
 * 可简单的对一组对象执行同样对操作
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    String dept = "中国共产党";
    // boss
    Employee boss = new Employee("近平", dept, 0);
    // leader
    Employee lisu = new Employee("lisu", dept, 0);
    Employee wangwu = new Employee("王五", dept, 0);
    // worker
    Employee teenageA = new Employee("少年A", dept, 0);
    Employee teenageB = new Employee("少年B", dept, 0);
    Employee teenageC = new Employee("少年C", dept, 0);

    boss.add(lisu);
    boss.add(wangwu);
    wangwu.add(teenageA);
    wangwu.add(teenageB);
    lisu.add(teenageC);
     boss.offDuty();

  }
}
