package com.example.blog_ajax.service.impl;

import com.example.blog_ajax.model.Blog;
import com.example.blog_ajax.repository.IBlogRepository;
import com.example.blog_ajax.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findBlogById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Blog> searchBlog(String name, Pageable pageable) {
        return blogRepository.searchByName(name,pageable);
    }
}
