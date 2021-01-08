/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Course
 * Author:   xutong
 * Date:     2019-04-08 10:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design_pattern.design_pattern.builder.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2019-04-08
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseName=courseBuilder.courseName;
        this.coursePPT=courseBuilder.coursePPT;
        this.courseVideo=courseBuilder.courseVideo;
        this.courseArticle=courseBuilder.courseArticle;
        this.courseQA=courseBuilder.courseQA;
    }

    public static class CourseBuilder {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT=coursePPT;
            return this;
        }


        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo=courseVideo;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle=courseArticle;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA=courseQA;
            return this;
        }
        public Course build(){
            return new Course(this);
        }

    }

}