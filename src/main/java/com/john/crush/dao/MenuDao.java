package com.john.crush.dao;

import org.springframework.stereotype.Repository;

import com.john.crush.entity.Category;
import com.john.crush.entity.Extra;
import com.john.crush.entity.Meal;

import java.util.List;

@Repository
public interface MenuDao {
    public List<Category> getCategories();

    public List<Meal> getMeals(String category);

    public List<Extra> getExtras(String name);

    public Meal findById(int id);

    public Meal save(Meal meal);

    public void delete(Meal meal);

    public List<Meal> findAll();
}
