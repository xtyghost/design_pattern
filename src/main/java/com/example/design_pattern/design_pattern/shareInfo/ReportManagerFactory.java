/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ReportManagerFactory
 * Author:   xutong
 * Date:     2019-04-10 15:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.shareInfo;

import lombok.val;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈享元工厂类〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-10
 * @since 1.0.0
 */
public class ReportManagerFactory {
    private ReportManagerFactory() {
    }

    private static Map<String,FinancialReportManager> financialReportManager=new HashMap<>();
    private static Map<String,EmployeeReportMangager> employeeReportMangager=new HashMap<>();

    public static  IReportManager getFinancialReportManager(String tenantId) {
        FinancialReportManager r = ReportManagerFactory.financialReportManager.get(tenantId);
        if (r==null){
            r=new FinancialReportManager(tenantId);
            financialReportManager.put(tenantId,r);
        }
        return r;
    }

    public static  IReportManager getEmployeeReportMangager(String tenantId) {
        EmployeeReportMangager r=employeeReportMangager.get(tenantId);
        if (r==null){
             r = new EmployeeReportMangager(tenantId);
             employeeReportMangager.put(tenantId,r);
        }
        return r;
    }
}