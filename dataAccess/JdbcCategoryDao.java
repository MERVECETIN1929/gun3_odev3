package odev3.dataAccess;

import java.util.ArrayList;
import odev3.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    private ArrayList<Category> categorys;
    @Override
    public void add(Category category, ArrayList<Category> categorys) {
       categorys.add(category);
        System.out.println(category.getName()+"  ekleme başarılı: jdbc");
    }

    @Override
    public void delete(Category category,ArrayList<Category> categorys) {
        categorys.remove(category);
        System.out.println("silindi: jdbc");
    }

    @Override
    public ArrayList<Category> list() {
        return null;
    }

}
