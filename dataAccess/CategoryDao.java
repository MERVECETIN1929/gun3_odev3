
package odev3.dataAccess;

import java.util.ArrayList;
import odev3.entities.Category;


public interface CategoryDao {
    public void add(Category category, ArrayList<Category> categorys);
    public void delete(Category category,ArrayList<Category> categorys);
    public ArrayList<Category> list();
}
