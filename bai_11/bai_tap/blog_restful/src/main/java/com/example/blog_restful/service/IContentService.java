package com.example.blog_restful.service;



import com.example.blog_restful.model.Content;

import java.util.List;

public interface IContentService {
    List<Content> findAll();
    void  save(Content content);
    void delete(Long id);
    Content findContentById(Long id);
}
