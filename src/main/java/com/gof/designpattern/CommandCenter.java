package com.gof.designpattern;

import com.gof.designpattern.course.Course;
import com.gof.designpattern.course.Teacher;
import com.gof.designpattern.course.builder.ClassroomCourseBuilder;
import com.gof.designpattern.course.builder.CourseBuilder;
import com.gof.designpattern.course.builder.OnlineCourseBuilder;

/**
 * Created by yl3 on 22.11.15.
 */
public class CommandCenter {

    public static void main(String[] args) {

        OnlineCourseBuilder onlineCourseBuilder = new OnlineCourseBuilder();
        ClassroomCourseBuilder classroomCourseBuilder = new ClassroomCourseBuilder();

        Teacher teacher = new Teacher();

        createCourse(teacher, onlineCourseBuilder);
        createCourse(teacher, classroomCourseBuilder);
    }

    private static void createCourse(Teacher teacher, CourseBuilder courseBuilder) {
        teacher.setCourseBuilder(courseBuilder);
        teacher.initializeCourse();
        Course course = teacher.getCourse();
        course.printDetails();
        System.out.println();

    }
}
