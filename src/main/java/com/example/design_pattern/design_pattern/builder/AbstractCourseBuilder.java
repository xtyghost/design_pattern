/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AbstractCourseBuilder
 * Author:   xutong
 * Date:     2019-04-08 10:30
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
public abstract class AbstractCourseBuilder {

    public abstract void  buildCourseName(String courseName);
    public abstract void  buildCoursePPT(String coursePPT);
    public abstract void  buildCourseVideo(String courseVideo);
    public abstract void  buildCourseArticle(String courseArticle);
    public abstract void  buildCourseQA(String courseQA);
    public abstract Course makeCourse();
}