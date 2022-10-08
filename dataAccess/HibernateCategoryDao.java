/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev3.dataAccess;

import java.util.ArrayList;
import odev3.entities.Category;

/**
 *
 * @author merve
 */
public class HibernateCategoryDao implements CategoryDao{
     @Override
    public void add(Category category, ArrayList<Category> categorys) {
       categorys.add(category);
        System.out.println(category.getName()+"  ekleme başarılı: hibernate");
    }

    @Override
    public void delete(Category category,ArrayList<Category> categorys) {
        categorys.remove(category);
        System.out.println("silindi: hibernate");
    }

    @Override
    public ArrayList<Category> list() {
        return null;
    }
}
