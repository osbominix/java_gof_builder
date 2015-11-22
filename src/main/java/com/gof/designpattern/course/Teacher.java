package com.gof.designpattern.course;

import com.gof.designpattern.course.builder.CourseBuilder;

/**
 * Created by yl3 on 22.11.15.
 */
public class Teacher {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course getCourse()  {
        return courseBuilder.getCourse();
    }

    public void initializeCourse() {
        courseBuilder.createEmptyCourse();
        courseBuilder.generateType();
        courseBuilder.generateTopic();
        courseBuilder.generateEntryTime();
        courseBuilder.generatePrice();
    }
}
