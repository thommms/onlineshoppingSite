package com.demo.shoppingbackend.dao;

import com.demo.shoppingbackend.dto.Category;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CategoryDAO {
    Category get(int id);
    List<Category> list();
    boolean add(Category category);
    boolean update(Category category);
    boolean delete(Category category);
}
