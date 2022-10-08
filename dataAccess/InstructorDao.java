
package odev3.dataAccess;

import java.util.ArrayList;
import odev3.entities.Instructor;


public interface InstructorDao {
    public void add(Instructor ınstructor,ArrayList<Instructor> instructorList);
    public void delete(Instructor ınInstructor,ArrayList<Instructor> instructorList);
    public ArrayList<Instructor> list(ArrayList<Instructor> instructorList);
}
