package com.gof.designpattern.course.builder;

/**
 * Created by yl3 on 22.11.15.
 */
public class OnlineCourseBuilder extends CourseBuilder{

    @Override
    public void generateType() {
        course.setType("online course");
    }

    @Override
    public void generateTopic() {
        course.setTopic("topic for online course");
    }

    @Override
    public void generateEntryTime() {
        course.setEntryTime("2019.01.01 12:00:00");
    }

    @Override
    public void generatePrice() {
        course.setPrice("10 Euro");
    }
}
