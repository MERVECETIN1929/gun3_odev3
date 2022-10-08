
package odev3.business;

import java.util.ArrayList;
import odev3.core.logger.Logger;
import odev3.dataAccess.CategoryDao;
import odev3.entities.Category;

// kategori eklemesi yapılırken isim tekrarı yapılamaz
// peki ben vt kullanamdan önceden en eklenmiş nereden bileyim
// array list yapısını kullanmam gerektiğine olan inancım sonsuz şuan
// base de oluşum yaparken mi istesem
// hem kendini hem de eklenmesi gereken listeyi mi parametre olarak alsam-> buna karar verdim
public class CategoryManager implements BaseManager{
    private CategoryDao categoryDao;
    private Logger logger;
    public CategoryManager(CategoryDao categoryDao, Logger logger){
        this.logger=logger;
        this.categoryDao=categoryDao;
    }
    public void add(Category category, ArrayList<Category> categorys){
        // isim tekrarının olmaması için eklenmesi gereken listede daha önce var mı kontrolü yapacam.
        for (Category category1 : categorys) {
            
            if(category1.getName()==category.getName()){
                System.out.println("Aynı isimde kategori eklemesi gerçekleşemez");
                return;
            }
        }
        logger.log("kategori kaydı");
        categoryDao.add(category, categorys);
    }
    public void delete(Category category,ArrayList<Category> categorys){
         logger.log("kategori silindi");
        categoryDao.delete(category, categorys);
    }
    public ArrayList<Category> list(){
      return null;  
    }
}
