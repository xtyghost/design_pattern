/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   xutong
 * Date:     2019-04-16 15:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.observer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-16
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("java设计模式精讲");
        Teacher teacher = new Teacher("alpha");
//        course.addObserver(teacher);
        //业务逻辑代码
        Question question = new Question();
        question.setUserName("lisu");
        question.setQuestionContext("too expensive");
        course.produceQuestion(course,question);
    }

}