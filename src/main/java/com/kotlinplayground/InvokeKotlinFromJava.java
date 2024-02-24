package com.kotlinplayground;

import com.kotlinplayground.classes.Authenticate;
import com.kotlinplayground.classes.Course;
import com.kotlinplayground.classes.CourseCategory;
import com.kotlinplayground.classes.CourseUtils;

public class InvokeKotlinFromJava {

    public static void main(String[] args) {

        var course = new Course(1, "Course", "Dilip", CourseCategory.BUSINESS);

        System.out.println("course: "+ course);
        System.out.println("noOfCourses: "+ course.noOfCourses);

        var course2 = new Course(1, "Course", "Dilip");
        System.out.println("course2: "+ course2.);

        CourseUtils.printName1();
        CourseUtils.printName1("Abc");

        Course.Companion.printName2("abc");
        Course.printName2("static abc");

        Authenticate.INSTANCE.authenticate("Dilip", "abc");
        Authenticate.authenticate("Dilip", "abc");
    }
}
