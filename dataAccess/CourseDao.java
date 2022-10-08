package odev3.dataAccess;

import java.util.ArrayList;
import odev3.entities.Course;

public interface CourseDao {
    public void add(Course course,ArrayList<Course> courses);
    public void delete(Course course,ArrayList<Course> courses);
    public ArrayList<Course> list(ArrayList<Course> courses);
}
