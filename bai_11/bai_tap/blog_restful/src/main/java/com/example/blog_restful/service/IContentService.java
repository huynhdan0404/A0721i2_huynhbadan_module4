package com.example.blog_restful.service;



import com.example.blog_restful.model.Content;

import java.util.List;
import java.util.Optional;

public interface IContentService {
    Iterable<Content> findAll();
    void  save(Content content);
    void delete(Long id);
    Optional<Content> findContentById(Long id);
}
