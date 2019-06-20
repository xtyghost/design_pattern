/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Coach
 * Author:   xutong
 * Date:     2019-04-08 10:37
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
public class Coach {
    private AbstractCourseBuilder courseBuilder;

    public void setCourseBuilder(AbstractCourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(
            String courseName
            , String coursePPT
            , String courseVideo
            , String courseArticle
            , String courseQA) {
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}