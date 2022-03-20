package com.example.blog_restful.service;

import com.example.blog_restful.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBlogService {
    Iterable<Blog> findAll();
    Optional<Blog> findById(Long id);
    void  save(Blog blog);
    void delete(Long id);
}
