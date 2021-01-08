/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Sale Author: xutong Date: 2020/10/31 10:44 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.mediator;

import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/10/31
 * @since 1.0.0
 */
public class Sale extends AbstractColleague {
  public Sale(AbstractMediator _mediator) {
    super(_mediator);
  }
  // 销售IBM电脑
  public void sellIBMComputer(int number) {
    super.mediator.execute("sale.sell", number);
    System.out.println("销售IBM电脑" + number + "台");
  }
  // 反馈销售情况，0～100变化，0代表根本就没人买，100代表非常畅销，出一个卖一个
  public int getSaleStatus() {
    Random rand = new Random(System.currentTimeMillis());
    int saleStatus = rand.nextInt(100);
    System.out.println("IBM电脑的销售情况为：" + saleStatus);
    return saleStatus;
  }
  // 折价处理
  public void offSale() {
    super.mediator.execute("sale.offsell");
  }
}
