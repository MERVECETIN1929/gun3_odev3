
package odev3.business;

import java.util.ArrayList;
import odev3.core.logger.Logger;
import odev3.dataAccess.InstructorDao;
import odev3.entities.Instructor;


public class InstructorManager implements BaseManager{
    
    private InstructorDao instructorDao;
    private Logger logger;
    public InstructorManager( InstructorDao instructorDao, Logger log){
        this.logger=log;
        this.instructorDao=instructorDao;
    }
     public void add(Instructor instructor,ArrayList<Instructor> instructorList){
         instructorDao.add(instructor, instructorList);
         logger.log("kayıt ekleme");
    }
    public void delete(Instructor instructor,ArrayList<Instructor> instructorList){
        instructorDao.delete(instructor, instructorList);
        logger.log("kayıt silme");
    }
    public ArrayList<Instructor> list(ArrayList<Instructor> instructorList){
      return instructorDao.list(instructorList);  
    }
}
