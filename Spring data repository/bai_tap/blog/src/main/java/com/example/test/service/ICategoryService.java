package com.example.test.service;

import com.example.test.model.Blog;
import com.example.test.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService {
    Category findById(int id);
    Page<Category> findAll(Pageable pageable);
    Page<Category> searchByName(String name, Pageable pageable);
    Category save (Category category);
    Category findOne(Integer id);
    void delete(int id);
    void delete(Category category);
}
