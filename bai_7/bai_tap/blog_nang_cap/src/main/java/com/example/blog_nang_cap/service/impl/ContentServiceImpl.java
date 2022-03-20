package com.example.blog_nang_cap.service.impl;

import com.example.blog_nang_cap.model.Content;
import com.example.blog_nang_cap.repository.IContentRepository;
import com.example.blog_nang_cap.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements IContentService {

    @Autowired
    private IContentRepository contentRepository;
    @Override
    public List<Content> findAll() {
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
    public Content findContentById(Long id) {
        return contentRepository.findById(id).orElse(null);
    }
}
