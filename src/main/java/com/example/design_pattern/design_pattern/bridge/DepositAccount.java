/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DepositAccount
 * Author:   xutong
 * Date:     2019-07-03 15:40
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
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("创建一个定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}