package com.example.blog_nang_cap.service;

import com.example.blog_nang_cap.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    void  save(Blog blog);
    void delete(Long id);
    Blog findBlogById(Long id);
}
