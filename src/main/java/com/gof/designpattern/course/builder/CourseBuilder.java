package com.gof.designpattern.course.builder;

import com.gof.designpattern.course.Course;

/**
 * Created by yl3 on 22.11.15.
 */
public abstract class CourseBuilder {
    protected Course course;


    public CourseBuilder() {

    }

    public void createEmptyCourse() { course = new Course();}

    public Course getCourse() {return course;}

    public abstract void generateType();
    public abstract void generateTopic();
    public abstract void generateEntryTime();
    public abstract void generatePrice();


}
