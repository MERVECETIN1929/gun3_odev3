
package odev3.dataAccess;

import java.util.ArrayList;
import odev3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor,ArrayList<Instructor> instructorList) {
        instructorList.add(instructor);
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" ekleme tamamlandı: jdbc");
    }

    @Override
    public void delete(Instructor instructor,ArrayList<Instructor> instructorList) {
        instructorList.remove(instructor);
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+"  silme tamamlandı: jdbc");
    }

    @Override
    public ArrayList<Instructor> list(ArrayList<Instructor> instructorList) {
         return instructorList;
    }
    
}
