package odev3;

import java.util.ArrayList;
import odev3.business.CategoryManager;
import odev3.business.CourseManager;
import odev3.business.InstructorManager;
import odev3.core.logger.DatabaseLogger;
import odev3.dataAccess.HibernateCategoryDao;
import odev3.dataAccess.HibernateCourseDao;
import odev3.dataAccess.HibernateInstructorDao;
import odev3.dataAccess.JdbcCategoryDao;
import odev3.dataAccess.JdbcCourseDao;
import odev3.dataAccess.JdbcInstructorDao;
import odev3.entities.Category;
import odev3.entities.Course;
import odev3.entities.Instructor;

public class Odev3 {

    public static void main(String[] args) {
//        Course ekleem silme denemeleri
//        ArrayList<Category> categorys=new ArrayList<Category>();
//        CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao());
//        Category category=new Category(1,"web-yazılım");
//        categoryManager.add(category, categorys);
//        Category category1=new Category(2,"siber güvenlik");
//        categoryManager.add(category1, categorys);
//        Category category2=new Category(3,"siber güvenlik");
//        categoryManager.add(category2, categorys);
//        System.out.println("Listede bulunan kategoriler");
//        for (Category category3 : categorys) {
//            System.out.println(category3.getName());
//        }
//        categoryManager.delete(category1,categorys);
//        System.out.println("silme olduktan sonra liste---");
//        for (Category category3 : categorys) {
//            System.out.println(category3.getName());
//        }
//     ------------------------------------ Instructor 
        ArrayList<Instructor> instructorList = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<Course>();
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "BİR NUMARA");
        Instructor instructor2 = new Instructor(2, "Mehmet", "Demir", "BİR NUMARA");
        Instructor instructor3 = new Instructor(3, "Canan", "Ak", "BİR NUMARA");
        Instructor instructor4 = new Instructor(4, "Filiz", "Can", "BİR NUMARA");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),new DatabaseLogger());
        instructorManager.add(instructor, instructorList);
        instructorManager.add(instructor2, instructorList);
        instructorManager.add(instructor3, instructorList);
        instructorManager.add(instructor4, instructorList);
        for (Instructor instructor1 : instructorList) {
            System.out.println(instructor1.getId());
        }
        Course course = new Course(1, "JAVA 2022", instructor, 0.1);
        Course course1 = new Course(2, "C++", instructor, 01);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),new DatabaseLogger());
        courseManager.add(course, courses);
         courseManager.add(course1, courses);
         
    }

}
