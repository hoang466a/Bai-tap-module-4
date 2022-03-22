package com.example.test.repository;

import com.example.test.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
        Page<Category> findAllByName(String name, Pageable pageable);
}
