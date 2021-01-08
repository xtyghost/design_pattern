/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Purchase Author: xutong Date: 2020/10/31 10:41 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.mediator;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/10/31
 * @since 1.0.0
 */
public class Purchase extends AbstractColleague {

  public Purchase(AbstractMediator mediator) {
    super(mediator);
  }

  public void buyIBMcomputer(int number) {}

  public void refuseBuyIBM() {
    System.out.println("不再购买IBM电脑");
  }
}
