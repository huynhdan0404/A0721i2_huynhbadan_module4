package com.example.blog_ajax.service;

import com.example.blog_ajax.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    void  save(Category category);
    void delete(Long id);
    Category findCategoryById(Long id);
}
