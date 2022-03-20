package com.example.blog_nang_cap.service;

import com.example.blog_nang_cap.model.Blog;
import com.example.blog_nang_cap.model.Content;

import java.util.List;

public interface IContentService {
    List<Content> findAll();
    void  save(Content content);
    void delete(Long id);
    Content findContentById(Long id);
}
