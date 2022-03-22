package com.example.test.service.ServiceImpl;

import com.example.test.model.Blog;
import com.example.test.model.Category;
import com.example.test.repository.ICategoryRepository;
import com.example.test.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository categoryRepository;

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Page<Category> searchByName(String name, Pageable pageable) {
        return categoryRepository.findAllByName(name,pageable);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findOne(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public void delete(Category category) {
        categoryRepository.delete(category);
    }
}
