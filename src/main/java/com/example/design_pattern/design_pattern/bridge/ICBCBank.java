/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ICBCBank
 * Author:   xutong
 * Date:     2019-07-03 15:51
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
public  class ICBCBank extends Bank  {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("创建中国工商银行账号");
        //将开户功能委托个account对象
        account.openAccount();
        return account;
    }
}