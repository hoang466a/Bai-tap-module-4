package com.example.test.service.ServiceImpl;

import com.example.test.model.Blog;
import com.example.test.repository.IBlogRepository;
import com.example.test.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository blogRepository;


    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }


    @Override
    public Page<Blog> searchByName(String name, Pageable pageable) {
        return blogRepository.findAllByName(name,pageable);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }


    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog findOne(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public void delete(Blog blog) {
        blogRepository.delete(blog);
    }
}
