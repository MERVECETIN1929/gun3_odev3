
package odev3.dataAccess;

import java.util.ArrayList;
import odev3.entities.Instructor;


public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor,ArrayList<Instructor> instructorList) {
        instructorList.add(instructor);
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" ekleme tamamland─▒: hibernate");
    }

    @Override
    public void delete(Instructor instructor,ArrayList<Instructor> instructorList) {
        instructorList.remove(instructor);
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+"  silme tamamland─▒: hibernate");
    }

    @Override
    public ArrayList<Instructor> list(ArrayList<Instructor> instructorList) {
         return instructorList;
    }
    
}
