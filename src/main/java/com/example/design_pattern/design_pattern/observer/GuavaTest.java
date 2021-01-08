/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GuavaTest
 * Author:   xutong
 * Date:     2019-04-16 15:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.observer;

import com.google.common.eventbus.EventBus;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-16
 * @since 1.0.0
 */
public class GuavaTest {
    public static void main(String[] args) {

        Course course = new Course("java开发");
        Teacher teacher = new Teacher("alpha");
        course.register(teacher);
        //业务逻辑代码
        Question question = new Question();
        question.setUserName("lisu");
        question.setQuestionContext("too expensive");
        course.produceQuestion(course,question);
    }

}