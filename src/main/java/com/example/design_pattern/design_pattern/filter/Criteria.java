/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Criteria
 * Author:   xutong
 * Date:     2019-07-19 16:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.filter;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019-07-19
 * @since 1.0.0
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);

}