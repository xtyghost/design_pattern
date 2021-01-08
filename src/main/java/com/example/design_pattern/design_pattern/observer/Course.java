/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Course
 * Author:   xutong
 * Date:     2019-04-16 15:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.observer;

import com.google.common.eventbus.EventBus;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-16
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
//public class Course extends Observable {
public class Course extends EventBus {
    private String courseName;

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.courseName + "提交来一个问题");
        post(course.toString() + question);
    }


}