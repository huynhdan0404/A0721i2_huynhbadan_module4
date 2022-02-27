package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IBlogService {
    List<Blog> findAll();
    void  save(Blog blog);
    void delete(Long id);
    Blog findBlogById(Long id);
}
