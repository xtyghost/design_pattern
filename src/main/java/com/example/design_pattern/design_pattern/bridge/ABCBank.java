/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ABCBank
 * Author:   xutong
 * Date:     2019-07-03 15:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.bridge;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2019-07-03
 * @since 1.0.0
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("创建中国农业银行账号");
        account.openAccount();
        return account;
    }
}