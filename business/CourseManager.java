package odev3.business;

import java.util.ArrayList;
import odev3.core.logger.Logger;
import odev3.dataAccess.CourseDao;
import odev3.entities.Course;

public class CourseManager implements BaseManager {

    // arraylist te eleman yoksa oluştur varsa kontrol edip ekle mi?
    private CourseDao courseDao;
    private Logger logger;

    public CourseManager(CourseDao courseDao, Logger logger) {
        this.courseDao = courseDao;
        this.logger = logger;
    }

    public void add(Course course, ArrayList<Course> courses) {
        if (course.getPrice() > 0) {
            for (Course course1 : courses) {
                if (course1.getName() == course.getName()) {
                    System.out.println("Aynı isimde kurs eklemesi yapılamaz.");
                    return;
                }

            }
            logger.log("kurs kaydı");
            courseDao.add(course, courses);
        } else {
            System.out.println("Kurs ücreti 0'dan fazla olmalıdır.");
        }
    }

    public void delete(Course course, ArrayList<Course> courses) {
        courseDao.delete(course, courses);
        logger.log("kurs silindi");

    }

    public ArrayList<Course> list() {
        return null;
    }
}
