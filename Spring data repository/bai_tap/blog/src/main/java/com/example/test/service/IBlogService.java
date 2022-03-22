package com.example.test.service;

import com.example.test.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IBlogService {
    Blog findById(int id);
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> searchByName(String name, Pageable pageable);
    Blog save (Blog blog);
    Blog findOne(Integer id);

    void delete(int id);
    void delete(Blog blog);
}
