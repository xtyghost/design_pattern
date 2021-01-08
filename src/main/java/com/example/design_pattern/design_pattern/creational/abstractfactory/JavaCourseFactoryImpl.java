/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JavaCourseFactoryImpl
 * Author:   xutong
 * Date:     2019-04-03 11:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.creational.abstractfactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-03
 * @since 1.0.0
 */
public class JavaCourseFactoryImpl implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideoImpl();
    }

    @Override
    public Article getArticle() {
        return new JavaArticleImpl();
    }
}