/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SavingAccount
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
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("创建一个活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}