/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev3.dataAccess;

import java.util.ArrayList;
import odev3.entities.Course;

/**
 *
 * @author merve
 */
public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course,ArrayList<Course> courses) {
        courses.add(course);
        System.out.println(course.getName()+" eklendi: hibernate");
    }

    @Override
    public void delete(Course course,ArrayList<Course> courses) {
        courses.remove(course);
        System.out.println(course.getName()+"silindi: hibernate");
    }

    @Override
    public ArrayList<Course> list(ArrayList<Course> courses) {
        return courses;
    }
}
