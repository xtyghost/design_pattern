/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: EmployeeReportMangager
 * Author:   xutong
 * Date:     2019-04-10 15:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.shareInfo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-10
 * @since 1.0.0
 */
public class EmployeeReportMangager implements IReportManager {
    protected  String tenantId=null;

    public EmployeeReportMangager(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return String.format(resultFormat,"employee");
    }
}