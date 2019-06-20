/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   xutong
 * Date:     2019-04-08 10:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.builder;

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
        AbstractCourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java设计模式", "java设计模式ppt", "java设计模式video", "java 设计模式标题", "java设计模式QA");
        System.out.println(course);
    }

}