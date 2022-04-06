package com.example.blog_restful.service.impl;


import com.example.blog_restful.model.Content;
import com.example.blog_restful.repository.IContentRepository;
import com.example.blog_restful.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ContentServiceImpl implements IContentService {

    @Autowired
    private IContentRepository contentRepository;
    @Override
    public Iterable<Content> findAll() {
        return contentRepository.findAll();
    }

    @Override
    public void save(Content content) {
        contentRepository.save(content);
    }

    @Override
    public void delete(Long id) {
        contentRepository.deleteById(id);
    }

    @Override
    public Optional<Content> findContentById(Long id) {
        return contentRepository.findById(id);
    }
}
