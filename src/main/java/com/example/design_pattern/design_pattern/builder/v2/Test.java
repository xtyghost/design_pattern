/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   xutong
 * Date:     2019-04-08 11:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.builder.v2;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-08
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Course build = new Course.CourseBuilder().buildCourseName("java").buildCourseArticle("java").build();
        System.out.printf("%s", build);
    }

}