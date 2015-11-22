package com.gof.designpattern.course.builder;

/**
 * Created by yl3 on 22.11.15.
 */
public class ClassroomCourseBuilder extends CourseBuilder {
    @Override
    public void generateType() {
        course.setType("classroom course");
    }

    @Override
    public void generateTopic() {
        course.setTopic("topic for classroom");
    }

    @Override
    public void generateEntryTime() {
        course.setEntryTime("2048.01.01 12:00:00");
    }

    @Override
    public void generatePrice() {
        course.setPrice("100 Euro");
    }
}
