/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Boss
 * Author:   xutong
 * Date:     2019-03-20 11:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.demeter;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2019-03-20
 * @since 1.0.0
 */
public class Boss {
 public void commandCheckNumer(TeamLeader teamLeader){
     ArrayList<Course> courses = new ArrayList<>();
     for (int i = 0; i < 20; i++) {
         courses.add(new Course());
     }
     teamLeader.checkNumberOfCourses(courses);
 }
}