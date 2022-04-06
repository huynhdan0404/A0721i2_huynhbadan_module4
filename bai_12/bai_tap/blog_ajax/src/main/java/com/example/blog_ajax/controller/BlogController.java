package com.example.blog_ajax.controller;

import com.example.blog_ajax.model.Blog;
import com.example.blog_ajax.model.Category;
import com.example.blog_ajax.service.IBlogService;
import com.example.blog_ajax.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class BlogController {
    @Autowired
     private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/blogs")
    public ModelAndView getList(@PageableDefault(size = 5) Pageable pageable){
        return new ModelAndView("list","blogs",blogService.findAll(pageable));
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateBlog(Model model){
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categorys",categories);
        return new ModelAndView("create","blog",new Blog());
    }

    @PostMapping("/create-blog")
    public String createBlog(@ModelAttribute("blog")  Blog blog){
        blogService.save(blog);
        return "redirect:/blogs";
    }

    @GetMapping("/delete-blog/{id}")
    public String deleteBlog(@PathVariable Long id){
        blogService.delete(id);
        return "redirect:/blogs";
    }

    @PostMapping("/search")
    public ModelAndView searchBlog(@RequestParam(name = "search",required = false) String name, @PageableDefault(size = 5) Pageable pageable){
        return new ModelAndView("list","blogs",blogService.searchBlog(name,pageable));
    }
}

