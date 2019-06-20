/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Teacher
 * Author:   xutong
 * Date:     2019-04-16 15:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.observer;

import com.google.common.eventbus.Subscribe;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

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
public class Teacher implements Observer {
    private String teacherName;
    @Override
    public void update(Observable o, Object arg) {
//        Course course = (Course) o;
//        Question question = (Question) arg;
//        System.out.println(teacherName+"老师的"+course.getCourseName()+"课程接受到一个"+question.getUserName()+"提交的"+question.getQuestionContext());

    }
    @Subscribe
    public void subscribe(String msg){
        System.out.println(teacherName+"收到"+msg);
    }
}