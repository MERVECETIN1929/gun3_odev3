
package odev3.dataAccess;

import java.util.ArrayList;
import odev3.entities.Instructor;


public interface InstructorDao {
    public void add(Instructor ─▒nstructor,ArrayList<Instructor> instructorList);
    public void delete(Instructor ─▒nInstructor,ArrayList<Instructor> instructorList);
    public ArrayList<Instructor> list(ArrayList<Instructor> instructorList);
}
