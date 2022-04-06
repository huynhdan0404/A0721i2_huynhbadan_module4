package com.example.blog_ajax.service;

import com.example.blog_ajax.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    void  save(Blog blog);
    void delete(Long id);
    Blog findBlogById(Long id);
    Page<Blog> searchBlog(String name, Pageable pageable);

}
