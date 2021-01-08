/**
 * Copyright (C), 2015-2019, XXX有限公司 FileName: Test Author: xutong Date: 2019-07-16 15:11
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.design_pattern.design_pattern.bridge;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉桥接模式：面向接口b编程，实现抽象和实现解耦， 开放对象间的组合关系，让关系灵活方便拓展
 *
 * @author xutong
 * @create 2019-07-16
 * @since 1.0.0
 */
public class Test {
  public static void main(String[] args) {
    Bank icbcBank = new ICBCBank(new DepositAccount());
    Account icbcAccount = icbcBank.openAccount();
    icbcAccount.showAccountType();

    Bank icbcBank2 = new ICBCBank(new DepositAccount());
    Account icbcAccount2 = icbcBank.openAccount();
    icbcAccount2.showAccountType();

    Bank abcBank = new ABCBank(new SavingAccount());
    Account abcAccount = abcBank.openAccount();
    abcAccount.showAccountType();
  }
}
