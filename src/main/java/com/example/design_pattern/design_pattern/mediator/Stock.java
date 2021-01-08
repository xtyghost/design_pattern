/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Stock Author: xutong Date: 2020/10/31 10:43 下午
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
public class Stock extends AbstractColleague {
  // 刚开始有100台电脑
  private static int COMPUTER_NUMBER = 100;
  public Stock(AbstractMediator _mediator) {
    super(_mediator);
  }

  // 库存增加
  public void increase(int number) {
    COMPUTER_NUMBER = COMPUTER_NUMBER + number;
    System.out.println("库存数量为：" + COMPUTER_NUMBER);
  }
  // 库存降低
  public void decrease(int number) {
    COMPUTER_NUMBER = COMPUTER_NUMBER - number;
    System.out.println("库存数量为：" + COMPUTER_NUMBER);
  }
  // 获得库存数量
  public int getStockNumber() {
    return COMPUTER_NUMBER;
  }
  // 存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售
  public void clearStock() {
    System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
    super.mediator.execute("stock.clear");
  }
}
