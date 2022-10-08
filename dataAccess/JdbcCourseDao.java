package odev3.dataAccess;

import java.util.ArrayList;
import odev3.entities.Course;

public class JdbcCourseDao implements CourseDao {

    @Override
    public void add(Course course,ArrayList<Course> courses) {
        courses.add(course);
        System.out.println(course.getName()+" eklendi: jdbc");
    }

    @Override
    public void delete(Course course,ArrayList<Course> courses) {
        courses.remove(course);
        System.out.println(course.getName()+"silindi: jdbc");
    }

    @Override
    public ArrayList<Course> list(ArrayList<Course> courses) {
        return courses;
    }

}
